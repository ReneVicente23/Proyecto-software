package bo.edu.ucb.ingsoft.bot.bl.apibl;

import bo.edu.ucb.ingsoft.bot.dao.apidao.ImageApiPetDao;
import bo.edu.ucb.ingsoft.bot.dao.apidao.PetListApiDao;
import bo.edu.ucb.ingsoft.bot.dto.apidto.PetListApiDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PetListApiBl {
    private PetListApiDao petListApiDao;
    private ImageApiPetDao imageApiPetDao;

    @Autowired
    public PetListApiBl(PetListApiDao petListApiDao, ImageApiPetDao imageApiPetDao) {
        this.petListApiDao = petListApiDao;
        this.imageApiPetDao= imageApiPetDao;
    }

    public List<PetListApiDto> findPets(Integer userid) {
        List<PetListApiDto> result =petListApiDao.findPets(userid);
        return result;
    }

    public PetListApiDto findPetbyid(Integer userid, Integer petid) {
        PetListApiDto result =petListApiDao.findPetbyid(userid,petid);
        return result;
    }

    //@Transactional(propagation = Propagation.REQUIRED)
    public void savePet(String data,Integer userid, Integer imageid){
        //String imageuuid, String imagename
        data=data.replace("\n"," ");
        String[] info=data.split("/");
        String name=info[0];
        String tipe=info[1];
        String age=info[2];
        String gender=info[3];
        String stat=info[4];
        String care=info[5];
        String contacts=info[6];
        petListApiDao.savePet(name,tipe,age,gender,stat,care,contacts,imageid,userid);
    }

}
