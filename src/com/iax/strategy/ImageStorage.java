package com.iax.strategy;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}

/* Problem
public class ImageStorage {
    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        if (compressor == "jpeg")
            System.out.println("Compressing using JPEG");
        else if (compressor == "png")
            System.out.println("Compressing using PNG");

        if (filter == "b&w")
            System.out.println("Applying B&W filter");
        else if (filter == "high-contrast")
            System.out.println("Applying Hig-Contrast filter");
    }
}
*/
