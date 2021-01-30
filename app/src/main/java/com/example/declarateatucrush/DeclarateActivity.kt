package com.example.declarateatucrush

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class DeclarateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_declarate)

        val btnSi = findViewById<Button>(R.id.btnSi)
        val btnNo = findViewById<Button>(R.id.btnNo)


        btnSi.setOnClickListener {
            var text = btnSi.text
            if(text.equals("Si")){
                Toast.makeText(this,"Gracias te Amo mucho mi amor", Toast.LENGTH_SHORT).show();
                val dialogBuilder = AlertDialog.Builder(this)

                // set message of alert dialog
                dialogBuilder.setMessage("Te amo mucho mi amor, sabia que dirias que si :), ya sabes como no te puedes negar uwu ._.")
                    // if the dialog is cancelable
                    .setCancelable(false)
                    // positive button text and action
                    .setPositiveButton("Aceptar", DialogInterface.OnClickListener {
                            dialog, id ->
                        intent = Intent(this, WinnerActivity::class.java)
                        startActivity(intent)
                    })
                // create dialog box
                val alert = dialogBuilder.create()
                // set title for alert dialog box
                alert.setTitle("Gracias")
                // show alert dialog
                alert.show()
            }
            else{
                btnSi.setText("Si")
                btnNo.setText("No")
                btnSi.setBackgroundColor(Color.GREEN)
                btnNo.setBackgroundColor(Color.RED)
            }
        }

        btnNo.setOnClickListener {
            var text = btnNo.text

            if(text.equals("Si")){
                Toast.makeText(this,"Gracias te Amo mucho mi amor", Toast.LENGTH_SHORT).show();
                val dialogBuilder = AlertDialog.Builder(this)

                // set message of alert dialog
                dialogBuilder.setMessage("Te amo mucho mi amor, sabia que dirias que si :)")
                    // if the dialog is cancelable
                    .setCancelable(false)
                    // positive button text and action
                    .setPositiveButton("Aceptar", DialogInterface.OnClickListener {
                            dialog, id -> intent = Intent(this, WinnerActivity::class.java)
                        startActivity(intent)
                    })
                // create dialog box
                val alert = dialogBuilder.create()
                // set title for alert dialog box
                alert.setTitle("Gracias")
                // show alert dialog
                alert.show()            }
            else{
                btnSi.setText("No")
                btnNo.setText("Si")
                btnSi.setBackgroundColor(Color.RED)
                btnNo.setBackgroundColor(Color.GREEN)
            }
        }
    }
}