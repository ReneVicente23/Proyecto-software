package bo.edu.ucb.ingsoft.bot.bl;

import bo.edu.ucb.ingsoft.bot.dto.NeighborListDto;
import bo.edu.ucb.ingsoft.bot.dto.PetFoundListDto;

import java.util.ArrayList;
import java.util.List;

public class PetFoundListBl {

    public PetFoundListBl(){
    }

    public static List<PetFoundListDto>petsfind(Long chatId){
        List<PetFoundListDto> result = new ArrayList<>();
        result.add(new PetFoundListDto("Bernardo","8440004","65578478","jhosede23@gmail.com","Bajo LLojeta"));
        return result;
    }

}
