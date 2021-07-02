package ru.sergo.learning.gradle

import org.junit.Assert
import org.junit.Test

class TestServiceKt {
    @Test
    fun testMsg() {
        println("All ok")
        Assert.assertEquals("Test string", Service().msg)
    }
}