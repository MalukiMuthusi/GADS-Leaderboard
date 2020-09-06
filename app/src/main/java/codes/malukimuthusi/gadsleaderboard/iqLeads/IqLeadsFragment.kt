package codes.malukimuthusi.gadsleaderboard.iqLeads

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import codes.malukimuthusi.gadsleaderboard.R
import codes.malukimuthusi.gadsleaderboard.databinding.IqLeadsFragmentBinding

class IqLeadsFragment : Fragment() {

    companion object {
        fun newInstance() = IqLeadsFragment()
    }

    private val viewModel: IqLeadsViewModel by viewModels()
    private lateinit var binding: IqLeadsFragmentBinding
    private lateinit var recyclerAdapter: IqLeadRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = IqLeadsFragmentBinding.inflate(inflater, container, false)
        recyclerAdapter = IqLeadRecyclerAdapter()
        binding.recyclerView.adapter = recyclerAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.iqscore()

        viewModel.iqHours.observe(viewLifecycleOwner) {
            recyclerAdapter.submitList(it)
        }
    }
}