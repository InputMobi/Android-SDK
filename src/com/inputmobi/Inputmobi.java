package com.inputmobi;

import android.app.Activity;
import android.content.Context;

import com.inputmobi.sdk.*;

public class Inputmobi {
	
	public static void startWithApplicationKey(String _appKey, Activity _parent, Context _context)
	{
		InputMobiHelper.startWithApplicationKey(_appKey, _parent, _context);	  
    }
	
}
