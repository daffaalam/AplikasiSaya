package com.daffaalam.aplikasisaya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * TODO 2 : Implementasikan OnClickListener, lalu tekan Alt+Enter pada 'OnClickListener' dan pilih 'Implement Methods'
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * TODO 3 : Panggil semua ID button yg ada pada layout lalu setOnClickListener pada konteks ini
     **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btA1Main).setOnClickListener(this);
        findViewById(R.id.btA2Main).setOnClickListener(this);
        findViewById(R.id.btA3Main).setOnClickListener(this);
        findViewById(R.id.btA4Main).setOnClickListener(this);
        findViewById(R.id.btA5Main).setOnClickListener(this);
        Log.v("LifeCycle onCreate", "goingOn");
    }

    /**
     * TODO 4 : Buat activity baru dengan cara klik kanan pada folder app atau java lalu pilih 'New' > 'Activity' > 'Empty Activity' ubah ActivityName sesuai selera (pada project ini diberi nama OneActivity) selebihnya biarkan secara bawaan dan OK
     * TODO 5 : Buat switch case untuk saat di klik pada ID button akan berpindah dari konteks ini ke aktifitas lainnya
     * TODO 6 : Berikan Log penjelasan ketika button ditekan atau berpindah aktifitas
     **/

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btA1Main:
                startActivity(new Intent(this, OneActivity.class));
                Log.v("MyLOG", "Button 1 pada MainActivity ditekan dan berpindah ke OneActivity");
                break;
            case R.id.btA2Main:
                startActivity(new Intent(this, TwoActivity.class));
                Log.v("MyLOG", "Button 2 pada MainActivity ditekan dan berpindah ke TwoActivity");
                break;
            case R.id.btA3Main:
                startActivity(new Intent(this, ThreeActivity.class));
                Log.v("MyLOG", "Button 3 pada MainActivity ditekan dan berpindah ke ThreeActivity");
                break;
            case R.id.btA4Main:
                startActivity(new Intent(this, FourActivity.class));
                Log.v("MyLOG", "Button 4 pada MainActivity ditekan dan berpindah ke FourActivity");
                break;
            case R.id.btA5Main:
                startActivity(new Intent(this, FiveActivity.class));
                Log.v("MyLOG", "Button 5 pada MainActivity ditekan dan berpindah ke FiveActivity");
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("LifeCycle onStart", "goingOn");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("LifeCycle onResume", "goingOn");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("LifeCycle onPause", "goingOn");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("LifeCycle onStop", "goingOn");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("LifeCycle onRestart", "goingOn");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("LifeCycle onDestroy", "goingOn");
    }
}
