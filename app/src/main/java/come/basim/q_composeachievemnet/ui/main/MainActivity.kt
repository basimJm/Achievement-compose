package come.basim.q_composeachievemnet.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import come.basim.q_composeachievemnet.ui.component.AchievementDesign
import come.basim.q_composeachievemnet.ui.component.TopAchievementBar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: AchievementViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(topBar = { TopAchievementBar()} , content = { ContentSection(viewModel)})
             Modifier.fillMaxSize()


                
            
               


        }
    }

}
@Composable
fun ContentSection(viewModel: AchievementViewModel)  {

    val achievement = viewModel.achievementState.value ?: emptyList()

    Column(horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center ,
    modifier = Modifier.verticalScroll(rememberScrollState()) .fillMaxSize())
    {
    if (viewModel.loadingState.value)
        CircularProgressIndicator(color = Color.Black ,   )
        else
            achievement.forEach { item-> AchievementDesign(model = item) }
    }
}



