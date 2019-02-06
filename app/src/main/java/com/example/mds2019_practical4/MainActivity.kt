package com.example.mds2019_practical4

import android.os.Bundle
import android.support.design.widget.BaseTransientBottomBar
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

private const val TAG = "Ya:Snackbar"

class MainActivity : AppCompatActivity() {

    private val snackbar = lazy(LazyThreadSafetyMode.NONE) {
        Snackbar.make(parentView, "Не забудь покормить кота", Snackbar.LENGTH_LONG)
            .setAction("Обойдётся") {}
            .addCallback(object : BaseTransientBottomBar.BaseCallback<Snackbar>() {
                override fun onShown(transientBottomBar: Snackbar?) {
                    Log.i(TAG, "Snackbar показан")
                }

                override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
                    val logMessage = when (event) {
                        DISMISS_EVENT_ACTION -> "Dismissed by action"
                        DISMISS_EVENT_TIMEOUT -> "Dismissed by timeout"
                        else -> "Dismissed by other reason"
                    }
                    Log.i(TAG, logMessage)
                }
            })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonPushMe.setOnClickListener { snackbar.value.show() }
    }
}
