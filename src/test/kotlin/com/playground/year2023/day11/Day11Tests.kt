package com.playground.year2023.day11

import com.playground.getExampleText
import com.playground.getRealText
import java.io.IOException
import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day11Tests {
    @Test
    @Throws(IOException::class)
    fun example1() {
        val lines = getExampleText("year2023", "day11")
        assertEquals(374L, part1(lines))
    }

    @Test
    @Throws(IOException::class)
    fun real1() {
        val lines = getRealText("year2023", "day11")
        assertEquals(9522407L, part1(lines))
    }

    @Test
    @Throws(IOException::class)
    fun example2a() {
        val lines = getExampleText("year2023", "day11")
        assertEquals(1030L, part2(lines, 10))
    }

    @Test
    @Throws(IOException::class)
    fun example2b() {
        val lines = getExampleText("year2023", "day11")
        assertEquals(8410L, part2(lines, 100))
    }

    @Test
    @Throws(IOException::class)
    fun real2() {
        val lines = getRealText("year2023", "day11")
        assertEquals(544723432977L, part2(lines, 1_000_000))
    }
}
