package com.shouduo.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by 刘亨俊 on 16.11.14.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
