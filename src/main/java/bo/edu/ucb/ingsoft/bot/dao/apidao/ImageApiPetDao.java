package bo.edu.ucb.ingsoft.bot.dao.apidao;

import bo.edu.ucb.ingsoft.bot.dto.apidto.ImageApiPetDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ImageApiPetDao {
    @Select("SELECT idimage,imagename,imageuuid,format ,state,mod_user,mod_date " +
            "FROM image WHERE idimage= #{imageid};")
    public ImageApiPetDto findByid(@Param("imageid") Integer id);

    @Select("SELECT idimage,imagename,imageuuid,format ,state,mod_user,mod_date " +
            "FROM image WHERE imageuuid= #{imageuuid};")
    public ImageApiPetDto findByuuid(@Param("imageuuid") String imageuuid);

    @Select("SELECT i.idimage,i.imagename,i.imageuuid,i.format ,i.state,i.mod_user,i.mod_date " +
            "FROM image i join pet p on p.image_idimage = i.idimage WHERE p.usuario_id_usuario = #{userid} and p.pet_id = #{petid};")
    public ImageApiPetDto findByidpet(@Param("userid") Integer userid,@Param("petid") Integer petid);

    @Insert("INSERT INTO image (imagename, imageuuid ,format ,state, mod_user, mod_date) " +
            " VALUES (#{imagename},#{imageuuid},#{format},1,'rene',CURRENT_TIMESTAMP);")
    void saveImage(@Param("imagename") String imagename,@Param("imageuuid") String imageuuid,@Param("format") String format);

}
