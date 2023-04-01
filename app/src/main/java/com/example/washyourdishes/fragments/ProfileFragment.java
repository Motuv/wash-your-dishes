package com.example.washyourdishes.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.washyourdishes.Globals;
import com.example.washyourdishes.R;


public class ProfileFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Context context = this.getContext();
        View view = inflater.inflate(R.layout.fragment_profile, null);
        container = view.findViewById(R.id.profile);

        ImageView iv = new ImageView(context);
        iv.setScaleType(ImageView.ScaleType.FIT_XY);
        iv.setImageResource(Globals.users.get(0).getPhoto());
        iv.setAdjustViewBounds(true);
        iv.setLayoutParams(new ViewGroup.LayoutParams(300,300));
        iv.setX(220);
        container.addView(iv);

        TextView tv = new TextView(context);
        tv.setTextSize(30);
        tv.setText("Name: ".concat(String.valueOf(Globals.users.get(0).getUserName())));
        tv.setGravity(Gravity.CENTER);
        container.addView(tv);

        TextView tv2 = new TextView(context);
        tv2.setTextSize(30);
        tv2.setText("Role: ".concat(String.valueOf(Globals.users.get(0).getRole())));
        tv2.setGravity(Gravity.CENTER);
        container.addView(tv2);

        return view;
    }
}
