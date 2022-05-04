package bo.edu.ucb.ingsoft.bot.chat;

import bo.edu.ucb.ingsoft.bot.dto.PetFoundListDto;
import org.springframework.context.ApplicationContext;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class RegisterPetFoundProcessImpl extends AbstractProcess{

    private PetFoundListDto t;

    public RegisterPetFoundProcessImpl(){
        this.setName("Agregar Avistamiento de mascota");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/100);
        this.setStatus("STARTED");
        this.t=new PetFoundListDto();
    }

    public RegisterPetFoundProcessImpl(PetFoundListDto t){
        this.setName("Form Agregar Avistamiento");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/100);
        this.setStatus("STARTED");
        this.t=t;
    }
    @Override
    public AbstractProcess handle(ApplicationContext context, Update update, MascotaLongPullingBot bot) {
        AbstractProcess result = this; //signop en el mismo MOD
        Long chadId = update.getMessage().getChatId();
        PetFoundListDto petfound=this.t;

        if (this.getStatus().equals("STARTED")){
            showPetFound(bot, chadId, petfound);
        } else if (this.getStatus().equals("AWAITING_USER_RESPONSE")) {

            Message message = update.getMessage();
            if(message.hasText()){
                String text = message.getText();// el texto contien

                try{
                    if(petfound.getPetFoundName().contentEquals("")){
                        petfound.petsFoundWrite(text);
                        result = new RegisterPetFoundProcessImpl(petfound);
                    }else {
                        result = new MenuProcessImpl();
                    }
                }catch (Exception ex){
                    showPetFound(bot, chadId, petfound);
                }

            }else {
                showPetFound(bot, chadId, petfound);
            }

        }
        return result;
    }
    private  void showPetFound(MascotaLongPullingBot bot, Long chatId, PetFoundListDto petfound){

        StringBuffer sb = new StringBuffer();
        sb.append(petfound.petFoundForm()+" \r\n");
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
