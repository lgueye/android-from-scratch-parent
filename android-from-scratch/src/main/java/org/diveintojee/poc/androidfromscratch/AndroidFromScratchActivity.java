package org.diveintojee.poc.androidfromscratch;

import android.os.Bundle;
import android.util.Log;

import com.google.android.maps.MapActivity;

public class AndroidFromScratchActivity extends MapActivity {

    private static String TAG = "android-from-scratch";

    /**
     * @see com.google.android.maps.MapActivity#isRouteDisplayed()
     */
    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }

    /**
     * Called when the activity is first created.
     * 
     * @param savedInstanceState If the activity is being re-initialized after previously being shut down then this
     *            Bundle contains the data it most recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise
     *            it is null.</b>
     */
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
        setContentView(R.layout.main);
    }

}
