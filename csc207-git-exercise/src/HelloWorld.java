import java.io.PrintWriter;

public class HelloWorld {
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println ("Hello, Edited GitHub!");
    pen.flush();
  } // main(String[])
}
