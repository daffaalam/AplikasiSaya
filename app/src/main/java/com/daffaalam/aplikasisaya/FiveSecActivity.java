package com.daffaalam.aplikasisaya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FiveSecActivity extends AppCompatActivity {

    /*
    TODO 44 : Deklarasikan TextView, dan String;
     */

    TextView tvA5sec;
    String sA5sec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_sec);

        /*
        TODO 45 : Isi nilai sA5sec dengan nilai yg ditangkap dari intent FiveActivity dan pastikan nama sesuai dengan yg ada pada activity sebelumnya
        TODO 46 : Hubungkan tvA5sec dengan TextView pada layout
        TODO 47 : Set nilai tvA5sec dengan nilai aA5sec
        TODO SESSION 5 FINISH - JALANKAN APLIKASI KE DEVICE
         */

        sA5sec = getIntent().getStringExtra("TEXT");

        tvA5sec = findViewById(R.id.tvA5sec);
        tvA5sec.setText(sA5sec);
    }
}
