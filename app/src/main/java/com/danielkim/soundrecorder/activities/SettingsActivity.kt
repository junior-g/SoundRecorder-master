package com.danielkim.soundrecorder.activities

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.preference.PreferenceActivity
import android.support.v4.app.ActivityCompat
import android.support.v7.app.ActionBar
import android.support.v7.widget.Toolbar

import com.danielkim.soundrecorder.R
import com.danielkim.soundrecorder.fragments.SettingsFragment

/**
 * Created by Daniel on 5/22/2017.
 */

class SettingsActivity : android.support.v7.app.ActionBarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        toolbar.popupTheme = R.style.ThemeOverlay_AppCompat_Light
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setTitle(R.string.action_settings)
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setDisplayShowHomeEnabled(true)
        }

        fragmentManager
                .beginTransaction()
                .replace(R.id.container, SettingsFragment())
                .commit()
    }
}
