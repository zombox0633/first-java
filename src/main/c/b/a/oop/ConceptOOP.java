package c.b.a.oop;

public class ConceptOOP {
    /* OOP Object-Oriented Programming
    *    เป็นวิธีการเขียนโปรแกรมที่ใช้ "objects" เป็นหลักในการจัดการและจัดระเบียบโค้ด
    */

    /*
    * 1. Abstraction (การทำให้เป็นนามธรรม) หมายถึงการซ่อนรายละเอียดภายใน และแสดงเฉพาะส่วนที่จำเป็นต่อผู้ใช้
    *
    * 2. Encapsulation (การห่อหุ้มข้อมูล) หมายถึงการห่อหุ้มข้อมูล และฟังก์ชันที่จัดการข้อมูลนั้นเข้าด้วยกันใน class
    *   เดียว ช่วยป้องกันการเข้าถึงข้อมูลจากภายนอก และ การกำหนด class หรือ method ในรูปแบบที่เหมาะสมตามนี้
    *   private จำกัดการเข้าถึงเฉพาะใน class
    *   protected จำกัดการเข้าถึงแต่สามารถเข้าถึงได้จาก subclass
    *   public ไม่จำกัดการเข้าถึง
     *
    * 3. Inheritance (การสืบทอด) หมายถึงความสามารถของ class ในการสืบทอดคุณสมบัติและพฤติกรรมจาก class แม่หรือ superclass
    *   โดยการใช้งาน extends( ใช้ 1 class ได้ 1 อัน) หรือ implements(ใช้ 1 class ได้หลายอันและใช้กับ interfaces ) และ
    *   ใช้ super()  ใช้เพื่อเรียก constructor ของ superclass (class แม่). มีความสำคัญในการสืบทอด (inheritance)
    *   โดยเฉพาะเมื่อคุณสร้าง subclass ที่ต้องการใช้งานหรือเพิ่มเติมคุณสมบัติ
     *
    * 4. Polymorphism (การมีหลายรูปแบบ) ความสามารถของ objects ที่มาจาก classes ต่างๆ
     *  ในการตอบสนองต่อการเรียกใช้ method เดียวกันในรูปแบบที่แตกต่างกัน ขึ้นอยู่กับ class ที่ object
     *
     * Animal myAnimal;
     *
     * myAnimal = new Dog();
     * myAnimal.makeSound(); // จะเป็นเสียง "bark"
     *
     * myAnimal = new Cat();
     * myAnimal.makeSound(); // จะเป็นเสียง "meow"
    * */

    /*
    * S.O.L.I.D
    * S — Single-Responsibility principle
    *  class ควรมีเหตุผลเพียงอย่างเดียวในการเปลี่ยนแปลง นั่นคือ แต่ละ class ควรมีความรับผิดชอบเฉพาะเจาะจงหนึ่งอย่าง
    *  และจะไม่เอาส่วนที่ไม่จำเป็นใส่ใน class
    *
    * O — Open/Closed principle
    * ควรเปิดสำหรับการขยาย (open for extension) แต่ปิดสำหรับการแก้ไข (closed for modification)
    *
    * L — Liskov Substitution principle
    * ลูกสามารถทำงานแทนแม่ได้ คือ objects ของ superclass ควรสามารถถูกแทนที่ด้วย objects ของ subclasses
    * โดยไม่ทำให้เกิดผลกระทบเชิงลบต่อการทำงาน
    *
    * I — Interface Segregation principle
    * clients ไม่ควรถูกบังคับให้พึ่งพา interfaces ที่พวกเขาไม่ใช้
    *
    * D — Dependency Inversion principle
    * การออกแบบโครงสร้างของโปรแกรมให้มีความยืดหยุ่นและลดการพึ่งพากันโดยตรงระหว่าง components หรือ modules ต่างๆ ในโปรแกรม
    * แต่สร้างตัวแปรหรือค่าที่ใช้งานซ้ำกันหรือทำการลดความซ้ำซ้อนของโปรแกรมแต่วธีนี้จะทำได้ก็ต่อเมื่อเกิดความซ้ำซ้อนจำนวนมาแล้วทำการ Reflector code
    */

}
