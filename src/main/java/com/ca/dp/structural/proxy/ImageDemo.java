package com.ca.dp.structural.proxy;

import java.nio.file.Paths;

/**
 * Created by yanya04 on 6/12/2017.
 */
public class ImageDemo {
    public static void main(String[] args) throws Exception {
        Image service = (Image) ImageProxy.newInstance(new ImageImpl(Paths.get(".").toUri().toURL()));

        service.displayImage();

        service.downloadImage();
    }
}
