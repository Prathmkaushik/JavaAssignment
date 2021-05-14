
import java.util.Set;
import java.util.TreeSet;
public class BankAccountList {
	public static void main(String[] args) {


		Set<SavingAccount> set=new TreeSet<SavingAccount>(new AccComp());  
		  
		   SavingAccount b1=new SavingAccount(101,"Bhanu",83200f,"No",1800f,2800f);  
		   SavingAccount b2=new SavingAccount(164,"Tushar",75300f,"No",3400f,4400f);
		   SavingAccount b3=new SavingAccount(219,"Muskan",12340f,"Yes",1001f,3500f);
		   SavingAccount b4=new SavingAccount(122,"Suresh",70300f,"Yes",8000f,3000f);
		 
		     
		   set.add(b1);  
		   set.add(b2);  
		   set.add(b3);
		   set.add(b4);
		     
		   for(SavingAccount b:set){  
		   System.out.println("Account Id:"+b.acc_ID+ " Account Holder's Name:"+b.accountholdername+" Account Balance: "+b.acc_balance+" Amount withdrawn:"+b.withdraw+" Amount Deposited:"+b.deposit);
		   
		   }
		 

		}

}
