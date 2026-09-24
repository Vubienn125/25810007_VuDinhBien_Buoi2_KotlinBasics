// 25810007_VuDinhBien

package com.ute.baitapthuchanhbuoi2

fun main() {
    val diem = arrayOf(10.0, 9.5, 9.0, 8.5, 8.0, 7.5, 7.0, 6.5, 6.0, 5.5)

    var tong: Double = 0.0
    var diemCaoNhat: Double = diem[0]
    var diemThapNhat: Double = diem[0]

    for (i in diem.indices) {
        tong = tong + diem[i]

        if (diem[i] > diemCaoNhat) {
            diemCaoNhat = diem[i]
        }

        if (diem[i] < diemThapNhat) {
            diemThapNhat = diem[i]
        }
    }

    val diemTrungBinh = tong / diem.size

    println("Diem trung binh: $diemTrungBinh")
    println("Diem cao nhat: $diemCaoNhat")
    println("Diem thap nhat: $diemThapNhat")
}
