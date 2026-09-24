// 25810007_VuDinhBien

package com.ute.baitapthuchanhbuoi2

fun main() {
    var a: Int = 0
    var b: Int = 1
    var viTri: Int = 0

    for (i in 0..20) {
        if (a >= 100) {
            break
        }

        println("Vi tri so $viTri: $a")

        val tiepTheo = a + b
        a = b
        b = tiepTheo

        viTri++
    }
}
