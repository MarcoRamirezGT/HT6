
import java.io.File;
import java.util.Scanner;

public class m {

	public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("C:\\Users\\MACO\\OneDrive\\Escritorio\\UVG S3\\Algoritmos y estructura de datos\\HT6\\HT6\\src\\cards_desc.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	}



