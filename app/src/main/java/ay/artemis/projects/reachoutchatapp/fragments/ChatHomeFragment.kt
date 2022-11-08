package ay.artemis.projects.reachoutchatapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import ay.artemis.projects.reachoutchatapp.databinding.FragmentChatHomeBinding
import ay.artemis.projects.reachoutchatapp.model.MessageViewModel


class ChatHomeFragment : Fragment() {

    /*
    chat home fragment all it will do is setup the two buttons to navigate to the crisis or teen lifeline
    fragments.
    */

    // this is the binding variable for binding this fragment file to the xml layout
    private var binding: FragmentChatHomeBinding? = null

    //adding the sharedviewmodel for the checking and sending messages.
    private val sharedViewModel: MessageViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //this is where I inflate the layout with the binding variable instead.
        // Inflate the layout for this fragment also I bind the fragment binding variable to the root.
        val fragmentBinding = FragmentChatHomeBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    /*this is where the majority of the work comes in. Where I check to see if the user has clicked the buttons and take them to appropriate direction.*/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }
    //this only appears when the view is destroyed and sets off an error.
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}