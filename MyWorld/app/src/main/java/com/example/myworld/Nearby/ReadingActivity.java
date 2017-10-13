package com.example.myworld.Nearby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myworld.R;
import com.example.myworld.View.CommonTitle;

public class ReadingActivity extends AppCompatActivity {
    private CommonTitle titleView;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);

        View view = getWindow().getDecorView();
        titleView = new CommonTitle(view);
        titleView.showTitleCenterText(R.string.readAndAnswer, true);
        titleView.showTitleLeftBtnImg(R.drawable.img_title_back, true);
        titleView.showTitleRightBtnImg(R.drawable.img_title_share, true);

        titleView.btn_titleLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
