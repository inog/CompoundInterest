package de.ingoreschke.compoundinterest

import org.junit.Assert
import org.junit.Test
import java.math.BigDecimal

class CompoundInterestCalculatorTest {
    private val cut = CompoundInterestCalculator()

    /**
     * 1000 * (1 + 0.05 / 10)^(1 * 1O)
     * 1000 * (1+ 0.05)^10
     * 1000 * (1.05)^10
     * 1000 * 1.62889462678
     * 1628.89462678
     */
    @Test
    fun calc() {
        val result = cut.calc()
        Assert.assertEquals(BigDecimal("1628.89"), result)
    }


}