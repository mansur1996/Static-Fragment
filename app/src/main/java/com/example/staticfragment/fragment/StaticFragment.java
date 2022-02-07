package com.example.staticfragment.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.staticfragment.R;
import com.example.staticfragment.model.User;

public class StaticFragment extends Fragment {

    private static final String KEY = "the_key";
    static StaticFragment fragment;

    public static StaticFragment newInstance(User user) {

        if(fragment == null) fragment = new StaticFragment();

        //Set the arguments.

        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY, user);

        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment = inflater.inflate(R.layout.fragment_static, container, false);
        TextView textView = (TextView) fragment.findViewById(R.id.tv_textview);


        //Use getArguments() to get the String argument set by the constructor
        textView.setText(getArguments().getParcelable(KEY).toString());
        return fragment;
    }
}