package com.example.wedwaitapp

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BudgetMain : AppCompatActivity() {

    private lateinit var tvTotalBudget: TextView
    private lateinit var tvRemainingBudget: TextView
    private lateinit var progressBar: ProgressBar
    private lateinit var btnEditBudget: Button
    private lateinit var dialog: Dialog
    private lateinit var recyclerViewProducts: RecyclerView
    private lateinit var productAdapter: ProductAdapter
    private val products = mutableListOf<Product>()
    private var totalBudget: Double = 0.0
    private var remainingBudget: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_budget_main)

        // Initialize views
        tvTotalBudget = findViewById(R.id.tvTotalBudget)
        tvRemainingBudget = findViewById(R.id.tvRemainingBudget)
        progressBar = findViewById(R.id.progressBar)
        btnEditBudget = findViewById(R.id.btnEditBudget)
        recyclerViewProducts = findViewById(R.id.recyclerViewProducts)

        // Set up RecyclerView
        productAdapter = ProductAdapter(products) { product ->
            productAdapter.removeProduct(product)
            updateRemainingBudget(-product.cost)
        }
        recyclerViewProducts.adapter = productAdapter
        recyclerViewProducts.layoutManager = LinearLayoutManager(this)

        // Set click listener on edit button
        btnEditBudget.setOnClickListener {
            showEditDialog()
        }

        // Floating action button for adding products
        val fabAddProduct: FloatingActionButton = findViewById(R.id.fab)
        fabAddProduct.setOnClickListener {
            showAddProductDialog()
        }

        // Navigation buttons
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

    private fun showEditDialog() {
        dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_edit_budget)
        val etBudget = dialog.findViewById<EditText>(R.id.etBudget)
        val btnCancel = dialog.findViewById<Button>(R.id.btnCancel)
        val btnSave = dialog.findViewById<Button>(R.id.btnSave)

        btnCancel.setOnClickListener {
            dialog.dismiss()
        }

        btnSave.setOnClickListener {
            val newBudget = etBudget.text.toString().toDoubleOrNull()
            if (newBudget != null) {
                totalBudget = newBudget
                remainingBudget = newBudget - calculateTotalProductCost()
                tvTotalBudget.text = "Total : $totalBudget EGP"
                tvRemainingBudget.text = "Remaining : $remainingBudget EGP"
                updateProgressBar()
            }
            dialog.dismiss()
        }

        dialog.show()
    }

    private fun showAddProductDialog() {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_add_product, null)
        val etServiceName: EditText = dialogView.findViewById(R.id.etServiceName)
        val etServiceCost: EditText = dialogView.findViewById(R.id.etServiceCost)
        val btnCancel: Button = dialogView.findViewById(R.id.btnCancel)
        val btnSave: Button = dialogView.findViewById(R.id.btnSave)

        val dialog = AlertDialog.Builder(this)
            .setView(dialogView)
            .create()

        btnCancel.setOnClickListener {
            dialog.dismiss()
        }

        btnSave.setOnClickListener {
            val serviceName = etServiceName.text.toString()
            val serviceCost = etServiceCost.text.toString().toDoubleOrNull()
            if (serviceName.isNotEmpty() && serviceCost != null) {
                val product = Product(serviceName, serviceCost)
                productAdapter.addProduct(product)
                updateRemainingBudget(serviceCost)
            }
            dialog.dismiss()
        }

        dialog.show()
    }

    private fun updateRemainingBudget(cost: Double) {
        remainingBudget -= cost
        tvRemainingBudget.text = "Remaining : $remainingBudget EGP"
        updateProgressBar()
    }

    private fun updateProgressBar() {
        if (totalBudget > 0) {
            val progress = ((totalBudget - remainingBudget) / totalBudget * 100).toInt()
            progressBar.progress = progress
        }
    }

    private fun calculateTotalProductCost(): Double {
        return products.sumOf { it.cost }
    }
}
