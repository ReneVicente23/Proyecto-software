package bo.edu.ucb.ingsoft.bot.chat;

import bo.edu.ucb.ingsoft.bot.bl.PetListBl;
import bo.edu.ucb.ingsoft.bot.dto.PetListDto;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

public class RequestsRegisterPetFromImpl extends AbstractProcess{
    private PetListDto t;
    public RequestsRegisterPetFromImpl() {
        this.setName("Form Agregar Nueva mascota");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        //this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
        this.t=new PetListDto(" "," "," "," "," "," "," "," ");
    }
    public RequestsRegisterPetFromImpl(PetListDto t) {
        this.setName("Form Agregar Nueva mascota");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        //this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
        this.t=t;
    }

    @Override
    public AbstractProcess handle(Update update, MascotaLongPullingBot bot) {
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
                try {
                    if(pet.getPetName().contentEquals(" ")){
                        pet.setPetName(text);
                        result = new RequestsRegisterPetFromImpl(pet);
                    }else{
                        if(pet.getPetTipe().contentEquals(" ")){
                            pet.setPetTipe(text);
                            result = new RequestsRegisterPetFromImpl(pet);
                        }else{
                            if(pet.getPetAge().contentEquals(" ")){
                                pet.setPetAge(text);
                                result = new RequestsRegisterPetFromImpl(pet);
                            }else{
                                if(pet.getPetGender().contentEquals(" ")){
                                    pet.setPetGender(text);
                                    result = new RequestsRegisterPetFromImpl(pet);
                                }else{
                                    if(pet.getPetStat().contentEquals(" ")){
                                        pet.setPetStat(text);
                                        result = new RequestsRegisterPetFromImpl(pet);
                                    }else{
                                        if(pet.getPetCare().contentEquals(" ")){
                                            pet.setPetCare(text);
                                            result = new RequestsRegisterPetFromImpl(pet);
                                        }else{
                                            if(pet.getPetContacts().contentEquals(" ")){
                                                pet.setPetContacts(text);
                                                result = new RequestsRegisterPetFromImpl(pet);
                                            }else{
                                                if(pet.getPetImage().contentEquals(" ")){
                                                    pet.setPetImage(text);
                                                    result = new RequestsRegisterPetFromImpl(pet);
                                                } else{
                                                    result = new MenuProcessImpl();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception ex) {
                    showPets(bot, chatId,pet);
                }
                // continuar con el proceso seleccionado
            } else { // Si me enviaron algo diferente de un texto.
                showPets(bot, chatId,pet);
            }
        }
        return result;
    }

    private void showPets(MascotaLongPullingBot bot, Long chatId, PetListDto pet) {
        StringBuffer sb = new StringBuffer();
        if(pet.getPetName().contentEquals(" ")){
            sb.append("Ingrese el nombre de la mascota: \r\n" );
        }else{
            if(pet.getPetTipe().contentEquals(" ")){
                sb.append("Ingrese la especie y raza de la mascota: \r\n" );
            }else{
                if(pet.getPetAge().contentEquals(" ")){
                    sb.append("Ingrese la edad de la mascota: \r\n" );
                }else{
                    if(pet.getPetGender().contentEquals(" ")){
                        sb.append("Ingrese el genero de la mascota: \r\n" );
                    }else{
                        if(pet.getPetStat().contentEquals(" ")){
                            sb.append("Ingrese rasgos de la mascota: \r\n" );
                        }else{
                            if(pet.getPetCare().contentEquals(" ")){
                                sb.append("¿su mascota tiene cuidados especiales? (si no tiene cuidados especiales ingrese no): \r\n" );
                            }else{
                                if(pet.getPetContacts().contentEquals(" ")){
                                    sb.append("¿tiene contactos adicionales? (si no los tiene ingrese no): \r\n" );
                                }else{
                                    if(pet.getPetImage().contentEquals(" ")){
                                        sb.append("espacio de prueba para imagenes ingrese cualquier texto \r\n" );
                                    } else{
                                        sb.append("Los datos ingresados son:  \r\n" );
                                        sb.append(pet.toString()+"  \r\n" );
                                        sb.append("ingrese cualquier carracter para continuar al menu principal:  \r\n" );
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

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
