package com.example.forex

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.forex.ui.theme.ForexTheme

class Destinationactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            destination()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun destination (){
    Column(modifier = Modifier.fillMaxSize()) {

        val mContext= LocalContext.current
        //start of top up bar
        TopAppBar(

            title = { Text(text = "Destination", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {

                IconButton(onClick = {

                    mContext.startActivity(Intent(mContext,MainActivity::class.java))

                }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "arrow back", tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "share", tint = Color.White)
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "settings", tint = Color.White)
                }

            }


        )
//end of top up bar


Box (modifier = Modifier
    .fillMaxWidth()
    .height(200.dp),
contentAlignment = Alignment.Center


){
Image(painter = painterResource(id = R.drawable.beauty), contentDescription = "indonesia",
    modifier = Modifier.fillMaxSize(),
    contentScale = ContentScale.Crop


    )

Text(text = "Let's plan your next vacation",
    fontSize = 30.sp,
    color = Color.White,
    fontWeight = FontWeight.ExtraBold,
    textAlign = TextAlign.Center


    )
}
        Spacer(modifier = Modifier.height(10.dp))

    //end of box
        Button(onClick = {

            mContext.startActivity(Intent(mContext,intentactivity::class.java))

        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "browse")
        }
    //Start of start bar
        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            placeholder = { Text(text = "whats your destination?")},
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "SEARCH")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

            )

    //end of search bar

        Spacer(modifier = Modifier.height(5.dp))

        Text(
        text = "recently viewed",
        textAlign = TextAlign.Center,
        fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp)
    )
        Spacer(modifier = Modifier.height(5.dp))


       Row (modifier = Modifier.horizontalScroll(rememberScrollState())){

           // start card 1
           Card(modifier = Modifier
               .width(200.dp)
               .height(200.dp)
           ) {

               Column {

                   Box (modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center

                   ){
                       Image(
                           painter = painterResource(id = R.drawable.elephant), contentDescription ="" ,
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)

                   }
                   Text(text = "Malawi",
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center,
                       fontSize = 20.sp
                   )

               }
           }

           //end of card1
           Spacer(modifier = Modifier.width(10.dp))

           // start card 1
           Card(modifier = Modifier
               .width(200.dp)
               .height(200.dp)
           ) {

               Column {

                   Box (modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center

                   ){
                       Image(
                           painter = painterResource(id = R.drawable.israel), contentDescription ="" ,
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)

                   }
                   Text(text = "indonesia",
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center,
                       fontSize = 20.sp
                   )

               }
           }

           //end of card1
           Spacer(modifier = Modifier.width(10.dp))
           // start card 1
           Card(modifier = Modifier
               .width(200.dp)
               .height(200.dp)
           ) {

               Column {

                   Box (modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center

                   ){
                       Image(
                           painter = painterResource(id = R.drawable.tourist), contentDescription ="" ,
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)

                   }
                   Text(text = "sey shells",
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center,
                       fontSize = 20.sp
                   )

               }
           }

           //end of card1
           Spacer(modifier = Modifier.width(10.dp))
           // start card 1
           Card(modifier = Modifier
               .width(200.dp)
               .height(200.dp)
           ) {

               Column {

                   Box (modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center

                   ){
                       Image(
                           painter = painterResource(id = R.drawable.africa), contentDescription ="" ,
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)

                   }
                   Text(text = "Africa",
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center,
                       fontSize = 20.sp
                   )

               }
           }

           //end of card1
           Spacer(modifier = Modifier.width(10.dp))
           // start card 1
           Card(modifier = Modifier
               .width(200.dp)
               .height(200.dp)
           ) {

               Column {

                   Box (modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center

                   ){
                       Image(
                           painter = painterResource(id = R.drawable.pple), contentDescription ="" ,
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)

                   }
                   Text(text = "india",
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center,
                       fontSize = 20.sp
                   )

               }
           }

           //end of card1
           Spacer(modifier = Modifier.width(10.dp))

       }
    }



}
@Preview(showBackground = true)
@Composable
fun destinationpreview(){

    destination()
}