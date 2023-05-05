package com.example.myapplication

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(name = "Santiago")

        }
    }
}
@Composable
fun MessageCard(name:String){
    Text("Hello $name!")
}
/*@Preview(showBackground = true)
@Composable
fun MessageCardPreview(){
    MessageCard(name = "Android")
}*/


data class Message(val author: String, val body: String)
@Composable
fun MessageCard(msg: Message){
    Row() {
        Image(painter = painterResource(R.drawable.luna), contentDescription = "Contact profile picture")
    }
    Column {
        Text(text = msg.author)
        Text(text = msg.body)

    }
}



@Preview(showBackground = true)
@Composable
fun MessageCardPreview(){
    MessageCard(msg = Message("Colleague",
        "Hey, take a look at Jetpack Compose, it's great!"))
}