package com.example.demo_03_01;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends  Activity{

	private Context mContext =null;
	private Constant constant = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mContext =this;
		constant = new Constant();
		
		GridView gridview = (GridView)findViewById(R.id.gridview);
		gridview.setAdapter(new ImageAdapter(this));
		gridview.setBackgroundColor(0xfffff5ee);
		gridview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				constant.showToast(MainActivity.this, "您点击了"+(position+1)+"号图片");
			}		
		});
	}
	public void DisplayToast(String str){
		Toast toast = Toast.makeText(this, str, Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.TOP,0,180);
		toast.show();
	}
}
