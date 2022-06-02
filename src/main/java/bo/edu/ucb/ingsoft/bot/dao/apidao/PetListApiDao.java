package bo.edu.ucb.ingsoft.bot.dao.apidao;

import bo.edu.ucb.ingsoft.bot.dto.PetListDto;
import bo.edu.ucb.ingsoft.bot.dto.apidto.PetListApiDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PetListApiDao {
    @Select("SELECT p.pet_id, p.pet_name, p.pet_tipe, p.pet_age, p.pet_gender,p.pet_stat, p.pet_care, p.pet_contacts, p.state ,p.mod_user, p.mod_date, p.usuario_id_usuario, p.image_idimage " +
            "FROM pet p JOIN usuario u  ON p.usuario_id_usuario = u.id_usuario WHERE u.id_usuario = #{userid} AND p.state = 1")
    public List<PetListApiDto> findPets(@Param("userid") Integer id);

    @Select("SELECT p.pet_id, p.pet_name, p.pet_tipe, p.pet_age, p.pet_gender,p.pet_stat, p.pet_care, p.pet_contacts, p.state ,p.mod_user, p.mod_date, p.usuario_id_usuario, p.image_idimage " +
            "FROM pet p JOIN usuario u  ON p.usuario_id_usuario = u.id_usuario WHERE u.id_usuario = #{userid} AND p.state = 1 AND p.pet_id = #{petid}")
    public PetListApiDto findPetbyid(@Param("userid") Integer id,@Param("petid") Integer petid);

/*
    @Select("SELECT pet_id "+
            "FROM pet WHERE pet_id = #{userid} AND state = 1")
    public UsuarioDto validChatid(@Param("userid") Integer id);
*/
    @Insert("INSERT INTO pet(pet_name, pet_tipe, pet_age, pet_gender, pet_stat, pet_care, pet_contacts, state,mod_user,mod_date,usuario_id_usuario,image_idimage) " +
            " VALUES ( #{pet_name}, #{pet_tipe}, #{pet_age}, #{pet_gender}, #{pet_stat}, #{pet_care}, #{pet_contacts}, 1,'rene',CURRENT_TIMESTAMP, "+
            " #{userid}, #{pet_image}) ")
    //void savePet(PetListDto petListDto,@Param("userid") Integer id); //FIXME: recibir el dto, da :nested exception is org.apache.ibatis.binding.BindingException: Parameter 'pet_name' not found. Available parameters are [petListDto, userid, param1, param2].
    void savePet(@Param("pet_name") String name,@Param("pet_tipe") String tipe,@Param("pet_age") String age,@Param("pet_gender") String gender,@Param("pet_stat") String stat,@Param("pet_care") String care,@Param("pet_contacts") String contacts,@Param("pet_image") Integer image,@Param("userid") Integer id);
}
