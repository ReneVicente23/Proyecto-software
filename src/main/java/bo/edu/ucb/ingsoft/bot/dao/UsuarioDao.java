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
    public UsuarioDto validChatid(@Param("userid") Integer id);

    @Insert("INSERT INTO usuario (telegram_id,state,mod_user,mod_date) " +
            " VALUES ( #{userid}, 1,'rene',CURRENT_TIMESTAMP)")
    void saveUsuario(@Param("userid") Integer id);
}
