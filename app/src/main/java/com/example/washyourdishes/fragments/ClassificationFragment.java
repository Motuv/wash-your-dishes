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

import com.example.washyourdishes.R;
import com.example.washyourdishes.objects.User;

import java.util.ArrayList;


public class ClassificationFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Context context = this.getContext();
        View view = inflater.inflate(R.layout.fragment_classification, null);
        container = view.findViewById(R.id.classification);
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User(1, "Piotr", R.drawable.piotr));
        users.add(new User(2, "Krzysiek", R.drawable.krzys));
        users.add(new User(3, "Wojtek", R.drawable.wojtek));
        users.add(new User(4, "Kuba", R.drawable.kuba));
        for(int i=0; i<4; i+=1) {
            TableRow tr = new TableRow(context);
            ImageView iv = new ImageView(context);
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            iv.setImageResource(users.get(i).getPhoto());
            iv.setAdjustViewBounds(true);
            iv.setMaxWidth(300);

            tr.addView(iv);

            TextView tv = new TextView(context);
            tv.setTextSize(100);
            tv.setText(String.valueOf(users.get(i).getPoints()));
            tr.addView(tv);

            container.addView(tr);
        }
        return view;
    }
}