package codes.malukimuthusi.gadsleaderboard.iqLeads

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import codes.malukimuthusi.gadsleaderboard.dataModels.IqScore
import codes.malukimuthusi.gadsleaderboard.dataModels.LearningHours
import codes.malukimuthusi.gadsleaderboard.learningLeads.LearningLeadsViewHolder

class IqLeadRecyclerAdapter : ListAdapter<IqScore, IqLeadViewHolder>(IqScoreDiff) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IqLeadViewHolder {
        return IqLeadViewHolder.instance(parent)
    }

    override fun onBindViewHolder(holder: IqLeadViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object IqScoreDiff : DiffUtil.ItemCallback<IqScore>() {
    override fun areItemsTheSame(oldItem: IqScore, newItem: IqScore): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: IqScore, newItem: IqScore): Boolean {
        return oldItem == newItem
    }
}