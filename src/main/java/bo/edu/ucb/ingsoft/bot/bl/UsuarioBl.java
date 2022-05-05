package bo.edu.ucb.ingsoft.bot.bl;

import bo.edu.ucb.ingsoft.bot.dao.UsuarioDao;
import bo.edu.ucb.ingsoft.bot.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioBl {
    private UsuarioDao usuarioDao;

    @Autowired
    public UsuarioBl(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }


    public String validChatid(Long chatId) {
        Integer chat= Math.toIntExact(chatId);
        UsuarioDto result=usuarioDao.validChatid(chat);
        if(result.getTelegram_id()!= null){
            return result.getTelegram_id()+"";
        }else{
            return " ";
        }
        //return result.toString();
    }

    public void saveUsuario(Long chatId) {
        Integer chat= Math.toIntExact(chatId);
        usuarioDao.saveUsuario(chat);
    }
}
