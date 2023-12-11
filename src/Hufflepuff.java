public class Hufflepuff extends Hogwarts {
    private int industriousness;//трудолюбие
    private int loyalty;//верность
    private int honesty;//честность

    public Hufflepuff(String name, int conjure, int transgress, int industriousness, int loyalty, int honesty) {
        super(name, conjure, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Студент факультета Пуффендуй " + getName() +
                ": навык колдовать = " + getConjure() +
                ", навык трансгрессии = " + getTransgress() +
                ", трудолюбие = " + industriousness +
                ", верность = " + loyalty +
                ", честность = " + honesty
                ;
    }
    public void printCompareFacult(Hufflepuff hogwarts2){
        if((industriousness + loyalty+honesty) > (hogwarts2.industriousness + hogwarts2.loyalty+hogwarts2.honesty))
        { System.out.println(getName() + " лучший Пуффендуец, чем " +
                hogwarts2.getName());}
        else
        {System.out.println(hogwarts2.getName() + " лучший Пуффендуец, чем  " +
                getName());}
    }

}
