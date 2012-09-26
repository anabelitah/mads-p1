import java.io.File;
import java.util.Scanner;


public class Main {
	
	public static Mine mine = new Mine(new File("example1.map"));
	public static Scanner scanner = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// MAIN CICLE
		while(true) {
			
			// exit condition
			
			// show map
			mine.print();
			
			// ask user for a command
			String command = scanner.nextLine();
			if (!(command.toLowerCase().charAt(0) == 'w')) {
				if (!mine.move(command.charAt(0))) {
					System.out.println("Invalid Command");
				}
			}
			
			// update map
			mine.updateMap();
			
		}

	}

}
