package bo.edu.ucb.ingsoft.bot.dto;
import java.util.Date;

public class PetListDto {
    private Integer pet_id;
    private String pet_name;
    private String pet_tipe;
    private String pet_age;
    private String pet_gender;
    private String pet_stat;
    private String pet_care;
    private String pet_contacts;
    private String pet_image;
    private Integer state;
    private String mod_user;
    private Date mod_date;
    private Integer Ususario_id_usuario;

    public PetListDto(Integer pet_id, String pet_name, String pet_tipe, String pet_age, String pet_gender, String pet_stat, String pet_care, String pet_contacts, String pet_image, Integer state, String mod_user, Date mod_date, Integer ususario_id_usuario) {
        this.pet_id = pet_id;
        this.pet_name = pet_name;
        this.pet_tipe = pet_tipe;
        this.pet_age = pet_age;
        this.pet_gender = pet_gender;
        this.pet_stat = pet_stat;
        this.pet_care = pet_care;
        this.pet_contacts = pet_contacts;
        this.pet_image = pet_image;
        this.state = state;
        this.mod_user = mod_user;
        this.mod_date = mod_date;
        Ususario_id_usuario = ususario_id_usuario;
    }

    public PetListDto(String petname, String petTipe, String petAge, String petGender, String petStat, String petCare, String petContacts, String petImage) {
        pet_name = petname;
        pet_tipe = petTipe;
        pet_age = petAge;
        pet_gender = petGender;
        pet_stat = petStat;
        pet_care = petCare;
        pet_contacts = petContacts;
        pet_image = petImage;
    }

    public PetListDto() {
        pet_name = " ";
        pet_tipe = " ";
        pet_age = " ";
        pet_gender = " ";
        pet_stat = " ";
        pet_care = " ";
        pet_contacts = " ";
        pet_image = " ";
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

    public void setPet_image(String pet_image) {
        this.pet_image = pet_image;
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

    public String getPet_image() {
        return pet_image;
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

    public Integer getUsusario_id_usuario() {
        return Ususario_id_usuario;
    }

    public void setUsusario_id_usuario(Integer ususario_id_usuario) {
        Ususario_id_usuario = ususario_id_usuario;
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

    public String petForm(){
        String resp=" ";
        if(getPet_name().contentEquals(" ")){
            resp=("Ingrese el nombre de la mascota: \r\n" );
        }else{
            if(getPet_tipe().contentEquals(" ")){
                resp=("Ingrese la especie y raza de la mascota: \r\n" );
            }else{
                if(getPet_age().contentEquals(" ")){
                    resp=("Ingrese la edad de la mascota: \r\n" );
                }else{
                    if(getPetGender().contentEquals(" ")){
                        resp=("Ingrese el genero de la mascota: \r\n" );
                    }else{
                        if(getPet_stat().contentEquals(" ")){
                            resp=("Ingrese rasgos de la mascota: \r\n" );
                        }else{
                            if(getPet_care().contentEquals(" ")){
                                resp=("¿su mascota tiene cuidados especiales? (si no tiene cuidados especiales ingrese no): \r\n" );
                            }else{
                                if(getPet_contacts().contentEquals(" ")){
                                    resp=("¿tiene contactos adicionales? (si no los tiene ingrese no): \r\n" );
                                }else{
                                    if(getPet_image().contentEquals(" ")){
                                        resp=("Adjunte una foto de su mascota o tome una desde adjuntar \r\n" );
                                    } else{
                                        resp=("Los datos ingresados son:  \r\n" );
                                        resp=resp+(toString()+"  \r\n" );
                                        resp=resp+("ingrese cualquier carracter para continuar al menu principal:  \r\n" );
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return resp;
    }

    public void petWrite(String text){
        if(getPet_name().contentEquals(" ")){
            setPet_name(text);
        }else {
            if (getPet_tipe().contentEquals(" ")) {
                setPet_tipe(text);
            } else {
                if (getPet_age().contentEquals(" ")) {
                    setPet_age(text);
                } else {
                    if (getPetGender().contentEquals(" ")) {
                        setPetGender(text);
                    } else {
                        if (getPet_stat().contentEquals(" ")) {
                            setPet_stat(text);
                        } else {
                            if (getPet_care().contentEquals(" ")) {
                                setPet_care(text);
                            } else {
                                if (getPet_contacts().contentEquals(" ")) {
                                    setPet_contacts(text);
                                } else {
                                    if (getPet_image().contentEquals(" ")) {
                                        setPet_image(text);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
