package com.bignerbranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by User on 09.05.2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
