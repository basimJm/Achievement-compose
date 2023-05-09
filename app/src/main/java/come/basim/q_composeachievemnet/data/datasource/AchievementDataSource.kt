package come.basim.q_composeachievemnet.data.datasource

import com.serjltt.moshi.adapters.Wrapped
import come.basim.q_composeachievemnet.domin.model.AchievementResponseModel
import retrofit2.http.GET

interface AchievementDataSource {

    @GET("achievements")
    @Wrapped(path = ["data"])
    suspend fun getAchievement():List<AchievementResponseModel>
}