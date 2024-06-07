package com.example.todo_list_android.missions

import java.util.Date

data class MissionResponseDto(
    val id : Long,
    val title : String,
    val description : String,
    val missionStatus : MissionStatus,
    val createdTime : Date,
    val priority: Priority,
    val startTime: Date,
    val endDate : Date,
    val categoryName:String
)
