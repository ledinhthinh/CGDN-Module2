package case_study.commons;

import case_study.models.Customers;

import java.util.Comparator;

public class CompaName extends Customers implements Comparator<Customers>{

    @Override
    public int compare(Customers o1, Customers o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
