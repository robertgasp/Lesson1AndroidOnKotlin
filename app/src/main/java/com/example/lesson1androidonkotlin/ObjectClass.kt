package com.example.lesson1androidonkotlin

import kotlin.properties.Delegates

object ObjectClass {
    var varA: String = "a"
    var varB: String = "b"
    var varC: String = "c"
    var varD: String = "d"

    private lateinit var executionResult: String

    var varIntI: Int = 0


    fun getExecution(): String? {
        for (i in 1..10 step 2) {
            varIntI += i
        }

        executionResult = "Значение переменной при цикле for =" + varIntI.toString() + "\n"

        when (varIntI) {
            25 -> {
                executionResult += "Выполнение when при знаении переменной = 25 \n"
            }
            30 -> {
                executionResult += "Выполнение when при знаении переменной = 30 \n"
            }
        }

        varA += varB + varC + varD

        if (varA == "abcd") {
            executionResult += "\n a+b+c+d = $varA \n"
        } else {
            executionResult += "\n Условие a+b+c+d =abcd не выполнилось \n"
        }

        return executionResult
    }
}


