package com.example.shoaib.purchaseapp.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numberofsubmit = 0
        var price = 0


        inc_item.setOnClickListener({
            dec_item.isClickable = true
            numberofsubmit = numberofsubmit + 1
            price = price + 20
            text2.text = "$numberofsubmit Items"
            text4.text = "$$price Only"
        })

        dec_item.setOnClickListener({
            if(numberofsubmit>0){
                numberofsubmit = numberofsubmit - 1
                price = price - 20
                text2.text = "$numberofsubmit Items"
                text4.text = "$$price Only"
            }else if(numberofsubmit==0)
            {
                dec_item.isClickable = false
            }
        })

        reset.setOnClickListener({
            numberofsubmit = 0
            price = 0
            text2.text = "$numberofsubmit Items"
            text4.text = "$$price Only"
        })

        order.setOnClickListener({

            if(numberofsubmit>-0){
                Toast.makeText(this, "You're $numberofsubmit items has been purchased for the price $price.", Toast.LENGTH_LONG).show()
            }
            else if(numberofsubmit==0)
            {
                Toast.makeText(this, "Cart is empty.", Toast.LENGTH_LONG).show()
            }

        })

    }

}







