package com.example.todo_list_android.dtos.returnModel

data class ReturnModel<T>(
    val success : Boolean,
    val message : String,
    val data : T
)
