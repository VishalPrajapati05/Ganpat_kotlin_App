package com.example.ganpat_kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ListView
import android.widget.Spinner


class spinnerActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        val technology = arrayOf("Android","IOS","Python")
        lateinit var spinner: Spinner
        lateinit var gridView: GridView
        lateinit var listview : ListView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        spinner= findViewById(R.id.spinner)
        gridView= findViewById(R.id.gridview)
        listview = findViewById(R.id.listview)

        val adapter =  ArrayAdapter(this,android.R.layout.simple_list_item_1,technology)
        spinner.adapter=adapter

        val ado = ArrayAdapter(this,android.R.layout.simple_list_item_1,technology)
        gridView.adapter=ado

        val ego = ArrayAdapter(this,android.R.layout.simple_list_item_1,technology)
        listview.adapter=ego
    }
}