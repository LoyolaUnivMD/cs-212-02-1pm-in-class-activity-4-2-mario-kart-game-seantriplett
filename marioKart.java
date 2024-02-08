
class MarioKartGame {
    public static void main(String[] args) {

        System.out.println("Mario Kart!\n");
        //Create two player objects
        MarioKartPlayer johnny = new MarioKartPlayer("Johnny Christmas", "Mario", 10);
        MarioKartPlayer billy = new MarioKartPlayer("Billy Quingus", "Luigi", 15);
        //Display new character info
        johnny.displayInfo();
        billy.displayInfo();
        //Both players hit boosts
        billy.boost();
        johnny.boost();
        //Display new character info
        johnny.displayInfo();
        billy.displayInfo();
        
    }
}
