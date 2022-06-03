package bo.edu.ucb.ingsoft.bot.bl.apibl;import bo.edu.ucb.ingsoft.bot.dao.apidao.ZonasListApiDao;import bo.edu.ucb.ingsoft.bot.dto.ZonasListApiDto;import org.springframework.beans.factory.annotation.Autowired;import java.util.ArrayList;import java.util.List;public class ZonasListApiBl {    private ZonasListApiDao zonasListApiDao;    @Autowired    public ZonasListApiBl(ZonasListApiDao zonasListApiDao){        this.zonasListApiDao = zonasListApiDao;    }    public List<ZonasListApiDto>findZonas(Integer zonasid){        int limit=5, offset=0, flg=0;        List<ZonasListApiDto> result =new ArrayList<ZonasListApiDto>();        while (flg==0){            try{                result.addAll(zonasListApiDao.findZonas(zonasid, limit, (offset*limit)));                offset++;                if(result.size()<(offset*limit)){                    flg=1;                }            }catch (NullPointerException e){                flg=1;            }        }        return result;    }}