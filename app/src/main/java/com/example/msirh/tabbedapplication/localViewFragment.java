package com.example.msirh.tabbedapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by msirh on 2/28/18.
 */

public class localViewFragment extends Fragment {
    private static final String TAG = "localviewfragment";

    private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.localviewtab,container,false);

        btnTEST = (Button) view.findViewById(R.id.btnTEST);


        return view;
    }
}
