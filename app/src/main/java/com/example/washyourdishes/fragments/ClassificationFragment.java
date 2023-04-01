package com.example.washyourdishes.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.washyourdishes.Globals;
import com.example.washyourdishes.R;


public class ClassificationFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Context context = this.getContext();
        View view = inflater.inflate(R.layout.fragment_classification, null);
        container = view.findViewById(R.id.classification);


        for(int i=0; i<4; i+=1) {
            TableRow tr = new TableRow(context);
            ImageView iv = new ImageView(context);
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            iv.setImageResource(Globals.users.get(i).getPhoto());
            iv.setAdjustViewBounds(true);
            iv.setMaxWidth(300);

            tr.addView(iv);

            TextView tv = new TextView(context);
            tv.setTextSize(100);
            tv.setText(String.valueOf(Globals.users.get(i).getPoints()));
            tv.setX(200);
            tr.addView(tv);


            container.addView(tr);
        }
        return view;
    }
}