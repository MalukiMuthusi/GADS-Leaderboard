package codes.malukimuthusi.gadsleaderboard.learningLeads

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import codes.malukimuthusi.gadsleaderboard.databinding.SingleLearningLeadersBinding

class LearningLeadsViewHolder private constructor(private val binding: SingleLearningLeadersBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind() {

    }

    companion object {
        fun instance(parent: ViewGroup): LearningLeadsViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = SingleLearningLeadersBinding.inflate(inflater, parent, false)
            return LearningLeadsViewHolder(binding)
        }
    }

}