package com.example.forex

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.forex.ui.theme.ForexTheme
import kotlinx.coroutines.launch
import kotlinx.coroutines.time.delay

class splashactivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mysplash()
            val mContent = LocalContext.current
            val coroutineScope= rememberCoroutineScope()
            coroutineScope.launch {
                kotlinx.coroutines.delay(1000)
                mContent.startActivity(Intent(mContent,MainActivity::class.java))
                finish()


            }


            }
        }
    }


@Composable
fun mysplash()
{
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        


    ){
        Image(painter = painterResource(id = R.drawable.x), contentDescription = "x")

Text(text = "xIOMA ",
    fontFamily = FontFamily.Monospace,
    fontWeight = FontWeight.Bold,
    color = Color.White

    )
        Box(modifier = Modifier.background(Color.White)) {


            Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "shop")
        }

    }




}

@Preview(showBackground = true)
@Composable
fun mysplashpreview(){

    mysplash()
}