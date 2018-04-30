	import java.io.File;
import java.io.FileInputStream;
	import java.io.IOException;

	public class AR {
	private static FileInputStream fis;

	public static void main (String[] args) {
	    //   Create a 2D character Array.
	    char[][] array = new char[20][45];
	    // File object for file address.
	    File file = new File("arrays");
	    // Check if it exists
	    if (!file.exists()) {
	      System.out.println("File does not exist.");
	     
	    }
	    if (!(file.isFile() && file.canRead())) {
	      System.out.println(file.getName() + " cannot be read from.");
	      
	    }
	    // Open file
	    try {
	      fis = new FileInputStream(file);
	    //   Character to store fetched char
	      char current;
	    //   Loop over the whole array.
	      for(int i=0;i<20;i++) {
	          for(int j=0;j<45;j++) {
	              if(fis.available() > 0) {
	                //   Fetch array and store it.
	                current = (char) fis.read();
	                if(current == ' ')
	                    array[i][j] = '@';
	                else
	                    array[i][j] = current;
	              }
	          }
	      }
	    } catch (IOException e) {
	      e.printStackTrace();
	    }

	    // Do a col wise scan and print without '@' and replace it with ' '.
	    for(int i=0;i<45;i++) {
	      for(int j=0;j<20;j++) {
	            if(array[j][i] == '@')
	                System.out.print(" ");
	            else
	                System.out.print(array[j][i]);
	      }
	    }
	}
	}