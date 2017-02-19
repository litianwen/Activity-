package com.example.activityone;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class OtherActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Bundle bundle = getIntent().getExtras();
		Obj data = (Obj) bundle.get("data");
		Obj2 data2 = (Obj2) bundle.get("data2");

		Log.d("OtherActivity", data.getName());
		Log.d("OtherActivity", data2.getAge());
	}
}
