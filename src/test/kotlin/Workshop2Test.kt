package org.example

import kotlin.test.Test
import kotlin.test.assertEquals

class Workshop2Test {

    private val sampleProducts = listOf(
        Product("Laptop", 35000.0, "Electronics"),
        Product("Smartphone", 25000.0, "Electronics"),
        Product("T-shirt", 450.0, "Apparel"),
        Product("Monitor", 7500.0, "Electronics"),
        Product("Keyboard", 499.0, "Electronics"),
        Product("Jeans", 1200.0, "Apparel"),
        Product("Headphones", 1800.0, "Electronics")
    )
//44
    @Test
    fun testCalculateTotalElectronicsPriceOver500() {
        val expected = 35000.0 + 25000.0 + 7500.0 + 1800.0
        val actual = calculateTotalElectronicsPriceOver500(sampleProducts)
        assertEquals(expected, actual)
    }

    @Test
    fun testCountElectronicsOver500() {
        val expectedCount = 4
        val actualCount = countElectronicsOver500(sampleProducts)
        assertEquals(expectedCount, actualCount)
    }
}
