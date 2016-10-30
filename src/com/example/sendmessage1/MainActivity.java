package com.example.sendmessage1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText num, mess;
	Button btn;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn = (Button) findViewById(R.id.button1);
		num = (EditText) findViewById(R.id.editText1);
		mess = (EditText) findViewById(R.id.editText2);
		btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				String mobile = num.getText().toString();
				String content = mess.getText().toString();
				Intent intent = new Intent();
				intent.setData(Uri.parse("smsto:" + mobile));
				intent.putExtra("sms_body", content);
				startActivity(intent);
			}
		});
	}
}
