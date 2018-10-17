package com.daffaalam.aplikasisaya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OneActivity extends AppCompatActivity {

    /*
    TODO 8 : Deklarasikan 1 TextView, 3 String, dan 1 Integer
     */

    TextView TvA1;
    String sNumber, sTvA1, sValTvA1;
    Integer iNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        /*
        TODO 9 : Isi nilai sNumber dengan angka 0 yg diubah dari nilai Integer ke String
        TODO 10 : Sambungkan variable TvA1 dengan TextView yg ada di layout dengan ID
        TODO 11 : Ubah text TvA1 menjadi nilai sNumber
        TODO 12 : Buat listener klik untuk TvA1
         */

        sNumber = String.valueOf(0);

        TvA1 = findViewById(R.id.tvA1);
        TvA1.setText(sNumber);
        TvA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                TODO 13 : Isi nilai sTvA1 dengan mengambil nilai dari TvA1
                TODO 14 : Isi nilai iNumber dengan nilai sTvA1 yg diubah dari String ke Integer
                TODO 15 : isi nilai sValTvA1 dengan nilai iNumber ditambah 1 yg diubah dari Integer ke String
                TODO 16 : Ubah text TvA1 menjadi nilai sValTvA1
                TODO SESSION 1 FINISH - JALANKAN APLIKASI KE DEVICE
                 */

                sTvA1 = TvA1.getText().toString();
                iNumber = Integer.valueOf(sTvA1);
                sValTvA1 = String.valueOf(iNumber + 1);
                TvA1.setText(sValTvA1);
            }
        });
    }
}

/*
TODO 17 : Buat BlankActivity baru seperti pada TODO 4 (pada project ini diberi nama TwoActivity)
 */