package bo.edu.ucb.ingsoft.bot.bl;

import bo.edu.ucb.ingsoft.bot.dto.NeighborListDto;

import java.util.ArrayList;
import java.util.List;

public class NeighborsListBl {

    public NeighborsListBl(){
    }



    public static List<NeighborListDto>findNeighbors(Long chatId){

        List<NeighborListDto>result = new ArrayList<>();
       result.add(new NeighborListDto("Jose Armando", "Pozo Silva","8440004","24"
       ,"65578478","jhosede23@gmail.com","Bajo LLojeta Sur","foto1"));

        result.add(new NeighborListDto("Prueba", "Demo","1212","01"
                ,"67777","prueba1@prueba.prueba","pruba 2","foto"));

        return result;
    }
}
