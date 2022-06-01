package bo.edu.ucb.ingsoft.bot.dao.apidao;

import bo.edu.ucb.ingsoft.bot.dto.apidto.UsuarioApiDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioApiDao {
    @Select("SELECT id_usuario, username,hashpassword ,name ,lastname , state, mod_user, mod_date " +
            "FROM usuario WHERE username = #{username} AND hashpassword = #{password} AND state = 1")
    public UsuarioApiDto auth(@Param("username") String username, @Param("password") String password );

    @Insert("INSERT INTO usuario (username,hashpassword ,name ,lastname ,state,mod_user,mod_date) " +
            " VALUES ( #{username},#{password},#{name},#{lastname}, 1,'rene',CURRENT_TIMESTAMP)")
    void saveUsuarioApi(@Param("username") String username,@Param("password") String password,@Param("name") String name,@Param("lastname") String lastname);

}
