package com.example.bloom.ui.screens.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bloom.R
import com.example.bloom.ui.theme.BloomTheme

@Composable
fun WelcomeScreen() {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        WelcomeBackground()

        WelcomeScreenContent()
    }
}

@Composable
private fun WelcomeScreenContent() {
    Column(

    ) {
        LeafImage()

        Spacer(modifier = Modifier.padding(top = 16.dp, bottom = 16.dp))

        LogoImage()

        WelcomePageSubtitle()

        CreateAccountButton()

        LoginButton()
    }
}

@Composable
private fun LeafImage() {
    val isLight = MaterialTheme.colors.isLight
    val leafImgRes = if(isLight) {
        R.drawable.ic_light_welcome_illos
    } else {
        R.drawable.ic_dark_welcome_illos
    }
    Image(
        painter = painterResource(id = leafImgRes),
        contentDescription = null
    )
}

@Composable
private fun LogoImage() {
    val isLight = MaterialTheme.colors.isLight
    val logoImgRes = if(isLight) {
        R.drawable.ic_light_logo
    } else {
        R.drawable.ic_dark_logo
    }
    Image(
        painter = painterResource(id = logoImgRes),
        contentDescription = null
    )
}

@Composable
private fun WelcomePageSubtitle() {
    Text(
        text = "Beautiful home garden solutions.",
        style = MaterialTheme.typography.subtitle1
    )
}

@Composable
private fun CreateAccountButton() {
    Button(onClick = {}) {
        Text(text = "Create account")
    }
}

@Composable
private fun LoginButton() {
    Button(onClick = {}) {
        Text(text = "Log in to your account")
    }
}

@Composable
private fun WelcomeBackground() {
    val isLight = MaterialTheme.colors.isLight
    val backgroundImgRes = if(isLight) {
        R.drawable.ic_light_welcome_bg
    } else {
        R.drawable.ic_dark_welcome_bg
    }

    Image(
        painter = painterResource(id = backgroundImgRes),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )
}

@Preview
@Composable
private fun PreviewWelcomeScreenDark() {
    BloomTheme(darkTheme = true) {
        WelcomeScreen()
    }
}

@Preview
@Composable
private fun PreviewWelcomeScreenLight() {
    BloomTheme(darkTheme = false) {
        WelcomeScreen()
    }
}
