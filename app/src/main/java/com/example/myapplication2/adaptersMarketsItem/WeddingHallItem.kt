package com.example.myapplication2.adaptersMarketsItem

import com.example.myapplication2.R

data class WeddingHallItem(
    val icon :Int,
    val name :String,
    val iconLocation:Int,
    val iconLocationName:String,
    val iconEvaluation : Int,
    val iconEvaluationNum:String

)

val weddingHallItem= listOf(WeddingHallItem(
    R.drawable.image_e,"hall 1",
    R.drawable.location,"Manshia", R.drawable.evaluation,"4.1"
),WeddingHallItem(
    R.drawable.image_e,"hall 2",
    R.drawable.location,"Loran", R.drawable.evaluation,"4.1"
), WeddingHallItem(
    R.drawable.image_e,"hall 3",
    R.drawable.location,"Smouha", R.drawable.evaluation,"4.1"
),WeddingHallItem(
    R.drawable.image_e,"hall 4",
    R.drawable.location,"Miami", R.drawable.evaluation,"4.1"
))

