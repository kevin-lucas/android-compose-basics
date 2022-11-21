package br.com.kevinlucas.android.jetpackcomposebasics

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.kevinlucas.android.jetpackcomposebasics.ui.theme.JetpackComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .width(600.dp)
                    //.requiredWidth(600.dp)]
                    // .padding(16.dp)
                    // .padding(top = 50.dp)
                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
                    .border(5.dp, Color.Blue)
                    .padding(5.dp)
                    .border(10.dp, Color.Red)
                    .padding(10.dp)
            ) {
                // Text(text = "Hello", modifier = Modifier.offset(0.dp, 20.dp))
                /*
                Text(text = "Hello",
                    modifier = Modifier
                        .border(5.dp, Color.Yellow)
                        .padding(5.dp)
                        .offset(20.dp, 20.dp)
                        .border(10.dp, Color.Gray)
                        .padding(10.dp)
                )
                 */
                Text(text = "Hello", modifier = Modifier.clickable {
                    Toast.makeText(this@MainActivity, "Hello", Toast.LENGTH_SHORT).show()
                })
                // Modifier.scrollable
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "World")
            }
        }
    }
}
