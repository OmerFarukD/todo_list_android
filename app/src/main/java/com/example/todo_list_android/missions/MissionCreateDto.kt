package com.example.todo_list_android.missions

import java.util.Date

data class MissionCreateDto(
    val title: String,
    val description : String,
    val priority : Priority,
    val startTime : Date,
    val endDate : Date,
    val categoryId: Int
)
