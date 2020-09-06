package codes.malukimuthusi.gadsleaderboard.iqLeads

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import codes.malukimuthusi.gadsleaderboard.dataModels.IqScore
import codes.malukimuthusi.gadsleaderboard.dataModels.LearningHours
import codes.malukimuthusi.gadsleaderboard.network.gadsApi
import kotlinx.coroutines.launch
import java.lang.Exception

class IqLeadsViewModel : ViewModel() {
    val iqHours = MutableLiveData<List<IqScore>>()

    fun iqscore() {
        viewModelScope.launch {
            try {
                val listResults = gadsApi.retrofitService.iqLeaders()
                iqHours.value = listResults
            } catch (e: Exception) {
                Log.e("IqLeadsViewModel", e.toString())
            }
        }
    }
}