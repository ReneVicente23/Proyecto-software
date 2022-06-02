package bo.edu.ucb.ingsoft.bot.bl;

import bo.edu.ucb.ingsoft.bot.dao.ZonasApiDao;
import bo.edu.ucb.ingsoft.bot.dto.apidto.ZonasListApiDto;
import org.springframework.beans.factory.annotation.Autowired;

public class ZonasApiBl {

    private ZonasApiDao zonasApiDao;


    @Autowired
    public ZonasApiBl(ZonasApiDao zonasApiDao) {this.zonasApiDao= zonasApiDao;}

    public ZonasListApiDto

}
