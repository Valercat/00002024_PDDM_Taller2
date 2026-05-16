package com.valeria.a00002024_pddm_taller2.screens.RestauranteLista

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ManageSearch
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import com.valeria.a00002024_pddm_taller2.AppScaffold

@Composable
fun RestauranteLista(){
    AppScaffold(
        title = "FoodSpot",
        navigationIcon = {
            IconButton(onClick = {
                //Va a Busqueda Screen
            }) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ManageSearch,
                    contentDescription = "Back"
                )
            }
        }
    ){ padding ->
        Row(){

        }
    }
}