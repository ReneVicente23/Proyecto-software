package bo.edu.ucb.ingsoft.bot.chat;

import bo.edu.ucb.ingsoft.bot.bl.PetListBl;
import bo.edu.ucb.ingsoft.bot.dto.PetListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.List;

@Service
public class RequestsRegisterPetFromImpl extends AbstractProcess{
    private PetListBl petListBl2;
    private PetListDto t;
    //LOGGER
    private static Logger LOGGER = LoggerFactory.getLogger(RequestsRegisterPetFromImpl.class);
    @Autowired
    public RequestsRegisterPetFromImpl(PetListBl petListBl2) {
        this.petListBl2=petListBl2;
        this.setName("Form Agregar Nueva mascota");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        //this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
        this.t=new PetListDto(" "," "," "," "," "," "," "," ");
    }

    public RequestsRegisterPetFromImpl(PetListDto t, PetListBl petListBl2) {
        this.petListBl2=petListBl2;
        this.setName("Form Agregar Nueva mascota");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        //this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
        this.t=t;
    }

    @Override
    public AbstractProcess handle(ApplicationContext context, Update update, MascotaLongPullingBot bot) {
        AbstractProcess result = this; // sigo en el mismo proceso. MOD
        Long chatId = update.getMessage().getChatId();
        PetListDto pet=this.t;

        if (this.getStatus().equals("STARTED")) {
            showPets(bot, chatId, pet);
        } else if (this.getStatus().equals("AWAITING_USER_RESPONSE")) {
            // Estamos esperando por un 1 Si o 2 No
            Message message = update.getMessage();
            if ( message.hasText() ) {
                // Intentamos transformar en número
                String text = message.getText(); // El texto contiene asdasdas
                //message.getPhoto();
                //List<PhotoSize> a=message.getPhoto();
                try {
                    if(pet.getPet_contacts().contentEquals(" ")){
                        pet.petWrite(text);
                        result = new RequestsRegisterPetFromImpl(pet,petListBl2);
                    }else{
                        if(pet.getPet_image().contentEquals(" ")){
                            List<PhotoSize> a=update.getMessage().getPhoto();

                            System.out.println(a.size());
                            System.out.println(a.toArray());
                        }else{
                            savePets(bot, chatId, pet);
                            this.setStatus("STARTED");
                            result = new MenuProcessImpl();
                        }

                    }
                } catch (Exception ex) {
                    showPets(bot, chatId,pet);
                }
                // continuar con el proceso seleccionado
            } else { // Si me enviaron algo diferente de un texto.
                if(message.hasPhoto()){
                    if(pet.getPet_image().contentEquals(" ")){
                        List<PhotoSize> a=update.getMessage().getPhoto();
                        pet.petWrite(a.get(0).getFileId());
                    }else{
                        savePets(bot, chatId, pet);
                        this.setStatus("STARTED");
                        result = new MenuProcessImpl();
                    }
                    //List<PhotoSize> a=update.getMessage().getPhoto();
                    //System.out.println(a.size());
                    //System.out.println(a.get(0).getFileId());
                    //System.out.println(a.toString());
                }
                showPets(bot, chatId,pet);
            }
        }
        return result;
    }

    private void showPets(MascotaLongPullingBot bot, Long chatId, PetListDto pet) {
        StringBuffer sb = new StringBuffer();
        sb.append(pet.petForm() + "\r\n");
        sendStringBuffer(bot, chatId, sb);
        this.setStatus("AWAITING_USER_RESPONSE");
    }

    private void savePets(MascotaLongPullingBot bot, Long chatId, PetListDto result) {
        PetListBl petListBl = petListBl2;
        StringBuffer sb = new StringBuffer();
        try {
            petListBl.savePet(result,chatId);
            sb.append("Mascota almacenada\r\n" );
        }catch (Exception e){
            sb.append("No se pudo guardar a su mascota\r\n" );
            LOGGER.error("error : {}",e);
        }
        sendStringBuffer(bot, chatId, sb);
        this.setStatus("STARTED");
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
