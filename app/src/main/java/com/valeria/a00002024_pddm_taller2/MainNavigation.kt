package com.valeria.a00002024_pddm_taller2

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.valeria.a00002024_pddm_taller2.screens.RestauranteBusqueda.RestauranteBusquedaScreen
import com.valeria.a00002024_pddm_taller2.screens.RestauranteDetalle.RestauranteDetallesScreen
import com.valeria.a00002024_pddm_taller2.screens.RestauranteLista.RestauranteListaScreen

@Composable
fun AppFoodSpot() {
    val backStack = rememberNavBackStack(Routes.Home)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Routes.Home> {
                RestauranteListaScreen(
                    navigateToDetail = { restaurantId ->
                        backStack.add(Routes.RestaurantDetail(restaurantId))
                    },
                    navigateToSearch = {
                        backStack.add(Routes.RestaurantBusqueda)
                    }
                )
            }
            entry<Routes.RestaurantDetail> { key ->
                RestauranteDetallesScreen(
                    restauranteId = key.restaurantId,
                    navigateBack = {
                        backStack.removeLastOrNull()
                    }
                )
            }
            entry<Routes.RestaurantBusqueda> { key ->
                RestauranteBusquedaScreen(
                    navigateBack = {
                        backStack.removeLastOrNull()
                    },
                    navigateToDetail = { restaurantId ->
                        backStack.add(Routes.RestaurantDetail(restaurantId))
                    }
                )
            }
        },
        transitionSpec = {
            slideInHorizontally(
                initialOffsetX = { it },
                animationSpec = tween(500)
            ) togetherWith slideOutHorizontally(
                targetOffsetX = { -it },
                animationSpec = tween(500)
            )
        }
    )

}