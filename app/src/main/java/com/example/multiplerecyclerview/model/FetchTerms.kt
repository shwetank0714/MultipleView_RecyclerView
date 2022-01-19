package com.example.multiplerecyclerview.model

import retrofit2.Call
import retrofit2.http.GET

interface FetchTerms {

    // https://jsonblob.com/api/jsonblob/932507209775202304

    @GET("932507209775202304")
    fun getData() : Call<TermsConditionData>
}