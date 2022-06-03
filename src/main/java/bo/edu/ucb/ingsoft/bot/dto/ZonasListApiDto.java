package bo.edu.ucb.ingsoft.bot.dto;

import java.util.Date;

public class ZonasListApiDto {

    private Integer zona_id;

    private String zona_name;

    private String zona_Calle_Avenida;

    private String zona_numero;

    private String zona_Referencia;

    private Date mod_date;

    private Integer usuario_id_usuario;

    public ZonasListApiDto(Integer zona_id, String zona_name, String zona_Calle_Avenida, String zona_numero, String zona_Referencia, Date mod_date, Integer usuario_id_usuario) {
        this.zona_id = zona_id;
        this.zona_name = zona_name;
        this.zona_Calle_Avenida = zona_Calle_Avenida;
        this.zona_numero = zona_numero;
        this.zona_Referencia = zona_Referencia;
        this.mod_date = mod_date;
        this.usuario_id_usuario = usuario_id_usuario;
    }

    public void setZona_id(Integer zona_id) {
        this.zona_id = zona_id;
    }

    public void setZona_name(String zona_name) {
        this.zona_name = zona_name;
    }

    public void setZona_Calle_Avenida(String zona_Calle_Avenida) {
        this.zona_Calle_Avenida = zona_Calle_Avenida;
    }

    public void setZona_numero(String zona_numero) {
        this.zona_numero = zona_numero;
    }

    public void setZona_Referencia(String zona_Referencia) {
        this.zona_Referencia = zona_Referencia;
    }

    public void setMod_date(Date mod_date) {
        this.mod_date = mod_date;
    }

    public void setUsuario_id_usuario(Integer usuario_id_usuario) {
        this.usuario_id_usuario = usuario_id_usuario;
    }

    public Integer getZona_id() {
        return zona_id;
    }

    public String getZona_name() {
        return zona_name;
    }

    public String getZona_Calle_Avenida() {
        return zona_Calle_Avenida;
    }

    public String getZona_numero() {
        return zona_numero;
    }

    public String getZona_Referencia() {
        return zona_Referencia;
    }

    public Date getMod_date() {
        return mod_date;
    }

    public Integer getUsuario_id_usuario() {
        return usuario_id_usuario;
    }

    @Override
    public String toString() {
        return "ZonasListApiDto{" +
                "zona_id=" + zona_id +
                ", zona_name='" + zona_name + '\'' +
                ", zona_Calle_Avenida='" + zona_Calle_Avenida + '\'' +
                ", zona_numero='" + zona_numero + '\'' +
                ", zona_Referencia='" + zona_Referencia + '\'' +
                ", mod_date=" + mod_date +
                ", usuario_id_usuario=" + usuario_id_usuario +
                '}';
    }
}
