package com.valeria.a00002024_pddm_taller2.screens.RestauranteDetalle

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.valeria.a00002024_pddm_taller2.data.repositories.RestauranteRepository.RestauranteApiRepository
import com.valeria.a00002024_pddm_taller2.data.repositories.RestauranteRepository.RestauranteRepository
import com.valeria.a00002024_pddm_taller2.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RestauranteDetalleViewModel : ViewModel(){
    private val restaurantRepository : RestauranteRepository = RestauranteApiRepository()

    private val _restaurant = MutableStateFlow<Restaurant?>(null)

    val restaurant = _restaurant.asStateFlow()

    //usara un launched effect ya que debe observar el cambio de id
    fun RestaurantById(id: Int) {
        viewModelScope.launch {
                _restaurant.value = restaurantRepository.getRestauranteById(id)
        }
    }


}