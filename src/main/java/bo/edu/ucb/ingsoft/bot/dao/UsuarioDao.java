package bo.edu.ucb.ingsoft.bot.dao;


import bo.edu.ucb.ingsoft.bot.dto.UsuarioDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioDao {
    @Select("SELECT id_usuario, telegram_id, state, mod_user, mod_date " +
            "FROM usuario WHERE telegram_id = #{userid} AND state = 1")
    public UsuarioDto findUserByUserid(@Param("userid") String userid);

    @Select("SELECT id_usuario, telegram_id , state , mod_user , mod_date "+
            "FROM usuario WHERE telegram_id = #{userid} AND state = 1")
    public UsuarioDto validChatid(@Param("userid") String id);

    @Insert("INSERT INTO person (person_id, first_name, last_name, birth_date, status, tx_id, tx_user, tx_host, tx_date) " +
            " VALUES ( #{personId}, #{firstName}, #{lastName}, #{birthDate}, #{status}, #{txId}, #{txUser}, #{txHost}, #{txDate}) ")
    void savePerson(UsuarioDto userDto);
}
