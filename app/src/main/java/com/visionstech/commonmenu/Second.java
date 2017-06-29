package com.visionstech.commonmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Second extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void sFirst(View view) {
        Intent intent = new Intent(Second.this, MainActivity.class);
        startActivity(intent);
    }

    public void sThird(View view) {
        Intent intent = new Intent(Second.this, Third.class);
        startActivity(intent);
    }
}
