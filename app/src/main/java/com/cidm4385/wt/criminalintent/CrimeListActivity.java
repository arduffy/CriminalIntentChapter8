package com.cidm4385.wt.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Amanda on 2/17/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
