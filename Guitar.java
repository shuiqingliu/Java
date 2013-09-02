public class Guitar {
    String brand; 
	int numOfPickups;
	boolean rockStarUsesIt;

	String getBrand() {
		return brand;
	}

	void setBrand(String aBrand) {
		brand = aBrand;
	}
    
    //在这里写代码
    int getNumOfPickups(){
        return numOfPickups;
    }
    
    void setNumOfPickups(int num){
        numOfPickups = num;
    }
    

    boolean getRockStarUsesIt(){
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean is){
        rockStarUsesIt = is;
    }


    public static void main(String[] args) {
    }
}