package com.danielkim.soundrecorder

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

/**
 * Created by Daniel on 5/22/2017.
 */

object MySharedPreferences {
    private val PREF_HIGH_QUALITY = "pref_high_quality"

    fun setPrefHighQuality(context: Context, isEnabled: Boolean) {
        val preferences = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = preferences.edit()
        editor.putBoolean(PREF_HIGH_QUALITY, isEnabled)
        editor.apply()
    }

    fun getPrefHighQuality(context: Context): Boolean {
        val preferences = PreferenceManager.getDefaultSharedPreferences(context)
        return preferences.getBoolean(PREF_HIGH_QUALITY, false)
    }
}
