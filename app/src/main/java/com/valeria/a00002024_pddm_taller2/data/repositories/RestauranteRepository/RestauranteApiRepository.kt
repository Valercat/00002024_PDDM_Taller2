package com.valeria.a00002024_pddm_taller2.data.repositories.RestauranteRepository

import com.valeria.a00002024_pddm_taller2.model.Restaurant
import com.valeria.a00002024_pddm_taller2.sampleRestaurants

class RestauranteApiRepository : RestauranteRepository {
    //definiendo la variable de la lista para que no se tenga acceso directo a esta
    private val restaurantes = sampleRestaurants

    override suspend fun getCategorias(): List<String>{
        //flat map hace que todas las categorias se hagan enn una sola lista en lugar de una lista de listas
        //y distinct ve que todas las categorias sean unicas
        return restaurantes.flatMap { it.categories }.distinct()
    }

    override suspend fun getRestaurantesPorCategoria() : Map<String, List<Restaurant>> {
        return restaurantes.flatMap { restaurante ->
                restaurante.categories.map { categoria ->
                    //darle una categoria a cada restaurante
                    //Pair(categoria, restaurante) como restaurante puede tenaer mas de una categoria
                    //se le asigna las categorias
                    categoria to restaurante
                }
            }
            .groupBy(
                //en base a el map entiende que la categoria va primero y luego el restaurante
                //first   categoría
                //second  restaurante
                keySelector = { it.first },
                valueTransform = { it.second }
            )
    }

    override suspend fun getRestauranteById(id: Int): Restaurant? {
        return restaurantes.find {it.id == id}
    }

    override suspend fun searchRestaurantes(query: String): List<Restaurant> {
        //si no hay nada en el de busqueda
        if (query.isBlank()) {return restaurantes}
                            //filtra
            return restaurantes.filter { restaurante ->
                //busca los platos dentro de menu por cada restaurante
                val searchPlato = restaurante.menu.any { dish ->
                                        //en la busqueda no tienen por que haber comparacion exacta por el ignore case
                    dish.name.contains(query, ignoreCase = true)
                }

                val searchRestaurante =
                    restaurante.name.contains(query, ignoreCase = true)
                //returna el restaurante en base a la busqueda
                searchPlato || searchRestaurante
            }
    }



}