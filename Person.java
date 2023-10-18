//This class is made by my classmate

public class Person
{
    private String name;
    private int bitches;
    private int intelligence;
    private int rizz;
    private boolean depressed;
    private boolean isRetarded;

    public Person(String name, int bitches, int intelligence, int rizz, boolean depressed, boolean isRetarded)
    {
        setName(name);
        setRizz(rizz);
        setBitches(bitches);
        setIntelligence(intelligence);
        setDepressed(depressed);
        setIsRetarded(isRetarded);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBitches(int bitches){
        this.bitches = bitches;
    }

    public int getBitches(){
        return bitches;
    }

    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    public int getIntelligence(){
        return intelligence;
    }

    public void setRizz(int rizz){
        this.rizz = rizz;
    }

    public int getRizz(){
        return rizz;
    }

    public void setDepressed(boolean depressed){
        this.depressed = depressed;
    }

    public boolean getDepressed(){
        return depressed;
    }

    public void setIsRetarded(boolean isRetarded){
        this.isRetarded = isRetarded;
    }

    public boolean getIsRetarded(){
        return isRetarded;
    }
}