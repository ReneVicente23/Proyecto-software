package bo.edu.ucb.ingsoft.bot.bl;

import bo.edu.ucb.ingsoft.bot.dao.PetLostDao;
import bo.edu.ucb.ingsoft.bot.dto.PetListDto;
import bo.edu.ucb.ingsoft.bot.dto.PetLostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PetLostBl {
    private PetLostDao petlostdao;

    @Autowired
    public PetLostBl(PetLostDao petlostdao) {
        this.petlostdao = petlostdao;
    }

    public void saveLostPet(Integer id, Integer zone){
        petlostdao.saveLostPet(id,zone);
    }
}
