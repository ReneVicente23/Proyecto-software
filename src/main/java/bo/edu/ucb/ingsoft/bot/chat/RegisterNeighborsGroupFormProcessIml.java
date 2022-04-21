package bo.edu.ucb.ingsoft.bot.chat;

import bo.edu.ucb.ingsoft.bot.dto.NeighborDto;
import bo.edu.ucb.ingsoft.bot.dto.PetListDto;
import org.telegram.telegrambots.meta.api.objects.Update;

public class RegisterNeighborsGroupFormProcessIml extends AbstractProcess {


    private NeighborDto t;

    public RegisterNeighborsGroupFormProcessIml(
          //  this.setName("Agregar Nuevo Vecino");

    ){


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
