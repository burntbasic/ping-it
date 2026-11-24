package dev.basic.pingit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.basic.pingit.ui.theme.PingItTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PingItTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    PingScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun PingScreen(modifier: Modifier = Modifier){
    Column(verticalArrangement = Arrangement.spacedBy(16.dp), modifier = modifier.fillMaxSize().padding(24.dp), horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text="Ping It")
        Text(text="Website Monitoring")
        Text(text="TARGET WEBSITE")
        Button(onClick = {}) {
            Text(text="Start Monitoring")
        }
        Text(text="Response Time: 120ms")
    }
}