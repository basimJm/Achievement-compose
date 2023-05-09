package come.basim.q_composeachievemnet.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import come.basim.q_composeachievemnet.R

@Composable
fun TopAchievementBar(){
    androidx.compose.material.TopAppBar(
        title = {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.AAA),
                    modifier = Modifier
                        .padding(end = 25.dp),
                    color = MaterialTheme.colors.onPrimary
                )
            }

        })
}