
package com.dtmc.graphics;


import java.awt.*;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageProducer;
import javax.swing.*;

// Referenced classes of package com.dtmc.server.analytics.graphics:
//            TransparentFilter

public class SwingGraph {

    public SwingGraph() {
        image = null;
        title = "Graph";
        width = 600;
        height = 400;
        transparent = false;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isTransparent() {
        return transparent;
    }

    public void setTransparent(boolean transparent) {
        this.transparent = transparent;
    }

    public JComponent getPlot() {
        return plot;
    }

    public void setPlot(JComponent plot) {
        this.plot = plot;
    }

    private Image image;
    private String title;
    private int width;
    private int height;
    private JComponent plot;
    private boolean transparent;

}
