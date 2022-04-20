package bo.edu.ucb.ingsoft.bot.dto;

import bo.edu.ucb.ingsoft.bot.chat.MenuProcessImpl;
import bo.edu.ucb.ingsoft.bot.chat.RequestsRegisterPetFromImpl;

public class PetListDto {
    private String PetName;
    private String PetTipe;
    private String PetAge;
    private String PetGender;
    private String PetStat;
    private String PetCare;
    private String PetContacts;
    private String PetImage;

    public PetListDto(String petName, String petTipe, String petAge, String petGender, String petStat, String petCare, String petContacts, String petImage) {
        PetName = petName;
        PetTipe = petTipe;
        PetAge = petAge;
        PetGender = petGender;
        PetStat = petStat;
        PetCare = petCare;
        PetContacts = petContacts;
        PetImage = petImage;
    }

    public PetListDto() {
        PetName = " ";
        PetTipe = " ";
        PetAge = " ";
        PetGender = " ";
        PetStat = " ";
        PetCare = " ";
        PetContacts = " ";
        PetImage = " ";
    }

    public void setPetName(String petName) {
        PetName = petName;
    }

    public void setPetTipe(String petTipe) {
        PetTipe = petTipe;
    }

    public void setPetAge(String petAge) {
        PetAge = petAge;
    }

    public void setPetGender(String petGender) {
        PetGender = petGender;
    }

    public void setPetStat(String petStat) {
        PetStat = petStat;
    }

    public void setPetCare(String petCare) {
        PetCare = petCare;
    }

    public void setPetContacts(String petContacts) {
        PetContacts = petContacts;
    }

    public void setPetImage(String petImage) {
        PetImage = petImage;
    }

    public String getPetName() {
        return PetName;
    }

    public String getPetTipe() {
        return PetTipe;
    }

    public String getPetAge() {
        return PetAge;
    }

    public String getPetGender() {
        return PetGender;
    }

    public String getPetStat() {
        return PetStat;
    }

    public String getPetCare() {
        return PetCare;
    }

    public String getPetContacts() {
        return PetContacts;
    }

    public String getPetImage() {
        return PetImage;
    }

    @Override
    public String toString() {
        return "Nombre de la mascota= '" + PetName + '\'' +
                "\n Especie y raza= '" + PetTipe + '\'' +
                "\n Edad de la mascota= '" + PetAge + '\'' +
                "\n Genero= '" + PetGender + '\'' +
                "\n Rasgos= '" + PetStat + '\'' +
                "\n Cuidados= '" + PetCare + '\'' +
                "\n Contactos= '" + PetContacts + '\'' +
                "\n Imagen= '" + PetImage + '\''+
                "\n ---------------------------------";
    }

    public String petForm(){
        String resp=" ";
        if(getPetName().contentEquals(" ")){
            resp=("Ingrese el nombre de la mascota: \r\n" );
        }else{
            if(getPetTipe().contentEquals(" ")){
                resp=("Ingrese la especie y raza de la mascota: \r\n" );
            }else{
                if(getPetAge().contentEquals(" ")){
                    resp=("Ingrese la edad de la mascota: \r\n" );
                }else{
                    if(getPetGender().contentEquals(" ")){
                        resp=("Ingrese el genero de la mascota: \r\n" );
                    }else{
                        if(getPetStat().contentEquals(" ")){
                            resp=("Ingrese rasgos de la mascota: \r\n" );
                        }else{
                            if(getPetCare().contentEquals(" ")){
                                resp=("¿su mascota tiene cuidados especiales? (si no tiene cuidados especiales ingrese no): \r\n" );
                            }else{
                                if(getPetContacts().contentEquals(" ")){
                                    resp=("¿tiene contactos adicionales? (si no los tiene ingrese no): \r\n" );
                                }else{
                                    if(getPetImage().contentEquals(" ")){
                                        resp=("espacio de prueba para imagenes ingrese cualquier texto \r\n" );
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
        if(getPetName().contentEquals(" ")){
            setPetName(text);
        }else {
            if (getPetTipe().contentEquals(" ")) {
                setPetTipe(text);
            } else {
                if (getPetAge().contentEquals(" ")) {
                    setPetAge(text);
                } else {
                    if (getPetGender().contentEquals(" ")) {
                        setPetGender(text);
                    } else {
                        if (getPetStat().contentEquals(" ")) {
                            setPetStat(text);
                        } else {
                            if (getPetCare().contentEquals(" ")) {
                                setPetCare(text);
                            } else {
                                if (getPetContacts().contentEquals(" ")) {
                                    setPetContacts(text);
                                } else {
                                    if (getPetImage().contentEquals(" ")) {
                                        setPetImage(text);
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
