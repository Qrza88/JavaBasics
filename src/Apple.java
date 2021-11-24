public class Apple {

   public String colour;
   public int size;

   public Apple(){
       System.out.println("creating an apple");
   }
   public Apple(String colour, int size){
       this.colour = colour;
       this.size = size;
   }

    public String rot(int rotTime, String rotColour) {
        while (rotTime > 0){
            System.out.println("rotting...");
            --rotTime;
        }
        colour = rotColour;
        return "The apple is rotten.";
    }

}
