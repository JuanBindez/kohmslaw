[![](https://jitpack.io/v/JuanBindez/kohmslaw.svg)](https://jitpack.io/#JuanBindez/kohmslaw)

# KohmsLaw Library

A lightweight Kotlin library to calculate electrical parameters using Ohm's Law.

## Features
- Calculate current (I) given voltage (V) and resistance (R).
- Calculate voltage (V) given current (I) and resistance (R).
- Calculate resistance (R) given voltage (V) and current (I).

## Installation

Add the dependency to your `build.gradle` file:
```groovy
implementation 'com.github.JuanBindez:Kohmslaw:v1.0.0'
```

## Usage

```kotlin
import com.example.ohmslaw.OhmsLaw

fun main() {
    val ohmsLaw = OhmsLaw()

    val current = ohmsLaw.calculateCurrent(12.0, 6.0) // 2.0 A
    val voltage = ohmsLaw.calculateVoltage(2.0, 6.0) // 12.0 V
    val resistance = ohmsLaw.calculateResistance(12.0, 2.0) // 6.0 Ω

    println("Current: $current A")
    println("Voltage: $voltage V")
    println("Resistance: $resistance Ω")
}
```

## Requirements
- Kotlin 1.9+
- Gradle 8.10+

## License
This project is licensed under the MIT License.
