package com.example.forex

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.forex.ui.theme.ForexTheme
import com.example.forex.ui.theme.Purple40
import com.example.forex.ui.theme.Purple80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            firstscreen()

        }
    }
}

@Composable
fun firstscreen()

{


        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = painterResource(id = R.drawable.sea),
                contentDescription = "Doja cat",
                modifier = Modifier
                    .size(width = 200.dp, height = 200.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop


            )
            val mContext = LocalContext.current

            Text(
                text = "Enjoy your vaccation ",
                fontFamily = FontFamily.Serif,
                fontStyle = FontStyle.Normal,
                color = Color.Blue,
                fontSize = 30.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "  You can enjoy a leisure stroll along the coastline, embark on a boat tour or gaze at the emerald water for hours. This is the perfect opportunity to take a break from your mundane life and de-clutter your mind.",
                fontFamily = FontFamily.SansSerif
            )

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {

                    mContext.startActivity(Intent(mContext, secondscreenactivity::class.java))

                },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Purple40),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp)
            ) {
                Text(text = "Next")
            }

        }



}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun firstscreenpreview() {

    firstscreen()
}