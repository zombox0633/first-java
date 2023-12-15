package c.b.a.collection;

import java.util.List;
import java.util.stream.Collectors;

public class ListCollection {

    //List กับ filter
    /*  คืนค่าเป็น List<Integer>        รับพารามิเตอร์เป็น List<Integer>*/
    public List<Integer> filterList(List<Integer> dataList){
        //java 11
//        return dataList.stream() /*stream()  เป็นเมธอดทีแปลง List เป็น stream และ ่ใช้กับคอลเลกชัน  lists หรือ sets */
//                .filter(data -> data < 10)
//                .collect(Collectors.toList()); /* เปลี่ยน stream กลับเป็น List */

        //java 17
        return dataList.stream() /* /*stream()  เป็นเมธอดทีแปลง List เป็น stream */
                .filter(data -> data < 10)
                .toList(); /* เปลี่ยน stream กลับเป็น List */
    }

    //List กับ map
    public List<String> mapList(List<Integer> dataList){
        return dataList.stream()
                .map(data -> String.valueOf(data))
                .toList();
    }

    //List กับ forEach
    public void forEachList(List<Integer> dataList){
        dataList.forEach(data -> {
            var dataAsString  = String.valueOf(data);
            System.out.println(dataAsString); /* เหมือน log ในการแสดงค่าเพื่อทดสอบ*/
        });
    }
}


