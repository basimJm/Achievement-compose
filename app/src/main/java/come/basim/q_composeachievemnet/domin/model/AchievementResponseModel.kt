package come.basim.q_composeachievemnet.domin.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AchievementResponseModel(
    @Json(name = "id")
    var id: Int,

    @Json(name = "title")
    var title: String,

    @Json(name = "label")
    var label: String,

    @Json(name = "records")
    var records: List<AchievementRowModel>,

    )


