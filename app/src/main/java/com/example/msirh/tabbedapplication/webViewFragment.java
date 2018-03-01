package com.example.msirh.tabbedapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

/**
 * Created by msirh on 2/28/18.
 */

public class webViewFragment extends Fragment {
    private static final String TAG = "webviewfragment";


    public WebView websiteview;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.webviewtab,container,false);




        String url = "http://mhealthcapstone.com";
        websiteview = (WebView) view.findViewById(R.id.webViewFrag);

        WebSettings mywebSettings = websiteview.getSettings();
        mywebSettings.setJavaScriptEnabled(true);

        websiteview.setWebViewClient(new WebViewClient());

        websiteview.loadUrl(url);


        return view;
    }
}
