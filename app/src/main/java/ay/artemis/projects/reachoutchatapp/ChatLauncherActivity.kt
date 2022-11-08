package ay.artemis.projects.reachoutchatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController

class ChatLauncherActivity : AppCompatActivity(R.layout.activity_chat_launcher) {

    //this is the nav controller for setting up the fragment host as navhostfragment
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.reachout_nav_host) as NavHostFragment
        navController = navHostFragment.navController

        //this allows the actionbar to be insync with the app.
        setupActionBarWithNavController(navController)
    }


    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp() || navController.navigateUp()
    }
}