package com.javatutorial;

public class Window {

    /*
     * For getters and setters for the initialized variables, use the IDE function "Generate..."
     * To access it, you may do the following:
     *  1. Right Click then select "Generate..." then select "Getters and Setters" and choose the variables for getters and setters.
     *  2. Press Alt + Insert then select "Getters and Setters" and choose the variables for getters and setters.
     */

    private int width;
    private int height;
    private boolean isVisible;
    private int top;
    private int bottom;
    private int left;
    private int right;

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        this.isVisible = visible;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }



}
