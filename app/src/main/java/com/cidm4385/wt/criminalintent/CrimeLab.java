package com.cidm4385.wt.criminalintent;

/**
 * Created by Amanda on 2/12/2018.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    public static CrimeLab get(Context context){
        if (sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
    private CrimeLab(Context context){
        
    }
}
