package com.example.shortcutmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.content.pm.ShortcutManagerCompat
import androidx.core.graphics.drawable.IconCompat
import com.example.shortcutmanager.ui.main.MainFragment
import com.example.shortcutmanager.ui.main.CappuccinoFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            if (intent.data != null) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, CappuccinoFragment.newInstance())
                    .commitNow()
            } else {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
            }
        }

        createShortcut()
    }

    private fun createShortcut() {
        var shortcutInfo = ShortcutInfoCompat.Builder(this, getString(R.string.mocha))
            .setShortLabel(getString(R.string.mocha))
            .setLongLabel(getString(R.string.mocha_long_label))
            .setIcon(IconCompat.createWithResource(this, R.drawable.ic_mocha))
            .setIntent(Intent(this, MochaActivity::class.java).setAction("mochaAction"))
            .build()

        ShortcutManagerCompat.pushDynamicShortcut(this, shortcutInfo)
    }
}