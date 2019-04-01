package com.kappaj.memecreator.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kappaj.memecreator.R;

public class BottomPictureFragment extends Fragment {

    private static TextView topMemeText;
    private static TextView bottomMemeText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.botton_picture_fragment, container, false);

        topMemeText = view.findViewById(R.id.topMemeText);
        bottomMemeText = view.findViewById(R.id.bottomMemeText);

        return view;
    }

    public void setMemeText(String topText, String botText){
        topMemeText.setText(topText);
        bottomMemeText.setText(botText);
    }

}
