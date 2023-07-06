import com.example.java.utilities.InputHelfer;
import com.example.java.utilities.MathHelper;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MathHelper mhelper=new MathHelper(100);
        int s=mhelper.doMath("Enter a Value","add");
        //int s=mhelper.doMath("Enter a Value",MathHelper.ADD);  //same as before
        int total= mhelper.getTotal();
        System.out.println(s+" "+total);



//        while(true){
//            int input1=mhelper.addNumber("Enter a number: ");
//            int total=mhelper.getTotal();
//            String msg=String.format("Entered : %d, total = %d", input1,total);
//            System.out.println(msg);
//            if (input ==" "){
//                break;
//            }
//        }
    }
}

//        String welcome="Welcome!";
//        char [] chars=welcome.toCharArray();
//        System.out.println(chars[chars.length-1]);
//        InputHelfer helfer=new InputHelfer();
//        String input= helfer.getInput("Enter Value 1");
//        System.out.println(input);