package com.example.angancare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerBtn = findViewById<Button>(R.id.btn_register_child)
        registerBtn.setOnClickListener {
            startActivity(Intent(this, RegisterChildActivity::class.java))
        }

        val attendanceBtn = findViewById<Button>(R.id.btn_attendance)
        attendanceBtn.setOnClickListener {
            startActivity(Intent(this, AttendanceActivity::class.java))
        }
    }
}