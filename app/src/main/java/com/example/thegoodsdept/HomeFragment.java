package com.example.thegoodsdept;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {
    @Nullable
    private TabLayout tablayout;
    private ViewPager viewpager;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        tablayout = view.findViewById(R.id.tablayout_home);
        viewpager = view.findViewById(R.id.viewpager_home);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getFragmentManager());
        //Adding Fragment
        adapter.AddFragment(new FragmentWomen(), "Women");
        adapter.AddFragment(new FragmentMen(), "Men");
        //Adapter Setup
        viewpager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewpager);


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewpager);
        tablayout.setupWithViewPager(viewpager);

        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewpager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());

        adapter.AddFragment(new FragmentWomen(),"Women");
        adapter.AddFragment(new FragmentMen(),"Men");

        viewpager.setAdapter(adapter);

    }
}
