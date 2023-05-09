package come.basim.q_composeachievemnet.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import coil.request.ImageRequest
import come.basim.q_composeachievemnet.R

@Composable
fun RemotImage(data: String, modifier: Modifier) {

    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(data)
            .crossfade(true)
            .build(),
        placeholder = painterResource(id = R.drawable.ic_baseline_error_24),
        error = painterResource(id = R.drawable.ic_baseline_error_24),
        modifier = Modifier,
        contentDescription = ""
    )
}