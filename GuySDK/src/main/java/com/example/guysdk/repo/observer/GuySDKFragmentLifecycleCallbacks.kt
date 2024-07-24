package com.example.guysdk.repo.observer

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.guysdk.GuySDK.Companion.TAG

internal class GuySDKFragmentLifecycleCallbacks : FragmentManager.FragmentLifecycleCallbacks() {
    override fun onFragmentCreated(fm: FragmentManager, f: Fragment, savedInstanceState: Bundle?) {
        super.onFragmentCreated(fm, f, savedInstanceState)
        Log.d(TAG, "onFragmentCreated: GuySDK")
        setupButtonListeners(f.view)

    }

    private fun setupButtonListeners(view: View?) {
        view?.let {
            if (it is ViewGroup) {
                for (i in 0 until it.childCount) {
                    setupButtonListeners(it.getChildAt(i))
                }
            } else if (it is Button) {
                it.setOnClickListener { button ->
                    Log.d(
                        TAG,
                        "setupButtonListeners: GuySDK, button clicked: ${(button as? Button)?.text}"
                    )
                }
            }
        }
    }
}