// 25810007_VuDinhBien

package com.ute.baitapthuchanhbuoi2

fun main() {
    val diemTB: Double = 7.5

    when (diemTB) {
        in 9.0..10.0 -> println("Diem TB: $diemTB - Xuat sac")
        in 8.0..8.9 -> println("Diem TB: $diemTB - Gioi")
        in 6.5..7.9 -> println("Diem TB: $diemTB - Kha")
        in 5.0..5.4 -> println("Diem TB: $diemTB - Trung binh")
        in 0.0..4.9 -> println("Diem TB: $diemTB - Yeu")
        else ->
            println("Điem trung binh khong le")
    }
}
