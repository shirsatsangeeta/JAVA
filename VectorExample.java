import java.util.*;
class VectorExample {
    public static void main(String args[]) {
        Vector<Object> v = new Vector<>();
        Integer s1 = Integer.valueOf(1);
        Integer s2 = Integer.valueOf(3);
        String s3 = new String("Vinay");
        String s4 = new String("More");
        Character s5 = 'V';
        Character s6 = 'P';
        Float s7 = Float.valueOf(1.3f);
        Float s8 = Float.valueOf(6.9f);
        v.addElement(s1);
        v.addElement(s2);
        v.addElement(s3);
        v.addElement(s4);
        v.addElement(s5);
        v.addElement(s6);
        v.addElement(s7);
        v.addElement(s8);
        System.out.println(v);
    }
}
