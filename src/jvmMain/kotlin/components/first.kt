package components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun first(){
    var count = remember { mutableStateOf(0) }
    Column {
        Text(text = "First count " + count.value)
        Button(onClick = {
            count.value++;
        }){
            Text("Add first")
        }
    }
}