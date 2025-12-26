package com.example.questapi_030.viewmodel

import android.annotation.SuppressLint
import android.net.http.HttpException
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.questapi_030.modeldata.DataSiswa
import com.example.questapi_030.repositori.RepositoryDataSiswa
import com.example.questapi_030.uicontroller.route.DestinasiDetail
import kotlinx.coroutines.launch
import retrofit2.Response
import java.io.IOException

sealed interface StatusUIDetail {
    data class Success(val satusiswa: DataSiswa) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}

class DetailViewModel(savedStateHandle: SavedStateHandle, private val repositoryDataSiswa:
RepositoryDataSiswa
): ViewModel() {

   }