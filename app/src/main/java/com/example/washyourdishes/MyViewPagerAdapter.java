package com.example.washyourdishes;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.washyourdishes.fragments.ClassificationFragment;
import com.example.washyourdishes.fragments.RulesFragment;
import com.example.washyourdishes.fragments.ResourcesFragment;

public class MyViewPagerAdapter  extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new ClassificationFragment();
            case 1:
                return new RulesFragment();
            case 2:
                return new ResourcesFragment();
            default:
                return new ClassificationFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
