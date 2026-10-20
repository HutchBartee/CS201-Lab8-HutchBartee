class StringInstrument extends Instrument {
    private int numStrings;
    private int numFrets;
    private boolean isBowed;

    //complete overloaded constructor 
    public StringInstrument(String type, String name, String manufacturer,
                            int year, int cost, int strings, int frets, boolean bowed) {
        super(type,name,manufacturer,year,cost);
        this.numStrings = strings;
        this.numFrets = frets;
        this.isBowed = bowed;
    }

    //complete getters
    public int getNumStrings() { return numStrings; }
    public int getNumFrets() { return numFrets; }
    public boolean getIsBowed() { return isBowed; }

    //complete setters
    public void setNumStrings(int strings) { this.numStrings = strings; }
    public void setNumFrets(int frets) { this.numFrets = frets; }
    public void setIsBowed(boolean bowed) { this.isBowed = bowed; }

    //correct toString to print String Instrument information (adding the numString, numFrets, isBowed)
    @Override
    public String toString() {
        String out = String.format("%-20s%-20s%-20s%10d%10d%10d%15s\n",
                getType(), getName(), getManufacturer(), getYear(), getCost(), numStrings, numFrets, isBowed);
        return out;
    }
}
