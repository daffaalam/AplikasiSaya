package com.daffaalam.aplikasisaya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ThreeActivity extends AppCompatActivity {

    /*
    TODO 25 : Deklarasikan EditText, TextView, dan String
     */

    EditText etA3;
    TextView tvA3;
    String sA3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        /*
        TODO 26 : Hubungkan variable EditText dan TextView dengan yg ada pada layout
         */

        etA3 = findViewById(R.id.etA3);
        tvA3 = findViewById(R.id.tvA3);

    }

    public void settextA3(View view) {

        /*
        TODO 27 : Isi nilai sA3 dengan nilai yg didapat dari etA3 kemudian set tvA3 dengan nilai sA3
         */

        sA3 = etA3.getText().toString();
        tvA3.setText(sA3);
    }

    public void toastA3(View view) {

        /*
        TODO 28 : Isi nilai sA3 dengan nilai yg didapat dari etA3 kemudian buat untuk memunculkan Toast dengan nilai sA3
        TODO SESSION 3 FINISH - JALANKAN APLIKASI KE DEVICE
        TODO 29 : Buat BlankActivity baru seperti pada TODO 4 (pada project ini diberi nama FourActivity)
         */

        sA3 = etA3.getText().toString();
        Toast.makeText(this, sA3, Toast.LENGTH_SHORT).show();
    }
}
