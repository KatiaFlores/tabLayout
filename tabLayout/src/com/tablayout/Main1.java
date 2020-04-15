package com.tablayout;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

public class Main1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Resources res= getResources();
        
        setContentView(R.layout.activity_main1);
    	TabHost tabs=(TabHost) findViewById(android.R.id.tabhost);
		tabs.setup();
		
		TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
		spec.setContent(R.id.tab1);
		spec.setIndicator("",
			res.getDrawable(android.R.drawable.ic_dialog_info));
		tabs.addTab(spec);
		
		spec=tabs.newTabSpec("mitab2");
		spec.setContent(R.id.tab2);
		spec.setIndicator("",
				res.getDrawable(android.R.drawable.ic_dialog_map));
		tabs.addTab(spec);
			
				
		tabs.setCurrentTab(0);

		tabs.setOnTabChangedListener(new OnTabChangeListener() {
			
			@Override
			public void onTabChanged(String tabId) {
				// TODO Auto-generated method stub
				Log.i("AndroidTabsDemo","pulsa pestaña: "+tabId);
			}
		});	
    }


}

