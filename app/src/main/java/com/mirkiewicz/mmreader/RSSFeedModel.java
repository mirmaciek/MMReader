package com.mirkiewicz.mmreader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.IOException;
import java.net.URL;

public class RSSFeedModel {

    public String title;
    public String link;
    public String description;
    public Bitmap photo;

    public RSSFeedModel(String title, String link, String description, String photo) throws IOException {
        this.title = title;
        this.link = link;
        this.description = description;
        URL url = new URL(photo);
        Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
        this.photo = bmp;

        Log.wtf("RSS", photo);
    }
}