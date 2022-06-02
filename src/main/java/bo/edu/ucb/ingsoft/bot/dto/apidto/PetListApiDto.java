package bo.edu.ucb.ingsoft.bot.dto.apidto;
import java.util.Date;

public class PetListApiDto {
    private Integer pet_id;
    private String pet_name;
    private String pet_tipe;
    private String pet_age;
    private String pet_gender;
    private String pet_stat;
    private String pet_care;
    private String pet_contacts;
    private Integer state;
    private String mod_user;
    private Date mod_date;
    private Integer ususario_id_usuario;
    private Integer image_idimage;

    public PetListApiDto(Integer pet_id, String pet_name, String pet_tipe, String pet_age, String pet_gender, String pet_stat, String pet_care, String pet_contacts, Integer state, String mod_user, Date mod_date, Integer ususario_id_usuario, Integer image_idimage) {
        this.pet_id = pet_id;
        this.pet_name = pet_name;
        this.pet_tipe = pet_tipe;
        this.pet_age = pet_age;
        this.pet_gender = pet_gender;
        this.pet_stat = pet_stat;
        this.pet_care = pet_care;
        this.pet_contacts = pet_contacts;
        this.state = state;
        this.mod_user = mod_user;
        this.mod_date = mod_date;
        this.ususario_id_usuario = ususario_id_usuario;
        this.image_idimage = image_idimage;
    }

    public PetListApiDto(String pet_name, String pet_tipe, String pet_age, String pet_gender, String pet_stat, String pet_care, String pet_contacts) {
        this.pet_name = pet_name;
        this.pet_tipe = pet_tipe;
        this.pet_age = pet_age;
        this.pet_gender = pet_gender;
        this.pet_stat = pet_stat;
        this.pet_care = pet_care;
        this.pet_contacts = pet_contacts;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public void setPet_tipe(String pet_tipe) {
        this.pet_tipe = pet_tipe;
    }

    public void setPet_age(String pet_age) {
        this.pet_age = pet_age;
    }

    public void setPetGender(String petGender) {
        pet_gender = petGender;
    }

    public void setPet_stat(String pet_stat) {
        this.pet_stat = pet_stat;
    }

    public void setPet_care(String pet_care) {
        this.pet_care = pet_care;
    }

    public void setPet_contacts(String pet_contacts) {
        this.pet_contacts = pet_contacts;
    }

    public String getPet_name() {
        return pet_name;
    }

    public String getPet_tipe() {
        return pet_tipe;
    }

    public String getPet_age() {
        return pet_age;
    }

    public String getPetGender() {
        return pet_gender;
    }

    public String getPet_stat() {
        return pet_stat;
    }

    public String getPet_care() {
        return pet_care;
    }

    public String getPet_contacts() {
        return pet_contacts;
    }

    public Integer getPet_id() {
        return pet_id;
    }

    public void setPet_id(Integer pet_id) {
        this.pet_id = pet_id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMod_user() {
        return mod_user;
    }

    public void setMod_user(String mod_user) {
        this.mod_user = mod_user;
    }

    public Date getMod_date() {
        return mod_date;
    }

    public void setMod_date(Date mod_date) {
        this.mod_date = mod_date;
    }

    public String getPet_gender() {
        return pet_gender;
    }

    public void setPet_gender(String pet_gender) {
        this.pet_gender = pet_gender;
    }

    public Integer getUsusario_id_usuario() {
        return ususario_id_usuario;
    }

    public void setUsusario_id_usuario(Integer ususario_id_usuario) {
        this.ususario_id_usuario = ususario_id_usuario;
    }

    public Integer getImage_idimage() {
        return image_idimage;
    }

    public void setImage_idimage(Integer image_idimage) {
        this.image_idimage = image_idimage;
    }

    @Override
    public String toString() {
        return "Nombre de la mascota= '" + pet_name + '\'' +
                "\n Especie y raza= '" + pet_tipe + '\'' +
                "\n Edad de la mascota= '" + pet_age + '\'' +
                "\n Genero= '" + pet_gender + '\'' +
                "\n Rasgos= '" + pet_stat + '\'' +
                "\n Cuidados= '" + pet_care + '\'' +
                "\n Contactos= '" + pet_contacts + '\'' ;//+
                //"\n Imagen= '" + pet_image + '\''+
                //"\n ---------------------------------";
    }
}
