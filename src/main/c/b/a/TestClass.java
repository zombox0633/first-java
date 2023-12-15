package c.b.a;

import c.b.a.collection.ListCollection;

import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        // เป็นการประกาศใช้งาน ListCollection ใน method ใน class TestClass
        var exampleForEachList = new ListCollection();
        // List.of และใส่ข้อมูลเข้าไป
        var numberList = List.of(1,2,3,4,5);
        exampleForEachList.forEachList(numberList);
    }
}
