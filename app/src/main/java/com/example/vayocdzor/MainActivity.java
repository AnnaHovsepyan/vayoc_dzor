package com.example.vayocdzor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openList(View view){
        Intent intent=new Intent(getBaseContext(),Main2Activity.class);
        intent.putExtra("value1","Պատմություն և լեգենդներ");
        intent.putExtra("value2","Քաղաքներ");
        intent.putExtra("value3","      Տեսարժան վայրեր");
        intent.putExtra("value4","       Լուսանկարներ");
        startActivity(intent);
    }
}

