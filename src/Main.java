public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

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
    public static void task2 () {
        System.out.println("task 2");
        double a = 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        int d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte j = 67;
        System.out.println(j);

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

    public static void task4 () {
        byte productivityTwoMin = 16;
        int productivityMin = productivityTwoMin / 2;
        System.out.println("Продуктивность машины за 1 минуту = "+ productivityMin );
        int twentyMin = productivityMin * 20;
        System.out.println("За 20 минут машина произвела " + twentyMin + " штук бутылок");
        int productivityOneDay = productivityMin * 1440;
        System.out.println("За сутки машина произвела " + productivityOneDay+ " штук бутылок");
        int productivity3Days = productivityOneDay * 3;
        System.out.println("За 3 суток машина произвела " + productivity3Days+ " штук бутылок");
        int productivityMonth = productivityOneDay * 31;
        System.out.println("За 1 месяц (31 день) машина произвела " + productivityMonth + " штук бутылок");

    }

    
    }