package codes.malukimuthusi.gadsleaderboard.network

import codes.malukimuthusi.gadsleaderboard.dataModels.LearningHours
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

interface GadsLeaderboardService {
    @GET("hours")
    suspend fun learningLeaders(): List<LearningHours>

    @GET("skilliq")
    suspend fun iqLeaders()
}


object gadsApi {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://gadsapi.herokuapp.com/api/")
        .addConverterFactory(
            MoshiConverterFactory.create(
                Moshi.Builder()
                    .add(KotlinJsonAdapterFactory())
                    .build()
            )
        )
        .build()
    val retrofitService: GadsLeaderboardService by lazy {
        retrofit.create(GadsLeaderboardService::class.java)
    }
}