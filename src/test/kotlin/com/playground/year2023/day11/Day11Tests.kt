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
        assertEquals(374, part1(lines))
    }

    @Test
    @Throws(IOException::class)
    fun real1() {
        val lines = getRealText("year2023", "day11")
        assertEquals(9522407, part1(lines))
    }

    @Test
    @Throws(IOException::class)
    fun example2() {
        val lines = getExampleText("year2023", "day11")
        assertEquals(-1, part2(lines))
    }

    @Test
    @Throws(IOException::class)
    fun real2() {
        val lines = getRealText("year2023", "day11")
        assertEquals(-1, part2(lines))
    }
}
