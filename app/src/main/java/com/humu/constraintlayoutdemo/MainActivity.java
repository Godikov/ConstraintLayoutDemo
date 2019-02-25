package com.humu.constraintlayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void demo1(View view) {
        startActivity(new Intent(this,Demo1Activity.class));
    }

    public void demo2(View view) {
        startActivity(new Intent(this,Demo2Activity.class));
    }

    public void demo3(View view) {
        startActivity(new Intent(this,Demo3Activity.class));
    }

    public void demo4(View view) {
        startActivity(new Intent(this,Demo4Activity.class));
    }

    public void demo5(View view) {
        startActivity(new Intent(this,Demo5Activity.class));
    }

    public void demo6(View view) {
        startActivity(new Intent(this,Demo6Activity.class));
    }

    public void demo7(View view) {
        startActivity(new Intent(this,Demo7Activity.class));
    }

    public void demo8(View view) {
        startActivity(new Intent(this,Demo8Activity.class));
    }
}
