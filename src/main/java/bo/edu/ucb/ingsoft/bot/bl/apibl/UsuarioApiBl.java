package bo.edu.ucb.ingsoft.bot.bl.apibl;

import bo.edu.ucb.ingsoft.bot.dao.apidao.UsuarioApiDao;
import bo.edu.ucb.ingsoft.bot.dto.apidto.InUserApiDto;
import bo.edu.ucb.ingsoft.bot.dto.apidto.UsuarioApiDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioApiBl {
    private UsuarioApiDao usuarioApiDao;
    //private InUserApiDto inUserApiDto;

    @Autowired
    public UsuarioApiBl(UsuarioApiDao usuarioApiDao) {
        this.usuarioApiDao = usuarioApiDao;
    }

    public UsuarioApiDto auth(String username,String hashpassword) {
        UsuarioApiDto result=usuarioApiDao.auth(username,hashpassword);
        if(result.getUsername()!= null){
            return result;
        }else{
            return null;
        }
    }

    public void saveUsuario(InUserApiDto inUserApiDto){
      usuarioApiDao.saveUsuarioApi(inUserApiDto.getUsername(),inUserApiDto.getPassword(),inUserApiDto.getName(),inUserApiDto.getLastname());
    }
}
