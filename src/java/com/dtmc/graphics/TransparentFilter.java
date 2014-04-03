package com.dtmc.graphics;


import java.awt.Color;
import java.awt.image.RGBImageFilter;

public class TransparentFilter extends RGBImageFilter {

    TransparentFilter(Color trans) {
        transparent = trans.getRGB() & 0xffffff;
        rt = transparent & 0xff;
        gt = transparent >> 8 & 0xff;
        bt = transparent >> 16 & 0xff;
        clear = 0;
    }

    public int filterRGB(int x, int y, int rgb) {
        int deltar = (rgb & 0xff) - rt;
        int deltag = (rgb >> 8 & 0xff) - gt;
        int deltab = (rgb >> 16 & 0xff) - bt;
        return Math.abs(deltar) + Math.abs(deltag) + Math.abs(deltab) >= 25 ? rgb : clear;
    }

    private int transparent;
    private int clear;
    private int rt;
    private int gt;
    private int bt;
}
