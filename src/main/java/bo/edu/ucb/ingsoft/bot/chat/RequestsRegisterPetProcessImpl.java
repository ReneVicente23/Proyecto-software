package bo.edu.ucb.ingsoft.bot.chat;

import bo.edu.ucb.ingsoft.bot.bl.PetListBl;
import bo.edu.ucb.ingsoft.bot.dto.PetListDto;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import java.util.List;

public class RequestsRegisterPetProcessImpl extends AbstractProcess{
    public RequestsRegisterPetProcessImpl() {
        this.setName("Agregar Nueva mascota");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        //this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }

    @Override
    public AbstractProcess handle(Update update, MascotaLongPullingBot bot) {
        AbstractProcess result = this; // sigo en el mismo proceso. MOD
        Long chatId = update.getMessage().getChatId();

        if (this.getStatus().equals("STARTED")) {

            showPets(bot, chatId);
        } else if (this.getStatus().equals("AWAITING_USER_RESPONSE")) {
            // Estamos esperando por un 1 Si o 2 No
            Message message = update.getMessage();
            if ( message.hasText() ) {
                // Intentamos transformar en número
                String text = message.getText(); // El texto contiene asdasdas
                try {
                    int opcion = Integer.parseInt(text);
                    switch (opcion){
                        case 1 : result = new RequestsRegisterPetFromImpl();
                            break;
                        case 2 : result = new MenuProcessImpl();
                            break;
                        default: showPets(bot, chatId);
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
        PetListBl petListBl = new PetListBl();
        List<PetListDto> petlist = petListBl.findPets(chatId);
        StringBuffer sb = new StringBuffer();
        sb.append("Tiene registradas las siguientes mascotas: \r\n" ).append(petlist.size());
        for(PetListDto pets: petlist) {
            sb.append(pets.toString()).append("\n\r");
        }
        sb.append("¿Desea Continuar? (1: Si/2: No)\r\n" );
        sendStringBuffer(bot, chatId, sb);

        String nombre = "Juan";
        String apellido = "Perez";
        String nombreCompleto = nombre + " " + apellido;
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