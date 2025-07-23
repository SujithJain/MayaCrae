package com.example.angancare

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterChildActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_child)

        val nameInput = findViewById<EditText>(R.id.et_name)
        val ageInput = findViewById<EditText>(R.id.et_age)
        val registerBtn = findViewById<Button>(R.id.btn_save)

        registerBtn.setOnClickListener {
            val child = ChildEntity(name = nameInput.text.toString(), age = ageInput.text.toString().toInt())
            AppDatabase.getDatabase(this).childDao().insertChild(child)
            Toast.makeText(this, "Child Registered", Toast.LENGTH_SHORT).show()
        }
    }
}