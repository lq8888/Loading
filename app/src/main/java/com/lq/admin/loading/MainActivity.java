package com.lq.admin.loading;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.wang.avi.AVLoadingIndicatorView;

public class MainActivity extends AppCompatActivity {
public AVLoadingIndicatorView av;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tt= (TextView) findViewById(R.id.tv);
        av= (AVLoadingIndicatorView) findViewById(R.id.avi);
        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (av.isShown()){
                    av.smoothToHide();
                }else {
                    av.smoothToShow();
                }
            }
        });
    }
}
