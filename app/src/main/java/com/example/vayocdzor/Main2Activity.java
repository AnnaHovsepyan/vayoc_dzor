package com.example.vayocdzor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String savedExtra1 = getIntent().getStringExtra("value1");
        Button myButton1 = (Button) findViewById(R.id.value1);
        myButton1.setText(savedExtra1);

        String savedExtra2 = getIntent().getStringExtra("value2");
        Button myButton2 = (Button) findViewById(R.id.value2);
        myButton2.setText(savedExtra2);

        String savedExtra3 = getIntent().getStringExtra("value3");
        Button myButton3 = (Button) findViewById(R.id.value3);
        myButton3.setText(savedExtra3);

        String savedExtra4 = getIntent().getStringExtra("value4");
        Button myButton4 = (Button) findViewById(R.id.value4);
        myButton4.setText(savedExtra4);


                    }
    public void openList1(View view1){
        Intent intent1=new Intent(getBaseContext(),Main2Activity1.class);
        intent1.putExtra("value11","Վայոց ձոր");
        intent1.putExtra("value12","Վա՜յ ձոր, վա՜յ ձոր");
        intent1.putExtra("value13","«Ջրահարսի վարսերի» լեգենդը");
        intent1.putExtra("value14","Խորհրդանիշ եղնիկի լեգենդը");
        intent1.putExtra("value15","Զարմանահրաշ Հերհերը");
        intent1.putExtra("value16","Վարպետ Մոմիկի սիրո լեգենդը");
        intent1.putExtra("value17","Գնդեվանքի լեգենդը");
        intent1.putExtra("value18","Սմբատաբերդի գրավումը");
        startActivity(intent1);}

        public void openList2(View view2){
            Intent intent2=new Intent(getBaseContext(),Main2Activity2.class);
            intent2.putExtra("value21","Եղեգնաձոր");
            intent2.putExtra("value22","Ջերմուկ");
            intent2.putExtra("value23","Վայք");
            startActivity(intent2);}

            public void openList3(View view3){
                Intent intent3=new Intent(getBaseContext(),Main2Activity3.class);
                intent3.putExtra("value31","Նորավանք");
                intent3.putExtra("value32","Սմբատաբերդ");
                intent3.putExtra("value33","Սպիտակավոր Սուրբ Աստվածածին եկեղեցի");
                intent3.putExtra("value34","Թանահատի վանք");
                intent3.putExtra("value35","Արկազի սբ Խաչ");
                intent3.putExtra("value36","Գնդևանք");
                intent3.putExtra("value37","գյուղ Հերհեր");
                intent3.putExtra("value38","Զորաց Սուրբ Աստվածածին եկեղեցի");
                intent3.putExtra("value39","Սուրբ Սիոն եկեղեցի");
                intent3.putExtra("value310","Շատինվանքի եկեղեցի");
                intent3.putExtra("value311","Ցախացքար եկեղեցի");
                intent3.putExtra("value312","Սուրբ Գայանե մատուռ");
                intent3.putExtra("value313","Արենիի Սուրբ Աստվածածին եկեղեցի");
                intent3.putExtra("value314","Եղեգնաձորի Սուրբ Աստվածածին եկեղեցի");
                intent3.putExtra("value315","Սուրբ Տրդատ եկեղեցի");
                intent3.putExtra("value316","Սուրբ Աննա եկեղեցի");
                intent3.putExtra("value317","Անգղի կամ Նահատակի մատուռ");
                startActivity(intent3);}
    public void openList4(View view4){
        Intent intent4=new Intent(getBaseContext(),Main2Activity4.class);
        startActivity(intent4);}


            }

