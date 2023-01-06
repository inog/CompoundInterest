package de.ingoreschke.compoundinterest

import java.math.BigDecimal
import java.math.RoundingMode

class CompoundInterestCalculator {
    fun calc(
        principal:BigDecimal = BigDecimal("1000"), // initial amount
        rate:BigDecimal = BigDecimal("0.05"), // interest rate
        numYears:Int = 10, // number of years
        numCompoundingsPerYear:Int = 1 // number of times compounded per year
    ): BigDecimal {
        val amount = principal
            .multiply(
                (BigDecimal.ONE.add(rate.divide(BigDecimal(numCompoundingsPerYear), 6, RoundingMode.HALF_UP)))
                    .pow(numCompoundingsPerYear * numYears)
            ).setScale(2,RoundingMode.HALF_UP)

        println("Compound interest: " + amount.subtract(principal))
        return amount
    }
}