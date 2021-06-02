package com.vaca.calc

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

/*
abs: absolute value
acos: arc cosine
asin: arc sine
atan: arc tangent
cbrt: cubic root
ceil: nearest upper integer
cos: cosine
cosh: hyperbolic cosine
exp: euler's number raised to the power (e^x)
floor: nearest lower integer
log: logarithmus naturalis (base e)
log2: logarithm to base 2
log10: logarithm to base 10
sin: sine
sinh: hyperbolic sine
sqrt: square root
tan: tangent
tanh: hyperbolic tangent
signum: signum of a value
Addition: '2 + 2'
Subtraction: '2 - 2'
Multiplication: '2 * 2'
Division: '2 / 2'
Exponential: '2 ^ 2'
Unary Minus,Plus (Sign Operators): '+2 - (-2)'
Modulo: '2 % 2'
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val e: Expression = ExpressionBuilder("3 * sin(y) - 2 / (x - 2)")
            .variables("x", "y")
            .build()
            .setVariable("x", 2.3)
            .setVariable("y", 3.14)
        val result: Double = e.evaluate()


        e.setVariable("x",5.0)



        Log.e("上岛咖啡","re        ${e.evaluate()}")
    }
}