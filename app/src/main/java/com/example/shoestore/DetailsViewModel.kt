package com.example.shoestore

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailsViewModel:ViewModel() {
    val name = MutableLiveData<String>()
    val company = MutableLiveData<String>()
    val description = MutableLiveData<String>()
    val size = MutableLiveData<String>()

    fun createShoe() : Shoe {
        return Shoe(name.value ?: "", size.value?.toDouble()!!, company.value ?: "", description.value ?: "")
    }

}