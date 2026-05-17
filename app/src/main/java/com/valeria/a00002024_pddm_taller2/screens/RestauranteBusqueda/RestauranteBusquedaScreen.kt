package com.valeria.a00002024_pddm_taller2.screens.RestauranteBusqueda

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.valeria.a00002024_pddm_taller2.AppScaffold
import com.valeria.a00002024_pddm_taller2.components.RestauranteBusquedaItem

@Composable
fun RestauranteBusquedaScreen(
    navigateBack: () -> Unit,
    navigateToDetail: (Int) -> Unit,
    viewModel : RestauranteBusquedaViewModel = viewModel())
{   val busqueda  : MutableState<String> = rememberSaveable() { mutableStateOf("") }
    var query by rememberSaveable() { mutableStateOf("") }

    LaunchedEffect(query) {
        viewModel.RestaurantSearch(query)
    }
    val restaurant by viewModel.restaurant.collectAsState()

    AppScaffold(
        title = "Buscar",
        navigationIcon = {
            IconButton(onClick = {
                navigateBack()
            }) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back"
                )
            }
        }
    ) { padding ->
        Box(modifier = Modifier.padding(padding)) {

            TextField(
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .background(color = MaterialTheme.colorScheme.background)
                    .padding(10.dp)
                    .fillMaxWidth(),
                placeholder = { Text(text = "Busca un platillo o restaurante...") },
                value = query,
                onValueChange = {
                    query = it
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search"
                    )
                },
                singleLine = true,
                maxLines = 1

            )
            if (restaurant.isEmpty()) {
                Box(modifier = Modifier
                    .padding(20.dp, 100.dp, 20.dp, 20.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .size(200.dp, 200.dp)
                    .align(alignment = androidx.compose.ui.Alignment.Center)
                )

                {
                    Text(text = "No se encontraron resultados",)
                }
            } else {
            Spacer(modifier = Modifier.height(15.dp).padding(padding))
            Text(
                text = "${restaurant.size} Restaurantes encontrados",
                modifier = Modifier.padding(15.dp, 75.dp, 0.dp, 10.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))

            LazyColumn(modifier = Modifier.padding(padding)) {
                items(restaurant) { restaurante ->
                    RestauranteBusquedaItem(
                        restaurantes = listOf(restaurante),
                        onClick = {
                            navigateToDetail(restaurante.id)
                        }
                    )
                }
            }
        }
        }
    }
}