package bo.edu.ucb.ingsoft.bot.chat;

import bo.edu.ucb.ingsoft.bot.dto.PetListDto;
import org.telegram.telegrambots.meta.api.objects.Update;

public class RegisterNeighborsGroupProcessIml extends AbstractProcess {


    private PetListDto t;

    public RegisterNeighborsGroupProcessIml(){

    }
    @Override
    public AbstractProcess handle(Update update, MascotaLongPullingBot bot) {
        return null;
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
