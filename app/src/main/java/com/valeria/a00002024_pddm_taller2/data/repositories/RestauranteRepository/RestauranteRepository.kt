package com.valeria.a00002024_pddm_taller2.data.repositories.RestauranteRepository

import com.valeria.a00002024_pddm_taller2.model.Restaurant

interface RestauranteRepository {
                                //este es el tipo de dato que devuelven
    suspend fun getCategorias(): List<String>

    suspend fun getRestaurantesPorCategoria(): Map<String, List<Restaurant>>

    //nullificador por si no lo encuentra
    suspend fun getRestauranteById(id: Int): Restaurant?

    //query cuando se busque
    suspend fun getSearchRestaurantes(query: String): List<Restaurant>
}