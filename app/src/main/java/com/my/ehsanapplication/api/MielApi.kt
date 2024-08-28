package com.my.ehsanapplication.api

import com.my.ehsanapplication.data.MielList
import retrofit2.http.GET

interface MielApi {
    @GET("random.php")
    suspend fun  getRandomMiel() : MielList

}