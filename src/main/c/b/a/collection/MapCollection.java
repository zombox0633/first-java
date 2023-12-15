package c.b.a.collection;


import java.util.HashMap;
import java.util.Map;

public class MapCollection {

    /*  Map ที่มี key ประเภท String และ value ประเภท Integer และ initialMap คือชื่อของ method      */
    public Map<String, Integer> integerMap(){
        // Intialize Map then setup value
        var myMap1 = new HashMap<String, Integer>();
        myMap1.put("one",1);
        myMap1.put("two",2);
        myMap1.put("three",3);

        //Initialize Map and setup value
        var myMap2 = Map.of(
                "one",1,
                "two", 2,
                "three", 3
        );

        // Initialize Map and setup value with sub-function
        var myMap3 = new  HashMap<>();
        myMap3.put("one",1);
        myMap3.put("two",2);
        myMap3.put("three",3);

        /* ทั้ง 3 รูปสามารถให้คำตามได้เหมือนกันแต่แบบสองในกรณีที่มีข้อมูลจำนวนมาจะเป็นรูปแบบที่แย่ที่สุด*/
        return  myMap1;
    }

    //การแทนที่ข้อมูลใน map
    public void mapReplaceValue(){
        var myMap = new HashMap<String, Integer>();
        myMap.put("one", 1);
        System.out.println(myMap.get("one"));

        myMap.put("one", 2);
        System.out.println("Replace value: " + myMap.get("one"));
    }

    //การแทนที่ข้อมูลในทั้งหมด
    public void mapPutAll(Map<String, Integer> valueMap){
        var myMap = new HashMap<String,Integer>();
        myMap.put("one", 1);
        myMap.put("two",2);
        System.out.println("Before Put All: " + myMap);

        myMap.putAll(valueMap);
        System.out.println("After Put All:" + myMap);
    }

    //Map ไม่มี key ที่กำหนด, putIfAbsent จะเพิ่มคู่ key-value นั้นลงใน Map
    // ถ้า Map มี key ที่กำหนดอยู่แล้ว, putIfAbsent จะไม่ทำการเปลี่ยนแปลงค่าของ key นั้นใน Map
    public void putIfAbsent() {
        var initMap = this.integerMap();
        initMap.putIfAbsent("one", 4);
        System.out.println("Initial Put One (If Absent): " + initMap);

        initMap.putIfAbsent("four", 4);
        System.out.println("Initial Put Four (If Absent): " + initMap);
    }

    // containsKey ตรวจสอบ key ว่ามีหรือไม่มีค่าที่ได้จะเป็น  boolean
    public void  checkContainsKey() {
        var initMap = this.integerMap();
        var checkOne = initMap.containsKey("one");
        System.out.println("Contains Key One: " + checkOne);

        var checkFour = initMap.containsKey("four");
        System.out.println("Contains Key Four: " + checkFour);
    }

    //การนำข้อมูลออก
    public void removeValue() {
        var initMap = this.integerMap();
        initMap.remove("one");
    }

    // การนำข้อมูลออกทั้งหมด *ไม่แนะนำให้ใช้งาน
    public void removeAllValue() {
        var initMap = this.integerMap();
        System.out.println("Initial Map: " + initMap);

        initMap.clear();
        System.out.println("Remove All: " + initMap);
    }

    //การใช้ compute ทำให้สามารถสนองต่อการมีหรือไม่มีของ key ใน Map ได้และสามารถสร้างเงือนไขเพื่อลองรับในกรณีที่ไม่มีค่าได้
    public void computeValue(){
        var initMap = this.integerMap();
        System.out.println("Initial Map: " + initMap);

        initMap.compute("one", (key, value) -> value == null ? 1 : value + 100);
        System.out.println("Compute One: " + initMap);
    }

    public void entrySetConcept() {
        // การกำหหนดตัวแปรแบบเก่า
        Map<String, Integer> initMap = this.integerMap();
        System.out.println(initMap);

        initMap.entrySet().forEach(entry -> {
            var value = entry.getValue();
            entry.setValue(value * 2);
        });

        System.out.println(initMap);
    }
}
