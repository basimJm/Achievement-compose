package come.basim.q_composeachievemnet.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import come.basim.q_composeachievemnet.domin.model.AchievementResponseModel

@Composable
fun TitleAchievement(item: AchievementResponseModel) {


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Gray)
            , horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = item.title, color = Color.Black, modifier =
            Modifier
                .fillMaxWidth(0.7f)
                .padding(16.dp)
        )
        Text(
            text = item.label, color = Color.Black, modifier =
            Modifier.padding(16.dp)
        )

    }


}