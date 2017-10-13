package com.example.myworld.Nearby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myworld.R;
import com.example.myworld.View.CommonTitle;

public class HeroActivity extends AppCompatActivity {
    private CommonTitle titleView;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);

        View view = getWindow().getDecorView();
        titleView = new CommonTitle(view);
        titleView.showTitleCenterText(R.string.rankList, true);
        titleView.showTitleLeftBtnImg(R.drawable.img_title_back, true);
    }
}
