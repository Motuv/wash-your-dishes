package com.example.washyourdishes;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.washyourdishes.fragments.ClassificationFragment;
import com.example.washyourdishes.fragments.ProfileFragment;
import com.example.washyourdishes.fragments.ResourcesFragment;
import com.example.washyourdishes.fragments.RulesFragment;
import com.example.washyourdishes.fragments.TimelineFragment;

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
            case 3:
                return new TimelineFragment();
            case 4:
                return new ProfileFragment();
            default:
                return new ClassificationFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
