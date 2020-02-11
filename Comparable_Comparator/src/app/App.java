package app;

import java.util.List;

import javax.swing.text.AbstractDocument.BranchElement;

import java.util.ArrayList;
import java.util.Collections;

class Laptops implements Comparable<Laptops> {
    private String brand;
    private int ram;
    private int price;
    Laptops(String brand, int ram, int price){
        this.brand = brand;
        this.ram = ram;
        this.price = price;

    }
    public String toString(){
        return "Laptops [ Brand = " + brand + " Ram = " + ram + " Price = " + price ;
    }

    @Override
    public int compareTo(Laptops lap2) {
        if(this.ram > lap2.ram)
        return 1;
        else 
        return -1;
    }

}
public class App {
    public static void main(String[] args) throws Exception {
        
        List<String> values = new ArrayList<>();
     
        values.add("Khan");
        values.add("Hello");
        values.add("Navin");
        values.add(0,"Abdur");
        values.add("zarwar");
        
        List<Laptops> lap = new ArrayList<>();
        lap.add(new Laptops("Dell", 8, 1000));
        lap.add(new Laptops("Acer", 12, 800));
        lap.add(new Laptops("Apple", 4, 2000));
        lap.add(new Laptops("Apple", 90, 2000));
        lap.add(new Laptops("Apple", 4, 2000));
        lap.add(new Laptops("Apple", 8, 2000));
        
        Collections.sort(lap);
        values.forEach(System.out::println);
        lap.forEach(System.out::println);

    }
}