package bo.edu.ucb.ingsoft.bot.dto;
import java.util.Date;

public class UsuarioDto {
    private Integer id_usuario;
    private Integer telegram_id;
    private Integer state;
    private String mod_user;
    private Date mod_date;

    public UsuarioDto() {
    }

    public UsuarioDto(Integer id_usuario, Integer chatid, Integer state, String mod_user, Date mod_date) {
        this.id_usuario = id_usuario;
        this.telegram_id = chatid;
        this.state = state;
        this.mod_user = mod_user;
        this.mod_date = mod_date;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getTelegram_id() {
        return telegram_id;
    }

    public void setTelegram_id(Integer telegram_id) {
        this.telegram_id = telegram_id;
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

    @Override
    public String toString() {
        return "UsuarioDto:  " +
                "id_usuario= " + id_usuario +
                ", chatid= " + telegram_id;
    }
}
