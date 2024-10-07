package com.example.tasklist

import android.icu.text.CaseMap.Title
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tasklist.ui.theme.ListData

class ListViewModel:ViewModel(){
    private var _taskList=MutableLiveData<List<ListData>>()
    val taskList:LiveData<List<ListData>> = _taskList

    fun getAll(){
        _taskList.value=ListManager.getAll().reversed()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun addIn(title:String){
        ListManager.addIn(title)
        getAll()
    }

    fun deleteIn(id:Int){
        ListManager.deleteIn(id)
        getAll()
    }
}