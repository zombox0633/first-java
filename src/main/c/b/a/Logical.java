package c.b.a;

import java.util.List;

public class Logical {
    // if else
    public void ifStatementTypeOne(int x, int y) {
        if (x < y) {
            System.out.println("X is less than Y");
        } else if (x == y) {
            System.out.println("X is equal Y");
        } else {
            System.out.println("X is more than Y");
        }
    }

    public void ifStatementTypeTwo(int x, int y) {
        var z = x < y
                ? "X is less than Y"
                : "X is more than Y";
        System.out.println(z);
    }

    //for
    public void forLoopEachIndex(int x) {
        for (var i = 0; i <= x; i++){
            System.out.println(i);
        }
    }

    public void forInList(List<Integer> dataList){
        for (var data:dataList){
            System.out.println(data);
        }
    }

    //forEach
    public void forEachStreamInList(List<Integer> dataList){
        dataList.forEach(data -> System.out.println(data));
    }

    //while
    public void whileLoop(int max){
        var i = 0;

        while (i <= max){
            System.out.println();
            i++;
        }
    }

    //switch
    public void switchCase(int x){
        switch (x){
            case 1:
                System.out.println("X = 1");
                break;
            case 2:
                System.out.println("X = 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("X = 10");
                break;
            default:
                System.out.println("X is not match any case.");
                break;
        }
    }
}
