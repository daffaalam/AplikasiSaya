package com.daffaalam.aplikasisaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FiveActivity extends AppCompatActivity {

    /*
    TODO 38 : Deklarasikan EditText, String, dan Intent
     */

    EditText etA5;
    String sA5;
    Intent intentA5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        /*
        TODO 39 : Hubungkan etA5 dengan EditText yg ada di layout dengan ID
         */

        etA5 = findViewById(R.id.etA5);
    }

    public void sendA5(View view) {

        /*
        TODO 40 : Buat BlankActivity baru seperti pada TODO 4 (pada project ini diberi nama FiveSecActivity)
        TODO 41 : Isi nilai sA5 dengan nilai yg didapat dari etA5
        TODO 42 : Masukkan nilai sA5 kedalam intentA5 kemudian kirim ke activity berikutnya
         */

        sA5 = etA5.getText().toString();
        intentA5 = new Intent(this, FiveSecActivity.class).putExtra("TEXT", sA5);
        startActivity(intentA5);
    }
}
