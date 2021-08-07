package com.example.lesson1androidonkotlin

import android.content.Context
import android.os.Bundle
import com.example.lesson1androidonkotlin.FirstPage
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.lesson1androidonkotlin.R


class FirstPage : Fragment() {


    private var clickButton: ClickButton? = null
    private var mainScreenContext: Context? = null


    private val dataClass: DataClass = DataClass("Иван", "Петров")
    private val dataClassCopy: DataClass = dataClass.copy(firstName = "Павел")

    private var resultText: String = String()
    private lateinit var resuText2: String
    private lateinit var resultText3: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ClickButton) {
            clickButton = context
        }
    }

    override fun onDetach() {
        clickButton = null
        super.onDetach()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_first_page, container, false)
        val buttonNext = rootView.findViewById<Button>(R.id.button_next)

        val textView: TextView = rootView.findViewById(R.id.result)


        textView.setText(getResultText())

        buttonNext.setOnClickListener(View.OnClickListener { clickButton!!.clickButton() })

        return rootView
    }


    fun getResultText(): String {
        resultText =
            "${ObjectClass.getExecution()} \n ${dataClass.firstName}  ${dataClass.secondName}  \n ${dataClassCopy.firstName}  ${dataClassCopy.secondName} \n \n"
        return resultText
    }

}





