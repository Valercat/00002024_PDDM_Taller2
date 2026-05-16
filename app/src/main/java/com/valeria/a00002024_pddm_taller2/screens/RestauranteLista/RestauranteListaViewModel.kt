package com.valeria.a00002024_pddm_taller2.screens.RestauranteLista

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.valeria.a00002024_pddm_taller2.data.repositories.RestauranteRepository.RestauranteApiRepository
import com.valeria.a00002024_pddm_taller2.data.repositories.RestauranteRepository.RestauranteRepository
import com.valeria.a00002024_pddm_taller2.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RestauranteListaViewModel : ViewModel() {
    private val restaurantRepository : RestauranteRepository = RestauranteApiRepository()
                            //Le dice a la variable privada que el flujo sera en una lista de restaurantes definida por la lista
                            //actualiza el estado y lo manda al flujo
    private val _restaurant = MutableStateFlow<Map<String, List<Restaurant>>>(emptyMap())
                    //flujo solo para lectura, el cambio se realiza a la privada
    val restaurant = _restaurant.asStateFlow()
    //no hay cambios constantes en ui
    init{
        viewModelScope.launch {
            //declaro el map con los restaurantes por categoria
            _restaurant.value = restaurantRepository.getRestaurantesPorCategoria()
        }
    }
}
