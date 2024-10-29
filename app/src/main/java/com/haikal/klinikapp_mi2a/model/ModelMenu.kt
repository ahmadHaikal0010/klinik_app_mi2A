package com.haikal.klinikapp_mi2a.model

import com.haikal.klinikapp_mi2a.R

data class ModelMenu(
    val gambarMenu : Int,
    val namaMenu : String
)

object ListMenu {
    fun getModel() : List<ModelMenu> {
        val item1 =  ModelMenu(
            R.drawable.eye,
            "Ophthalmologyst"
        )

        val item2 =  ModelMenu(
            R.drawable.heart,
            "Cardiologyst"
        )

        val item3 =  ModelMenu(
            R.drawable.tooth,
            "Dentist"
        )

        val item4 =  ModelMenu(
            R.drawable.eye,
            "Ophthalmologyst"
        )

        val item5 =  ModelMenu(
            R.drawable.heart,
            "Cardiologyst"
        )

        val item6 =  ModelMenu(
            R.drawable.tooth,
            "Dentist"
        )

        val itemList : ArrayList<ModelMenu> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)

        return itemList
    }
}
