package JAVA102;

public class main {
    public static void main(String[] args) {
        student s1 = new student("yunus ", "karataş", 200315015, 75, "adana");
        student s2 = new student("ibo ", "öztaş", 200315025, 50, "izmir");
        student s3 = new student("kadir", "yıldız", 200315020, 95, "sivas");

        student[] stdnt = { s1, s2, s3 };
        ınstructor ı1 = new ınstructor("cemre", "soykan", "CENG"); // ınstructor object
        course c1 = new course("JAVA", "102", ı1); // course object

        System.out.println(c1.getInsructor1().getName());

        // System.out.println(c1.average(stdnt));

    }
}
