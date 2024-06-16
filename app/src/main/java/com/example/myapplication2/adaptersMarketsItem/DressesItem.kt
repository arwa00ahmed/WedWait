package com.example.myapplication2.adaptersMarketsItem

import com.example.myapplication2.R

data class DressesItem(
    val icon :Int,
    val name :String,
    val iconLocation:Int,
    val iconLocationName:String,
    val iconEvaluation : Int,
    val iconEvaluationNum:String

)

val dressesItem= listOf(DressesItem(
    R.drawable.image_e,"atelier 1",
    R.drawable.location,"Manshia", R.drawable.evaluation,"4.1"
), DressesItem(
    R.drawable.image_e,"atelier 2",
    R.drawable.location,"Loran", R.drawable.evaluation,"4.1"
), DressesItem(
    R.drawable.image_e,"atelier 3",
    R.drawable.location,"Smouha", R.drawable.evaluation,"4.1"
),DressesItem(
    R.drawable.image_e,"atelier 4",
    R.drawable.location,"Miami", R.drawable.evaluation,"4.1"
))


