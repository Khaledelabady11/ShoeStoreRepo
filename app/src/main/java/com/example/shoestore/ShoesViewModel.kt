package com.example.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoesViewModel:ViewModel() {


    private val _shoesItems = MutableLiveData<MutableList<Shoe>>()

    val shoesItems: LiveData<MutableList<Shoe>>
        get() = _shoesItems

    fun addNewShoe(shoeItem: Shoe){
        if (_shoesItems.value==null) _shoesItems.value= mutableListOf(shoeItem)
        else _shoesItems.value?.add(shoeItem)

    }





}