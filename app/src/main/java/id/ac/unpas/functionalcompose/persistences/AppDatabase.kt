package id.ac.unpas.functionalcompose.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.functionalcompose.model.SetoranSampah

@Database(entities = [SetoranSampah::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun setoranSampahDao(): SetoranSampahDao
}