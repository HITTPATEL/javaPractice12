package day12.Q2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	
	
	public boolean validate(String name, String mobileNum, String aadharCard) {   
		  boolean n= Pattern.matches("[A-Za-z]{3,8}", name);
		  boolean m=Pattern.matches("[6789]{1}[0-9]{9}",mobileNum);
		  boolean a=Pattern.matches("[1-9]{1}[0-9]{11}",aadharCard);
		  
		  if(n==false) {
			  System.out.println("Please enter name in 3 to 8 characters");
		  }
		  if(m==false) {
			  System.out.println("Please enter mobile number in correct format");
		  }
		  if(a==false) {
			  System.out.println("Please enter correct aadharcard number");
		  }
		  
		if (n==true && m==true && a==true) {
			
			return true;
		}
		else {
		
			return false;
		}
		
	}
	  public static void main(String[] args) {
		
		  Demo d1=new Demo();
		  
		  Scanner scanner=new Scanner(System.in);
		  System.out.println("Enter Name :");
		  String nameString=scanner.next();
		  
		  System.out.println("Enter Mobile Number :");
		  String mobileNumString=scanner.next();
		  
		  System.out.println("Enter Aadhar Card Number :");
		  String aadharCard=scanner.next();
		  
		  boolean answer=d1.validate(nameString,mobileNumString, aadharCard);
		  
		  if(answer==true){
			  Citizen citizen=new Citizen();
			  citizen.setName(nameString);
			  citizen.setMobileNumber(mobileNumString);
			  citizen.setAadharNumber(aadharCard);
			  System.out.println("Citizen name is "+citizen.getName());
			  System.out.println("Mobile Number is "+citizen.getMobileNumber());
			  System.out.println("Aadharcard Number is "+citizen.getAadharNumber());
		  }
		  else {
			  System.out.println("Invalid input");
		  }
		  
		  
		  
	}

}
