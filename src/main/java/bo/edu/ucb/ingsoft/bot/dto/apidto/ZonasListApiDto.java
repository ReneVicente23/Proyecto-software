package bo.edu.ucb.ingsoft.bot.dto.apidto;

import java.util.Date;

public class ZonasListApiDto {

    private Integer zona_id;

    private String zona_name;

    private String zona_Calle_Avenida;

    private String numero;

    private String referencia;

    protected Date mod_Date;

    private Integer ususario_id_usuario;


    public ZonasListApiDto(Integer zona_id, String zona_name, String zona_Calle_Avenida, String numero, String referencia, Date mod_Date, Integer ususario_id_usuario) {
        this.zona_id = zona_id;
        this.zona_name = zona_name;
        this.zona_Calle_Avenida = zona_Calle_Avenida;
        this.numero = numero;
        this.referencia = referencia;
        this.mod_Date = mod_Date;
        this.ususario_id_usuario = ususario_id_usuario;
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

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setMod_Date(Date mod_Date) {
        this.mod_Date = mod_Date;
    }

    public void setUsusario_id_usuario(Integer ususario_id_usuario) {
        this.ususario_id_usuario = ususario_id_usuario;
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

    public String getNumero() {
        return numero;
    }

    public String getReferencia() {
        return referencia;
    }

    public Date getMod_Date() {
        return mod_Date;
    }

    public Integer getUsusario_id_usuario() {
        return ususario_id_usuario;
    }


    @Override
    public String toString() {
        return "ZonasApiDto{" +
                "zona_id=" + zona_id +
                ", zona_name='" + zona_name + '\'' +
                ", zona_Calle_Avenida='" + zona_Calle_Avenida + '\'' +
                ", numero='" + numero + '\'' +
                ", referencia='" + referencia + '\'' +
                ", mod_Date=" + mod_Date +
                ", ususario_id_usuario=" + ususario_id_usuario +
                '}';
    }
}
