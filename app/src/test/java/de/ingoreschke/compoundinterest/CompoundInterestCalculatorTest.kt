package de.ingoreschke.compoundinterest

import org.junit.Assert
import org.junit.Test
import java.math.BigDecimal

class CompoundInterestCalculatorTest {
    private val cut = CompoundInterestCalculator()

    /**
     * 1000 * (1 + 0.05 / 10)^(1 * 1O)
     * 1000 * (1+ 0.005)^10
     * 1000 * (1.005)^10
     * 1000 *  1.051140
     * 1051.140
     */

    @Test
    fun calc() {
        val result = cut.calc()
        Assert.assertEquals(BigDecimal("1051.140"), result)
    }
}