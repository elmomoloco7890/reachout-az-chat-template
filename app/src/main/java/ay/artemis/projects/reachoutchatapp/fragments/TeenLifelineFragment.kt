package ay.artemis.projects.reachoutchatapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import ay.artemis.projects.reachoutchatapp.databinding.FragmentTeenLifelineBinding
import ay.artemis.projects.reachoutchatapp.model.MessageViewModel


class TeenLifelineFragment : Fragment() {


    //adding the sharedviewmodel for the checking and sending messages.
    private val sharedViewModel: MessageViewModel by activityViewModels()

    private var binding: FragmentTeenLifelineBinding? =null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentTeenLifelineBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}