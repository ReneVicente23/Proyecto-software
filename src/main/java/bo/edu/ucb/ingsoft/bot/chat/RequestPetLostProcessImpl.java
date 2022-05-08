package bo.edu.ucb.ingsoft.bot.chat;

import bo.edu.ucb.ingsoft.bot.bl.PetListBl;
import bo.edu.ucb.ingsoft.bot.bl.PetLostBl;
import bo.edu.ucb.ingsoft.bot.bl.UsuarioBl;
import bo.edu.ucb.ingsoft.bot.dto.PetListDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;


@Service
public class RequestPetLostProcessImpl extends AbstractProcess{

    private UsuarioBl usuarioBl;
    private PetListBl petListBl2;
    private PetLostBl petlostbl;
    //LOGGER
    private static Logger LOGGER = LoggerFactory.getLogger(RequestPetLostProcessImpl.class);

    @Autowired
    public RequestPetLostProcessImpl(UsuarioBl usuarioBl, PetListBl petListBl2, PetLostBl petlostbl) {
        this.usuarioBl = usuarioBl;
        this.petListBl2 = petListBl2;
        this.petlostbl = petlostbl;
        this.setName("Marcar mascota como perdida");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        //this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }

    @Override
    public AbstractProcess handle(ApplicationContext context, Update update, MascotaLongPullingBot bot) {
        AbstractProcess result = this; // sigo en el mismo proceso. MOD
        Long chatId = update.getMessage().getChatId();

        //Modulo para guardar usuario
        try {
            String a=usuarioBl.validChatid(chatId);
            LOGGER.info("Id result: {} ",a);
        }catch (NullPointerException e){
            LOGGER.error("error:  ",e);
            usuarioBl.saveUsuario(chatId);
        }
        //fin modulo guardar usuario

        if (this.getStatus().equals("STARTED")) {

            showPets(bot, chatId);
        } else if (this.getStatus().equals("AWAITING_USER_RESPONSE")) {
            // Estamos esperando por un 1 Si o 2 No
            Message message = update.getMessage();
            if ( message.hasText() ) {
                // Intentamos transformar en número
                String text = message.getText(); // El texto contiene asdasdas
                try {
                    String respuesta [] = text.split("/");
                    System.out.println(respuesta[0]+respuesta[1]);
                    int auxid = Integer.valueOf(respuesta[0]);
                    int auxzone = Integer.valueOf(respuesta[1]);
                    //int opcion = Integer.parseInt(text);
                    if(text.contentEquals("N")){
                        this.setStatus("STARTED");
                        result = new MenuProcessImpl();
                    }else{
                        //Integer auxid = Integer.parseInt(respuesta[0]);
                        //Integer auxzone = Integer.parseInt(respuesta[1]);
                        System.out.println(auxid+" "+auxzone);
                        //placeListTest(bot,chatId);
                        List<PetListDto> petlist = petListBl2.findPets(chatId);
                        Integer s= petlist.get((auxid-1)).getPet_id();
                        petlostbl.saveLostPet(s,auxzone);
                        //System.out.println(text);

                        this.setStatus("STARTED");
                        result = new MenuProcessImpl();
                    }
                } catch (NumberFormatException ex) {
                    showPets(bot, chatId);
                }
                // continuar con el proceso seleccionado
            } else { // Si me enviaron algo diferente de un texto.
                showPets(bot, chatId);
            }
        }
        return result;
    }

    private void showPets(MascotaLongPullingBot bot, Long chatId) {
        PetListBl petListBl = petListBl2;
        StringBuffer sb = new StringBuffer();
        List<PetListDto> petlist = petListBl.findPets(chatId);
        if(petlist.size()==0){
            sb.append("No tiene mascotas Registradas😕\r\n" );
        }else{
            sb.append("Tiene registradas las siguientes mascotas🐶: \r\n" ).append(petlist.size());
            for(PetListDto pets: petlist) {
                sb.append(pets.toString()).append("\n\r");
            }
        }
        sb.append("Id de las zonas\r\n" );
        sb.append("1. Sopocachi\r\n" );
        sb.append("2. Obrajes\r\n" );
        sb.append("3. San Miguel\r\n" );
        sb.append("4. Achumani\r\n" );

        //LOGGER.error("error:  ",e);
        //sb.append("No tiene mascotas Registradas\r\n" );
        sb.append("¿Desea Continuar? (Si✅: Ingrese: (Id mascota / Número zona)(Ej: 1/1) / No❌: N / N)\r\n" );
        sendStringBuffer(bot, chatId, sb);
        this.setStatus("AWAITING_USER_RESPONSE");
    }

    private void placeListTest(MascotaLongPullingBot bot, Long chatId) {

        StringBuffer sb = new StringBuffer();

        sb.append("Ingrese el numero de la zona donde se perdió su mascota😥\r\n" );
        sb.append("1. Sopocachi\r\n" );
        sb.append("2. Obrajes\r\n" );
        sb.append("3. San Miguel\r\n" );
        sb.append("4. Achumani\r\n" );
        //LOGGER.error("error:  ",e);
        //sb.append("No tiene mascotas Registradas\r\n" );
        sendStringBuffer(bot, chatId, sb);
        this.setStatus("AWAITING_USER_RESPONSE");
    }

    @Override
    public AbstractProcess onError() {
        return null;
    }

    @Override
    public AbstractProcess onSuccess() {
        return null;
    }

    @Override
    public AbstractProcess onTimeout() {
        return null;
    }

}
