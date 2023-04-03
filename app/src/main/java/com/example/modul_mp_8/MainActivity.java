package com.example.modul_mp_8;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ambil list view dari activity_main.xml
        ListView list=findViewById(R.id.list_view);

        //definisikan list adapter yang kita buat
        ListAdapter adapter=new ListAdapter(this,createPersons());

        //set adapter pada list view.
        list.setAdapter(adapter);
    }

    private List<Person> createPersons(){
        List<Person>data=new ArrayList<>();
        data.add(new Person(R.drawable.kuda,"Kuda","Kuda (Equus caballus atau Equus ferus caballus) adalah salah satu dari sepuluh spesies modern mamalia dari genus Equus."));
        data.add(new Person(R.drawable.kucing,"Kucing","Kucing disebut juga kucing domestik atau kucing rumah (nama ilmiah: Felis silvestris catus atau Felis catus) adalah sejenis mamalia karnivora dari keluarga Felidae."));
        data.add(new Person(R.drawable.masbro,"Masbro","Masbro merupakan jenis hewan pengerat terbesar yang masih ada di dunia (hewan pengerat terbesar yang telah punah adalah Phoberomys pattersoni) yang merupakan anggota genus Hydrochoerus. "));
        data.add(new Person(R.drawable.beruang,"Beruang","Beruang adalah binatang buas jenis Ursus, berbulu tebal, dapat berdiri di atas kedua kakinya, bercakar, dan bermoncong panjang."));

        return data;
    }
}