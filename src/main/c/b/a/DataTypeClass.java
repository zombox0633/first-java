package c.b.a;

/* ระบุการเข้าถึงข้อมูลใน class  Class Declaration  ชื่อ Class */
public class DataTypeClass {
    /* Data Type
     *  Pass by Valve: Primitive Data Type
     *  Pass by Reference: Non-Primitive Data Type
     * */
    public void PrimitiveDataType() {
        /* ถ้าขึ้นต้นเป็นตัวพิมเล็กจะเป็น Primitive */

        /* All Number ค่าเริ่มต้นเป็น 0 */
        short shortDataType = 1;
        int intDataType = 1;
        long longDataType = 1;

        float floatDataType = 1.f;
        double doubleDataType = 1.0;

        /* boolean ค่าเริ่มต้นเป็น false */
        boolean booleanDataType = false;
    }

    public void NonPrimitiveAndPrimitive(){
        Short shortDataType = 1;
        Integer integerDataType = 1;
        Long longDataType = 1L;

        Float floatDataType = 1.0f;
        Double doubleDataType = 1.0;

        Boolean BooleanType = false;
    }
    public void NonPrimitiveDataType() {
        /* NonPrimitive ค่าเริ่มต้นจะเป็น null เท่านั้น  */
        char charDataType = 'c';
        Character characterDataType = 'c';
        String stringDataType = "String";
    }

}
