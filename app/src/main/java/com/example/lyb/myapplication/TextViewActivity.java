package com.example.lyb.myapplication;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        //中划线
        TextView tv4 = findViewById(R.id.tv4);
        tv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        tv4.getPaint().setAntiAlias(true); //去除锯齿
        //下划线
        //方法一
        TextView tv5 = findViewById(R.id.tv5);
        tv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        tv4.getPaint().setAntiAlias(true); //去除锯齿
        //方法二，内嵌html代码
        TextView tv6 = findViewById(R.id.tv6);
        tv6.setText(Html.fromHtml("<u>使用html代码实现下划线</u>"));
    }
}
