package com.example.familysafety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)

        bottomBar.setOnItemSelectedListener {
            if(it.itemId == R.id.nav_home){
                inflateHomeFragment()
            } else if(it.itemId == R.id.nav_guard){
                inflateGuardFragment()
            } else if(it.itemId == R.id.nav_profile){
                inflateProfileFragment()
            } else if(it.itemId == R.id.nav_dashboard){
                inflateDashboardFragment()
            }


            true
        }


    }


    private fun inflateGuardFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, GuardFragment.newInstance())
        transaction.commit()
    }

    private fun inflateHomeFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, HomeFragment.newInstance())
        transaction.commit()
    }

    private fun inflateProfileFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, ProfileFragment.newInstance())
        transaction.commit()
    }

    private fun inflateDashboardFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, DashboardFragment.newInstance())
        transaction.commit()
    }

}