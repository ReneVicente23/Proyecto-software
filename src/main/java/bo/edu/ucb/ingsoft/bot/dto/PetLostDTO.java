package bo.edu.ucb.ingsoft.bot.dto;

import java.util.Date;

public class PetLostDTO {

    private Integer lostreportid;
    private Integer Pet_pet_id;
    private Integer state;
    private String mod_user;
    private Date mod_date;
    private Integer place_place_id;

    public PetLostDTO(Integer lostreportid, Integer pet_pet_id, Integer state, String mod_user, Date mod_date, Integer place_place_id) {
        this.lostreportid = lostreportid;
        Pet_pet_id = pet_pet_id;
        this.state = state;
        this.mod_user = mod_user;
        this.mod_date = mod_date;
        this.place_place_id = place_place_id;
    }

    public PetLostDTO(){

    }

    public Integer getLostreportid() {
        return lostreportid;
    }

    public void setLostreportid(Integer lostreportid) {
        this.lostreportid = lostreportid;
    }

    public Integer getPet_pet_id() {
        return Pet_pet_id;
    }

    public void setPet_pet_id(Integer pet_pet_id) {
        Pet_pet_id = pet_pet_id;
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

    public Integer getPlace_place_id() {
        return place_place_id;
    }

    public void setPlace_place_id(Integer place_place_id) {
        this.place_place_id = place_place_id;
    }

    @Override
    public String toString() {
        return "PetLostDTO{" +
                "lostreportid=" + lostreportid +
                ", Pet_pet_id=" + Pet_pet_id +
                ", state=" + state +
                ", mod_user='" + mod_user + '\'' +
                ", mod_date=" + mod_date +
                ", place_place_id=" + place_place_id +
                '}';
    }
}
