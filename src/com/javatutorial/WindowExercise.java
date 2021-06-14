package com.javatutorial;

public class WindowExercise {

    public static void main(String[] args) {
        Window win =  new Window();

        win.setWidth(300);
        win.setHeight(400);
        win.setTop(150);
        win.setLeft(240);

        System.out.println(win.getWidth());
        System.out.println(win.getHeight());
        System.out.println(win.getTop());
        System.out.println(win.getLeft());

    }

}
