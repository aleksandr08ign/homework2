public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog =  8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        System.out.println("Задача 2");
                dog = dog + 4;
                cat = cat +4;
                paper = paper + 4;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);

        System.out.println("Задача 6");
        var theFirst = 78.2;
        var theSecond = 82.7;
        System.out.println("Вес первого боксера " + theFirst);
        System.out.println("Вес второго боксера " + theSecond);
        System.out.println("Общий вес боксеров " + (theFirst + theSecond));
        System.out.println("Разница в весе " + (theFirst - theSecond));

        System.out.println("Задача 7");
        System.out.println("Разница в весе (вычитанием) " + (theSecond - theFirst ));
        System.out.println("Разница в весе (остаток от деления) " + (theFirst + theSecond) % theFirst);

        System.out.println("Задача 8.1");
        var totalHours = 640;
        var oneEmployee = 8;
        System.out.println("Общее кол-во часов - " + totalHours);
        System.out.println("Кол-во часов на одного работника - " + oneEmployee);
        System.out.println("Всего работников в компании - " + (totalHours / oneEmployee) + " человек");

        System.out.println("Задача 8.2");
        var still = 94;
        System.out.println("Если в компании работает " + (still + totalHours / oneEmployee) + " человек(а), то всего " + ((still + totalHours / oneEmployee) / oneEmployee) + " час(ов) работы может быть поделено между сотрудниками");

    }
    }