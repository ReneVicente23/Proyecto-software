package bo.edu.ucb.ingsoft.bot.api;

import bo.edu.ucb.ingsoft.bot.bl.apibl.ImageApiPetBl;
import bo.edu.ucb.ingsoft.bot.bl.apibl.PetListApiBl;
import bo.edu.ucb.ingsoft.bot.dto.apidto.ImageApiPetDto;
import bo.edu.ucb.ingsoft.bot.dto.apidto.PetListApiDto;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/user")
public class PetApi {
    private PetListApiBl petListApiBl;
    private ImageApiPetBl imageApiPetBl;
    private static Logger LOGGER = LoggerFactory.getLogger(PetApi.class);

    public PetApi(PetListApiBl petListApiBl, ImageApiPetBl imageApiPetBl) {
        this.petListApiBl = petListApiBl;
        this.imageApiPetBl=imageApiPetBl;
    }

    @GetMapping(path="/{userid}/pet/", produces = APPLICATION_JSON_VALUE)
    public List<PetListApiDto> findPetsbyUserid(@PathVariable("userid") Integer userid) {
        return petListApiBl.findPets(userid);
    }

    @PostMapping(path="/{userid}/pet/",produces = APPLICATION_JSON_VALUE)
    public void saveimage(@PathVariable("userid") Integer userid,@RequestParam ("archivos")MultipartFile archivos, @RequestParam ("data")String datos) {
        //FIXME: recibir JSON en lugar de un string, no reconoce Json como objeto PetListApiDto
        LOGGER.info("Formato: {} , Nombre: {}", archivos.getContentType(), archivos.getName());
        LOGGER.info("Datos:  {}", datos);
        UUID uuid = UUID.randomUUID();
        LOGGER.info("UUID {}",uuid);
        Integer id=0;
        try{
            archivos.transferTo(new File("C:\\Users\\rener\\General\\general\\soft\\LostPetApiImages\\"+uuid.toString()));
            imageApiPetBl.saveImage(archivos.getOriginalFilename(),uuid.toString(),archivos.getContentType());
            LOGGER.info("Immagen guardada como: {}",uuid);
            id= imageApiPetBl.findimagesuuid(uuid.toString()).getIdimage();
            LOGGER.info("id imagen: {}",uuid);
        }catch (IOException e){
            throw new RuntimeException("Error al intentar guardar la imagen ");
        }
        //return petListApiBl.savePet();
        petListApiBl.savePet(datos, userid,id);
    }

    @GetMapping(path="/{userid}/pet/{petid}/", produces = APPLICATION_JSON_VALUE)
    public PetListApiDto findPetsbyPetanduserid(@PathVariable("userid") Integer userid,@PathVariable("petid") Integer petid) {
        return petListApiBl.findPetbyid(userid,petid);
    }

    @RequestMapping (path="/{userid}/pet/{petid}/image",method = RequestMethod.GET)
    public ResponseEntity<InputStreamResource> getimage(@PathVariable("userid") Integer userid, @PathVariable("petid") Integer petid) {
        ImageApiPetDto imageApiPetDto=imageApiPetBl.findimagepetid(userid,petid);
        String original=imageApiPetDto.getImagename();
        String uuid=imageApiPetDto.getImageuuid();
        String format=imageApiPetDto.getFormat();
        File file = new File("C:\\Users\\rener\\General\\general\\soft\\LostPetApiImages\\"+uuid);
        InputStreamResource resource=null;
        try {
            resource=new InputStreamResource(new FileInputStream(file));
        }catch (FileNotFoundException e){
            throw new RuntimeException("No se encontro el archivo");
        }
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-type",format);
        return ResponseEntity.ok()
                .headers(httpHeaders)
                .contentLength(file.length())
                .body(resource);
    }


}
