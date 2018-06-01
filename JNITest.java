import java.util.StringTokenizer;
public class JNITest {
   static{ 
     // System.loadLibrary("mynativelib.so");
     
   System.load("/Users/farhan/Documents/JNI_project/mynativelib.so");
      //System.load("C:\\JNI_project
      //\\mynativelib.dll");
   }

   public native void greet();
   public static void main(String[] args) { 
      JNITest test=new JNITest();
      test.greet();
     /* String property = System.getProperty("java.library.path");

StringTokenizer parser = new StringTokenizer(property, ";");
while (parser.hasMoreTokens()) {
    System.err.println(parser.nextToken());
    System.out.println();
    }*/
   }
}  