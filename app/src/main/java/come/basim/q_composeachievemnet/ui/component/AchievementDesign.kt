package come.basim.q_composeachievemnet.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import come.basim.q_composeachievemnet.domin.model.AchievementResponseModel

@Composable
fun AchievementDesign(model: AchievementResponseModel) {

    Column(modifier = Modifier.padding(bottom = 40.dp)) {
        TitleAchievement(item = model)
        Column {
            model.records.forEachIndexed { index, _ ->
                Row {
                    if (index % 2 == 0)
                        RecordAchievement(
                            item = model.records[index],
                            modifier = Modifier.fillMaxWidth(0.5f)
                        )
                    if (index + 1 < model.records.size)
                        RecordAchievement(
                            item = model.records[index + 1],
                            modifier = Modifier.fillMaxWidth()
                        )
                }
            }

        }
    }

}

    
