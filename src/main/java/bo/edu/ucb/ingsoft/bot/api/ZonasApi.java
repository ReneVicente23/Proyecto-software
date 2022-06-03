
package bo.edu.ucb.ingsoft.bot.api;

import bo.edu.ucb.ingsoft.bot.bl.apibl.ZonasListApiBl;
import bo.edu.ucb.ingsoft.bot.dto.ZonasListApiDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

public class ZonasApi {

    private ZonasListApiBl zonasListApiBl;


    private static Logger LOGGER = LoggerFactory.getLogger(ZonasApi.class);

    public ZonasApi(ZonasListApiBl zonasListApiBl){
        this. zonasListApiBl = zonasListApiBl;
    }

    @GetMapping(path = "/{zonasid}", produces = APPLICATION_JSON_VALUE)
    public List<ZonasListApiDto> zonasid(@PathVariable("zonasid") Integer zonasid) {
        return  zonasListApiBl.findZonas(zonasid);
    }





}
