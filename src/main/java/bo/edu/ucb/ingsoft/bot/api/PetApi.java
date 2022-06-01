package bo.edu.ucb.ingsoft.bot.api;

import bo.edu.ucb.ingsoft.bot.bl.PetListBl;
import bo.edu.ucb.ingsoft.bot.bl.apibl.PetListApiBl;
import bo.edu.ucb.ingsoft.bot.dto.PetListDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/user")
public class PetApi {
    private PetListApiBl petListApiBl;

    public PetApi(PetListApiBl petListApiBl) {
        this.petListApiBl = petListApiBl;
    }

    @GetMapping(path="/{userid}/pet/", produces = APPLICATION_JSON_VALUE)
    public List<PetListDto> findPetsbyUserid(@PathVariable("userid") Integer userid) {
        Long id=userid.longValue();
        return petListApiBl.findPets(id);
    }
}
