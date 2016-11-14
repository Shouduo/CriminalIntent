package com.shouduo.criminalintent;

import android.app.ListFragment;
import android.os.Bundle;

import java.util.ArrayList;

/**
 * Created by 刘亨俊 on 16.11.14.
 */

public class CrimeListFragment extends ListFragment {
    private ArrayList<Crime> mCrimes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);
        mCrimes = CrimeLab.get(getActivity()).getCrimes();
    }
}
