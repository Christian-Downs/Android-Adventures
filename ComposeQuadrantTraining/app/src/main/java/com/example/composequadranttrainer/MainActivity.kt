package com.example.composequadranttrainer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.composequadranttrainer.ui.theme.ComposeQuadrantTrainerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTrainerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    QuadrantPractice()

                }
            }
        }
    }
}

@Composable
fun ComposableInfoCard(title:String,
                       message: String,
                       backgroundColor: Color,
                       modifier:Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = message,
        textAlign = TextAlign.Justify)
    }

}



@Composable
fun QuadrantPractice() {
    Column(){
        Row(Modifier.weight(1f)){
            ComposableInfoCard(title = "Text Composable",
                message = "Displays text and follows Material Design Guidelines",
                backgroundColor = Color.Red ,modifier= Modifier.weight(1f) )
            ComposableInfoCard(title = "Image Composable",
                message = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color.LightGray,modifier= Modifier.weight(1f))
        }
        Row(Modifier.weight(1f)){
            ComposableInfoCard(title = "Row Composable", message = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = Color.Yellow,modifier= Modifier.weight(1f))
            ComposableInfoCard(title = "Column Composable", message = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = Color.Cyan, modifier = Modifier.weight(1f))
        }
    }

}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTrainerTheme {
        QuadrantPractice()



//        QuadrantPractice(message = "test")
    }
}