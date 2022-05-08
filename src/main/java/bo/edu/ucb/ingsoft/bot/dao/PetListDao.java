package bo.edu.ucb.ingsoft.bot.dao;

import bo.edu.ucb.ingsoft.bot.dto.PetListDto;
import bo.edu.ucb.ingsoft.bot.dto.UsuarioDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PetListDao {
    @Select("SELECT p.pet_id, p.pet_name, p.pet_tipe, p.pet_age, p.pet_gender,p.pet_stat, p.pet_care, p.pet_contacts, p.pet_image, p.state ,p.mod_user, p.mod_date, p.usuario_id_usuario " +
            "FROM pet p JOIN usuario u  ON p.usuario_id_usuario = u.id_usuario WHERE u.telegram_id = #{userid} AND p.state = 1")
    public List<PetListDto> findPets(@Param("userid") Integer id);

/*
    @Select("SELECT pet_id "+
            "FROM pet WHERE pet_id = #{userid} AND state = 1")
    public UsuarioDto validChatid(@Param("userid") Integer id);
*/
    @Insert("INSERT INTO pet(pet_name, pet_tipe, pet_age, pet_gender, pet_stat, pet_care, pet_contacts,pet_image, state,mod_user,mod_date,usuario_id_usuario) " +
            " VALUES ( #{pet_name}, #{pet_tipe}, #{pet_age}, #{pet_gender}, #{pet_stat}, #{pet_care}, #{pet_contacts}, #{pet_image}, 1,'rene',CURRENT_TIMESTAMP,"+
            " (SELECT u.id_usuario FROM usuario u WHERE u.telegram_id = #{userid} AND u.state = 1)) ")
    //void savePet(PetListDto petListDto,@Param("userid") Integer id); //FIXME: recibir el dto, da :nested exception is org.apache.ibatis.binding.BindingException: Parameter 'pet_name' not found. Available parameters are [petListDto, userid, param1, param2].
    void savePet(@Param("pet_name") String name,@Param("pet_tipe") String tipe,@Param("pet_age") String age,@Param("pet_gender") String gender,@Param("pet_stat") String stat,@Param("pet_care") String care,@Param("pet_contacts") String contacts,@Param("pet_image") String image,@Param("userid") Integer id);
}
