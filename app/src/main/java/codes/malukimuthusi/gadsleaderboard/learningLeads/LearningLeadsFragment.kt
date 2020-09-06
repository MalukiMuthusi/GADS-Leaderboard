package codes.malukimuthusi.gadsleaderboard.learningLeads

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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

//        val learningLeadsAdapter = LearningLeadsAdapter()
//        binding.recycler.adapter = learningLeadsAdapter
//        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        return binding.root
    }
}