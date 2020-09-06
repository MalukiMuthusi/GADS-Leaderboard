package codes.malukimuthusi.gadsleaderboard

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import codes.malukimuthusi.gadsleaderboard.iqLeads.IqLeadsFragment
import codes.malukimuthusi.gadsleaderboard.learningLeads.LearningLeadsFragment

class ViewPagerAdapter(fm: Fragment) : FragmentStateAdapter(fm) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                LearningLeadsFragment()

            }
            else -> {
                IqLeadsFragment()
            }
        }
    }
}