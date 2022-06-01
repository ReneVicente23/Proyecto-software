package bo.edu.ucb.ingsoft.bot.api;

import bo.edu.ucb.ingsoft.bot.bl.apibl.UsuarioApiBl;
import bo.edu.ucb.ingsoft.bot.dto.apidto.AuthApiDto;
import bo.edu.ucb.ingsoft.bot.dto.apidto.UsuarioApiDto;
import org.springframework.web.bind.annotation.*;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping("/api/auth")
public class AuthApi {
    private UsuarioApiBl usuarioApiBl;

    public AuthApi(UsuarioApiBl usuarioApiBl) {
        this.usuarioApiBl = usuarioApiBl;
    }

    @PostMapping(path="/", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE )
    public UsuarioApiDto autentication(@RequestBody AuthApiDto authApiDto) {
        // Validamos si los campos obligatorios fueron enviados.

        return usuarioApiBl.auth(authApiDto.getUsername(),authApiDto.getPassword());
    }
}
