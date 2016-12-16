package com.example.os.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBar;
    private TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = (SeekBar)findViewById(R.id.seekbars);
        tv1 = (TextView)findViewById(R.id.current);
        tv2 = (TextView)findViewById(R.id.status);
        seekBar.setProgress(30);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv1.setText("当前进度是："+progress+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                tv2.setText("正在拖动搜索条");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                tv2.setText("停止拖动搜索条");
            }
        });
    }
}
