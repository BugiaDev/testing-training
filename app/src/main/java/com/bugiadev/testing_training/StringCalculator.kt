package com.bugiadev.testing_training

import java.lang.Exception

/**
 * Created by Kiko on 2019-11-12 for testing-training.
 */
class StringCalculator {

    fun add(number: String): Int {
        if(number.isEmpty()) {
            return 0
        }
        else if(number.startsWith("-")) {
            throw Exception("negatives not allowed: $number")
        }
        else if(number.contains("\n") || number.contains(",")) {
            val array = number.split("\n", ",").toTypedArray()
            return array.map {
                it.toInt()
            }.sum()
        }
        else {
            return number.toInt()
        }
    }
}