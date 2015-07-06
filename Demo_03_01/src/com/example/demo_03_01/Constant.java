package com.example.demo_03_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Constant {
	
	Context mContext = null;
	
	public void Constant(Context c)
	{
		this.mContext = c;
	}
	public void showToast( Context context,String text) //显示带有图片的toast
	{
		LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view =layoutInflater.inflate(R.layout.toast, null);
		Toast toast =new Toast(context);
		toast.setView(view);
		
		TextView tv_show = (TextView) view.findViewById(R.id.tv1);
		tv_show.setText(text);
		toast.setDuration(Toast.LENGTH_SHORT);
		toast.show();
	}
}
