package com.example.rickmortyv2.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.rickmortyv2.fragments.PersonajesFragment;
import com.example.rickmortyv2.fragments.UbicacionesFragment;

public class TabsNavPageAdapter extends FragmentStatePagerAdapter {
    public TabsNavPageAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    //codigo que se ejecuta al cambiar de tabs
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return  new PersonajesFragment();
            case 1: return  new UbicacionesFragment();
            default: return  null;
        }
    }


    //Devolver la cantidad de tabs
    @Override
    public int getCount() {
        return 2;
    }
}
