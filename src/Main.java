public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(82, 180);
        System.out.println(bmi);
        float bmi1 = service.calculate(82, 160);
        System.out.println(bmi1);
        float bmi2 = service.calculate(60, 180);
        System.out.println(bmi2);
    }
}