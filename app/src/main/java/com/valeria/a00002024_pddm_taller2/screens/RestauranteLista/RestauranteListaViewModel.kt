package com.valeria.a00002024_pddm_taller2.screens.RestauranteLista

import androidx.lifecycle.ViewModel
import com.valeria.a00002024_pddm_taller2.data.repositories.RestauranteRepository.RestauranteApiRepository
import com.valeria.a00002024_pddm_taller2.data.repositories.RestauranteRepository.RestauranteRepository

class RestauranteListaViewModel : ViewModel() {
    private val restaurantRepository : RestauranteRepository = RestauranteApiRepository()


}