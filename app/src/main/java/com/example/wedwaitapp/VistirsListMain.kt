package com.example.wedwaitapp

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class VistirsListMain : AppCompatActivity() {

    private lateinit var VistirsListMain: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vistirs_list_main)

        VistirsListMain = findViewById(R.id.visitor_list)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener {
            showAddVisitorDialog()
        }

        val searchButton: ImageButton = findViewById(R.id.searchbtn)
        val accountButton: ImageButton = findViewById(R.id.accountButton)
        val homeButton: ImageButton = findViewById(R.id.homeButton)

        searchButton.setOnClickListener {
            val intent = Intent(this, search::class.java)
            startActivity(intent)
            finish()
        }

        accountButton.setOnClickListener {
            val intent = Intent(this, account::class.java)
            startActivity(intent)
            finish()
        }

        homeButton.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun showAddVisitorDialog() {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_add_visitor, null)
        val etVisitorName: EditText = dialogView.findViewById(R.id.et_visitor_name)
        val etVisitorPhone: EditText = dialogView.findViewById(R.id.et_visitor_phone)
        val btnCancel: Button = dialogView.findViewById(R.id.btn_cancel)
        val btnSave: Button = dialogView.findViewById(R.id.btn_save)

        val dialog = AlertDialog.Builder(this)
            .setView(dialogView)
            .create()

        btnCancel.setOnClickListener {
            dialog.dismiss()
        }

        btnSave.setOnClickListener {
            val name = etVisitorName.text.toString()
            val phone = etVisitorPhone.text.toString()
            if (name.isNotEmpty() && phone.isNotEmpty()) {
                addVisitor(name, phone)
                dialog.dismiss()
            } else {
                // Show error message if fields are empty
                if (name.isEmpty()) {
                    etVisitorName.error = "Name is required"
                }
                if (phone.isEmpty()) {
                    etVisitorPhone.error = "Phone number is required"
                }
            }
        }

        dialog.show()
    }

    private fun addVisitor(name: String, phone: String) {
        val visitorItemView = LayoutInflater.from(this).inflate(R.layout.item_visitor, VistirsListMain, false)
        val tvVisitorInfo: TextView = visitorItemView.findViewById(R.id.tv_visitor_info)
        val btnInvite: Button = visitorItemView.findViewById(R.id.btn_invite)
        val btnDelete: ImageView = visitorItemView.findViewById(R.id.btn_delete)

        tvVisitorInfo.text = "$name / $phone"

        btnInvite.setOnClickListener(object : View.OnClickListener {
            var clickCount = 0

            override fun onClick(v: View?) {
                clickCount++
                when (clickCount % 3) {
                    1 -> {
                        btnInvite.text = "Attending"
                        btnInvite.setBackgroundResource(R.drawable.bg_attending)
                    }
                    2 -> {
                        btnInvite.text = "Not Attending"
                        btnInvite.setBackgroundResource(R.drawable.bg_not_attending)
                    }
                    else -> {
                        btnInvite.text = "Invite"
                        btnInvite.setBackgroundResource(R.drawable.btn_border)
                    }
                }
            }
        })

        btnDelete.setOnClickListener {
            VistirsListMain.removeView(visitorItemView)
        }

        VistirsListMain.addView(visitorItemView)
    }
}

