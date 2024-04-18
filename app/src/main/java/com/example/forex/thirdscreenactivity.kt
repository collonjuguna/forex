package com.example.forex

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.forex.ui.theme.Grey
import com.example.forex.ui.theme.Purple40

class thirdscreenactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            thirdscreen()

        }
    }
}

@Composable
fun thirdscreen(){

    Column (modifier=Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,){
        Image(painter = painterResource(id = R.drawable.snow),
            contentDescription = "Doja cat",
            modifier = Modifier
                .size(width = 200.dp, height = 200.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop


        )
        val mContext = LocalContext.current

        Text(text = "Enjoy your vaccation ",
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            color = Color.Blue,
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "   enjoying the benefits of snowfall, with ski slopes and ice skating to keep you busy. Although, you can look forward to much more than snow sports when enjoying a snowy winter holiday.",
            fontFamily = FontFamily.SansSerif)

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {

            mContext.startActivity(Intent(mContext,intentactivity::class.java))

        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Grey),
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
fun thirdscreenpreview(){


    thirdscreen()
}