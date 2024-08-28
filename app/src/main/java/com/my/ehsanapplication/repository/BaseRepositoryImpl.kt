package com.my.ehsanapplication.repository

open class BaseRepositoryImpl {

    suspend fun<T> getResult(
        onSuccess : (suspend () -> Unit)? = null,
        call : suspend () -> T
    ): Result<T> {
        return try {
            val apiRes = call.invoke()
            if (apiRes!=null){
                onSuccess?.invoke()
                Result.success(apiRes)
            } else{
                throw Exception()
            }
        } catch (e:Exception) {
            Result.failure(e)
        }
    }


}