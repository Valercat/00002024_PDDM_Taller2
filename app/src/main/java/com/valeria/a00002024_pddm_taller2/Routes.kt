package com.valeria.a00002024_pddm_taller2

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes: NavKey {

    @Serializable
    data object Home : Routes()
    @Serializable
    data object RestaurantLista : Routes()
    @Serializable
    data object RestaurantBusqueda : Routes()
    @Serializable
    data class RestaurantDetail(val restaurantId :Int): Routes()

}