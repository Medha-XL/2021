package AdvancedJavaPrograms;

interface TransactionI 
{ 
  void withdrawAmt(int amtToWithdraw); 
 } 

class TransactionImpl implements TransactionI 
{ 
  public void withdrawAmt(int amtToWithdraw) 
  { 
    // logic of withdraw. 
    System.out.println(amtToWithdraw + " is debited from customer ");
  } 
}

public class interfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   TransactionI obj = new TransactionImpl();	
  
	   obj.withdrawAmt(500);
	}

}
