package com.example.multiplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerview.adapter.RecyclerViewAdapter
import com.example.multiplerecyclerview.model.Data
import com.example.multiplerecyclerview.model.FetchTerms
import com.example.multiplerecyclerview.model.TermsAndCondition
import com.example.multiplerecyclerview.model.TermsConditionData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    var dataList = ArrayList<Data>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        val baseUrl = "https://jsonblob.com/api/jsonblob/"
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FetchTerms::class.java)

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object :Callback<TermsConditionData?>{
            override fun onResponse(
                call: Call<TermsConditionData?>,
                response: Response<TermsConditionData?>
            ) {
                val termsData = response.body()
                val termsList = termsData!!.termsAndConditions
            }

            override fun onFailure(call: Call<TermsConditionData?>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = RecyclerViewAdapter(this@MainActivity,dataList)

        recyclerView.adapter = adapter

    }

    private fun initData() {
        dataList.add(Data(RecyclerViewAdapter.VIEW_ONE, "1. Hi! I am in View 1"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_ONE, "2. Hi! I am in View 2"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_ONE, "3. Hi! I am in View 3"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TWO, "4. Hi! I am in View 4"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_ONE, "5. Hi! I am in View 5"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TWO, "6. Hi! I am in View 6"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TWO, "7. Hi! I am in View 7"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TWO, "8. Hi! I am in View 8"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_ONE, "9. Hi! I am in View 9"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_ONE, "10. Hi! I am in View 10"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_ONE, "11. Hi! I am in View 11"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TWO, "12. Hi! I am in View 12"))
    }
}