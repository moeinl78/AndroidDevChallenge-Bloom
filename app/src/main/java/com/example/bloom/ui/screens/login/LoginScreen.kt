package com.example.bloom.ui.screens.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bloom.ui.components.CustomButton
import com.example.bloom.ui.theme.BloomTheme

@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.primary
    ) {
        LoginScreenContent()
    }
}

@Composable
private fun LoginScreenContent() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
    ) {
        LoginScreenTitle()

        EmailField()

        Spacer(modifier = Modifier.height(8.dp))

        PasswordField()

        TermsAndPrivacy()

        LoginButton()
    }
}

@Composable
private fun LoginScreenTitle() {
    Text(
        text = "Log in with email",
        modifier = Modifier
            .paddingFromBaseline(
                top = 184.dp,
                bottom = 16.dp
            ),
        fontSize = MaterialTheme.typography.h1.fontSize,
        fontWeight = FontWeight.Bold
    )
}

@Composable
private fun EmailField() {
    var email by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = email,
        onValueChange = {
            email = it
        },
        modifier = Modifier
            .height(56.dp)
            .fillMaxWidth(),
        label = {
            Text(
                text = "Email Address",
                fontWeight = FontWeight.Bold
            )
        }
    )
}

@Composable
private fun PasswordField() {
    var password by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = password,
        onValueChange = {
            password = it
        },
        modifier = Modifier
            .height(56.dp)
            .fillMaxWidth(),
        label = {
            Text(
                text = "Password (+8 characters)",
                fontWeight = FontWeight.Bold
            )
        }
    )
}

@Composable
private fun TermsAndPrivacy() {
    Text(
        text = "By clicking below you agree to our Terms of Use and consent to our Privacy Policy.",
        style = MaterialTheme.typography.body2,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.paddingFromBaseline(
            top = 24.dp,
            bottom = 16.dp
        )
    )
}

@Composable
private fun LoginButton() {
    CustomButton(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        action = {},
        contentText = "Log in"
    )
}

@Preview
@Composable
private fun PreviewLoginScreenLight() {
    BloomTheme(darkTheme = false) {
        LoginScreen()
    }
}

@Preview
@Composable
private fun PreviewLoginScreenDark() {
    BloomTheme(darkTheme = true) {
        LoginScreen()
    }
}
