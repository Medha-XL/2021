package basicPrograms;
public class calc
{

  public static void main(String[] args) 
  {

   try {
    int a = Integer.parseInt(args[0]);
    String operator = args[1];
    int b = Integer.parseInt(args[2]);
    int result;
    if (operator.equals("+")) { 
        result= a+b;
        System.out.println(" Result : " + a + " + " + b + " = " + result);
    }
    else if (args[1].equals("-")) 
    {
        result= a-b;
        System.out.println(" Result : " + a + " - " + b + " = " + result);
    }   
    else if (operator.equals("*")) 
    {
        result= a*b;
        System.out.println(" Result :" + a + " * " + b + " = " + result);
    }  
    else if (args[1].equals("/")) 
    {
        result= a/b;
        System.out.println(" Result :" + a + " / " + b + " = " + result);
    }  
   }
   catch(Exception ex)
   {
       System.out.println("Invalid Input...please try again..");
       System.out.println("Usage Example --> java calc 2 + 3 ");
       System.out.println("              --> java calc 4 - 2 ");
       System.out.println("              --> java calc 4 \"*\" 2 ");
       System.out.println("              --> java calc 6 / 2 ");

   }
   
  } // End of Main

}  // End of Class