package bo.edu.ucb.ingsoft.bot.chat;
import bo.edu.ucb.ingsoft.bot.dto.NeighborListDto;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
public class RegisterNeighborsGroupFromProcessIml extends AbstractProcess {

    private NeighborListDto t;

    public RegisterNeighborsGroupFromProcessIml(){
        this.setName("Agregar Nuevo Vecino");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/100);
        this.setStatus("STARTED");
        this.t=new NeighborListDto();
    }

    public RegisterNeighborsGroupFromProcessIml(NeighborListDto t){
        this.setName("Form Agregar Nuevo Vecino");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/100);
        this.setStatus("STARTED");
        this.t=t;

    }
    @Override
    public AbstractProcess handle(Update update, MascotaLongPullingBot bot) {
        AbstractProcess result = this; //signop en el mismo MOD
        Long chadId = update.getMessage().getChatId();
        NeighborListDto neighbor=this.t;

            if (this.getStatus().equals("STARTED")){
                showNeighbor(bot, chadId, neighbor);
            } else if (this.getStatus().equals("AWAITING_USER_RESPONDSE")) {

                Message message = update.getMessage();
                    if(message.hasText()){
                        String text = message.getText();// el texto contien

                        try{
                            if(neighbor.getNeighborPhoto().contentEquals("")){
                                neighbor.neighborsWrite(text);
                                result = new RegisterNeighborsGroupFromProcessIml(neighbor);
                            }else {
                                result = new MenuProcessImpl();
                            }
                        }catch (Exception ex){
                            showNeighbor(bot, chadId, neighbor);
                        }

                    }else {
                        showNeighbor(bot, chadId, neighbor);
                    }

            }


        return result;
    }

private  void showNeighbor(MascotaLongPullingBot bot, Long chatId, NeighborListDto neighbor){

        StringBuffer sb = new StringBuffer();
        sb.append(neighbor.neighborForm()+" \r\n");
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
