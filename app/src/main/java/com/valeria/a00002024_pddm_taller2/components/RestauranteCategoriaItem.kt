package com.valeria.a00002024_pddm_taller2.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.valeria.a00002024_pddm_taller2.model.Restaurant

@Composable
fun RestauranteCategoriaItem(
    categoria: String,
    restaurantes: List<Restaurant>,
    onClick: (Int) -> Unit
){
        Column(modifier = Modifier.fillMaxWidth().padding(15.dp, 15.dp, 15.dp, 15.dp)) {
            Text(categoria, style = MaterialTheme.typography.titleLarge)

            Spacer(modifier = Modifier.size(20.dp))

            LazyRow {
                items(restaurantes) { restaurante ->

                    Column {
                        Card(
                            onClick = { onClick(restaurante.id) },
                            modifier = Modifier.padding(8.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.tertiaryContainer
                            )
                        ) {

                            AsyncImage(
                                model = restaurante.imageUrl,
                                contentDescription = restaurante.name,
                                modifier = Modifier
                                    .size(width = 100.dp, height = 120.dp)
                                    .clip(RoundedCornerShape(8.dp)),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.size(4.dp))

                        Text(
                            restaurante.name,
                            style = MaterialTheme.typography.bodyMedium,
                            textAlign = TextAlign.Center
                        )

                        Spacer(modifier = Modifier.size(15.dp))
                    }
                }
            }

    }
}