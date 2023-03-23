package id.ac.unpas.functionalcompose.model

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class SetoranSampah(
    @PrimaryKey val id: String,
    val tanggalbeli: String,
    val namaobat: String,
    val jenispenyakit: String,
    val harga: String
)
