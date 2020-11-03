package _7_abstract_and_interface.thuc_hanh.comparator;

import _6_inheritance.thuc_hanh.circle.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius()>o2.getRadius()) return 1;
        else if (o1.getRadius()<o2.getRadius()) return -1;
        else return 0;
    }
}
