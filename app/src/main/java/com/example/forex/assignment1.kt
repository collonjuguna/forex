package com.example.forex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.forex.ui.theme.ForexTheme

class assignment1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            contacts()
Modifier
        }
    }
}

@Composable
fun contacts(){





            Column(modifier = Modifier.fillMaxSize()) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                ) {


    Column {


        Box(
            modifier = Modifier
                .width(100.dp)
                .height(100.dp),
            contentAlignment = Alignment.Center

        )
        {
            Image(
                painter = painterResource(id = R.drawable.elephant),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize()
                    .size(width = 200.dp, height = 100.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )




            Box (modifier = Modifier.padding(start = 300.dp)){


                Text(
                    text = "KODA",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp
                )
                Text(text = "2 Years old")

            }


        }


    }


                }
            }
       //end of card1

   }


@Preview(showBackground = true)
@Composable
fun contactspreview(){

    contacts()
}