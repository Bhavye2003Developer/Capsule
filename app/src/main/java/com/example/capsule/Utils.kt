package com.example.capsule

import com.example.capsule.fragments.NotesFragment
import com.example.capsule.fragments.QuizFragment
import com.example.capsule.fragments.VideoFragment

class Utils {
    companion object {
        val fragments = arrayOf(VideoFragment(), NotesFragment(), QuizFragment())
        val fragmentNames = arrayOf("Video", "Notes", "Quiz")
    }
}