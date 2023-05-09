package come.basim.q_composeachievemnet.data.repo

import come.basim.q_composeachievemnet.data.datasource.AchievementDataSource
import come.basim.q_composeachievemnet.domin.model.AchievementResponseModel
import javax.inject.Inject


class AchievemntRepository @Inject constructor(private val achievementDataSource: AchievementDataSource) {

    suspend fun getAchievement():List<AchievementResponseModel>{
        return achievementDataSource.getAchievement()
    }
}