package com.example.myapplication2.adapters

import com.example.myapplication2.R

data class MenuItem(
    val icon:Int,
    val text:Int
)


//val homeLists = listOf(
//    R.drawable.markets,
//    R.drawable.ic_todolist,
//    R.drawable.ic_visitors_list,
//    R.drawable.ic_badget_management
//)

val menuItem= listOf(MenuItem(R.drawable.markets,R.drawable.text_markets),
    MenuItem(R.drawable.ic_todolist,R.drawable.to_do_list_text),
    MenuItem(R.drawable.ic_visitors_list,R.drawable.visitors_list_text),
    MenuItem(R.drawable.ic_budget_management,R.drawable.budget_managements_text)
    )