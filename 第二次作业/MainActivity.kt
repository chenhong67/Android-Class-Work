package com.example.ch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ch.ui.theme.CHTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CHTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UserCardList()
                }
            }
        }
    }
}

data class User(var userAvatar:Int,var userName:String,var userBio:String)

@Composable
fun UserCard(user:User){
    Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier
        .padding(bottom = 10.dp)
        .fillMaxWidth()
        .size(width = 200.dp, height = 100.dp)
        .background(Color.White)
    ){
        Box{
            Image(painter = painterResource(id = user.userAvatar), contentDescription = null, modifier = Modifier
                .size(100.dp)
                .padding(20.dp)
                .clip(CircleShape)
            )
        }
        Column {
            Text(text = user.userName, style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp))
            Text(text = user.userBio)
        }
        Text(text = "3 min ago", modifier = Modifier.padding(15.dp), color = Color.Gray)
    }
}

@Composable
fun UserCardList(){
    Box{
        Column {
            val users = listOf<User>(
                User(R.drawable.__useravatre1,"林暖暖","赚钱养老妈"),
                User(R.drawable.___useravatre2,"司徒星","快乐万岁"),
                User(R.drawable.__useravatre3,"谢一航","赚钱养老婆"),
                User(R.drawable.__useravatre4,"谢一霄","养活废物弟弟"),
                User(R.drawable.__useravatre5,"谢一麟","我有两个哥，不上班也饿不死！"),
                User(R.drawable.__useravatre6,"陈灵伟","摆烂至上"),
                User(R.drawable.__useravatre7,"赵悠悠","打工人"),
            )
            repeat(users.size){index->
                UserCard(users[index])
            }
            UserCard(users[0])
            UserCard(users[0])
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CHTheme {
        UserCardList()
    }
}

