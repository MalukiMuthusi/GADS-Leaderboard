package codes.malukimuthusi.gadsleaderboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import codes.malukimuthusi.gadsleaderboard.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPagerAdapter = ViewPagerAdapter(this)
        binding.myPager.adapter = viewPagerAdapter

        TabLayoutMediator(binding.tabLayout, binding.myPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = getString(R.string.learning_leaders)
                    tab.icon = ContextCompat.getDrawable(requireContext(), R.drawable.top_learner)
                }
                else -> {
                    tab.text = getString(R.string.skill_iq_leaders)
                    tab.icon =
                        ContextCompat.getDrawable(requireContext(), R.drawable.skill_iq_trimmed)
                }
            }
        }.attach()

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment HomeFragment.
         */
        @JvmStatic
        fun newInstance() =
            HomeFragment()
    }
}
