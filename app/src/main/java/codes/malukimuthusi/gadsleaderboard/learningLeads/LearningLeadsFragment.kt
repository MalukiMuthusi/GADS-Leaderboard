package codes.malukimuthusi.gadsleaderboard.learningLeads

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import codes.malukimuthusi.gadsleaderboard.R
import codes.malukimuthusi.gadsleaderboard.databinding.LearningLeadsFragmentBinding

class LearningLeadsFragment : Fragment() {

    companion object {
        fun newInstance() = LearningLeadsFragment()
    }

    private val viewModel: LearningLeadsViewModel by activityViewModels()
    private lateinit var binding: LearningLeadsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LearningLeadsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}