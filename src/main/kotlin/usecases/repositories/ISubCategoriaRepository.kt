package usecases.repositories

import adapters.entities.SubCategoriaEntity
import java.util.*

interface ISubCategoriaRepository {
    fun save(subCategoria: SubCategoriaEntity): SubCategoriaEntity
    fun getById(id: Int): SubCategoriaEntity
    fun findAll(): List<SubCategoriaEntity>
    fun deleteById(id: Int)
}