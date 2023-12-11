public class Gryffindor extends Hogwarts {

    private int nobility;//благородство
    private int honor;//честь
    private int bravery;//храбрость

    public Gryffindor (String name,int conjure, int transgress, int nobility, int honor, int bravery) {
        super(name,conjure, transgress);

        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public Gryffindor (){}

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


    @Override
    public String toString() {
        return "Студент факультета Гриффиндор " +getName()+
                ": навык колдовать = "+getConjure()+
                ", навык трансгрессии = "+getTransgress()+
                ", благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery
                ;
    }


    public void printCompareFacult(Gryffindor hogwarts2){
        if((nobility + honor+bravery) > (hogwarts2.nobility + hogwarts2.bravery+hogwarts2.honor))
        { System.out.println(getName() + " лучший Гриффиндорец, чем " +
                hogwarts2.getName());}
        else
        {System.out.println(hogwarts2.getName() + " лучший Гриффиндорец, чем  " +
                getName());}
    }

}
