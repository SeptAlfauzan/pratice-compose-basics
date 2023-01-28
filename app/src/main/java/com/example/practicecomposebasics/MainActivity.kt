package com.example.practicecomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicecomposebasics.ui.theme.PracticeComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeComposeBasicsTheme {
                // A surface container using the 'background' color from the theme
                ComposeArticle()
            }
        }
    }
}

@Composable
fun ComposeArticle(){
    val image = painterResource(id = R.drawable.bg_compose_background)
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(){
            Image(painter = image , contentDescription = "bg image ", modifier = Modifier.fillMaxWidth())
            Text("Jetpack Compose tutorial", fontSize=24.sp, modifier = Modifier.padding(16.dp))
            Text("Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.", modifier = Modifier.padding(start =  16.dp, end = 16.dp), textAlign = TextAlign.Justify)
            Text("In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name", modifier = Modifier.padding(16.dp), textAlign = TextAlign.Justify)
        }
    }
}

@Composable
fun TaskManagerCompleted(){
    val image = painterResource(id = R.drawable.ic_task_completed)
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Image(painter = image, contentDescription = "image icon")
            Text("All tasks completed", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 16.sp), modifier = Modifier.padding(top = 24.dp, bottom = 8.dp))
            Text("Nice work!", style = TextStyle(fontSize = 16.sp))
        }
    }
}

@Composable
fun QuadranCard(text: String, text2: String, color: androidx.compose.ui.graphics.Color, modifier: Modifier){
    Column(
        modifier = modifier.background(color).padding(16.dp).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text, style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 16.sp, textAlign = TextAlign.Center), modifier = Modifier.padding(bottom = 16.dp))
        Text(text2, style = TextStyle(fontSize = 16.sp,  textAlign = TextAlign.Center, color = androidx.compose.ui.graphics.Color.DarkGray))
    }
}
@Composable
fun Quadran(){

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.weight(1f)) {
                QuadranCard("You need to build an app that displays .", "In this exercise, you need to apply most of the concepts that you learned so far and then go a step further to explore a new Modifier and properties.",androidx.compose.ui.graphics.Color.Green, Modifier.weight(1f))
                QuadranCard("You need to build an app that displays the information about the Composable functions that you learned.", "In this exercise, you need to apply most of the concepts that you learned so far and then go a step further to explore a new Modifier and properties.",androidx.compose.ui.graphics.Color.Yellow, Modifier.weight(1f))
            }
            Row(Modifier.weight(1f)) {
                QuadranCard("You need to build an app that displays the information about the Composable functions that you learned.", "In this exercise, you need to apply most of the concepts that you learned so far and then go a step further to explore a new Modifier and properties.",androidx.compose.ui.graphics.Color.Cyan, Modifier.weight(1f))
                QuadranCard("You need to build an app that displays the information about the Composable functions that you learned.", "In this exercise, you need to apply most of the concepts that you learned so far and then go a step further to explore a new Modifier and properties.",androidx.compose.ui.graphics.Color.LightGray, Modifier.weight(1f))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PracticeComposeBasicsTheme {
        ComposeArticle()
    }
}
