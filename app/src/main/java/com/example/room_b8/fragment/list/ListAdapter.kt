package com.example.room_b8.fragment.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.room_b8.R
import com.example.room_b8.Student
import kotlinx.android.synthetic.main.custom_row.view.*

class ListAdapter:  RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var studentList = emptyList<Student>()

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_row, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = studentList[position]
        holder.itemView.id_txt.text = currentItem.id.toString()
        holder.itemView.name_txt.text = currentItem.name
        holder.itemView.address_txt.text = currentItem.address
        holder.itemView.age_txt.text = currentItem.age.toString()

    }

    override fun getItemCount(): Int {
        return studentList.size
    }
    fun setData(student: List<Student>){
        this.studentList = student
        notifyDataSetChanged()
    }
}