package patterns.creational.builder;

public class BuilderEverydayExample {
    public static void showExample() {
        StringBuilder builder = new StringBuilder();
        builder.append("This is an example ");
        builder.append("of the builder pattern. ");
        builder.append("It has methods to append ");
        builder.append("almost anything we want to a String. ");
        builder.append(42);
        System.out.println(builder.toString());
    }
}