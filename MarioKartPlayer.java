public class MarioKartPlayer {
    private String playerName;
    private String character;
    private int speed;

    public MarioKartPlayer(String p, String c, int s) {
        this.playerName = p;
        this.character = c;
        this.speed = s;
    }
    public void boost() {
        System.out.println(this.character + " hit a boost!\n");
        speed+=5;
    }
    public void displayInfo() {
        System.out.println("Current Stats:");
        System.out.println("Name: " + this.playerName);
        System.out.println("Character: " + this.character);
        System.out.println("Speed: " + this.speed + "\n");
    }

}
