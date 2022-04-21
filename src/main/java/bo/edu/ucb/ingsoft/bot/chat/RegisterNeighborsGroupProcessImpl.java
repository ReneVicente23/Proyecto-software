package bo.edu.ucb.ingsoft.bot.chat;

import bo.edu.ucb.ingsoft.bot.bl.NeighborsListBl;
import bo.edu.ucb.ingsoft.bot.dto.NeighborListDto;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import java.util.List;

public class RegisterNeighborsGroupProcessImpl extends AbstractProcess{

    public RegisterNeighborsGroupProcessImpl(){

        this.setName("Agergar nuevo duenho");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);

        this.setStatus("STARTED");
    }


    @Override
    public AbstractProcess handle(Update update, MascotaLongPullingBot bot) {
        AbstractProcess result = this;  //
        Long chatId = update.getMessage().getChatId();

        if(this.getStatus().equals("STARTED")){
                showNeighbors(bot, chatId);
            }
        else if(this.getStatus().equals("AWAITING_USER_RESPONSE")){
            Message message = update.getMessage();
                if(message.hasText()){
                    String text = message.getText();

                    try {
                        int opcion = Integer.parseInt(text);
                        switch (opcion) {
                            case 1:
                                result = new RegisterNeighborsGroupFromProcessImpl();
                                break;
                            case 2:
                                result = new MenuProcessImpl();
                                break;
                            default:
                                showNeighbors(bot, chatId);
                        }
                    }
                            catch (NumberFormatException ex){
                                showNeighbors(bot, chatId);
                            }
                    }else{
                        showNeighbors(bot, chatId);
                    }
                }



        return result;
    }

    private void showNeighbors(MascotaLongPullingBot bot, Long chatId){
        NeighborsListBl neighborsListBl = new NeighborsListBl();
        List<NeighborListDto> neighborsList = NeighborsListBl.findNeighbors(chatId);
        StringBuffer sb = new StringBuffer();
        sb.append("Tiene registrados los siguientes vecinos: \r\n").append(neighborsList.size());
        for (NeighborListDto neighbors: neighborsList){
            sb.append(neighbors.toString()).append("\r\n");
        }
        sb.append("Desea continuar (1. SI / 2. NO  \r\n");
        sendStringBuffer(bot, chatId, sb);

        String nombre="Jose A";
        String apellido ="Pozo Silva";
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
