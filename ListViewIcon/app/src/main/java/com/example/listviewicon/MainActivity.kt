package com.example.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listViewIcon)
        var list = mutableListOf<Model>()

        list.add(Model( "Ruby", "Ruby is an open-source and fully object-oriented programming language.", R.drawable.ruby))
        list.add(Model( "Rails", "Ruby on Rails is a server-side web application development framework written in Ruby language", R.drawable.rails))
        list.add(Model( "Phyton", "Phyton is interpreted scripting and object-oriented programming language", R.drawable.phyton))
        list.add(Model( "Javascript", "Javascript is an object-based scripting language", R.drawable.javascript))
        list.add(Model( "PHP", "PHP is an interpreted language, there is no need for compilation", R.drawable.php))

    listView.adapter = MyListIconAdapter( this , R.layout.row, list)
    }
}
