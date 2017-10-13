package com.example.myworld.MainFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.myworld.Nearby.HeroActivity;
import com.example.myworld.Nearby.MonsterActivity;
import com.example.myworld.Nearby.ReadingActivity;
import com.example.myworld.Nearby.SceneActivity;
import com.example.myworld.R;
import com.example.myworld.View.CommonTitle;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by admin on 2017/10/10.
 */

public class FragmentNearby extends Fragment{
    private View view;
    private CommonTitle titleView;

    private ImageView img_nearby;
    private Button btn_reading;
    private Button btn_hero;
    private Button btn_monster;
    private Button btn_scene;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_nearby,null);

        titleView = new CommonTitle(view);
        titleView.showTitleCenterText(R.string.nearby, true);
        init();

        return view;
    }

    private void init() {
        //碎片中若使用butterknife绑定会出现闪退
        btn_reading = view.findViewById(R.id.btn_reading);
        btn_reading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),ReadingActivity.class);
                startActivity(intent);
            }
        });
        btn_hero = view.findViewById(R.id.btn_hero);
        btn_hero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),HeroActivity.class);
                startActivity(intent);
            }
        });
        btn_monster = view.findViewById(R.id.btn_monster);
        btn_monster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),MonsterActivity.class);
                startActivity(intent);
            }
        });
        btn_scene = view.findViewById(R.id.btn_scene);
        btn_scene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),SceneActivity.class);
                startActivity(intent);
            }
        });


    }
}

