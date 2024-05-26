public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        var dog = 8.0;
        System.out.println(dog);
        var cat =3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача №2");
        dog = dog + 2;
        System.out.println(dog);
        cat = cat + 2;
        System.out.println(cat);
        paper = paper + 2;
        System.out.println(paper);

        System.out.println("Задача №3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задача №4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 2;
        System.out.println(friend);

        System.out.println("Задача №5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача №6");
        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        System.out.println("Общая масса двух бойцов " + oneBoxer + twoBoxer + " кг.");
        System.out.println(("Разница между массами бойцов ") + (twoBoxer - oneBoxer) + " кг.");
        System.out.println(("Остаток от деления между двумя весами равен ") + (twoBoxer / oneBoxer) + "%");

        System.out.println("Задача №7");
        var allHour = 640;
        var oneWorker = 8;
        var workers = allHour / oneWorker;
        System.out.printf("Всего работников в компании — " + workers + " человек.");
        var totalWorkers = workers + 94;
        var otherHour = allHour / totalWorkers;
        System.out.println(" Если в компании работает " + totalWorkers + " человек, то всего " + otherHour +" часов работы может быть поделено между сотрудниками");
    }
}