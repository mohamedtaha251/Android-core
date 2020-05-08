package com.mnasat.logutil

import android.content.Context
import android.widget.Toast

object ToastUtils {
    fun doToast(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}