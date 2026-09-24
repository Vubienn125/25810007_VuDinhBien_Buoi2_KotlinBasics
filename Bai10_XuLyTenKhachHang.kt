// 25810007_VuDinhBien

package com.ute.baitapthuchanhbuoi2

fun xuLyTenKhachHang(tenKhachHang: String?) {
    val doDai = tenKhachHang?.length
    println("Do dai ten: $doDai")

    val tenHienThi = tenKhachHang ?: "Khach vang lai"
    println("Ten khach hang: $tenHienThi")

    val tenChacChan = tenKhachHang!!
    println("Ten su dung: $tenChacChan")
}

fun main() {
    val tenKhachHang: String? = "Vu Dinh Bien"

    xuLyTenKhachHang(tenKhachHang)
}
