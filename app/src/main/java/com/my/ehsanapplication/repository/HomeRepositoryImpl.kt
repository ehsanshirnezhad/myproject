package com.my.ehsanapplication.repository

import com.my.ehsanapplication.api.MielApi
import com.my.ehsanapplication.data.MielList
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(private val miealApi : MielApi) : BaseRepositoryImpl(), GetHomeRepository {
    override suspend fun getRandomMiel(): Result<MielList>  {
        return getResult {
            miealApi.getRandomMiel()
        }
    }
}