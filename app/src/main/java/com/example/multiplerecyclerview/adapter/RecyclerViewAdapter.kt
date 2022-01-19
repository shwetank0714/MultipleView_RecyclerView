package com.example.multiplerecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerview.R
import com.example.multiplerecyclerview.model.Data
import com.example.multiplerecyclerview.model.TermsAndCondition

class RecyclerViewAdapter(val context: Context, val list: List<TermsAndCondition>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == 1){
            return
        }
        else if(viewType == 2){

        }
        else{

        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].viewType
    }

    /*companion object{
        const val VIEW_ONE = 1
        const val VIEW_TWO = 2
    }

    inner class View1ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var message = itemView.findViewById<TextView>(R.id.textViewFirst)

        fun bind(position:Int){
            val recyclerViewModel = list[position]
            message.text = recyclerViewModel.textData
        }
    }

    inner class View2ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var message = itemView.findViewById<TextView>(R.id.textViewSecond)!!

        fun bind(position: Int){
            val recyclerViewModel = list[position]
            message.text = recyclerViewModel.textData
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == VIEW_ONE){
            return View1ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view_1,parent,false))
        }
        else{
            return View2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view_2,parent,false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if(list[position].viewType == VIEW_ONE){
            (holder as View1ViewHolder).bind(position)
        }
        else{
            (holder as View2ViewHolder).bind(position)
        }
    }

    override fun getItemCount(): Int = list.size

    override fun getItemViewType(position: Int): Int {
        return list[position].viewType
    }*/
}