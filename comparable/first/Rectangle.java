package com.functional.comparable.first;

import java.util.Objects;

public class Rectangle implements Comparable<Rectangle> {
    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getS(){
        return length * height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return length == rectangle.length && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, height);
    }

    @Override
    public int compareTo(Rectangle o) {
        if( o == null){
            throw new NullPointerException();
        }
        if(this.getS() > o.getS()){
            return 1;
        }
        if(this.getS() < o.getS()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.valueOf(getS());
    }
}
