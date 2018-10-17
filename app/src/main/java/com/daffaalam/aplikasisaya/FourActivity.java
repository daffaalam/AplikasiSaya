package com.daffaalam.aplikasisaya;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class FourActivity extends AppCompatActivity {

    /*
    TODO 32 : Deklarasikan WebView dan String
     */

    String teksWeb;
    WebView wvA4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        /*
        TODO 32 : Isi nilai teksWeb dengan nilai string pad TODO 30 ditambah dengan format HTML untuk teks rata kanankiri didepan dan dibelakang teks tersebut
        TODO 33 : Hubungkan wvA4 dengan WebView yg berada pada layout
        TODO 34 : Buat warna latar belakang wvA4 transparan
        TODO 35 : Muat nilai teksWeb kedalam wvA4
        TODO SESSION 4 FINISH - JALANKAN APLIKASI KE DEVICE
        TODO 36 : Buat BlankActivity baru seperti pada TODO 4 (pada project ini diberi nama FiveActivity)
         */

        teksWeb = "<html><body style=\"text-align: justify;\">" + getResources().getString(R.string.text_a4) + "</body></html>";

        wvA4 = findViewById(R.id.wvA4);
        wvA4.setBackgroundColor(Color.TRANSPARENT);
        wvA4.loadData(teksWeb, "text/html", "UTF-8");
    }
}
