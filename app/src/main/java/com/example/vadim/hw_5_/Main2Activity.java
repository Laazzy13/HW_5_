package com.example.vadim.hw_5_;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        Log.d("TAG", "onCreate: "+intent.getStringExtra("name"));
        BlankFragment2 fragment=new BlankFragment2();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragment2,fragment);
        fragmentTransaction.commit();
        Bundle bundle = new Bundle();
        bundle.putString("name",intent.getStringExtra("name"));
        fragment.setArguments(bundle);
    }
}

