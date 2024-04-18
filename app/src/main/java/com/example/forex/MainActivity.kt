package com.example.forex

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.forex.ui.theme.ForexTheme

class screenactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        demo()
        }
    }
}

@Composable
fun demo(){

Column (modifier = Modifier.fillMaxSize()) {

    val mContext = LocalContext.current

    Text(
        text = "welcome to android",
        textDecoration = TextDecoration.Underline,
        fontSize = 30.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        color = Color.Red
    )


    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = "TYPES OF CARS OWNED BY RICH ARTISTS",
        fontSize = 20.sp,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .height(40.dp),
        textAlign = TextAlign.Center,
        textDecoration = TextDecoration.Underline
    )
Spacer(modifier = Modifier.height(20.dp))
    Text(text = "1.BMW")
    Text(text = "4.pocshe")
    Text(text = "2.Mercides benz")
    Text(text = "3.ferari")
    Text(text = "4.pocshe")
    Spacer(modifier = Modifier.height(20.dp))
    Button(onClick = {

        mContext.startActivity(Intent(mContext,Destinationactivity::class.java))

    },
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(Color.Red),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp)
    ) {
        Text(text = "see more")
    }
    Spacer(modifier = Modifier.height(20.dp))

    Text(text = "ABOUT FOREX",


    modifier = Modifier
        .fillMaxWidth()
        .background(Color.Red)
        .height(40.dp),
    textAlign = TextAlign.Center,
    textDecoration = TextDecoration.Underline
    )
    Spacer(modifier = Modifier.height(20.dp))
    Text(text = "The foreign exchange (forex or FX) market is a global marketplace for exchanging national currencies. Because of the worldwide reach of trade, commerce, and finance, forex markets tend to be the world's largest and most liquid asset markets. Currencies trade against each other as exchange rate pairs.")
    Spacer(modifier = Modifier.height(20.dp))


    Text(text = "1.cash in cash out")
    Text(text = "2.money transfer ")
    Text(text = "3.money conversion")
    Spacer(modifier = Modifier.height(10.dp))

   //making a button functional
    Button(onClick = {
                     mContext.startActivity(Intent(mContext,layout::class.java))

    },

    //end of codespec

        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(Color.Blue),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp)
        ) {
        Text(text = "continue")
    }
    Divider()

    Button(onClick = {

        mContext.startActivity(Intent(mContext,lottieactivity::class.java))

    },
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(Color.Red),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp)
    ) {
        Text(text = "browse")
    }

}

}
@Preview(showBackground = true)
@Composable
fun demopreview(){
    demo()
}