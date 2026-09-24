// 25810007_VuDinhBien

package com.ute.baitapthuchanhbuoi2

fun main() {
    // val vi so du ban dau ko thay doi
    val soDuBanDau: Double = 5_000_000.0

    // var vi so du hien tai thay doi sau moi giao dich
    var soDuHienTai: Double = soDuBanDau

    // Gui them 2 trieu
    soDuHienTai = soDuHienTai + 2_000_000.0
    println("Sau khi gui: $soDuHienTai VND")

    // Rut 1 trieu ruoi
    soDuHienTai = soDuHienTai - 1_500_000.0
    println("Sau khi rut: $soDuHienTai VND")
}

