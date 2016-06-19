package com.yang49.fortag;

import android.os.AsyncTask;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

/**
 * Created by yang on 19/06/16.
 */
public class DownloadImage extends AsyncTask<String, Void, String> {
    @Override
    protected String doInBackground(String... params) {
        String link = "www.yang49.com/android_php/connect.php";

        try {
            URL url = new URL(link);
            HttpClient client = new DefaultHttpClient();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
