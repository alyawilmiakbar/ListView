package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()
        list.add(Model("Ir.Soekarno", "adalah Presiden pertama Republik Indonesia, Soekarno yang biasa dipanggil Bung Karno, lahir di Blitar, Jawa Timur, 6 Juni 1901 dan meninggal di Jakarta, 21 Juni 1970",
            R.drawable.soekarno))
        list.add(Model("Soeharto", "adalah Presiden kedua Republik Indonesia. Beliau lahir di Kemusuk, Yogyakarta, tanggal 8 Juni 1921",
            R.drawable.soeharto))
        list.add(Model("Bacharuddin Jusuf Habibie", "adalah Presiden ketiga Republik Indonesia, Bacharuddin Jusuf Habibie lahir di Pare-Pare, Sulawesi Selatan, pada 25 Juni 1936",
            R.drawable.habibie))
        list.add(Model("Abdurrahman Wahid", "adalah Presiden keempat dan putra pertama dari enam bersaudara yang dilahirkan di Denanyar Jombang Jawa Timur pada tanggal 4 Agustus 1940",
            R.drawable.gusdur))
        list.add(Model("Megawati Soekarnoputri", "adalah Presiden kelima Megawati Soekarnoputri lahir di Yogyakarta, 23 Januari 1947. ",
            R.drawable.megawati))
        list.add(Model("Susilo Bambang Yudhoyono", "adalah Presiden keenam Berbeda dengan presiden sebelumnya, beliau merupakan presiden pertama yang dipilih secara langsung oleh rakyat dalam proses Pemilu ",
            R.drawable.susilo))
        list.add(Model("Joko Widodo", "adalah Presiden ketujuh Ia lahir di Surakarta, 21 Juni 1961",
            R.drawable.jokowi))

        listView.adapter = MyListAdapter( this , R.layout.row, list)

        listView.setOnItemClickListener{ parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            if(position==0){
                Toast.makeText(this@MainActivity," Anda memilih: Presiden Pertama", Toast.LENGTH_SHORT).show()
            }
            if(position==1){
                Toast.makeText(this@MainActivity," Anda memilih: Presiden Kedua", Toast.LENGTH_SHORT).show()
            }
            if(position==2){
                Toast.makeText(this@MainActivity," Anda memilih: Presiden Ketiga", Toast.LENGTH_SHORT).show()
            }
            if(position==3){
                Toast.makeText(this@MainActivity," Anda memilih: Presiden Keempat", Toast.LENGTH_SHORT).show()
            }
            if(position==4){
                Toast.makeText(this@MainActivity," Anda memilih: Presiden Kelima", Toast.LENGTH_SHORT).show()
            }
            if(position==5){
                Toast.makeText(this@MainActivity," Anda memilih: Presiden Keenam", Toast.LENGTH_SHORT).show()
            }
            if(position==6){
                Toast.makeText(this@MainActivity," Anda memilih: Presiden Ketujuh", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
