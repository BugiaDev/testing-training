package com.bugiadev.testing_training

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.lang.Exception
import java.lang.NumberFormatException

/**
 * Created by Kiko on 2019-11-12 for testing-training.
 */
class StringCalculatorTest {
    private lateinit var stringCalculator: StringCalculator

    private val scenarios = listOf(
        Pair("", 0),
        Pair("1", 1),
        Pair("1\n2\n3", 6),
        Pair("1,2,3", 6)
    )

    @Before
    fun setUp() {
        stringCalculator = StringCalculator()
    }

    // This test can substitute all the below ones just adding new scenarios to the list above
    @Test
    fun evaluateAllPossibleScenarios() {
        scenarios.forEach {
            evaluateStringCalculator(it.first, it.second)
        }
    }

    @Test
    fun returnsZeroIfTheStringIsEmpty() = evaluateStringCalculator("", 0)

    @Test
    fun returnsNumberIfTheStringIsANumber() = evaluateStringCalculator("1", 1)

    @Test
    fun returnsSumIfTheStringHasSeveralNumbers() = evaluateStringCalculator("1\n2\n3", 6)

    @Test(expected = NumberFormatException::class)
    fun returnsExceptionIfTheStringIsNegative()  {
        evaluateStringCalculator("-2", -2)
    }

    private fun evaluateStringCalculator(input: String, expectedResult: Int) {
        val result = StringCalculator().add(input)
        Assert.assertEquals(expectedResult, result)
    }
}