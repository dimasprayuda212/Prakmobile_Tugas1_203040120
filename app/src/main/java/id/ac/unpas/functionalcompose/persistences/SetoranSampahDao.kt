package id.ac.unpas.functionalcompose.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.functionalcompose.model.SetoranSampah

@Dao
interface SetoranSampahDao {
    @Query("SELECT * FROM SetoranSampah")
    fun loadAll(): LiveData<List<SetoranSampah>>
    @Query("SELECT * FROM SetoranSampah WHERE id = :id")
    fun find(id: String): SetoranSampah?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: SetoranSampah)
    @Delete
    fun delete(item: SetoranSampah)
}