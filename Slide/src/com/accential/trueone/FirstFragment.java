package com.accential.trueone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.slide.R;

public class FirstFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.first_frag, container, false);

		// TextView tv = (TextView) v.findViewById(R.id.tvFragFirst);
		// tv.setText(getArguments().getString("msg"));

		return v;
	}

	public static FirstFragment newInstance(String text) {

		FirstFragment f = new FirstFragment();
		Bundle b = new Bundle();
		b.putString("msg", text);

		f.setArguments(b);

		return f;
	}

}
