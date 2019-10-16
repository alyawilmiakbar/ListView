package com.example.listviewicon

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.text.FieldPosition

class MyListIconAdapter(var mCtx:Context, var resorce:Int, var items:List<Model>)
    :ArrayAdapter<Model>(mCtx, resorce, items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resorce, null )
        val imageView:ImageView = view.findViewById(R.id.IconTv)
        val textView: TextView = view.findViewById(R.id.titleTv)
        val textView1: TextView = view.findViewById(R.id.descIv)

        var mItems:Model = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItems.photo))
        textView.text = mItems.title
        textView1.text = mItems.desc
        return view
    }


    }
