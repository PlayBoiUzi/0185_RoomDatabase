package com.example.praktikum9.viewmodel
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.praktikum9.repositori.RepositoriSiswa
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.viewModelScope
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue



class EditViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa): ViewModel() {


    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

