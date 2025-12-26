package com.example.questapi_030.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.questapi_030.modeldata.DetailSiswa
import com.example.questapi_030.modeldata.UIStateSiswa
import com.example.questapi_030.modeldata.toDataSiswa
import com.example.questapi_030.modeldata.toUiStateSiswa
import com.example.questapi_030.repositori.RepositoryDataSiswa
import com.example.questapi_030.uicontroller.route.DestinasiDetail
import kotlinx.coroutines.launch
import retrofit2.Response

class EditViewModel(savedStateHandle: SavedStateHandle, private val repositoryDataSiswa:
RepositoryDataSiswa