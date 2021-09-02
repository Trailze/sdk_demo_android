package com.yourcompanyname.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.trailze.sdk.TRLMainActivity
import com.trailze.sdk.TrailzeApp
import com.trailze.sdk.TrailzeOptions

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val intent = Intent(this, TRLMainActivity::class.java)
        intent.putExtra(resources.getString(com.trailze.sdk.R.string.LOGO), R.drawable.logo)
        intent.putExtra(resources.getString(com.trailze.sdk.R.string.LOGO_WIDTH), 106)
        intent.putExtra(resources.getString(com.trailze.sdk.R.string.LOGO_HEIGHT), 22)
        config()
        startActivity(intent)
    }

    private fun config() {
        val op = TrailzeOptions(
            apiToken = BuildConfig.TRAILZE_ACCESS_KEY,
            mapboxToken = BuildConfig.MAPBOX_ACCESS_TOKEN,
        )

        TrailzeApp.configure(op)
    }
}