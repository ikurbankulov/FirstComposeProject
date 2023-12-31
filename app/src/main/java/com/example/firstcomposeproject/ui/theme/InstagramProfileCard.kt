package com.example.firstcomposeproject.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeproject.R


@Composable
fun InstagramProfileCard() {

    Card(
        modifier = Modifier.padding(8.dp),
        shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.onBackground),
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
            painter = painterResource(id = R.drawable.instagram_glyph_color_logo_wine),
            contentDescription = "",
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
                .background(Color.White)
                .padding(8.dp)
        )

            UserStatistics(title = "Posts", value = "6,950")
            UserStatistics(title = "Followers", value = "436M")
            UserStatistics(title = "Following", value = "76")
        }

        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Instagram",
                fontFamily = FontFamily.Cursive,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "#YoursToMake",
                fontSize = 14.sp,)
            Text(
                text = "www.facebook.com/android.developer",
                fontSize = 14.sp,
                fontFamily = FontFamily.SansSerif)
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(4.dp),
                ) {
                Text(text = "Follow")
            }
        }
    }

}


@Composable
private fun UserStatistics(title: String, value: String) {
    Column(
        modifier = Modifier.height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = value,
            fontFamily = FontFamily.Cursive,
            fontSize = 24.sp,
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Preview
@Composable
private fun LightThemePreview() {
    FirstComposeProjectTheme(darkTheme = false) {
        InstagramProfileCard()
    }
}

@Preview
@Composable
private fun DarkThemePreview() {
    FirstComposeProjectTheme(darkTheme = true) {
        InstagramProfileCard()
    }
}