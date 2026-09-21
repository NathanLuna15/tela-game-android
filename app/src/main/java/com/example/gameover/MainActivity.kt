package com.example.gameover

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
   Column (
        modifier = modifier
            .background(Color.Black)
            .fillMaxSize()
            .padding(10.dp, 30.dp),


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

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 80.dp)
                ,horizontalArrangement = Arrangement.Center
        ) {
            inimigos(
                modifier = Modifier
                    .size(60.dp)
            )
            inimigos(
                modifier = Modifier
                    .size(60.dp)
            )
            inimigos(
                modifier = Modifier
                    .size(60.dp)
            )
            inimigos(
                modifier = Modifier
                    .size(60.dp)
            )
            inimigos(
                modifier = Modifier
                    .size(60.dp)
            )
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 500.dp)
            ,horizontalArrangement = Arrangement.Center
        ){
            jogador(
                modifier = Modifier
                    .size(60.dp)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .background(Color.DarkGray),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "PRESS START",
                color = Color.White,
                fontSize = 30.sp

            )
        }
    }

    /*Box(
        modifier = modifier
            .background(Color.Black)
            .fillMaxSize()
            .padding(10.dp, 30.dp),
        contentAlignment = Alignment.Center
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top
        ) {
            inimigos(
                modifier = Modifier
                    .size(60.dp)
            )
            inimigos(
                modifier = Modifier
                    .size(60.dp)
            )
            inimigos(
                modifier = Modifier
                    .size(60.dp)
            )
            inimigos(
                modifier = Modifier
                    .size(60.dp)
            )
            inimigos(
                modifier = Modifier
                    .size(60.dp)
            )
        }
        Text(
            text = "GAME OVER",
            modifier = Modifier,
            color = Color.White,
            fontSize = 40.sp
        )
    }*/

}

@Composable
fun jogador(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.jogador),
        contentDescription = "Android enemy",
        )
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

@Composable
fun inimigos(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.inimigo2),
        contentDescription = "Android enemy",

        )
}