package com.example.staticfragment.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.staticfragment.R;
import com.example.staticfragment.fragment.StaticFragment;
import com.example.staticfragment.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews(){
        addFirstFragment();
    }

    private void addFirstFragment(){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        User user1 = new User(1, "Sobirov Jamshid", 20);

        ft.add(R.id.fl_frame1, StaticFragment.newInstance(user1));
        ft.commit();
    }
}