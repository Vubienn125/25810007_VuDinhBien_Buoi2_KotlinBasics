// 25810007_VuDinhBien

package com.ute.baitapthuchanhbuoi2

fun main() {
    val canNang: Double = 55.0
    val chieuCao: Double = 1.65

    val bmi = canNang / (chieuCao * chieuCao)

    if (bmi < 18.5) {
        println("BMI: $bmi - Gay")
    } else if (bmi < 25.0) {
        println("BMI: $bmi - Binh thuong")
    } else if (bmi < 30.0) {
        println("BMI: $bmi - Thua can")
    } else {
        println("BMI: $bmi - Beo phi")
    }
}