public class Bitches
{
    private double rizz;
    private int bitches;

    public static void main(String[] args){
        Bitches b = new Bitches();

        System.out.println(b);
        
    }
    @Override
    public String toString(){
        return "";
    }


    public Bitches(){

        this.bitches = getBitches();
        getSomeBitches(bitches);
    }

    public double getRizz(){
        return 0;
    }

    public int getBitches() {
        return 0;
    } 

    public int getSomeBitches(int bitches){
        this.rizz = 0;

        if (rizz > 0){
            this.bitches = bitches;
            return bitches;
        }
        else{
            this.bitches = 0;
            System.out.println("U got no bitches");
            return bitches;
        }
    }
}