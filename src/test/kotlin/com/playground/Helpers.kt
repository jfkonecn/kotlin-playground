package com.playground

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths

@Throws(IOException::class)
fun getExampleText(
    year: String,
    day: String,
): List<String> = Files.readAllLines(Paths.get("target", "test-classes", year, day, "example.txt"))

@Throws(IOException::class)
fun getRealText(
    year: String,
    day: String,
): List<String> = Files.readAllLines(Paths.get("target", "test-classes", year, day, "real.txt"))

@Throws(IOException::class)
fun getExample2Text(
    year: String,
    day: String,
): List<String> = Files.readAllLines(Paths.get("target", "test-classes", year, day, "example2.txt"))

@Throws(IOException::class)
fun getExample3Text(
    year: String,
    day: String,
): List<String> = Files.readAllLines(Paths.get("target", "test-classes", year, day, "example3.txt"))

@Throws(IOException::class)
fun getExample4Text(
    year: String,
    day: String,
): List<String> = Files.readAllLines(Paths.get("target", "test-classes", year, day, "example4.txt"))

@Throws(IOException::class)
fun getExample5Text(
    year: String,
    day: String,
): List<String> = Files.readAllLines(Paths.get("target", "test-classes", year, day, "example5.txt"))

@Throws(IOException::class)
fun getExample6Text(
    year: String,
    day: String,
): List<String> = Files.readAllLines(Paths.get("target", "test-classes", year, day, "example6.txt"))
