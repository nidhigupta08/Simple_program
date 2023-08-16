
public class  AreaOfCircle {
    public static void main(String args[]) {
        area_circ ac = new area_circ();
        area_cyl acl = new area_cyl();
        ac.area();
        acl.area();
    }
}

class area_circ {
    final double pi = 3.14;
    int r = 23;

    void area() {
        System.out.println("The area of circle is : " + pi * r * r);
    }
}

class area_cyl extends area_circ {
    final double pi = 3.14;
    int r1 = super.r;
    int h = 34;

    void area() {
        System.out.println("The area of cylinder is : " + ((2 * pi * r1 * h) + (2 * pi * r1 * r1)));
    }
}