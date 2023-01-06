package de.ingoreschke.compoundinterest

import java.math.BigDecimal
import java.math.RoundingMode

class CompoundInterestCalculator {
    fun calc(): BigDecimal {
        val principal = BigDecimal("1000") // initial amount
        val rate = BigDecimal("0.05") // interest rate
        val numYears = 10 // number of years
        val numCompoundingsPerYear = 1 // number of times compounded per year
        val amount = principal
            .multiply(
                (BigDecimal.ONE.add(rate.divide(BigDecimal(numCompoundingsPerYear), 6, RoundingMode.HALF_UP)))
                    .pow(numCompoundingsPerYear * numYears)
            ).setScale(2,RoundingMode.HALF_UP)

        println("Compound interest: " + amount.subtract(principal))
        return amount
    }
}