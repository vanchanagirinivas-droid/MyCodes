import java.io.*;
public class mysixthcode{
    public static void main(String[] args){
        long n1=0,nw=0,nc=0;
        String line;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(args[0]));
            while((line = br.readLine()) != null) {
                n1++;
                nc = nc + line.length();
                int i = 1;
                boolean pspace = true;
                while(i < line.length()) {
                    char c = line.charAt(i++);
                    boolean cspace = Character.isWhitespace(c);
                    if(pspace && !cspace) {
                        nw++;
                    }
                    pspace = cspace;
                }
            }
            System.out.println("Number of characters: " + nc);
            System.out.println("Number of words: " + nw);
            System.out.println("Number of lines: " + n1);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
        
