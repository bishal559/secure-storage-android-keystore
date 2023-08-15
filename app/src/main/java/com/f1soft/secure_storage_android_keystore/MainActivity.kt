package com.f1soft.secure_storage_android_keystore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.f1soft.securestorage.SecurePreferences

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SecurePreferences.setValue(this,"KEY","TEST")
        SecurePreferences.getStringValue(this,"KEY","DEFAULE")
    }
}