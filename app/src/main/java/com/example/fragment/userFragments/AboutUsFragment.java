package com.example.fragment.userFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.activity.R;
import com.example.fragment.BaseFragment;

public class AboutUsFragment extends BaseFragment {

	private View rootview;

	private TextView timeDetailCurrent;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootview = inflater.inflate(R.layout.fragment_about_us, container,
				false);
		// TODO Auto-generated method stub
		return rootview;
	}

	@Override
	protected void initView(View view) {
		// TODO Auto-generated method stub
		super.initView(view);

	}

	@Override
	protected void initEvents() {
		// TODO Auto-generated method stub
		super.initEvents();
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onViewCreated(view, savedInstanceState);
		view.findViewById(R.id.image_back).setOnClickListener(
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						getFragmentManager().popBackStack();
					}
				});
	}

}
