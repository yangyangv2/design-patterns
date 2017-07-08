package com.ca.dp.structural.proxy;

import java.net.URL;

public class ImageImpl implements Image {


    private URL url;

    public ImageImpl(URL url) {      //load up the image
        loadImage(url);
    }

    public void displayImage()   {       //display the image
        System.out.println("display image " + url);
    }   //a method that only the real image has
    private void loadImage(URL url)  {      //do resource intensive operation to load image
        this.url = url;
    }

    @Override
    public void downloadImage() {
        throw new UnsupportedOperationException("download is not supported");
    }
}
