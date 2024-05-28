public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Tinh", 24, 175,65 );
        Student s2 = s1;
        s2.setWeight(90);
        System.out.println( s1.id);
        System.out.println( s2.getWeight());


        Student s3 = new Student(1, "Tinh", 24, 175,65 );
        System.out.println(s3);
    }
}
