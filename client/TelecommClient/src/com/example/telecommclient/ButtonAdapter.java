package com.example.telecommclient;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class ButtonAdapter extends ArrayAdapter<Button> {

	private Context mContext;
	private static Button[] mButtons = {};
	
	public ButtonAdapter(Context context){
		super(context, NO_SELECTION, mButtons);
		mContext = context;
	}
	
	public ButtonAdapter(Context context, int resource, int textViewResourceId,
			Button[] buttons) {
		super(context, resource, textViewResourceId, buttons);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
