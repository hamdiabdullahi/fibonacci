package com.example.numbersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rvFibonacci=findViewById<RecyclerView>(R.id.rvFibonacci)
        rvFibonacci.layoutManager=LinearLayoutManager(baseContext)
        var numberAdapter=NumberRecyclerViewAdapter(sequence(100))
        rvFibonacci.adapter=numberAdapter





}

fun sequence(num:Int): List<BigInteger> {
    var fibList = MutableList<BigInteger>(num,{BigInteger.ZERO})
    var number1=BigInteger.ZERO
    var number2=BigInteger.ONE
    fibList[0]=number1
    fibList[1]=number2
    for (x in 1..num){
        var sum=number1+number2
        number1=number2
        number2=sum
        fibList[x-1]=number1
    }
    return fibList
}
}











