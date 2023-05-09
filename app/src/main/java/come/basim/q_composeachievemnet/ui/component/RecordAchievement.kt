package come.basim.q_composeachievemnet.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import come.basim.q_composeachievemnet.domin.model.AchievementRowModel
import come.basim.q_composeachievemnet.ui.theme.RemotImage
import java.lang.reflect.Modifier

@Composable
fun RecordAchievement(item: AchievementRowModel, modifier: androidx.compose.ui.Modifier) {
    Column(modifier = androidx.compose.ui.Modifier.alpha(if (item.active) 1f else 0.5f)) {

        RemotImage(
            data = item.image,
            modifier = androidx.compose.ui.Modifier
                .padding(8.dp)
                .height(140.dp)
        )

        Text(
            text = item.title,
            modifier = androidx.compose.ui.Modifier
                .padding(start = 30.dp, end = 30.dp, top = 5.dp)
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,

            color = Color.Black,
            style = MaterialTheme.typography.subtitle2
        )

        Text(
            text = item.label,
            modifier = androidx.compose.ui.Modifier
                .align(Alignment.CenterHorizontally)
                .padding(horizontal = 10.dp),
            color = Color.Black,
            style = MaterialTheme.typography.body1
        )

    }

}