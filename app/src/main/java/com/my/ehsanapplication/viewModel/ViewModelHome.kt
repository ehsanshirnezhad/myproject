package com.my.ehsanapplication.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.my.ehsanapplication.data.MielList
import com.my.ehsanapplication.repository.GetHomeRepository
import com.my.ehsanapplication.repository.HomeRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ViewModelHome @Inject constructor(private val homeRepository: HomeRepositoryImpl) :
    ViewModel() {

    private val _homeDataList = MutableLiveData<MielList>()
    val homeData get() = _homeDataList

    private val _homeDataListError = MutableLiveData<Throwable>()
    val homeDataListError get() = _homeDataListError

    init {
        viewModelScope.launch {
            homeRepository.getRandomMiel().fold(
                onSuccess = { data ->
                    _homeDataList.value = data
                }, onFailure = { error ->
                    _homeDataListError.value = error
                }
            )
        }
    }
}

