package bo.edu.ucb.ingsoft.bot.api;

import bo.edu.ucb.ingsoft.bot.bl.apibl.UsuarioApiBl;
import bo.edu.ucb.ingsoft.bot.dto.apidto.AuthApiDto;
import bo.edu.ucb.ingsoft.bot.dto.apidto.InUserApiDto;
import bo.edu.ucb.ingsoft.bot.dto.apidto.UsuarioApiDto;
import org.springframework.web.bind.annotation.*;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping("/api/user")
public class UsuarioApi {
    private UsuarioApiBl usuarioApiBl;

    public UsuarioApi(UsuarioApiBl usuarioApiBl) {
        this.usuarioApiBl = usuarioApiBl;
    }

    @PostMapping(path="/", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE )
    public InUserApiDto autentication(@RequestBody InUserApiDto inUserApiDto) {
        // Validamos si los campos obligatorios fueron enviados.
        usuarioApiBl.saveUsuario(inUserApiDto);
        return inUserApiDto;
    }


}
