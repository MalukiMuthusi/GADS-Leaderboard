package codes.malukimuthusi.gadsleaderboard.learningLeads

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import codes.malukimuthusi.gadsleaderboard.dataModels.LearningHours
import codes.malukimuthusi.gadsleaderboard.network.gadsApi
import kotlinx.coroutines.launch
import java.lang.Exception

class LearningLeadsViewModel : ViewModel() {

    val learningHours = MutableLiveData<List<LearningHours>>()

    fun leadsLearningHours() {
        viewModelScope.launch {
            try {
                val listResults = gadsApi.retrofitService.learningLeaders()
                learningHours.value = listResults
            } catch (e: Exception) {
                Log.e("LearningLeadsViewModel", e.toString())
            }
        }
    }

}