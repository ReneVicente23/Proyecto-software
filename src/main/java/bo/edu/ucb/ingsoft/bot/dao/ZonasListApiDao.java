package bo.edu.ucb.ingsoft.bot.dao;

import bo.edu.ucb.ingsoft.bot.dto.ZonasListApiDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface ZonasListApiDao {
    @Select("SELECT z.zona_id, z.zona, z.calle_avenida, z.numero, z.referencia"+
            "FROM zonas ")
    public List<ZonasListApiDto> findZonas(@Param("zonaid") Integer id, @Param("limit")Integer limit,@Param("offset") Integer offset);
}

