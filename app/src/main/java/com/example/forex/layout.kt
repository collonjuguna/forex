package com.example.forex

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.forex.ui.theme.ForexTheme

class layout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current


        //Top app bar
        TopAppBar(
            title = { Text(text = "Home", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Gray),
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
        //end of top app bar
Spacer(modifier = Modifier.height(20.dp))
Text(
    text ="Types of artists",
    fontSize = 20.sp,
    fontWeight = FontWeight.Bold,
    modifier = Modifier.fillMaxWidth(),
    textAlign = TextAlign.Center
    )
        Spacer(modifier = Modifier.height(19.dp))
Row {
    Image(painter = painterResource(id = R.drawable.savage),
        contentDescription = "21 savage",
        modifier = Modifier
            .size(width = 200.dp, height = 100.dp)
            .clip(shape = CircleShape),
        contentScale = ContentScale.Crop


    )


    Spacer(modifier = Modifier.width(19.dp))


    Column {
        Text(text = "21 savage", fontWeight = FontWeight.Bold, fontSize = 17.sp)
        Text(text = "21 savage was born in 1997 in alasca USA.His music carer developed in church. ")
    }
    Spacer(modifier = Modifier.height(19.dp))
}
        Spacer(modifier = Modifier.height(19.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.asake),
                contentDescription = "Asake $",
                modifier = Modifier.
                size(width = 200.dp, height = 100.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop


            )


            Spacer(modifier = Modifier.width(19.dp))


            Column {
                Text(text = " Asake $", fontWeight = FontWeight.Bold, fontSize = 17.sp)
                Text(text = "mr money  was born in 1920 in lagos nigeria.His music carer was mentored by rema who financed his first video. ")

            }

        }
        Spacer(modifier = Modifier.height(19.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.doja),
                contentDescription = "Doja cat",
                modifier = Modifier
                    .size(width = 200.dp, height = 100.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop


            )


            Spacer(modifier = Modifier.width(19.dp))


            Column {
                Text(text = "Doja cat", fontWeight = FontWeight.Bold, fontSize = 17.sp)
                Text(text = "Doja cat was born in 1997 in alasca USA.His music carer developed in church. ")
            }
            Spacer(modifier = Modifier.height(19.dp))


        }
        Button(onClick = {

            mContext.startActivity(Intent(mContext,intentactivity::class.java))

        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Next")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun LayoutPreview() {
    Layout()
}