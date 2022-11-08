package ay.artemis.projects.reachoutchatapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import ay.artemis.projects.reachoutchatapp.R
import ay.artemis.projects.reachoutchatapp.databinding.FragmentCrisisBinding
import ay.artemis.projects.reachoutchatapp.model.MessageViewModel


class CrisisFragment : Fragment() {

    //this fragment handles the messages for the crisis hotline.

    private var binding: FragmentCrisisBinding? = null

    //adding the sharedviewmodel for the checking and sending messages.
    private val sharedViewModel: MessageViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // same deal as the other home fragment
        val fragmentBinding = FragmentCrisisBinding.inflate(inflater, container, false)
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