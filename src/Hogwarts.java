public abstract class Hogwarts {
    private String name;
    private int conjure;//свойство колдовать
    private int transgress;//свойство трансгрессировать



    public Hogwarts(String name, int conjure, int transgress) {
        this.name = name;
        this.conjure = conjure;
        this.transgress = transgress;
    }
    public Hogwarts(){}


    public int getConjure() {
        return conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setConjure(int conjure) {
        this.conjure = conjure;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", conjure=" + conjure +
                ", transgress=" + transgress +
                "};";

    }

    public void printCompare(Hogwarts hogwarts2) {
        if((conjure + transgress) > (hogwarts2.conjure + hogwarts2.transgress))
        { System.out.println(name + " обладает большей мощностью магии, чем  " +
                hogwarts2.name);}
        else
            System.out.println(hogwarts2.name + " обладает большей мощностью магии, чем  " +
                    name);
    }

}