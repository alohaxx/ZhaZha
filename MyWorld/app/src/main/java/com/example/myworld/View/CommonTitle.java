package com.example.myworld.View;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myworld.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by admin on 2017/10/11.
 */

public class CommonTitle {
    @InjectView(R.id.tx_title_left)
    public TextView tv_titleLeft;
    @InjectView(R.id.tx_title_center)
    public TextView tv_titleCenter;
    @InjectView(R.id.tx_title_right)
    public TextView tv_titleRight;
    @InjectView(R.id.btn_title_left)
    public Button btn_titleLeft;
    @InjectView(R.id.btn_title_right)
    public Button btn_titleRight;

    public CommonTitle(View view){
        ButterKnife.inject(this,view);
    }

    public void showTitleLeftText(int leftTvID, boolean isshow) {
        if(tv_titleLeft != null) {
            if(isshow){
                tv_titleLeft.setText(leftTvID);
                tv_titleLeft.setVisibility(View.VISIBLE);
            }else{
                tv_titleLeft.setVisibility(View.INVISIBLE);
            }
        }
    }
    public void showTitleCenterText(int centerTvID, boolean isshow) {
        if(tv_titleCenter != null) {
            if(isshow){
                tv_titleCenter.setText(centerTvID);
                tv_titleCenter.setVisibility(View.VISIBLE);
            }else{
                tv_titleCenter.setVisibility(View.INVISIBLE);
            }
        }
    }

    public void showTitleRightText(int rightTvID, boolean isshow) {
        if(tv_titleRight != null) {
            if(isshow){
                tv_titleRight.setText(rightTvID);
                tv_titleRight.setVisibility(View.VISIBLE);
            }else{
                tv_titleRight.setVisibility(View.INVISIBLE);
            }
        }
    }


    public void showTitleLeftBtnImg(int titleLeftBtnImgID, boolean isshow){
        if (btn_titleLeft != null){
            if (isshow){
                btn_titleLeft.setBackgroundResource(titleLeftBtnImgID);
                btn_titleLeft.setVisibility(View.VISIBLE);
            }else{
                btn_titleLeft.setVisibility(View.INVISIBLE);
            }
        }
    }

    public void showTitleRightBtnImg(int titleRightBtnImgID, boolean isshow){
        if (btn_titleRight != null){
            if (isshow){
                btn_titleRight.setBackgroundResource(titleRightBtnImgID);
                btn_titleRight.setVisibility(View.VISIBLE);
            }else{
                btn_titleRight.setVisibility(View.INVISIBLE);
            }
        }
    }
}
