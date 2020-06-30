package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean triangleExist = false;
        if ((ab < (ac + bc)) && (ac < (ab + bc)) && (bc < (ab + ac))) {
            triangleExist = true;
        }
        return triangleExist;
    }
}
