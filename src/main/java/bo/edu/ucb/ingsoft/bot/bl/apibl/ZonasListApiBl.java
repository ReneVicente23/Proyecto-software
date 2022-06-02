package bo.edu.ucb.ingsoft.bot.bl.apibl;

import bo.edu.ucb.ingsoft.bot.api.ZonasApi;
import bo.edu.ucb.ingsoft.bot.dao.ZonasApiDao;
import bo.edu.ucb.ingsoft.bot.dao.apidao.ZonasListApiDao;
import bo.edu.ucb.ingsoft.bot.dto.apidto.ZonasListApiDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class ZonasListApiBl {

    private ZonasListApiDao zonasListApiDao;


    @Autowired
    public ZonasListApiBl(ZonasListApiDao zonasListApiDao){
        this.zonasListApiDao = zonasListApiDao;

        public List<ZonasListApiDto> findZonas(Integer zonasid){
            int limit=5,offset=0, flag=0;
            List<ZonasListApiDto> result=new ArrayList<~>();
            while (flg==0){
                try{
                    result.addAll(ZonasApiDao.findZonas(zonasid, limits, (offers*limit)));
                }
            }

        }
    }









}
