package com.kappaj.memecreator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kappaj.memecreator.fragments.BottomPictureFragment;
import com.kappaj.memecreator.fragments.TopSectionListener;

public class MainActivity extends AppCompatActivity implements TopSectionListener {


    @Override
    public void createMeme(String topString, String bottomString) {
        BottomPictureFragment bottomFragment = (BottomPictureFragment)getSupportFragmentManager().findFragmentById(R.id.displayFragment);
        bottomFragment.setMemeText(topString, bottomString);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
