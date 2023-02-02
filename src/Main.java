public class Main {
    public static void main(String[] args) {
        task1();
        task3();

    }
        public static void task1 () {
            System.out.println("task 1");
            int a = 1000;
            System.out.println("Значение переменной а с типом int равно " + a);
            byte b = 114;
            System.out.println("Значение переменной b с типом byte равно " + b);
            short c = -4000;
            System.out.println("Значение переменной c с типом short равно " + c);
            long d = -789423;
            System.out.println("Значение переменной d с типом long равно " + d);
            double f = 304.66;
            System.out.println("Значение переменной f с типом double равно " + f);
            float j = 305.567F;
            System.out.println("Значение переменной j с типом float равно " + j);
        }
    public static void task3 () {
        System.out.println("task 3");
        int lp = 23;
        int as = 27;
        int ea = 30;
        int totalP = 480;
        int students = ea+as+lp;
        int paper = totalP / students;
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");
    }
    }