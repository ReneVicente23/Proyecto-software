package bo.edu.ucb.ingsoft.bot.dto;

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
}
