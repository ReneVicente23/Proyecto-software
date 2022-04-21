package bo.edu.ucb.ingsoft.bot.dto;

public class NeighborListDto {

    private String NeighborName;

    private String NeighBorLastName;

    private String NeighborDocumentIdentification;

    private String NeighborAge;

    private String NeighborCellPhoneNumber;

    private String NeighborEmail;

    private String NeighborAddress;

    private String NeighborPhoto;

    public NeighborListDto(String neighborName, String neighBorLastName, String neighborDocumentIdentification,
                           String neighborAge, String neighborCellPhoneNumber, String neighborEmail, String neighborAddress,
                           String neighborPhoto) {
        NeighborName = neighborName;
        NeighBorLastName = neighBorLastName;
        NeighborDocumentIdentification = neighborDocumentIdentification;
        NeighborAge = neighborAge;
        NeighborCellPhoneNumber = neighborCellPhoneNumber;
        NeighborEmail = neighborEmail;
        NeighborAddress = neighborAddress;
        NeighborPhoto = neighborPhoto;
    }

    public NeighborListDto() {

        NeighborName = "";
        NeighBorLastName = "";
        NeighborDocumentIdentification = "";
        NeighborAge = "";
        NeighborCellPhoneNumber = "";
        NeighborEmail = "";
        NeighborAddress = "";
        NeighborPhoto = "";
    }

    public void setNeighborName(String neighborName) {
        NeighborName = neighborName;
    }

    public void setNeighBorLastName(String neighBorLastName) {
        NeighBorLastName = neighBorLastName;
    }

    public void setNeighborDocumentIdentification(String neighborDocumentIdentification) {
        NeighborDocumentIdentification = neighborDocumentIdentification;
    }

    public void setNeighborAge(String neighborAge) {
        NeighborAge = neighborAge;
    }

    public void setNeighborCellPhoneNumber(String neighborCellPhoneNumber) {
        NeighborCellPhoneNumber = neighborCellPhoneNumber;
    }

    public void setNeighborEmail(String neighborEmail) {
        NeighborEmail = neighborEmail;
    }

    public void setNeighborAddress(String neighborAddress) {
        NeighborAddress = neighborAddress;
    }

    public void setNeighborPhoto(String neighborPhoto) {
        NeighborPhoto = neighborPhoto;
    }

    public String getNeighborName() {
        return NeighborName;
    }

    public String getNeighBorLastName() {
        return NeighBorLastName;
    }

    public String getNeighborDocumentIdentification() {
        return NeighborDocumentIdentification;
    }

    public String getNeighborAge() {
        return NeighborAge;
    }

    public String getNeighborCellPhoneNumber() {
        return NeighborCellPhoneNumber;
    }

    public String getNeighborEmail() {
        return NeighborEmail;
    }

    public String getNeighborAddress() {
        return NeighborAddress;
    }

    public String getNeighborPhoto() {
        return NeighborPhoto;
    }

    @Override
    public String toString() {
        return "NeighborName='" + NeighborName + '\'' +
                "\n, NeighBorLastName='" + NeighBorLastName + '\'' +
                "\n, NeighborDocumentIdentification='" + NeighborDocumentIdentification + '\'' +
                "\n, NeighborAge='" + NeighborAge + '\'' +
                "\n, NeighborCellPhoneNumber='" + NeighborCellPhoneNumber + '\'' +
                "\n, NeighborEmail='" + NeighborEmail + '\'' +
                "\n, NeighborAddress='" + NeighborAddress + '\'' +
                "\n, NeighborPhoto='" + NeighborPhoto + '\'' +
                "\n -----------------------------------";
    }

    public String neighborForm(){
        String resp1="";
            if(getNeighborName().contentEquals("")){
                    resp1=("Ingrese su nommbre porfavor: \r\n");
                }
            else{
                if(getNeighBorLastName().contentEquals("")){
                        resp1=("Ingrese su apellido porfavor: \r\n");
                    }
                else{
                    if(getNeighborDocumentIdentification().contentEquals("")){
                            resp1=("Ingrese el numero de identificacion personal porfavor \r\n");
                        }
                    else {
                        if(getNeighborAge().contentEquals("")){
                                resp1=("Ingrese su edad porfavor \r\n");
                            }
                        else{
                            if(getNeighborCellPhoneNumber().contentEquals("")){
                                    resp1=("Ingrese su numero de celular porfavor: \r\n");
                                }
                            else{
                                if(getNeighborEmail().contentEquals("")){
                                        resp1=("Ingrese su correo electronico porfavor: \r\n");
                                    }
                                else{
                                    if(getNeighborAddress().contentEquals("")){
                                            resp1=("Ingrese su Direccion de Domicilio Porfavor: \r\n");
                                        }
                                    else{
                                        if(getNeighborPhoto().contentEquals("")){
                                            resp1=("Ingrese  algun texto de pruba par ala foto de perfil: \r\n");
                                        }
                                        else{
                                            resp1=("Los datos ingresados son:  \r\n" );
                                            resp1=resp1+(toString()+"  \r\n" );
                                            resp1=resp1+("ingrese cualquier carracter para continuar al menu principal:  \r\n" );
                                        }
                                    }

                                }

                            }

                        }
                    }
                }
            }
        return resp1;
    }
    public void neighborsWrite(String text){
        if(getNeighborName().contentEquals("")){
                setNeighborName(text);
            } else{
                if(getNeighBorLastName().contentEquals("")){
                    setNeighBorLastName(text);
                } else{
                    if(getNeighborDocumentIdentification().contentEquals("")){
                        setNeighborDocumentIdentification(text);
                    } else{
                        if(getNeighborEmail().contentEquals("")){
                            setNeighborEmail(text);
                        }
                    else{
                        if(getNeighborAddress().contentEquals("")){
                                setNeighborAddress(text);
                            }
                        else{
                            if(getNeighborPhoto().contentEquals("")){
                                    setNeighborPhoto(text);
                            }
                        }
                    }
                }
            }
        }
    }
}



