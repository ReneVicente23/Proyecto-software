package bo.edu.ucb.ingsoft.bot.bl.apibl;

import bo.edu.ucb.ingsoft.bot.dao.apidao.ImageApiPetDao;
import bo.edu.ucb.ingsoft.bot.dto.apidto.ImageApiPetDto;
import bo.edu.ucb.ingsoft.bot.dto.apidto.InUserApiDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ImageApiPetBl {
    ImageApiPetDao imageApiPetDao;

    @Autowired
    public ImageApiPetBl(ImageApiPetDao imageApiPetDao) {
        this.imageApiPetDao = imageApiPetDao;
    }

    public ImageApiPetDto findimagesuuid(String imageuuid) {
        ImageApiPetDto result =imageApiPetDao.findByuuid(imageuuid);
        return result;
    }

    public ImageApiPetDto findimageid(Integer id) {
        ImageApiPetDto result =imageApiPetDao.findByid(id);
        return result;
    }

    public ImageApiPetDto findimagepetid(Integer id,Integer petid) {
        ImageApiPetDto result =imageApiPetDao.findByidpet(id,petid);
        return result;
    }

    public void saveImage(String imagename, String imageuuid,String format){
        imageApiPetDao.saveImage(imagename,imageuuid,format);
    }
}
