package bo.edu.ucb.ingsoft.bot.api;


import bo.edu.ucb.ingsoft.bot.bl.ZonasApiBl;
import bo.edu.ucb.ingsoft.bot.bl.apibl.ZonasListApiBl;
import bo.edu.ucb.ingsoft.bot.dto.apidto.InUserApiDto;
import bo.edu.ucb.ingsoft.bot.dto.apidto.ZonasListApiDto;
import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Application;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/zonas")

public class ZonasApi {

    private ZonasListApiBl zonasListApiBl;

    private static Logger LOGGER = LoggerFactory.getLogger(ZonasApi.class);

    public ZonasApi(ZonasListApiBl zonasListApiBl){
        this.zonasListApiBl = zonasListApiBl;
    }





}
