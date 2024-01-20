class Employee extends Person {
    private String position;
    private double salary;

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    public double getPaymentAmount() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String toString() {
        return String.format("Employee: %s %s earns %.2f tenge", super.toString(), getPosition(),salary);
    }
}