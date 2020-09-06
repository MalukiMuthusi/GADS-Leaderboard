package codes.malukimuthusi.gadsleaderboard.learningLeads

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import codes.malukimuthusi.gadsleaderboard.R
import codes.malukimuthusi.gadsleaderboard.databinding.LearningLeadsFragmentBinding

class LearningLeadsFragment : Fragment() {

    companion object {
        fun newInstance() = LearningLeadsFragment()
    }

    private val viewModel: LearningLeadsViewModel by viewModels()
    private lateinit var binding: LearningLeadsFragmentBinding
    private lateinit var learningLeadsAdapter: LearningLeadsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LearningLeadsFragmentBinding.inflate(inflater, container, false)

        learningLeadsAdapter = LearningLeadsAdapter()
        binding.recycler.adapter = learningLeadsAdapter
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.leadsLearningHours()

        viewModel.learningHours.observe(viewLifecycleOwner) {
            learningLeadsAdapter.submitList(it)
        }

    }
}