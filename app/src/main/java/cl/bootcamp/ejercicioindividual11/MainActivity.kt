package cl.bootcamp.ejercicioindividual11

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import cl.bootcamp.ejercicioindividual11.ui.theme.EjercicioIndividual11Theme
import cl.bootcamp.ejercicioindividual11.view.HomeView
import cl.bootcamp.ejercicioindividual11.viewModel.CalculateViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel: CalculateViewModel by viewModels()
        setContent {
            EjercicioIndividual11Theme {
                HomeView(viewModel)
            }
        }
    }
}

