package com.example.gameover

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gameover.ui.theme.GameOverTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GameOverTheme {
                Scaffold(modifier = Modifier.fillMaxSize()){ innerPadding ->
                    gameOver(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun gameOver(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.
        background(Color.Black).fillMaxSize().
        padding(10.dp,30.dp),


    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween

        ){
            Text(
                text = "SCORE: 00050",
                color = Color.White,
                fontSize = 20.sp
            )


            Row(
                modifier = Modifier
            ){
                Text(
                    text = "LIVES: ",
                    color = Color.White,
                    fontSize = 20.sp
                )
                AndroidImg(
                    batata = Modifier.size(30.dp)
                )
                AndroidImg(
                    batata = Modifier.size(30.dp)
                )
                AndroidImg(
                    batata = Modifier
                        .size(30.dp)
                )

            }
        }
    }
}

@Composable
fun AndroidImg(
    batata: Modifier = Modifier
) {
    Image(
        modifier = batata,
        painter = painterResource(R.drawable.caracao),
        contentDescription = "Android enemy"
    )

}