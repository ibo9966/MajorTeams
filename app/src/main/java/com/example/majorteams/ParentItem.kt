package com.example.majorteams

data class ParentItem(
    val title : String,
    val logo :Int,
    val mList:List<ChildItem>)
