package Virtualpetapp;

import java.util.Random;

public class virtualpetapp {
	private String name = "Tommy the Teddybear";
// 
    private int hunger = 0;
    private int thirst = 0;
    private int play = 0;
    private int sleep = 12;
 
    // get random method
    Random random = new Random();
    public int getRandom() {
        return random.nextInt(10); // 0-9
    }
    //tick makes time go by
    public void tick() {
        hunger += (5 + getRandom());
        thirst += (3 + getRandom());
        play += (2 + getRandom());
        sleep -= (2 + getRandom());
        
        }
    
    // returns
    public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public int getBored() {
        return play;
    }
    public int getTired() {
        return sleep;
    }
    
    // these are my methods 
    public void feed(){
        hunger -= 5; 
        play += 2; 
        
    }
    
    public void pet () {
        play -= 2;
        sleep += 3;
    }
    
    public void haveFun () {
        thirst -= 5; 
        hunger += 3; 
    
	
    }
	public void Teddy () {
	}
	// this prints an image of a Teddy bear
	public static void teddybear()
	{
		System.out.println("            ___   .--. ");
		System.out.println("      .--.-\"   \"-' .- |");
		System.out.println("     / .-,`          .'");
		System.out.println("     \\   `           \\");
		System.out.println("      '.            ! \\");
		System.out.println("        |     !  .--.  |");
		System.out.println("        \\        '--'  /.____");
		System.out.println("       /`-.     \\__,'.'      `\\");
		System.out.println("    __/   \\`-.____.-' `\\      /");
		System.out.println("    | `---`'-'._/-`     \\----'    _");
		System.out.println("    |,-'`  /             |    _.-' `\\");
		System.out.println("   .'     /              |--'`     / |");
		System.out.println("  /      /\\              `         | |");
		System.out.println("  |   .\\/  \\      .--. __          \\ |");
		System.out.println("   '-'      '._       /  `\\         /");
		System.out.println("      jgs      `\\    '     |------'`");
		System.out.println("                 \\  |      |");
		System.out.println("                  \\        /");
		System.out.println("                   '._  _.'");
		System.out.println("                      ``");
	}
}