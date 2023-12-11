public class PrintService {
    public void print(Hogwarts[] hogwarts) {
        System.out.println("Студенты Хогвартса:");
        for (int i = 0; i < hogwarts.length; i++) {
            Hogwarts hogwart = hogwarts[i];
            System.out.println(hogwart.getName() + ", сила магии " + hogwart.getConjure()
                    + ", расстояние трансгрессии " + hogwart.getTransgress());

        }
    }

    public void print(Gryffindor[] gryffindors) {
        System.out.println("Студенты факультета Гриффиндор");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println(gryffindor.getName() + ", сила магии " + gryffindor.getConjure()
                    + ", расстояние трансгрессии " + gryffindor.getTransgress() + ". Свойства характера: благородство "
                    + gryffindor.getNobility() + ", честь " + gryffindor.getHonor() + ", храбрость " + gryffindor.getBravery());

        }
    }

    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Студенты факультета Пуффендуй");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println(hufflepuff.getName() + ", сила магии " + hufflepuff.getConjure()
                    + ", расстояние трансгрессии " + hufflepuff.getTransgress() + ". Свойства характера: трудолюбие "
                    + hufflepuff.getIndustriousness() + ", верность " + hufflepuff.getLoyalty() + ", честность " + hufflepuff.getHonesty());

        }
    }

    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Студенты факультета Когтевран");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println(ravenclaw.getName() + ", сила магии " + ravenclaw.getConjure()
                    + ", расстояние трансгрессии " + ravenclaw.getTransgress() + ". Свойства характера: умность "
                    + ravenclaw.getSmartness() + ", мудрость " + ravenclaw.getWisdom() + ", остроумие " + ravenclaw.getWit()
                    + " , творчество " + ravenclaw.getCreative());
        }

    }
    public void print(Slytherin[] slytherins) {
        System.out.println("Студенты факультета Слизерин");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println(slytherin.getName() + ", сила магии " + slytherin.getConjure()
                    + ", расстояние трансгрессии " + slytherin.getTransgress() + ". Свойства характера: хитрость "
                    + slytherin.getTrick() + ", решительность " + slytherin.getResolute() + ", амбициозность " + slytherin.getAmbitious()
                    + " ,находчивость " + slytherin.getResourceful() +", жажда власти "+slytherin.getLustForPower());
        }

    }
    //сравнение сил внутри факультета
    public void printCompareFacult( Gryffindor[] gryffindors,String name1,String name2){
        int power1=0,power2=0;
        int k1=0,k2=0;

        for (int i = 0; i < gryffindors.length; i++) {

            if (gryffindors[i].getName().equals(name1)) {
                power1 = gryffindors[i].getNobility() + gryffindors[i].getHonor() + gryffindors[i].getBravery();
                k1 = i;
            }
            if (gryffindors[i].getName().equals(name2)) {
                power2 = gryffindors[i].getNobility() + gryffindors[i].getHonor() + gryffindors[i].getBravery();
                k2 = i;
            }
        }
        if (power1>power2) {
            System.out.println(gryffindors[k1].getName() + " лучший Гриффиндорец, чем " +
                    gryffindors[k2].getName());
        } else if (power2>power1) {
            System.out.println(gryffindors[k2].getName() + " лучший Гриффиндорец, чем " +
                    gryffindors[k1].getName());
        }
        else System.out.println("Силы равны");


    }
    public void printCompareFacult(Hufflepuff[] hufflepuffs,String name1,String name2){
        int power1=0,power2=0;
        int k1=0,k2=0;

        for (int i = 0; i < hufflepuffs.length; i++) {

            if (hufflepuffs[i].getName().equals(name1)) {
                power1 = hufflepuffs[i].getIndustriousness() + hufflepuffs[i].getLoyalty() + hufflepuffs[i].getHonesty();
                k1 = i;
            }
            if (hufflepuffs[i].getName().equals(name2)) {
                power2 = hufflepuffs[i].getIndustriousness() + hufflepuffs[i].getLoyalty() + hufflepuffs[i].getHonesty();
                k2 = i;
            }
        }
        if (power1>power2) {
            System.out.println(hufflepuffs[k1].getName() + " лучший Пуффендуец, чем " +
                    hufflepuffs[k2].getName());
        } else if (power2>power1) {
            System.out.println(hufflepuffs[k2].getName() + " лучший Пуффендуец, чем " +
                    hufflepuffs[k1].getName());
        }
        else System.out.println("Силы равны");


    }
    public void printCompareFacult( Ravenclaw[] ravenclaws,String name1,String name2){
        int power1=0,power2=0;
        int k1=0,k2=0;

        for (int i = 0; i < ravenclaws.length; i++) {

            if (ravenclaws[i].getName().equals(name1)) {
                power1 = ravenclaws[i].getSmartness() + ravenclaws[i].getCreative() + ravenclaws[i].getWit()
                        +ravenclaws[i].getWisdom();
                k1 = i;
            }
            if (ravenclaws[i].getName().equals(name2)) {
                power2 = ravenclaws[i].getSmartness() + ravenclaws[i].getCreative() + ravenclaws[i].getWit()
                        +ravenclaws[i].getWisdom();
                k2 = i;
            }
        }
        if (power1>power2) {
            System.out.println(ravenclaws[k1].getName() + " лучший Когтевранец, чем " +
                    ravenclaws[k2].getName());
        } else if (power2>power1) {
            System.out.println(ravenclaws[k2].getName() + " лучший Когтевранец, чем " +
                    ravenclaws[k1].getName());
        }
        else System.out.println("Силы равны");


    }
    public void printCompareFacult( Slytherin[] slytherins,String name1,String name2){
        int power1=0,power2=0;
        int k1=0,k2=0;
        for (int i = 0; i < slytherins.length; i++) {
            if (slytherins[i].getName().equals(name1)) {
                power1 = slytherins[i].getLustForPower() + slytherins[i].getResourceful() + slytherins[i].getTrick()
                        +slytherins[i].getResolute()+slytherins[i].getAmbitious();
                k1 = i;
            }
            if (slytherins[i].getName().equals(name2)) {
                power2 = slytherins[i].getLustForPower() + slytherins[i].getResourceful() + slytherins[i].getTrick()
                        +slytherins[i].getResolute()+slytherins[i].getAmbitious();
                k2 = i;
            }
        }
        if (power1>power2) {
            System.out.println(slytherins[k1].getName() + " лучший Слизеринец, чем " +
                    slytherins[k2].getName());
        } else if (power2>power1) {
            System.out.println(slytherins[k2].getName() + " лучший Слизеринец, чем " +
                    slytherins[k1].getName());
        }
        else System.out.println("Силы равны");
    }
    public void printCompare( Hogwarts[] hogwarts,String name1,String name2){

        int power1=0,power2=0;
        int k1=0,k2=0;

        for (int i = 0; i < hogwarts.length; i++) {

            if (hogwarts[i].getName().equals(name1)) {
                power1 = hogwarts[i].getConjure() + hogwarts[i].getTransgress();
                k1 = i;
            }
            if (hogwarts[i].getName().equals(name2)) {
                power2 = hogwarts[i].getConjure() + hogwarts[i].getTransgress();
                k2 = i;
            }
        }
        if (power1>power2) {
            System.out.println(hogwarts[k1].getName() + " большей мощностью магии, чем " +
                    hogwarts[k2].getName());
        } else if (power2>power1) {
            System.out.println(hogwarts[k2].getName() + " большей мощностью магии, чем " +
                    hogwarts[k1].getName());
        }
        else System.out.println("Силы равны");


    }





}

