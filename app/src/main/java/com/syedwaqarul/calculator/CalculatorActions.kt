package com.syedwaqarul.calculator

sealed class CalculatorActions {
    data class Number(val number: Int) :CalculatorActions()
    object Clear:CalculatorActions()
    object Delete:CalculatorActions()
    object Decimal :CalculatorActions()
    object Calculate:CalculatorActions()
    data class Operation(val operation:CalculatorOperation): CalculatorActions()

}
//State is the any type of value that change overtime.
//8 16 to 8 46