package com.example.tasklist.ui.theme

import java.util.Date

data class ListData(
    var id: Int,
    var title: String,
    var createdAt: Date
)

fun getFake(): List<ListData> {
    return listOf(
        ListData(1, "First", Date()),
        ListData(2, "Second", Date()),
        ListData(3, "Third", Date()),
        ListData(4, "Last", Date())

    )
}