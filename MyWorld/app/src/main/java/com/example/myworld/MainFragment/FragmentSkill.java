package com.example.myworld.MainFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myworld.R;
import com.example.myworld.View.CommonTitle;

/**
 * Created by admin on 2017/10/10.
 */

public class FragmentSkill extends Fragment {
    private View view;
    private CommonTitle titleView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_skill, null);

        titleView = new CommonTitle(view);
        titleView.showTitleCenterText(R.string.me, true);

        return view;
    }
}
