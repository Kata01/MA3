package si.uni_lj.fri.pbd.miniapp3.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import si.uni_lj.fri.pbd.miniapp3.database.entity.RecipeDetails

@Dao
interface RecipeDao {
    @Query("SELECT * FROM RecipeDetails WHERE idDrink = :idDrink")
    fun getRecipeById(idDrink: String?): RecipeDetails?

    // TODO: Add the missing methods
}