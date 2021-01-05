package com.example.khaltiqomasha;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.khaltiqomasha.Fragments.FragmentONE;
import com.example.khaltiqomasha.Fragments.FragmentTHREE;
import com.example.khaltiqomasha.Fragments.FragmentTWO;

public class fragmentAdapter extends FragmentPagerAdapter {

    public fragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new FragmentONE();
            case 1 :
                return new FragmentTWO();
            case 2 :
                return new FragmentTHREE();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}