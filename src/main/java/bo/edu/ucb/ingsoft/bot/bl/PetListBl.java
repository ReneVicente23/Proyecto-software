package bo.edu.ucb.ingsoft.bot.bl;

import bo.edu.ucb.ingsoft.bot.dao.PetListDao;
import bo.edu.ucb.ingsoft.bot.dto.PetListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PetListBl {
    private PetListDao petListDao;

    @Autowired
    public PetListBl(PetListDao petListDao) {
        this.petListDao = petListDao;
    }

    public List<PetListDto> findPets(Long chatId) {
        Integer chat= Math.toIntExact(chatId);
        List<PetListDto> result =petListDao.findPets(chat);
        return result;
    }

    public void savePet(PetListDto petListDto, Long chatId){
        Integer chat= Math.toIntExact(chatId);
        String name=petListDto.getPet_name();
        String tipe=petListDto.getPet_tipe();
        String age=petListDto.getPet_age();
        String gender=petListDto.getPetGender();
        String stat=petListDto.getPet_stat();
        String care=petListDto.getPet_care();
        String contacts=petListDto.getPet_contacts();
        String image=petListDto.getPet_image();

        petListDao.savePet(name,tipe,age,gender,stat,care,contacts,image,chat);
    }
}
