package com.example.activityone;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button btn_tiaozhuan;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn_tiaozhuan = (Button) findViewById(R.id.btn_tiaozhuan);
		btn_tiaozhuan.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, OtherActivity.class);
				Obj obj=new Obj();
				obj.setName("±Ú»¢");
				Obj2 obj2=new Obj2();
				obj2.setAge("19");
				intent.putExtra("data",obj);//object
				intent.putExtra("data2",obj2);
				startActivity(intent);
			}
		});
	}
}
