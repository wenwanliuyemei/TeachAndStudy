package com.xm.teach;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StringTestActivity extends BaseActivity {


    EditText edt_putin_data_1;
    EditText edt_putin_data_2;
    TextView tv_show_data;
    Button btn_show_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_test);
        initView();
        setListener();
    }

    public void initView() {
        edt_putin_data_1 = (EditText) findViewById(R.id.edt_putin_data_1);
        edt_putin_data_2 = (EditText) findViewById(R.id.edt_putin_data_2);
        tv_show_data = (TextView) findViewById(R.id.tv_show_data);
        btn_show_data = (Button) findViewById(R.id.btn_show_data);
    }

    public void setListener() {
        btn_show_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data1 = edt_putin_data_1.getText().toString();
                String data2 = edt_putin_data_2.getText().toString();
                String data3 = "Hello ";
                String data4 = "World!";
                String data5 = data3 + data4;
                tv_show_data.setText(TextUtils.isEmpty(data1 + data2) ? data5 : data1 + data2);
            }
        });
    }

}
