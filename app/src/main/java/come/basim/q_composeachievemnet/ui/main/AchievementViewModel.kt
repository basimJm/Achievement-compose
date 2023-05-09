package come.basim.q_composeachievemnet.ui.main

import android.os.RemoteException
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import come.basim.q_composeachievemnet.data.repo.AchievemntRepository
import come.basim.q_composeachievemnet.domin.model.AchievementResponseModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AchievementViewModel @Inject constructor(private val achievemntRepository: AchievemntRepository) :
    ViewModel() {

    private val _loadingState = mutableStateOf(false)
    val loadingState: State<Boolean> = _loadingState

    private val _achievementState = mutableStateOf<List<AchievementResponseModel>?>(null)
    val achievementState: State<List<AchievementResponseModel>?> = _achievementState


    init {
        getAchievement()
    }

    private fun getAchievement() {
        viewModelScope.launch {
            _loadingState.value = true
            try {
                _achievementState.value = achievemntRepository.getAchievement()
            } catch (remotCatch: RemoteException) {

            }

            _loadingState.value = false

        }
    }
}