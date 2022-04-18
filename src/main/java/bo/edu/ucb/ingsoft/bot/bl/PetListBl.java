package bo.edu.ucb.ingsoft.bot.bl;

import bo.edu.ucb.ingsoft.bot.dto.PetListDto;

import java.util.ArrayList;
import java.util.List;

public class PetListBl {

    public PetListBl(){
    }

    public List<PetListDto> findPets(Long chatId) {
        List<PetListDto> result = new ArrayList<>();
        result.add(new PetListDto("Pancho", "Perro mestizo", "3 años", "macho","manchas", " ","telefono 88888888","test1"));
        result.add(new PetListDto("Gray", "Gato persa", "2 años", "macho","todo gris", " gotas para los ojos ","telefono 88888888","test2"));
        return result;
    }
}
