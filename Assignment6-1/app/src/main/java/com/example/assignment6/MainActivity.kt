package com.example.assignment6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Text1 = Toast.makeText(applicationContext, "กรุณากรอกให้ครบทุกช่อง", Toast.LENGTH_LONG)
        val Nonum2 = Toast.makeText(applicationContext, "ห้ามกรอกช่อง Num2 = 0 !!", Toast.LENGTH_LONG)
        val Nnum2 = Toast.makeText(applicationContext, "กรอกค่า Num2", Toast.LENGTH_LONG)
        var nn1 = 0
        var nn2 = 0
        tplus.setOnClickListener {
            if (num1.text.toString() != "" && num2.text.toString() != "") {
                ta.setText("+")
                nn1 = num1.text.toString().toInt()
                nn2 = num2.text.toString().toInt()
                var total = nn1 + nn2
                tt.setText("$total")
            } else if (num1.text.toString() == "" && num2.text.toString() == "") {
                Text1.show()
            } else if (num2.text.toString() == "") {
                Nnum2.show()
            } else {
                Text1.show()
            }
        }
        val N2 = Toast.makeText(applicationContext, "กรอกค่า Num2", Toast.LENGTH_LONG)
        tminus.setOnClickListener {
            if (num1.text.toString() != "" && num2.text.toString() != "") {
                ta.setText("-")
                nn1 = num1.text.toString().toInt()
                nn2 = num2.text.toString().toInt()
                var total = nn1 - nn2
                tt.setText("$total")
            } else if (num1.text.toString() == "" && num2.text.toString() == "") {
                Text1.show()
            } else if (num2.text.toString() == "") {
                N2.show()
            } else {
                Text1.show()
            }
        }
        tmultiply.setOnClickListener {
            if (num1.text.toString() != "" && num2.text.toString() != "") {
                ta.setText("x")
                nn1 = num1.text.toString().toInt()
                nn2 = num2.text.toString().toInt()
                var total = nn1 * nn2
                tt.setText("$total")
            } else if (num1.text.toString() == "" && num2.text.toString() == "") {
                Text1.show()
            } else if (num2.text.toString() == "") {
                N2.show()
            } else {
                Text1.show()
            }
        }

        tdivider.setOnClickListener {
            if (num2.text.toString() == "") {
                Nnum2.show()
            } else if (num2.text.toString() == "0") {
                Nonum2.show()
            } else if (num1.text.toString() != "" && num2.text.toString() != "") {
                ta.setText("÷")
                var nn3:Double = num1.text.toString().toDouble()
                var nn4:Double = num2.text.toString().toDouble()
                var total:Double = nn3 / nn4
                tt.setText("$total")
            } else if (num1.text.toString() == "") {
                Text1.show()
            } else {
                Text1.show()
            }
        }
        tmodulo.setOnClickListener {
            if (num2.text.toString() == "") {
                Nnum2.show()
            } else if (num2.text.toString() == "0") {
                Nonum2.show()
            } else if (num1.text.toString() != "" && num2.text.toString() != "") {
                ta.setText("%")
                nn1 = num1.text.toString().toInt()
                nn2 = num2.text.toString().toInt()
                var total = nn1 % nn2
                tt.setText("$total")
            } else if (num1.text.toString() == "") {
                Text1.show()
            } else {
                Text1.show()
            }
        }

       tclear.setOnClickListener {
           num1.setText("")
           num2.setText("")
           ta.setText("")
           tt.setText("")
       }

    }
}
