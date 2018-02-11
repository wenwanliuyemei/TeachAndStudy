package com.xm.teach;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BasicDataTypeActivity extends BaseActivity {

    EditText edt_putin_data_1;
    EditText edt_operator;
    EditText edt_putin_data_2;
    TextView tv_show_data;
    Button btn_show_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_data_type);
        initView();
        setListener();
    }

    public void initView() {
        edt_putin_data_1 = (EditText) findViewById(R.id.edt_putin_data_1);
        edt_operator = (EditText) findViewById(R.id.edt_operator);
        edt_putin_data_2 = (EditText) findViewById(R.id.edt_putin_data_2);
        tv_show_data = (TextView) findViewById(R.id.tv_show_data);
        btn_show_data = (Button) findViewById(R.id.btn_show_data);
    }

    public void setListener() {
        btn_show_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getResult();
            }
        });
    }

    private void getResult() {
        if (TextUtils.isEmpty(edt_putin_data_1.getText())) {
            showToast("请输入第一个运算的数据。");
            return;
        }
        if (TextUtils.isEmpty(edt_operator.getText())) {
            showToast("请输入运算符。");
            return;
        }
        if (TextUtils.isEmpty(edt_putin_data_2.getText())) {
            showToast("请输入第二个运算的数据。");
            return;
        }
        double data1 = Double.parseDouble(edt_putin_data_1.getText().toString());
        double data2 = Double.parseDouble(edt_putin_data_2.getText().toString());
        double result = 0;
        StringBuffer operator = new StringBuffer();
        operator.append(edt_operator.getText().toString());
        switch (operator.toString()) {
            case "+":
                result = data1 + data2;
                break;
            case "-":
                result = data1 - data2;
                break;
            case "*":
                result = data1 * data2;
                break;
            case "/":
                result = data1 / data2;
                break;
        }
        tv_show_data.setText(data1 + operator.toString() + data2 + "=" + result);
    }
}
