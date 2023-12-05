package com.ist.loginscreen.screens

import android.graphics.drawable.Icon
import android.widget.CheckBox
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ist.loginscreen.components.ButtonComponent
import com.ist.loginscreen.components.GithubComponent
import com.ist.loginscreen.components.GitlabComponent
import com.ist.loginscreen.components.HeadingTextComponent
import com.ist.loginscreen.components.SimpleTextComponent
import com.ist.loginscreen.components.UserFieldComponent

@Composable
@Preview
fun SignupScreen(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {

//            SimpleTextComponent(value = "Hello")
            MyImg()
            HeadingTextComponent(value = "Create an account")
            UserFieldComponent(labelValue ="Firstname", icon = Icons.Default.Person)
            UserFieldComponent(labelValue ="Lastname", icon = Icons.Default.Person)
            UserFieldComponent(labelValue ="Email", icon = Icons.Default.Email)
            UserFieldComponent(labelValue ="password", icon = Icons.Default.Lock)
            Row ( modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()){
                CheckBox()
//                SimpleTextComponent(value = "Remember Me")
                ForgotPassword()
            }
            ButtonComponent(value = "SignUp")
            MyImage()
            Row {
                GithubComponent(value = "GitHub" )
                GitlabComponent(value = "GitLab")
            }

        }
    }
}
@Composable
fun MyImg(){

    Column (modifier = Modifier.padding(16.dp)){

        Image(
            painter = painterResource(id = com.ist.loginscreen.R.drawable.logo),
            contentDescription = "alt",
            modifier= Modifier
                .height(128.dp)
                .fillMaxWidth()
                .background(Color.Blue)

        )
    }
}
@Composable
fun MyImage(){

    Column (modifier = Modifier.padding(16.dp)){

        Image(
            painter = painterResource(id = com.ist.loginscreen.R.drawable.img),
            contentDescription = "alt",
            modifier= Modifier
                .fillMaxWidth()
                .height(70.dp)
        )
    }
}
@Composable
fun CheckBox(){
    val isCheckedState = remember { mutableStateOf(false) }

    Column( modifier = Modifier.padding(16.dp)

    ){
        Checkbox(checked = isCheckedState.value, onCheckedChange =
        {isChecked -> isCheckedState.value = isChecked

        },
            modifier = Modifier.padding(8.dp))
    }
}
@Composable
fun ForgotPassword(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .height(2.dp)
            .clickable { },
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Forgot Password"
        )

    }
}
