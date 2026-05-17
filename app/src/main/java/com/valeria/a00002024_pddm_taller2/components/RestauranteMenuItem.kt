package com.valeria.a00002024_pddm_taller2.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.valeria.a00002024_pddm_taller2.model.Dish

@Composable
fun RestauranteMenuItem(
    dish: List<Dish>,
    onClick: () -> Unit
) {

    LazyRow(  modifier = Modifier
        .fillMaxSize()
        ) {
        items(dish) {plato ->
        Card(
            modifier = Modifier
                .fillParentMaxWidth()
                .padding(15.dp, 15.dp, 15.dp, 15.dp)
                .clip(RoundedCornerShape(8.dp))

        ) {
            Row() {

                Box(  modifier = Modifier
                    .weight(1f)
                    .padding(15.dp, 15.dp, 15.dp, 15.dp)
                    .clip(RoundedCornerShape(8.dp)),) {
                    AsyncImage(
                        model = plato.imageUrl,
                        contentDescription = plato.name,
                        modifier = Modifier
                            .size(width = 100.dp, height = 120.dp)
                            .clip(RoundedCornerShape(8.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
                Box(  modifier = Modifier
                    .weight(1f)
                    .padding(15.dp, 15.dp, 15.dp, 15.dp)
                    .clip(RoundedCornerShape(8.dp)),) {
                    Column() {
                        Text(plato.name,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Spacer(modifier = Modifier.size(5.dp))
                        Text(plato.description,
                            style = MaterialTheme.typography.bodySmall)
                        Spacer(modifier = Modifier.size(8.dp))
                        TextButton(
                            onClick = { onClick() },
                            modifier = Modifier
                                .background(color = MaterialTheme.colorScheme.tertiaryContainer))
                                    { Text("+ Agregar", ) }
                    }
                }
            }
        }
        }
    }
}