// 25810007_VuDinhBien

package com.ute.baitapthuchanhbuoi2

fun main() {
    val soLuong = 5
    val donGia = 25000.0

    val tienHang = soLuong.toDouble() * donGia
    val thue = tienHang * 0.08
    val tongTien = tienHang + thue

    println("Tien hang: $tienHang VND")
    println("Thue: $thue VND")
    println("Tong tien cuoi cung: $tongTien VND")
}
