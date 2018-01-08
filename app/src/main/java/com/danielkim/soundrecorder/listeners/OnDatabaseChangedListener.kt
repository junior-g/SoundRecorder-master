package com.danielkim.soundrecorder.listeners

/**
 * Created by Daniel on 1/3/2015.
 * Listen for add/rename items in database
 */
interface OnDatabaseChangedListener {
    fun onNewDatabaseEntryAdded()
    fun onDatabaseEntryRenamed()
}