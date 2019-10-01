package PP;
import java.util.*;

import javax.lang.model.util.ElementScanner6;
class ContactManager 
{
	
	private String name;
	private	String Email;
	private	String Phonenumber;
    ContactManager(){
		name=null;
		Email=null;
		Phonenumber=null;
		}
		public ContactManager(String name,String Email,String Phonenumber){
			this.name=name;
			this.Email=Email;
			this.Phonenumber=Phonenumber;
		}
		 public String getName(){
			 return name;
		 }
		 public void setName( String name){
			 this.name=name;
		 }
		 public String getEmail(){
			 return Email;
		 }
		 public void setEmail( String Email){
			 this.Email=Email;
		 }
		 public String getPhonenumber(){
			 return Phonenumber;
		 }
		 public void setPhonenumber( String Phonenumber){
			 this.Phonenumber=Phonenumber;
		 }
		 public String toString(){
			 return "{ Name = " + name + ", Email = " + Email + ", Phone Number = " + Phonenumber + "}";
		 }
		
         
		 



		 

	public static void main(String[] args) 
	{
		ContactManager myc []=new ContactManager[200];
		int size=0,ch;
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println("1.addContact");

			System.out.println("2.Display");
			System.out.println("3.searchforname");
			System.out.println("4.search for phonenumber");
			System.out.println("5.search for Email");
			System.out.print("Enter your choice:-");
			
			
			ch =sc.nextInt();
			sc.nextLine(); 
			


		switch (ch)
		{
		case 1:		
		System.out.println("enter name");
		String name=sc.nextLine();
        System.out.println("enter the email");
		String email=sc.nextLine();
		System.out.println("enter the phonenumber");
		String phone=sc.nextLine();
		ContactManager contact = new ContactManager(name,email,phone);
		myc[size]=contact;
		size++;
		break;
		case 2: 
		for(int i=0;i<size;i++){
			System.out.println(myc[i]);
		}
		break;
		case 3:
		System.out.println("enter the name to search");
		String searchName=sc.nextLine();
		int count=0;
		for(int i=0;i<size;i++){
			if (searchName.equals(myc[i].name))
			{
				System.out.println("name is present in contact"+myc[i].name);
				count++;
			}			
		}
		if (count==0)
		{
			System.out.println("not found your name in this list");
		}
		case 4:
		        System.out.println("enter the phonenumber");
				String searchPhonenumber=sc.nextLine();
				int count1=0;
				for(int i=0;i<size;i++)
				{
					if(searchPhonenumber.equals(myc[i].Phonenumber))
					{
						System.out.println(myc[i].Phonenumber);
						count1++;
					}
				}
				if (count1==0)
				{
					System.out.println("null");
				}
		break;
		case 5:
				System.out.println("enter the email to search");
				String e=sc.nextLine();
				int count2=0;
				for(int i=0;i<size;i++)
				{
					if(e.equals(myc[i].Email)){
						System.out.println(myc[i].Email);
						count2++;
					}
				}
				if(count2==0)
				{
					System.out.println("not found");
				}
		break;
		
	}
}while(ch<6);
sc.close();


}
}
