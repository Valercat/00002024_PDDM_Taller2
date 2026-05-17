package com.valeria.a00002024_pddm_taller2.screens.RestauranteBusqueda

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.valeria.a00002024_pddm_taller2.data.repositories.RestauranteRepository.RestauranteApiRepository
import com.valeria.a00002024_pddm_taller2.data.repositories.RestauranteRepository.RestauranteRepository
import com.valeria.a00002024_pddm_taller2.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RestauranteBusquedaViewModel: ViewModel() {
    private val restaurantRepository: RestauranteRepository = RestauranteApiRepository()

    private val _restaurant = MutableStateFlow<List<Restaurant>>(emptyList())
    val restaurant = _restaurant.asStateFlow()

    fun RestaurantSearch(query: String) {
        viewModelScope.launch {
            _restaurant.value = restaurantRepository.getSearchRestaurantes(query = query)
        }
    }
}