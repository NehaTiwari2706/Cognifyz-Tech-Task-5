package com.example.task6

import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    private lateinit var nameInput: EditText
    private lateinit var ageInput: EditText
    private lateinit var emailInput: EditText
    private lateinit var submitbtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameInput = findViewById(R.id.name_input)
        ageInput = findViewById(R.id.age_input)
        emailInput = findViewById(R.id.email_input)
        submitbtn = findViewById(R.id.submit_btn)

        submitbtn.setOnClickListener{
            val name = nameInput.text.toString()
            val age = ageInput.text.toString()
            val email = emailInput.text.toString()

            Log.i( "Test Credentials", "Name : $name and Age : $age and Email : $email")
            val message = "Submitted"
            Toast.makeText(this, message , Toast.LENGTH_SHORT).show()
        }
    }
}
