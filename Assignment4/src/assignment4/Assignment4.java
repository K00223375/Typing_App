package assignment4;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author K00223375
 */
public class Assignment4 {
    private static TypingTutor typingApp= new TypingTutor();
    private String path;
    public static void main(String[] args) 
    {
        
    }
 
    public void writeToFile(String x, String y) throws IOException
    {
        FileWriter write = new FileWriter(path,true);
    }
}
