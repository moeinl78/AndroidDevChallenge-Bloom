package com.example.bloom.ui.screens.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth(1f)
    ) {
        Spacer(modifier = Modifier.height(72.dp))

        LeafImage()

        Spacer(modifier = Modifier.height(48.dp))

        LogoImage()

        WelcomePageSubtitle()

        Spacer(modifier = Modifier.height(40.dp))

        CreateAccountButton()

        Spacer(modifier = Modifier.height(8.dp))

        LoginButton()
    }
}

@Composable
private fun LeafImage() {
    val isLight = MaterialTheme.colors.isLight
    val leafImgRes = if (isLight) {
        R.drawable.ic_light_welcome_illos
    } else {
        R.drawable.ic_dark_welcome_illos
    }
    Image(
        painter = painterResource(id = leafImgRes),
        contentDescription = null,
        modifier = Modifier.offset(x = 88.dp)
    )
}

@Composable
private fun LogoImage() {
    val isLight = MaterialTheme.colors.isLight
    val logoImgRes = if (isLight) {
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
        style = MaterialTheme.typography.subtitle1,
        modifier = Modifier.paddingFromBaseline(32.dp)
    )
}

@Composable
private fun CreateAccountButton() {
    Button(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .padding(horizontal = 16.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.secondary,
            contentColor = MaterialTheme.colors.onSecondary
        ),
        shape = MaterialTheme.shapes.medium
    ) {
        Text(text = "Create account")
    }
}

@Composable
private fun LoginButton() {
    Button(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .padding(horizontal = 16.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
            contentColor = MaterialTheme.colors.onPrimary
        ),
        shape = MaterialTheme.shapes.medium,
        elevation = ButtonDefaults.elevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp,
            focusedElevation = 0.dp,
            disabledElevation = 0.dp
        )
    ) {
        Text(text = "Log in")
    }
}

@Composable
private fun WelcomeBackground() {
    val isLight = MaterialTheme.colors.isLight
    val backgroundImgRes = if (isLight) {
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
