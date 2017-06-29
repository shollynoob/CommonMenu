package com.visionstech.commonmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Third extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void tFirst(View view) {
        Intent intent = new Intent(Third.this, MainActivity.class);
        startActivity(intent);
    }

    public void tSecond(View view) {
        Intent intent = new Intent(Third.this, Second.class);
        startActivity(intent);
    }
}
