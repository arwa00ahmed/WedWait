package com.example.myapplication2.adaptersMarketsItem

import com.example.myapplication2.R

data class ElectricalAppliancesItem(
    val icon :Int,
    val name :String,
    val iconLocation:Int,
    val iconLocationName:String,
    val iconEvaluation : Int,
    val iconEvaluationNum:String

)

val electricalAppliancesItem= listOf(ElectricalAppliancesItem(R.drawable.image_e,"store 1",
    R.drawable.location,"Manshia",R.drawable.evaluation,"4.1"
    ),ElectricalAppliancesItem(R.drawable.image_e,"store 2",
    R.drawable.location,"Loran",R.drawable.evaluation,"4.1"
),ElectricalAppliancesItem(R.drawable.image_e,"store 3",
    R.drawable.location,"Smouha",R.drawable.evaluation,"4.1"
),ElectricalAppliancesItem(R.drawable.image_e,"store 4",
    R.drawable.location,"Miami",R.drawable.evaluation,"4.1"
))
