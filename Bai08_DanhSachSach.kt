// 25810007_VuDinhBien

package com.ute.baitapthuchanhbuoi2

fun main() {
        val danhSachSach = mutableListOf(
        "Chi Pheo - Nam Cao",
        "\nSo Do - Vu Trong Phung",
        "\nTat Den - Ngo Tat To",
        "\nVo Nhat - Kim Lan",
        "\nMat Biec - Nguyen Nhat Anh"
    )

    println("Danh sach ban dau: ")
    println(danhSachSach)

    danhSachSach.add("\nDat Rung Phuong Nam - Doan Gioi")
    danhSachSach.add("\nToi Thay Hoa Vang Tren Co Xanh - Nguyen Nhat Anh")

    danhSachSach.remove("\nVo Nhat - Kim Lan")

    danhSachSach.sort()

    println("\nDanh sach sau khi them, xoa va sap xep:")
    println(danhSachSach)
}
