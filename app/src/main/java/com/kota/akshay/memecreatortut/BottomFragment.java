package com.kota.akshay.memecreatortut;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomFragment extends Fragment{

    private static TextView textTop;
    private static TextView textBottom;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);

        textTop = (TextView)view.findViewById(R.id.textView);
        textBottom = (TextView)view.findViewById(R.id.textView2);

        return view;
    }

    public void setMemeText(String top, String bottom){
        textTop.setText(top);
        textBottom.setText(bottom);
    }
}
