package com.example.ohmslaw

class OhmsLaw {
    fun calculateCurrent(voltage: Double, resistance: Double): Double {
        require(resistance > 0) { "Resistance must be greater than zero." }
        return voltage / resistance
    }

    fun calculateVoltage(current: Double, resistance: Double): Double {
        return current * resistance
    }

    fun calculateResistance(voltage: Double, current: Double): Double {
        require(current > 0) { "The current must be greater than zero." }
        return voltage / current
    }
}
