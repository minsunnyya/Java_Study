package ExerciseSelf.Review7;

class point{
    int x,y;

    point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Point3D extends point{
    int z;

    Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
}

public class Ex7_4 {

    public static void main(String[] args) {
        Point3D p = new Point3D(4,5,7);
        System.out.println(p.x+","+p.y+","+p.z);
    }
}
