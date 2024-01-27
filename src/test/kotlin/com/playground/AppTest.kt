package com.playground

import kotlin.test.Test
import kotlin.test.assertEquals

internal class AppTest {
    private val testSample: Sample = Sample()

    @Test
    fun testSum() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }

    @Test
    fun testSum2() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }
}
