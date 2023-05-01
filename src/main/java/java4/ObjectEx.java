package java4;

class Point {
    public int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ObjectEx {
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName());    //클래스 이름
        System.out.println(obj.hashCode());      //해시코드값
        System.out.println(obj.toString());     //객체를 문자열로 만들어 출력
        System.out.println(obj);    //객체출력
    }

    public static void main(String[] args) {
        Point p = new Point(2, 3);
        print(p);
    }
}
