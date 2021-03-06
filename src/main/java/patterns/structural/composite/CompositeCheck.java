package patterns.structural.composite;

public class CompositeCheck {
    public static void check() {
        // faculty is a root
        var composite = new Composite("FPM");

        // groups
        var group1 = new Composite("KP-61");
        composite.add(group1);
        var group2 = new Composite("KP-62");
        composite.add(group2);

        // students
        var student = new Leaf("Valera");
        group1.add(student);
        group1.add(new Leaf("Jeniffer"));

        group2.add(new Leaf("Mina"));
        group2.add(new Leaf("Bryan"));

        System.out.println(composite.toString(2));
        System.out.println(group1.passExam());
        System.out.println(student.passExam());
    }
}