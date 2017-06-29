package com.visionstech.commonmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Third(View view) {
        Intent intent = new Intent(MainActivity.this, Third.class);
        startActivity(intent);
    }

    public void Second(View view) {
        Intent intent = new Intent(MainActivity.this, Second.class);
        startActivity(intent);
    }
}
