package com.example.family

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)

        bottomBar.setOnItemSelectedListener {

            if(it.itemId == R.id.nav_safty) {

                inflateFragment(GuardFragment.newInstance())

            }else if (it.itemId == R.id.nav_home){

            inflateFragment(HomeFragment.newInstance())

            }else if (it.itemId == R.id.nav_dashboard){

                inflateFragment(DashboardFragment.newInstance())

            }else if(it.itemId == R.id.nav_profile){

            inflateFragment(UserFragment.newInstance())
            }


            true
        }


    }

    private fun inflateFragment(newInstance: Fragment) {
        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,newInstance)
        transaction.commit()
    }

    /* private fun inflateUserFragment() {
         var transaction = supportFragmentManager.beginTransaction()
         transaction.replace(R.id.container,UserFragment.newInstance())
         transaction.commit()
     }*/




}