package com.mnasat.logutil

import android.content.Context
import android.widget.Toast

object CoreUtils {
    fun doToast(context: Context) {
        Toast.makeText(context, "hello world", Toast.LENGTH_SHORT).show()
    }
}