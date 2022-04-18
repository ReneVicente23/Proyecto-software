package bo.edu.ucb.ingsoft.bot.chat;

import bo.edu.ucb.ingsoft.bot.bl.PermissionBl;
import bo.edu.ucb.ingsoft.bot.dto.PermissionDto;
import bo.edu.ucb.ingsoft.bot.bl.PetListBl;
import bo.edu.ucb.ingsoft.bot.dto.PetListDto;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import java.util.List;

public class QueryRegisterPetProcessImpl extends AbstractProcess{
    public QueryRegisterPetProcessImpl() {
        this.setName("Agregar Nueva mascota");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        //this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }

    @Override
    public AbstractProcess handle(Update update, MascotaLongPullingBot bot) {
        Long chatId = update.getMessage().getChatId();
        PetListBl petListBl = new PetListBl();
        List<PetListDto> petlist = petListBl.findPets(chatId);
        StringBuffer sb = new StringBuffer();
        sb.append("Tiene registradas las siguientes mascotas: \r\n" ).append(petlist.size());
        for(PetListDto pets: petlist) {
            sb.append(pets.toString()).append("\n\r");
        }
        sb.append("¿Desea Continuar? (s/n)\r\n" );
        sendStringBuffer(bot, chatId, sb);

        //atrapar mensajes
        Message message = update.getMessage();
        if ( message.hasText() ) {
            // obtenemos respuesta s/n
            String text = message.getText(); // El texto contiene asdasdas
            System.out.println(text+"el texto");
            try {
                if(text.contentEquals("s")){
                    System.out.println("si me lee");
                    return new QueryRegisterPetProcessImpl();

                }else{
                    return new MenuProcessImpl();
                }

            } catch (Exception ex) {
                return new MenuProcessImpl();
            }
            // continuar con el proceso seleccionado
        } else { // Si me enviaron algo diferente de un texto.
            return new MenuProcessImpl();
        }

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
