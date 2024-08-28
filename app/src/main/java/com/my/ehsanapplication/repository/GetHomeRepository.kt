package com.my.ehsanapplication.repository

import com.my.ehsanapplication.data.MielList


interface GetHomeRepository {
    suspend fun  getRandomMiel() : Result<MielList>
}