package com.example.deuxiemeexojetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.deuxiemeexojetpack.ui.theme.DeuxiemeExoJetpackTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        setContent {
            DeuxiemeExoJetpackTheme {
                Surface() {
                    Body()
                }
            }
        }
    }
}

@Composable
fun Body() {
    Box(){
        Column { ImageCompodable(id = R.drawable.bg_compose_background,modifier = Modifier
            .fillMaxWidth())
Row (modifier = Modifier
    .padding(16.dp)

) {    Text(text = stringResource(R.string.title), fontSize = 24.sp) }

Row(modifier = Modifier.padding(16.dp)) {
    Text(text = stringResource(R.string.paragraphe1),textAlign = TextAlign.Justify)
}
Row(modifier = Modifier.padding((16.dp))) {
    Text(text = stringResource(R.string.paragraphe2), textAlign = TextAlign.Justify)
}
        }
    }
}
@Composable
fun ImageCompodable(id :Int,modifier:Modifier){
    Image(
        painter = painterResource(id=id),
        contentDescription = null,
    modifier = modifier

    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DeuxiemeExoJetpackTheme {
        Body()
    }
}