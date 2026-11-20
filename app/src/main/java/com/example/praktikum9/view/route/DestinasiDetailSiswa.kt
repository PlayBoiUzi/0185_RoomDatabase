package com.example.praktikum9.view.route


import com.example.praktikum9.R
import  com.example.praktikum9.uicontroller.DestinasiNavigasi
object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "detail_siswa"

    override val titleRes = R.string.detail_siswa

    const val itemIdArg = "idSiswa"

    val routeWithArgs = "$route/{$itemIdArg}"
}