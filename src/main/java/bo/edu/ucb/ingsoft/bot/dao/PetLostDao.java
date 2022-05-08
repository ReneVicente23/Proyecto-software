package bo.edu.ucb.ingsoft.bot.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface PetLostDao {

    @Insert("INSERT INTO lost_report(Pet_pet_id, state, mod_user, mod_date, place_place_id) " +
            " VALUES ( #{pet_id}, 1,'rene',CURRENT_TIMESTAMP,#{place})")
    void saveLostPet(@Param("pet_id") Integer id , @Param("place") Integer place);

}