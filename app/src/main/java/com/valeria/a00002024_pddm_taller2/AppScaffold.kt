package com.valeria.a00002024_pddm_taller2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScaffold(
                title : String = "",
                navigationIcon: @Composable () -> Unit = {},
                content: @Composable (PaddingValues) -> Unit
){

    Scaffold(modifier = Modifier.fillMaxSize(),
            topBar = {
                if(title.isNotEmpty()){
                    TopAppBar(
                        title = {Text(title)},
                        modifier = Modifier.background(color = MaterialTheme.colorScheme.tertiary),
                        navigationIcon = navigationIcon
                    )

                }
            }

    ){ padding ->
        content(padding)
    }
}