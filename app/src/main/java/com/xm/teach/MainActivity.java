package com.xm.teach;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//1、显示hello world。
//2、点击按钮，显示默认数据。
//3、点击按钮，显示EditText中的数据。
//4、点击按钮，显示EditText中的数据，Toast提示。
//5、TextView、Button、EditText
//6、基本数据类型。int、long、double、String。
//7、类、属性、方法。


public class MainActivity extends AppCompatActivity {

    TextView tv_show_data;
    EditText edt_putin_data;
    Button btn_show_data;
    Button btn_show_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListener();
    }

    private void initView() {
        tv_show_data = (TextView) findViewById(R.id.tv_show_data);
        edt_putin_data = (EditText) findViewById(R.id.edt_putin_data);
        btn_show_data = (Button) findViewById(R.id.btn_show_data);
        btn_show_toast = (Button) findViewById(R.id.btn_show_toast);
    }

    private void setListener() {
        btn_show_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showData();
            }
        });
        btn_show_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showData();
                showToast();
            }
        });
    }

    private void showData() {
        tv_show_data.setText(getData());
    }

    private void showToast() {
        Toast.makeText(MainActivity.this, getData(), Toast.LENGTH_SHORT).show();
    }

    private String getData() {
        return TextUtils.isEmpty(edt_putin_data.getText()) ? "默认数据" : edt_putin_data.getText().toString();
    }
}
