package com.example.tasklist

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.tasklist.ui.theme.ListData
import java.time.Instant
import java.util.Date

object ListManager {
    private val taskList= mutableListOf<ListData>()

    fun getAll():List<ListData>{
        return taskList
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun addIn(title:String){
        taskList.add(ListData(System.currentTimeMillis().toInt(),title, Date.from(Instant.now())))
    }

    fun deleteIn(id:Int){
        taskList.removeIf{
            it.id==id
        }
    }
}