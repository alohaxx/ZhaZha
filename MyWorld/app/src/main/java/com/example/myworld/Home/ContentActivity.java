package com.example.myworld.Home;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myworld.MainFragment.FragmentAddressBook;
import com.example.myworld.MainFragment.FragmentMe;
import com.example.myworld.MainFragment.FragmentMessage;
import com.example.myworld.MainFragment.FragmentNearby;
import com.example.myworld.MainFragment.FragmentSkill;
import com.example.myworld.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ContentActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    private FragmentSkill fragment_skill;
    private FragmentAddressBook fragment_addressBook;
    private FragmentMessage fragment_message;
    private FragmentNearby fragment_nearby;
    private FragmentMe fragment_me;

    //附近
    @InjectView(R.id.img_menu_nearby)
    ImageView img_menu_nearby;
    @InjectView(R.id.tv_menu_nearby)
    TextView tv_menu_nearby;

    // 消息
    @InjectView(R.id.img_menu_message)
    ImageView img_menu_message;
    @InjectView(R.id.tv_menu_message)
    TextView tv_menu_message;

    // 通讯录
    @InjectView(R.id.img_menu_addressBook)
    ImageView img_menu_addressBook;
    @InjectView(R.id.tv_menu_addressBook)
    TextView tv_menu_addressBook;

    // 技能
    @InjectView(R.id.img_menu_skill)
    ImageView img_menu_skill;
    @InjectView(R.id.tv_menu_skill)
    TextView tv_menu_skill;

    // 我的
    @InjectView(R.id.img_menu_me)
    ImageView img_menu_me;
    @InjectView(R.id.tv_menu_me)
    TextView tv_menu_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        ButterKnife.inject(this);

        fragmentManager = getSupportFragmentManager();

        // 默认选中“附近”
        clickMenu(findViewById(R.id.lay_nearby));
    }

    /**
     * 点击底部菜单事件
     * @param v
     */
    public void clickMenu(View v){
        FragmentTransaction trans = fragmentManager.beginTransaction();
        int viewID = v.getId();
        // 设置menu样式
        setMenuStyle(viewID);
        // 隐藏所有fragment
        hideFrament(trans);
        // 设置fragment
        setFragment(viewID,trans);
        trans.commit();
    }
    /**
     * 设置menu样式
     * @param viewID
     * @param trans
     */
    private void setMenuStyle(int viewID) {
        // 附近
        if(viewID==R.id.lay_nearby){
            img_menu_nearby.setImageDrawable(getResources().getDrawable(R.drawable.img_menu_nearby_click));
            tv_menu_nearby.setTextColor(getResources().getColor(R.color.col_menu_click));
        }else {
            img_menu_nearby.setImageDrawable(getResources().getDrawable(R.drawable.img_menu_nearby));
            tv_menu_nearby.setTextColor(getResources().getColor(R.color.col_menu_normal));
        }
        // 消息
        if(viewID==R.id.lay_message){
            img_menu_message.setImageDrawable(getResources().getDrawable(R.drawable.img_menu_message_click));
            tv_menu_message.setTextColor(getResources().getColor(R.color.col_menu_click));
        }else {
            img_menu_message.setImageDrawable(getResources().getDrawable(R.drawable.img_menu_message));
            tv_menu_message.setTextColor(getResources().getColor(R.color.col_menu_normal));
        }
        // 通讯录
        if(viewID==R.id.lay_addressBook){
            img_menu_addressBook.setImageDrawable(getResources().getDrawable(R.drawable.img_menu_address_book_click));
            tv_menu_addressBook.setTextColor(getResources().getColor(R.color.col_menu_click));
        }else {
            img_menu_addressBook.setImageDrawable(getResources().getDrawable(R.drawable.img_menu_address_book));
            tv_menu_addressBook.setTextColor(getResources().getColor(R.color.col_menu_normal));
        }

        // 技能
        if(viewID==R.id.lay_skill){
            img_menu_skill.setImageDrawable(getResources().getDrawable(R.drawable.img_menu_skill_click));
            tv_menu_skill.setTextColor(getResources().getColor(R.color.col_menu_click));
        }else {
            img_menu_skill.setImageDrawable(getResources().getDrawable(R.drawable.img_menu_skill));
            tv_menu_skill.setTextColor(getResources().getColor(R.color.col_menu_normal));
        }
        // 我的
        if(viewID==R.id.lay_me){
            img_menu_me.setImageDrawable(getResources().getDrawable(R.drawable.img_menu_me_click));
            tv_menu_me.setTextColor(getResources().getColor(R.color.col_menu_click));
        }else {
            img_menu_me.setImageDrawable(getResources().getDrawable(R.drawable.img_menu_me));
            tv_menu_me.setTextColor(getResources().getColor(R.color.col_menu_normal));
        }
    }


    /**
     * 隐藏所有的fragment(编程初始化状态)
     * @param trans
     */
    private void hideFrament(FragmentTransaction trans) {
        if(fragment_nearby!=null){
            trans.hide(fragment_nearby);
        }
        if(fragment_message!=null){
            trans.hide(fragment_message);
        }
        if(fragment_addressBook!=null){
            trans.hide(fragment_addressBook);
        }

        if(fragment_skill!=null){
            trans.hide(fragment_skill);
        }
        if(fragment_me!=null){
            trans.hide(fragment_me);
        }
    }

    /**
     * 设置fragment
     * @param vID
     * @param trans
     */
    private void setFragment(int vID,FragmentTransaction trans) {
        switch (vID) {
            case R.id.lay_nearby:
                if(fragment_nearby==null){
                    fragment_nearby = new FragmentNearby();
                    trans.add(R.id.content, fragment_nearby);
                }else{
                    trans.show(fragment_nearby);
                }
                break;
            case R.id.lay_message:
                if(fragment_message==null){
                    fragment_message = new FragmentMessage();
                    trans.add(R.id.content, fragment_message);
                }else{
                    trans.show(fragment_message);
                }
                break;
            case R.id.lay_addressBook:
                if(fragment_addressBook==null){
                    fragment_addressBook = new FragmentAddressBook();
                    trans.add(R.id.content, fragment_addressBook);
                }else{
                    trans.show(fragment_addressBook);
                }
                break;

            case R.id.lay_skill:
                if(fragment_skill==null){
                    fragment_skill = new FragmentSkill();
                    trans.add(R.id.content, fragment_skill);
                }else{
                    trans.show(fragment_skill);
                }
                break;

            case R.id.lay_me:
                if(fragment_me==null){
                    fragment_me = new FragmentMe();
                    trans.add(R.id.content, fragment_me);
                }else{
                    trans.show(fragment_me);
                }
                break;
            default:
                break;
        }
    }
}
