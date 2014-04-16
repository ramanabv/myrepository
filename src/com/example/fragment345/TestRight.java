package com.example.fragment345;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

@SuppressLint("NewApi") 
public class TestRight extends Fragment {

	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {

	        View view = inflater.inflate(R.layout.test_right, container, false);
	        return view; 
	    }

	    @Override
	    public void onStart() {
	        super.onStart();
	        Button button = (Button)getActivity().findViewById(R.id.button1);
	        button.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                Fragment newFragment = new Right2nd();
	                FragmentTransaction transaction = getFragmentManager()
	                        .beginTransaction();
	                transaction.replace(R.id.downlayout, newFragment);
	                transaction.addToBackStack("aa");
	                transaction.commit();

//	              transaction.add(R.id.frag, newFragment).commit();
	            }
	        });
	    }

}
