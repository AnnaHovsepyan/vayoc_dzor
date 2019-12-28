package com.example.vayocdzor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

    String savedExtra21 = getIntent().getStringExtra("value21");
    Button myButton21 = (Button) findViewById(R.id.value21);
        myButton21.setText(savedExtra21);

    String savedExtra22 = getIntent().getStringExtra("value22");
    Button myButton22 = (Button) findViewById(R.id.value22);
        myButton22.setText(savedExtra22);

    String savedExtra23 = getIntent().getStringExtra("value23");
    Button myButton23 = (Button) findViewById(R.id.value23);
        myButton23.setText(savedExtra23);
}
    public void yexegnadzor(View view1){
        Intent intent221=new Intent(getBaseContext(),Yexegnadzor.class);
        startActivity(intent221);}
    public void jermuk(View view1){
        Intent intent221=new Intent(getBaseContext(),Jermuk.class);
        startActivity(intent221);}
    public void vayk(View view1){
        Intent intent221=new Intent(getBaseContext(),Vayk.class);
        startActivity(intent221);}

}
