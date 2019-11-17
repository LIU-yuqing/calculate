package com.example.myapplication1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


import androidx.appcompat.app.AppCompatActivity;


public class SwitchActivity extends AppCompatActivity{

    Button button_jinZhi;
    Button button_danWei;
    Button button_tiji;

    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;

    public int textId;
    public int textId1;
    public int D_text_Id;
    public int D_text_Id1;
    public String result;
    public int textId3;
    public int textId4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        editText1=(EditText)findViewById(R.id.edit_text1);
        editText2=(EditText)findViewById(R.id.edit_text2);
        editText3=(EditText)findViewById(R.id.edit_text3);
        editText4=(EditText)findViewById(R.id.edit_text4);
        editText5=(EditText)findViewById(R.id.edit_text5);
        editText6=(EditText)findViewById(R.id.edit_text6);

        button_danWei=(Button)findViewById(R.id.button_dan);
        button_jinZhi=(Button)findViewById(R.id.button_jin);
        button_tiji=(Button)findViewById(R.id.button_ti);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.items, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        //下拉列表选择事件监听器
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        textId=0;break;
                    case 1:
                        textId=1;break;
                    case 2:
                        textId=2;break;
                    case 3:
                        textId=3;break;
                    default:break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.items, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        //下拉列表选择事件监听器
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        textId1=0;break;
                    case 1:
                        textId1=1;break;
                    case 2:
                        textId1=2;break;
                    case 3:
                        textId1=3;break;
                    default:break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        button_jinZhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=editText1.getText().toString();
                Integer text10= Integer.parseInt(text);
                //二进制转十进制
                if(textId==0&&textId1==1){
                    result=Integer.valueOf(text,2).toString();
                    editText2.setText(result);
                    //Toast.makeText(SwitchActivity.this,result,Toast.LENGTH_LONG).show();
                }
                //二进制转十六进制
                else if(textId==0&&textId1==3){
                    result= Integer.toHexString(Integer.parseInt(text, 2));
                    editText2.setText(result);
                    //Toast.makeText(SwitchActivity.this,result,Toast.LENGTH_LONG).show();
                }
                //二进制转二进制
                else if(textId==0&&textId1==0){
                    result=text;
                    editText2.setText(result);
                }
                //二进制转八进制
                else if(textId==0&&textId1==2){
                    result= Integer.toOctalString(Integer.parseInt(text, 2));
                    editText2.setText(result);
                }
                //十进制转二进制
                else if(textId==1&&textId1==0){
                    result=Integer.toBinaryString(text10);
                    editText2.setText(result);
                }
                //十进制转十进制
                else if(textId==1&&textId1==1){
                    editText2.setText(text);
                }
                //十进制转八进制
                else if(textId==1&&textId1==2){
                    result=Integer.toOctalString(text10);
                    editText2.setText(result);
                }
                //十进制转十六进制
                else if(textId==1&&textId1==3){
                    result=Integer.toHexString(text10);
                    editText2.setText(result);
                }
                //八进制转二进制
                else if(textId==2&&textId1==0){
                    result= Integer.toBinaryString(Integer.valueOf(text,8));
                    editText2.setText(result);
                }
                //八进制转十进制
                else if(textId==2&&textId1==1){
                    result=Integer.valueOf(text,8).toString();
                    editText2.setText(result);
                }
                //八进制转八进制
                else if(textId==2&&textId1==2){
                    editText2.setText(text);
                }
                //八进制转十六进制
                else if(textId==2&&textId1==3){
                    result= Integer.toHexString(Integer.valueOf(text,8));
                    editText2.setText(result);
                }
                //十六进制转二进制
                else if(textId==3&&textId1==0){
                    result=Integer.toBinaryString(Integer.valueOf(text,16));
                    editText2.setText(result);
                }
                //十六进制转十进制
                else if(textId==3&&textId1==1){
                    result=Integer.valueOf(text,16).toString();
                    editText2.setText(result);
                }
                //十六进制转八进制
                else if(textId==3&&textId1==2){
                    result=Integer.toOctalString(Integer.valueOf(text,16));
                    editText2.setText(result);
                }
                //十六进制转十六进制
                else if(textId==3&&textId1==3){
                    editText2.setText(text);
                }
            }
        });

        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.items2, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        //下拉列表选择事件监听器
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        D_text_Id=0;break;
                    case 1:
                        D_text_Id=1;break;
                    case 2:
                        D_text_Id=2;break;
                    case 3:
                        D_text_Id=3;break;
                    default:break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.items2, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);

        //下拉列表选择事件监听器
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        D_text_Id1=0;break;
                    case 1:
                        D_text_Id1=1;break;
                    case 2:
                        D_text_Id1=2;break;
                    case 3:
                        D_text_Id1=3;break;
                    default:break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        button_danWei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=editText3.getText().toString();
                //Integer text10= Integer.parseInt(text);
                double text10=Double.parseDouble(text);
                double number;
                String sign;
                if(D_text_Id==0&&D_text_Id1==1){
                    number=text10*10.0;
                    sign=String.valueOf(number);
                    editText4.setText(sign);
                }
                else if(D_text_Id==0&&D_text_Id1==2){
                    number=text10/100.0;
                    sign=String.valueOf(number);
                    editText4.setText(sign);
                }
                else if(D_text_Id==0&&D_text_Id1==3){
                    number=text10/(100.0*1000.0);
                    sign=String.valueOf(number);
                    editText4.setText(sign);
                }
                else if(D_text_Id==1&&D_text_Id1==0){
                    number=text10/10.0;
                    sign=String.valueOf(number);
                    editText4.setText(sign);
                }
                else if(D_text_Id==1&&D_text_Id1==2){
                    number=text10/(10.0*100.0);
                    sign=String.valueOf(number);
                    editText4.setText(sign);
                }
                else if(D_text_Id==1&&D_text_Id1==3){
                    number=text10/(10.0*100.0*1000.0);
                    sign=String.valueOf(number);
                    editText4.setText(sign);
                }
                else if(D_text_Id==2&&D_text_Id1==0){
                    number=text10*100.0;
                    sign=String.valueOf(number);
                    editText4.setText(sign);
                }
                else if(D_text_Id==2&&D_text_Id1==1){
                    number=text10*100.0*10.0;
                    sign=String.valueOf(number);
                    editText4.setText(sign);
                }
                else if(D_text_Id==2&&D_text_Id1==3){
                    number=text10/1000.0;
                    sign=String.valueOf(number);
                    editText4.setText(sign);
                }
                else if(D_text_Id==3&&D_text_Id1==0){
                    number=text10*100.0*1000.0;
                    sign=String.valueOf(number);
                    editText4.setText(sign);
                }
                else if(D_text_Id==3&&D_text_Id1==1){
                    number=text10*10.0*100.0*1000.0;
                    sign=String.valueOf(number);
                    editText4.setText(sign);
                }
                else if(D_text_Id==3&&D_text_Id1==2){
                    number=text10*1000.0;
                    sign=String.valueOf(number);
                    editText4.setText(sign);
                }
                else if((D_text_Id==0&&D_text_Id1==0)||(D_text_Id==1&&D_text_Id1==1)||(D_text_Id==2&&D_text_Id1==2)||(D_text_Id==3&&D_text_Id1==3)){
                    editText4.setText(text);
                }
            }
        });

        Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
                R.array.itemss, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);

        //下拉列表选择事件监听器
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        textId3=0;break;
                    case 1:
                        textId3=1;break;
                    case 2:
                        textId3=2;break;

                    default:break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner spinner6 = (Spinner) findViewById(R.id.spinner6);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,
                R.array.itemss, android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);

        //下拉列表选择事件监听器
        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        textId4=0;break;
                    case 1:
                        textId4=1;break;
                    case 2:
                        textId4=2;break;

                    default:break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        button_tiji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=editText5.getText().toString();
                //Integer text10= Integer.parseInt(text);
                double text10=Double.parseDouble(text);
                double number;
                String sign;
                if(textId3==0&&textId4==1){
                    number=text10*1000.0;
                    sign=String.valueOf(number);
                    editText6.setText(sign);
                }
                else if(textId3==0&&textId4==2){
                    number=text10/1000000.0;
                    sign=String.valueOf(number);
                    editText6.setText(sign);
                }

                else if(textId3==1&&textId4==0){
                    number=text10/1000.0;
                    sign=String.valueOf(number);
                    editText6.setText(sign);
                }
                else if(textId3==1&&textId4==2){
                    number=text10/(10.0*100000000.0);
                    sign=String.valueOf(number);
                    editText6.setText(sign);
                }

                else if(textId3==2&&textId4==0){
                    number=text10*1000000.0;
                    sign=String.valueOf(number);
                    editText6.setText(sign);
                }
                else if(textId3==2&&textId4==1){
                    number=text10*100000000.0*10.0;
                    sign=String.valueOf(number);
                    editText6.setText(sign);
                }


                else if((textId3==0&&textId4==0)||(textId3==1&&textId4==1)||(textId3==2&&textId4==2)||(textId3==3&&textId4==3)){
                    editText6.setText(text);
                }
            }
        });
    }
}
