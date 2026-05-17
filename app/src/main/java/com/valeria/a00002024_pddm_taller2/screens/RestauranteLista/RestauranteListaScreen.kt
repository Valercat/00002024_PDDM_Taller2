package com.valeria.a00002024_pddm_taller2.screens.RestauranteLista

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ManageSearch
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.valeria.a00002024_pddm_taller2.AppScaffold
import com.valeria.a00002024_pddm_taller2.components.RestauranteCategoriaItem

@Composable
fun RestauranteListaScreen(
    viewModel: RestauranteListaViewModel = viewModel(),
    navigateToDetail: (Int) -> Unit,
    navigateToSearch: () -> Unit
) {

    val restaurant by viewModel.restaurant.collectAsState()

    AppScaffold(
        title = "FoodSpot",
        navigationIcon = {
            IconButton(onClick = {
                navigateToSearch()
            }) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ManageSearch,
                    contentDescription = "ToSearch"
                )
            }
        }
    ) { padding ->
        LazyColumn(modifier = Modifier.padding(0.dp, 90.dp, 0.dp, 80.dp)) {
            //cada restaurante se pasa a una lista
            items(restaurant.entries.toList()) { (categoria, restaurantes) ->

                RestauranteCategoriaItem(
                    categoria = categoria,
                    restaurantes = restaurantes,
                    onClick = { id ->
                        navigateToDetail(id)
                    }
                )
            }
        }
    }
}
