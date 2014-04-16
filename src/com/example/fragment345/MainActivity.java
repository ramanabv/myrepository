package com.example.fragment345;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        FragmentManager fragment1 = getFragmentManager();
        FragmentTransaction trans = fragment1.beginTransaction();
        
        trans.add(R.id.upperlayout, new Test());
        trans.commit();
        
        FragmentManager fragment2 = getFragmentManager();
        FragmentTransaction trans1 = fragment2.beginTransaction();
        
        trans1.add(R.id.downlayout, new TestRight());
        trans1.commit();
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
