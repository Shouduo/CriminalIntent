package com.shouduo.criminalintent;

import android.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragment);
//
//        FragmentManager fm = getFragmentManager();
//        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
//
//        if (fragment == null) {
//            fragment = new CrimeFragment();
//            fm.beginTransaction()
//                    .add(R.id.fragmentContainer, fragment)
//                    .commit();
//        }
//    }


    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
