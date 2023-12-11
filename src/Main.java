    public  class Main {


        public static void main(String[] args) {
            System.out.println("Hello world!");

            Gryffindor hogwarts1 = new Gryffindor("Гарри Поттер", 56, 72, 88, 65, 76);
            Gryffindor hogwarts2 = new Gryffindor("Гермиона Грейнджер", 44, 35, 34, 28, 43);
            Gryffindor hogwarts3 = new Gryffindor("Рон Уилзи", 47, 35, 43, 28, 43);
            Hufflepuff hogwarts4 = new Hufflepuff("Захария Смит",22,33,54,48,32);
            Hufflepuff hogwarts5 = new Hufflepuff("Седрик Диггори", 27, 31, 59, 47, 52);
            Hufflepuff hogwarts6 = new Hufflepuff("Джастин Финч-Флетчли", 29, 40, 64, 35, 28);
            Ravenclaw hogwarts7 = new Ravenclaw("Чжоу Чанг", 54, 12, 47, 65, 54, 55);
            Ravenclaw hogwarts8 = new Ravenclaw("Падма Патил", 43, 28, 24, 55, 54, 66);
            Ravenclaw hogwarts9 = new Ravenclaw("Маркус Белби", 65, 21, 76, 39, 53, 43);
            Slytherin hogwarts10 = new Slytherin("Драко Малфой", 32, 37, 44, 36, 26, 53, 22);
            Slytherin hogwarts11 = new Slytherin("Грэхэм Монтегю", 27, 34, 45, 34, 44, 25, 41);
            Slytherin hogwarts12 = new Slytherin("Грегори Гойл", 22, 33, 33, 21, 25, 42, 66);

            hogwarts1.printCompare(hogwarts2);
            hogwarts5.printCompare(hogwarts8);
            System.out.println(hogwarts2.toString());
            System.out.println(hogwarts5.toString());
            System.out.println(hogwarts8.toString());
            System.out.println(hogwarts11.toString());
            hogwarts1.printCompareFacult(hogwarts3);
            hogwarts5.printCompareFacult(hogwarts6);
            hogwarts7.printCompareFacult(hogwarts8);
            hogwarts11.printCompareFacult(hogwarts12);

        }
    }