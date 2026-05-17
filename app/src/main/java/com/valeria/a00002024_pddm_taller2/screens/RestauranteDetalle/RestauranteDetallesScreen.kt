package com.valeria.a00002024_pddm_taller2.screens.RestauranteDetalle

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.valeria.a00002024_pddm_taller2.AppScaffold
import com.valeria.a00002024_pddm_taller2.components.RestauranteMenuItem


@Composable
fun RestauranteDetallesScreen(restauranteId: Int,
                              navigateBack: () -> Unit,
                              viewModel : RestauranteDetalleViewModel = viewModel()){
    val restaurant by viewModel.restaurant.collectAsState()
    val context = LocalContext.current

    LaunchedEffect(restauranteId) {
        viewModel.RestaurantById(restauranteId)
    }

    restaurant?.let {
        AppScaffold(
            title = it.name,
            navigationIcon = {
                IconButton(onClick = {
                    navigateBack()
                }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            },
        ) { padding ->
            Box(modifier = Modifier.padding(padding).fillMaxSize() .clip(RoundedCornerShape(8.dp))) {
                Text(restaurant!!.description, modifier = Modifier.padding(15.dp, 15.dp, 15.dp, 15.dp))
                LazyColumn(modifier = Modifier.padding(0.dp, 50.dp, 0.dp, 80.dp)) {

                    items(restaurant!!.menu.toList()) { dish ->

                        RestauranteMenuItem(
                            dish = listOf(dish),
                            onClick = {
                                Toast.makeText(
                                    context,
                                    "${dish.name} agregado al carrito",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        )
                    }

                }

            }
        }
    }
}