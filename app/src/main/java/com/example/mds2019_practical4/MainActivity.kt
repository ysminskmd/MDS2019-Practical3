package com.example.mds2019_practical4

import android.os.Bundle
import android.support.design.widget.BaseTransientBottomBar
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

private const val TAG = "Ya:Snackbar"

class MainActivity : AppCompatActivity() {

    private val catSnackbar = lazy(LazyThreadSafetyMode.NONE) {
        Snackbar
            .make(parentView, "Не забудь покормить кота", Snackbar.LENGTH_LONG)
            .setAction("Перебьётся") {}
            .addCallback(object : BaseTransientBottomBar.BaseCallback<Snackbar>() {
                override fun onShown(transientBottomBar: Snackbar?) {
                    Log.i(TAG, "Snackbar shown")
                }

                override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
                    val logMessage = when (event) {
                        Snackbar.Callback.DISMISS_EVENT_ACTION -> "Закрыт кнопкой"
                        Snackbar.Callback.DISMISS_EVENT_TIMEOUT -> "Закрыт по таймауту"
                        else -> "Закрыт по прочей причине"
                    }
                    Log.i(TAG, logMessage)
                }
            })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonPushMe.setOnClickListener(this::showSnack)
    }

    private fun showSnack(view: View) {
        catSnackbar.value.show()
    }
}
