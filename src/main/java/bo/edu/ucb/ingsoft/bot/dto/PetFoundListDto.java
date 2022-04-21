package bo.edu.ucb.ingsoft.bot.dto;

public class PetFoundListDto {

    private String PetFoundName;

    private String PetFoundDocumentIdentification;

    private String PetFoundCellPhoneNumber;

    private String PetFoundEmail;

    private String PetFoundAddress;

    public PetFoundListDto(String petFoundName, String petFoundDocumentIdentification,
                           String petFoundCellPhoneNumber, String petFoundEmail, String petFoundAddress) {
        PetFoundName = petFoundName;
        PetFoundDocumentIdentification = petFoundDocumentIdentification;
        PetFoundCellPhoneNumber = petFoundCellPhoneNumber;
        PetFoundEmail = petFoundEmail;
        PetFoundAddress =petFoundAddress;
    }

    public PetFoundListDto() {

        PetFoundName = "";
        PetFoundDocumentIdentification = "";
        PetFoundCellPhoneNumber = "";
        PetFoundEmail = "";
        PetFoundAddress = "";
    }

    public void setPetFoundName(String petFoundName) {
        PetFoundName = petFoundName;
    }

    public void setPetFoundDocumentIdentification(String petFoundDocumentIdentification) {
        PetFoundDocumentIdentification = petFoundDocumentIdentification;
    }

    public void setPetFoundCellPhoneNumber(String petFoundCellPhoneNumber) {
        PetFoundCellPhoneNumber = petFoundCellPhoneNumber;
    }

    public void setPetFoundEmail(String petFoundEmail) {
        PetFoundEmail = petFoundEmail;
    }

    public void setPetFoundAddress(String petFoundAddress) {
        PetFoundAddress = petFoundAddress;
    }

    public String getPetFoundName() {
        return PetFoundName;
    }

    public String getPetFoundDocumentIdentification() {
        return PetFoundDocumentIdentification;
    }

    public String getPetFoundCellPhoneNumber() {
        return PetFoundCellPhoneNumber;
    }

    public String getPetFoundEmail() {
        return PetFoundEmail;
    }

    public String getPetFoundAddress() {
        return PetFoundAddress;
    }

    @Override
    public String toString() {
        return "PetFoundName='" + PetFoundName + '\'' +
                "\n, PetFoundDocumentIdentification='" + PetFoundDocumentIdentification + '\'' +
                "\n, PetFoundCellPhoneNumber='" + PetFoundCellPhoneNumber + '\'' +
                "\n, PetFoundEmail='" + PetFoundEmail + '\'' +
                "\n, PetFoundAddress='" + PetFoundAddress + '\'' +
                "\n -----------------------------------";
    }

    public String petFoundForm(){
        String resp1="";
        if(getPetFoundName().contentEquals("")){
            resp1=("Ingrese su nommbre porfavor: \r\n");
        }
        else{
                if(getPetFoundDocumentIdentification().contentEquals("")){
                    resp1=("Ingrese el numero de identificacion personal porfavor \r\n");
                }
                else{
                        if(getPetFoundCellPhoneNumber().contentEquals("")){
                            resp1=("Ingrese su numero de celular porfavor: \r\n");
                        }
                        else{
                            if(getPetFoundEmail().contentEquals("")){
                                resp1=("Ingrese su correo electronico porfavor: \r\n");
                            }
                            else{
                                if(getPetFoundAddress().contentEquals("")){
                                    resp1=("Ingrese su Direccion de Domicilio Porfavor: \r\n");
                                }
                                else{
                                        resp1=("Los datos ingresados son:  \r\n" );
                                        resp1=resp1+(toString()+"  \r\n" );
                                        resp1=resp1+("ingrese cualquier caracter para continuar al menu principal:  \r\n" );
                                    }
                                }

                            }
            }
        }
        return resp1;
    }
    public void petsFoundWrite(String text){
        if(getPetFoundName().contentEquals("")){
            setPetFoundName(text);
        } else{
                if(getPetFoundDocumentIdentification().contentEquals("")){
                    setPetFoundDocumentIdentification(text);
                } else{
                    if(getPetFoundEmail().contentEquals("")){
                        setPetFoundEmail(text);
                    }
                    else{
                        if(getPetFoundAddress().contentEquals("")){
                            setPetFoundAddress(text);
                        }
                    }
                }
            }
    }

}
