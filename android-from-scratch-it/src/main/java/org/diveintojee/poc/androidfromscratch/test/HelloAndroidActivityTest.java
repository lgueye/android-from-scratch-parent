package org.diveintojee.poc.androidfromscratch.test;

import org.diveintojee.poc.androidfromscratch.HelloAndroidActivity;
import org.diveintojee.poc.androidfromscratch.R;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

	public HelloAndroidActivityTest() {
		super(HelloAndroidActivity.class);
	}

	public void testActivity() {
		HelloAndroidActivity activity = getActivity();
		assertNotNull(activity);
		TextView textView = (TextView) activity.findViewById(R.id.my_text);
		assertNotNull(textView);
	}
}
