package com.example.madt_3_lab_calculator

import android.os.Bundle
import android.text.SpannableStringBuilder
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import org.mariuszgromada.math.mxparser.Expression


class MainActivity : AppCompatActivity() {
    private lateinit var display: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.input)
        display.showSoftInputOnFocus = false

        display.setOnClickListener {
            if (getString(R.string.enter_a_value) == display.text.toString()) {
                display.setText("")
            }
        }
    }

    private fun updateText(strToAdd: String) {
        val oldStr = display.text.toString()
        val cursorPos = display.selectionStart
        val leftStr = oldStr.substring(0, cursorPos)
        val rightStr = oldStr.substring(cursorPos)
        if (getString(R.string.enter_a_value) == display.text.toString()) {
            display.setText(strToAdd)
        } else {
            display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr))
        }
        display.setSelection(cursorPos + 1)
    }

    fun equalsBTN(view: View) {
        var userExp = display.text.toString()
        userExp = userExp.replace("÷", "/")
        userExp = userExp.replace("×", "*")
        val exp = Expression(userExp)
        val result = exp.calculate()

        if (result % 1 == 0.0) {
            display.setText(result.toInt().toString())
        } else {
            display.setText(result.toString())
        }

        display.setSelection(display.text.length)
    }

    fun backspaceBTN(view: View) {
        val cursorPos = display.selectionStart
        val textLen = display.text.length
        if (cursorPos != 0 && textLen != 0) {
            val selection = display.text as SpannableStringBuilder
            selection.replace(cursorPos - 1, cursorPos, "")
            display.setText(selection)
            display.setSelection(cursorPos - 1)
        }
    }

    fun zeroBTN(view: View?) {
        updateText("0")
    }

    fun oneBTN(view: View?) {
        updateText("1")
    }

    fun twoBTN(view: View?) {
        updateText("2")
    }

    fun threeBTN(view: View?) {
        updateText("3")
    }

    fun fourBTN(view: View?) {
        updateText("4")
    }

    fun fiveBTN(view: View?) {
        updateText("5")
    }

    fun sixBTN(view: View?) {
        updateText("6")
    }

    fun sevenBTN(view: View?) {
        updateText("7")
    }

    fun eightBTN(view: View?) {
        updateText("8")
    }

    fun nineBTN(view: View?) {
        updateText("9")
    }

    fun plusOrMinusBTN(view: View?) {
        updateText("-")
    }

    fun clearBTN(view: View?) {
        this.display.setText("")
    }

    fun powerBTN(view: View?) {
        updateText("^")
    }

    fun divideBTN(view: View?) {
        updateText("÷")
    }

    fun multiplyBTN(view: View?) {
        updateText("×")
    }

    fun minusBTN(view: View?) {
        updateText("-")
    }

    fun plusBTN(view: View?) {
        updateText("+")
    }

    fun pointBTN(view: View?) {
        updateText(".")
    }

    fun reciprocalBTN(view: View?) {
        updateText("1/")
    }

    fun squareRootBTN(view: View?) {
        updateText("√")
    }

    fun percentBTN(view: View?) {
        updateText("%")
    }
}