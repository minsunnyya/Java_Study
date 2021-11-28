package Chapter6_Object;

public class Exercise6_4 {

        //두 점 (x,y)와 (x1,y1)의 거리를 구한다.
    static double getDistance(int x,int y, int x1,int y1){
        return Math.sqrt((x-x1)*(x-x1) +(y-y1)*(y-y1));

    }
}
