package com.valeria.a00002024_pddm_taller2.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.valeria.a00002024_pddm_taller2.model.Restaurant

@Composable
fun RestauranteBusquedaItem(restaurantes: List<Restaurant>, onClick: () -> Unit) {

    Box(modifier = Modifier.fillMaxSize()){

    LazyRow(modifier = Modifier.padding(8.dp).fillMaxHeight().width(350.dp)) {
        items(restaurantes) { restaurante ->
            Card(
                onClick = onClick,
                modifier = Modifier
                    .padding(8.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .fillParentMaxSize()
            ) {
                Row() {
                    Box(modifier = Modifier.weight(1f)){
                        AsyncImage(
                            model = restaurante.imageUrl,
                            contentDescription = restaurante.name,
                            modifier = Modifier
                                .size(width = 100.dp, height = 120.dp)
                                .clip(RoundedCornerShape(8.dp)),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.padding(5.dp))
                    Column(modifier = Modifier.weight(2f).fillMaxSize()) {
                        Text(text = restaurante.name)
                        Spacer(modifier = Modifier.padding(5.dp))
                        Text(text = restaurante.description)
                        Spacer(modifier = Modifier.padding(10.dp))
                        Box(modifier = Modifier.background(MaterialTheme.colorScheme.tertiaryContainer)
                            .clip(RoundedCornerShape(8.dp))){
                        Text(text = restaurante.categories.joinToString(),)
                        }
                    }
                }
            }
        }
    }
    }
}