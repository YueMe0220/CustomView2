package com.atguigu.atguiguempire;

import android.util.Log;

public class Utils {

	public static boolean isShow = true;
	
	public static void logleo(String msg){
		if(isShow){
			Log.i("leo", msg);
		}
	}
}
