package org.diveintojee.poc.androidfromscratch.test;

import org.diveintojee.poc.androidfromscratch.AndroidFromScratchActivity;
import org.diveintojee.poc.androidfromscratch.R;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.maps.MapView;

public class AndroidFromScratchTest extends ActivityInstrumentationTestCase2<AndroidFromScratchActivity> {

    public AndroidFromScratchTest() {
        super(AndroidFromScratchActivity.class);
    }

    public void testUIComponentsInstanciation() {
        final AndroidFromScratchActivity activity = getActivity();
        assertNotNull(activity);
        final EditText locationEditText = (EditText) activity.findViewById(R.id.location);
        assertNotNull(locationEditText);
        final Button searchButton = (Button) activity.findViewById(R.id.search);
        assertNotNull(searchButton);
        final MapView mapView = (MapView) activity.findViewById(R.id.map);
        assertNotNull(mapView);
        final Button zoomInButton = (Button) activity.findViewById(R.id.zoomin);
        assertNotNull(zoomInButton);
        final Button zoomOutButton = (Button) activity.findViewById(R.id.zoomout);
        assertNotNull(zoomOutButton);
        final Button centerButton = (Button) activity.findViewById(R.id.center_map);
        assertNotNull(centerButton);
    }
}
