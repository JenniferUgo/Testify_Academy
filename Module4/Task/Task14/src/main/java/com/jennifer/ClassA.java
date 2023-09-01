package com.jennifer;

public class ClassA {
    static class A {
        private int shapeSides = 4; // Square always has 4 sides
        private double shapeLength;
        private double shapeBreadth;

        public double getShapeLength() {
            return shapeLength;
        }

        public void setShapeLength(double shapeLength) {
            this.shapeLength = shapeLength;
        }

        public double getShapeBreadth() {
            return shapeBreadth;
        }

        public void setShapeBreadth(double shapeBreadth) {
            this.shapeBreadth = shapeBreadth;
        }

        public int getShapeSides() {
            return shapeSides;
        }
    }

}
