package com.organization.directory.ui

import android.content.Intent
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.organization.directory.R
import com.organization.directory.core.view.BaseActivity
import com.organization.directory.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * Main activity to host the UI
 */
@AndroidEntryPoint
class EmployeeActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun setUpActivityUI(intent: Intent, savedInstanceState: Bundle?) {
        setUpNavHost()
    }

    /**
     * Sets up the navigation host fragment for the application.
     */
    private fun setUpNavHost() {
        val host = NavHostFragment.create(R.navigation.navigation_graph)
        supportFragmentManager.beginTransaction().replace(
            binding.fragment.id, host
        ).setPrimaryNavigationFragment(host).commit()
    }
}
