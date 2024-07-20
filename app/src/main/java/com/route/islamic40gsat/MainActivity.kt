package com.route.islamic40gsat

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    // Git & Github (Version Control Systems) (VCS)
    // background => RED
    //   1.0
    // background => Green
    //   1.1
    //
    //   9 -> project
    //   1- Login
    //   2- Register
    //   3- Home
    //   4- Profile
    //   ....
    //
    //  Git & Github
    //  1- Initialize Project with git
    //  2-
    // Repository -> Holds Code Changes and Versions
    // Commit ->  Save Code Changes as Version
    // Local Repository -> Repository on Laptop/PC
    // // Github or Gitlab or BitBucket
//  Remote Repository :- Repository on Server
    // 1- Untracked - UnVersioned
    // 2- Tracked - Versioned
    // 3- Ignored
    // add files to git and initial commit

}