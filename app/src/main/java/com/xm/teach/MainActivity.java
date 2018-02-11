package com.xm.teach;

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
//6、基本数据类型。int、long、float、double、String。
//7、类、属性、方法。


public class MainActivity extends BaseActivity {

    TextView tv_show_data;
    EditText edt_putin_data;
    Button btn_show_data;
    Button btn_show_toast;
    Button btn_basic_data_type;
    Button btn_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListener();
    }

    @Override
    public void initView() {
        tv_show_data = (TextView) findViewById(R.id.tv_show_data);
        edt_putin_data = (EditText) findViewById(R.id.edt_putin_data);
        btn_show_data = (Button) findViewById(R.id.btn_show_data);
        btn_show_toast = (Button) findViewById(R.id.btn_show_toast);
        btn_basic_data_type = (Button) findViewById(R.id.btn_basic_data_type);
        btn_string = (Button) findViewById(R.id.btn_string);
    }

    @Override
    public void setListener() {
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
                showToast(getData());
            }
        });
        btn_basic_data_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                basicDataType();
            }
        });
        btn_string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringTest();
            }
        });
    }

    private void showData() {
        tv_show_data.setText(getData());
    }

    private String getData() {
        return TextUtils.isEmpty(edt_putin_data.getText()) ? "默认数据" : edt_putin_data.getText().toString();
    }

    private void basicDataType() {
        intent(MainActivity.this, BasicDataTypeActivity.class);
    }

    private void stringTest() {
        intent(MainActivity.this, StringTestActivity.class);
    }
}
