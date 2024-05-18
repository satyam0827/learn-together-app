package com.example.learntogether
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme
import androidx.compose.foundation.layout.Column as Column
import androidx.compose.ui.res.painterResource as painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PageImage(
                       text1 = stringResource(R.string.tutorial_heading),
                        text2 = stringResource(R.string.tutorial_introduction),
                        text3 = stringResource(R.string.tutorial_description)
                   )
                }
            }
        }
    }
}
@Composable
fun PageContent(text1: String,text2: String,text3: String,modifier: Modifier=Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ){
        Text(
            text = text1,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)

        )
        Text(
            text = text2,
            modifier = Modifier.padding(16.dp)


        )
        Text(
            text = text3,
            modifier = Modifier.padding(16.dp)


        )
    }
}

@Composable
fun PageImage(text1: String, text2: String, text3 : String, modifier: Modifier = Modifier) {
    Column(modifier){
        Box {
            Image(
                painter = painterResource(id = R.drawable.bg_compose_background),
                contentDescription = null,
            )
        }
        PageContent(
            text1 = text1,
            text2 = text2,
            text3 = text3
        )

    }
}

@Preview(showBackground = true)
@Composable
fun TutorialPreview() {
    LearnTogetherTheme {
        PageImage(
            stringResource(R.string.tutorial_heading),
            stringResource(R.string.tutorial_introduction),
            stringResource(R.string.tutorial_description)
        )
    }
}