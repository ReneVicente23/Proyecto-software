package bo.edu.ucb.ingsoft.bot.dto;
import bo.edu.ucb.ingsoft.bot.chat.MenuProcessImpl;
import bo.edu.ucb.ingsoft.bot.chat.RegisterNeighborsGroupFormProcessIml;
public class NeighborDto {

    private String NeighborName;

    private String NeighBorLastName;

    private String NeighborDocumentIdentification;

    private String NeighborAge;

    private String NeighborCellPhoneNumber;

    private String NeighborEmail;

    private String NeighborAddress;

    private String NeighborPhoto;

    public NeighborDto(String neighborName, String neighBorLastName, String neighborDocumentIdentification, String neighborAge, String neighborCellPhoneNumber, String neighborEmail, String neighborAddress, String neighborPhoto) {
        NeighborName = neighborName;
        NeighBorLastName = neighBorLastName;
        NeighborDocumentIdentification = neighborDocumentIdentification;
        NeighborAge = neighborAge;
        NeighborCellPhoneNumber = neighborCellPhoneNumber;
        NeighborEmail = neighborEmail;
        NeighborAddress = neighborAddress;
        NeighborPhoto = neighborPhoto;
    }
}
