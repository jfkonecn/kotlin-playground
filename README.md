# kotlin-playground

## Setup a new Kotlin Project

1. Create new java project with maven

   - replace DgroupId and -DartifactId

   ```sh
   mvn archetype:generate -DgroupId=com.playground -DartifactId=KotlinPlayground -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
   ```

2. Add kotlin dependencies to pom.xml

   modify the pom.xml file to add the kotlin dependencies
   look at the pom.xml file in this project for reference

3. Create App.kt

   ```kotlin
   package com.playground

   class Sample() {

       fun sum(a: Int, b: Int): Int {
           return a + b
       }
   }

   fun main(args : Array<String>) {
       println("Hello, World!")
   }
   ```

4. Compile and run

   ```sh
   mvn compile exec:java
   ```

5. Create test

   ```kotlin
   package com.playground;

   import kotlin.test.Test
   import kotlin.test.assertEquals

   internal class SampleTest {

       private val testSample: Sample = Sample()

       @Test
       fun testSum() {
           val expected = 42
           assertEquals(expected, testSample.sum(40, 2))
       }
   }

   ```

6. Pass Cusotm Command line arguments

   ```sh
   mvn exec:java -Dexec.mainClass="com.example.Main" [-Dexec.args="argument1"]
   ```
