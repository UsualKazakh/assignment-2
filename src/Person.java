class Person implements Payable, Comparable<Person> {
    private static int idCounter = 1;
    private final int id;
    private String name;
    private String surname;

    public Person() {
        this.id = idCounter++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public double getPaymentAmount() {
        return 0.0;
    }

    public String getPosition() {
        return "Student";
    }

    public String toString() {
        return String.format("%s: %d. %s %s", getPosition(), id, name, surname);
    }

    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}