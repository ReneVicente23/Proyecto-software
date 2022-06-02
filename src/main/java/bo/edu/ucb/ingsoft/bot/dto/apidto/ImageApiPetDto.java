package bo.edu.ucb.ingsoft.bot.dto.apidto;

import java.util.Date;

public class ImageApiPetDto {
    private Integer idimage;
    private String imagename;
    private String imageuuid;
    private String format;
    private Integer state;
    private String mod_user;
    private Date mod_date;

    public ImageApiPetDto() {
    }

    public Integer getIdimage() {
        return idimage;
    }

    public void setIdimage(Integer idimage) {
        this.idimage = idimage;
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public String getImageuuid() {
        return imageuuid;
    }

    public void setImageuuid(String imageuuid) {
        this.imageuuid = imageuuid;
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

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "ImageApiPetDto{" +
                "idimage=" + idimage +
                ", imagename='" + imagename + '\'' +
                ", imageuuid='" + imageuuid + '\'' +
                ", format='" + format + '\'' +
                ", state=" + state +
                ", mod_user='" + mod_user + '\'' +
                ", mod_date=" + mod_date +
                '}';
    }
}
