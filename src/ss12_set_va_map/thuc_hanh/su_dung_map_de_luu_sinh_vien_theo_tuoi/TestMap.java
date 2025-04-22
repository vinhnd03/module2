package ss12_set_va_map.thuc_hanh.su_dung_map_de_luu_sinh_vien_theo_tuoi;

import java.util.*;

public class TestMap {
    private static void add(Map<Student, Integer> studentMap, Student key, Integer value){
        if(studentMap.containsKey(key)){
            studentMap.replace(key, studentMap.get(key) + value);
        }else{
            studentMap.put(key, value);
        }
    }
    public static void main(String[] args) {
//        Map<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("Vinh", 21);
//        hashMap.put("Huy", 21);
//        hashMap.put("Chien", 22);
//        hashMap.put("Vuong", 20);
//
//        System.out.println("Display entries in HashMap");
//        System.out.println(hashMap + "\n");
//        System.out.println();
//
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("Vinh", 21);
//        treeMap.put("Huy", 21);
//        treeMap.put("Chien", 20);
//        treeMap.put("Vuong", 22);
//        System.out.println("Display entries in ascending order of key");
//        System.out.println(treeMap);
//        System.out.println();
//
//        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
//        linkedHashMap.put("Vinh", 21);
//        linkedHashMap.put("Huy", 21);
//        linkedHashMap.put("Chien", 20);
//        linkedHashMap.put("Vuong", 22);
//        System.out.println("\nThe age for " + "Vinh is " + linkedHashMap.get("Vinh"));

        Student student1 = new Student(1, "Vinh", 21);
        Student student2 = new Student(2, "Huy", 20);
        Student student3 = new Student(3, "Chien", 22);
        Student student4 = new Student(1, "Vinh", 21);
        Student student5 = new Student(1, "Tam", 25);
        Student student6 = new Student(4, "Duy", 19);

        Map<Student, Integer> studentMap = new HashMap<>();
        studentMap.put(student1, 3);
        studentMap.put(student2, 4);
        studentMap.put(student3, 5);
        studentMap.put(student4, 6);

        add(studentMap, student6, 1);
        add(studentMap, student4, 1);

        studentMap.forEach((k,v) -> {
            System.out.println(k.getName() + ": " + v);
        });



//        Set<Student> studentSet = studentMap.keySet();
//        for(Student s : studentSet){
//            System.out.println(s.getName());
//            System.out.println(studentMap.get(s));
//        }

//        System.out.println(studentMap.containsKey(student5));
//        Set<Map.Entry<Student, Integer>> studentEntry = studentMap.entrySet();
//        for(Map.Entry<Student, Integer> entry: studentEntry){
//            Student student = entry.getKey();
//            Integer value = entry.getValue();
//
//            System.out.println("Student: " + student + ", Value: " + value);
//        }
    }
}
