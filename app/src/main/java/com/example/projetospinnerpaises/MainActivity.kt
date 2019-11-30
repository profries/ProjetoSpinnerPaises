package com.example.projetospinnerpaises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import android.view.View



class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var arrayAdapter: ArrayAdapter<CharSequence>;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var spinner: Spinner = findViewById(R.id.spinnerPais)
        arrayAdapter = ArrayAdapter.createFromResource(this,
            R.array.lista_paises,android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(this);
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        Toast.makeText(this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT)
            .show()

        //Toast.makeText(this,parent.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
    }

    override fun onNothingSelected(parent: AdapterView<*>) {

    }
}
