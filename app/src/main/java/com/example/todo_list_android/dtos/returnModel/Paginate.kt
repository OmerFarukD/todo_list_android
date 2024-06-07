package com.example.todo_list_android.dtos.returnModel

data class Paginate<T>(
    val size : Int,
    val index : Int,
    val pages : Int,
    val items : List<T>
)
