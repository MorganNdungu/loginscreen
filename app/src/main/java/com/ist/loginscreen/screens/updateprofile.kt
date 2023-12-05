package com.ist.loginscreen.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ist.loginscreen.R
import com.ist.loginscreen.components.ButtonComponent
import com.ist.loginscreen.components.GitlabComponent
import com.ist.loginscreen.components.HeadingTextComponent
import com.ist.loginscreen.components.UserFieldComponent

class updateprofile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_updateprofile)
    }
}

@Composable
@Preview
fun Update(){
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
            UserFieldComponent(labelValue ="Username", icon = Icons.Default.Person)
            UserFieldComponent(labelValue ="Phone Number", icon = Icons.Default.Phone)
            UserFieldComponent(labelValue ="Email", icon = Icons.Default.Email)
            UserFieldComponent(labelValue ="password", icon = Icons.Default.Lock)

            ButtonComponent(value = "Update Profile")

            }

        }
    }



