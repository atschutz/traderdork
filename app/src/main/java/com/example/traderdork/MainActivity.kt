package com.example.traderdork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.traderdork.ui.theme.TraderdorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TraderdorkTheme {
                TradeScreen()
            }
        }
    }
}

@Preview(
    showBackground = true,
    device = "spec:width=411dp,height=891dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape"
)
@Composable
fun TradeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        TradeListTopBar()
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            TraderColumn(
                modifier = Modifier
                    .weight(1f)
            )
            Spacer(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(1.dp)
                    .background(Color.Gray)
            )
            TraderColumn(
                modifier = Modifier
                    .weight(1f)
            )
        }
    }
}

@Composable
fun TradeListTopBar() {
    Box(
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth()
            .background(Color.Blue)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Back button",
            modifier = Modifier
                .align(Alignment.CenterStart)
                .size(48.dp)
        )
        Text(
            text ="$0.00",
            fontSize = 32.sp,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.Center)
        )
    }
}

@Composable
fun TraderBottomBar() {
    Row(
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth()
            .background(Color.Blue)
    ) {
        BasicTextField(
            value = "Search...",
            onValueChange = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .padding(4.dp)
                .background(Color.White)
                .align(Alignment.CenterVertically)
                .weight(1f)
        )
        Text(
            text = "$0.00",
            fontSize = 24.sp,
            color = Color.White,
            modifier = Modifier
                .padding(4.dp)
                .align(Alignment.CenterVertically)
        )
    }
}

@Composable
fun TraderColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxHeight()
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 4.dp)
        ) {
            TraderListItem()
            TraderListItem()
            TraderListItem()
        }
        TraderBottomBar()
    }
}

@Preview(showBackground = true)
@Composable
fun TraderListItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp)
    ) {
        Text(
            text = "Card Name",
            fontSize = 12.sp,
            modifier = Modifier
                .weight(1f)
        )
        Text(
            text = "SET",
            fontSize = 12.sp,
            modifier = Modifier
                .weight(0.25f)
        )
        Text(
            text = "CD",
            fontSize = 12.sp,
            modifier = Modifier
                .weight(0.25f)
        )
        Text(
            text = "*F*",
            fontSize = 12.sp,
            modifier = Modifier
                .weight(0.25f)
        )
        Text(
            text = "$0.00",
            fontSize = 12.sp,
            modifier = Modifier
                .weight(0.25f)
        )
    }
}