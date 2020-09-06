package codes.malukimuthusi.gadsleaderboard.iqLeads

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import codes.malukimuthusi.gadsleaderboard.dataModels.IqScore
import codes.malukimuthusi.gadsleaderboard.dataModels.LearningHours
import codes.malukimuthusi.gadsleaderboard.databinding.IqLeadsSingleBinding
import codes.malukimuthusi.gadsleaderboard.databinding.SingleLearningLeadersBinding

class IqLeadViewHolder private constructor(private val binding: IqLeadsSingleBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(leadData: IqScore) {
        binding.iqLead = leadData
    }

    companion object {
        fun instance(parent: ViewGroup): IqLeadViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = IqLeadsSingleBinding.inflate(inflater, parent, false)
            return IqLeadViewHolder(binding)
        }
    }

}