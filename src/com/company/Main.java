package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Figure3D cone = new Conus(5, 7);
        Figure3D sfera = new Sfera(5);
        Figure3D caramida = new Paralelepiped(25, 12, 8);

        List<Figure3D> obiecte = new ArrayList<Figure3D>();
        obiecte.add(cone);
        obiecte.add(sfera);
        obiecte.add(caramida);

        for(Figure3D f: obiecte){
            System.out.println(f.getType() + "--> Aria : " + f.Aria() + "--> Volumul : " + f.Volum());
        }
    }
}
