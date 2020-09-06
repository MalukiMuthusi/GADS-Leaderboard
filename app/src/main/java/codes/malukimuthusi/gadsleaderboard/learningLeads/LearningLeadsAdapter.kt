package codes.malukimuthusi.gadsleaderboard.learningLeads

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import codes.malukimuthusi.gadsleaderboard.dataModels.LearningHours

class LearningLeadsAdapter : ListAdapter<LearningHours, LearningLeadsViewHolder>(HoursDiff) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearningLeadsViewHolder {
        return LearningLeadsViewHolder.instance(parent)
    }

    override fun onBindViewHolder(holder: LearningLeadsViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object HoursDiff : DiffUtil.ItemCallback<LearningHours>() {
    override fun areItemsTheSame(oldItem: LearningHours, newItem: LearningHours): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: LearningHours, newItem: LearningHours): Boolean {
        return oldItem == newItem
    }
}