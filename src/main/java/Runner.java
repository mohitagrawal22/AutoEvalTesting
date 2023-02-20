import java.util.Scanner;

import dao.PersonDao;
import dao.PersonDaoImpl;
import entities.Person;
import exceptions.PersonException;
public class Runner {
    public static void main(String[] args) throws PersonException {
        // You can use this method to test your code.
    	

    	
//    	System.out.println("=====================================");
//		System.out.println("Welcome to Testing");
//		System.out.println("=====================================");
//
//		Scanner sc = new Scanner(System.in);
//
//		PersonDaoImpl pObj = new PersonDaoImpl();
//		
//		while (true) {
//			System.out.println("choose an operation: " + "\n1.Add New Person" + "\n2.Find Person by id"
//					+ "\n3.Delete Person" + "\n0.Exit");
//
//			int key = sc.nextInt();
//
//			if (key == 0)
//				break;
//
//			switch (key) {
//			case 1:
//				System.out.println("Enter id:");
//				int id = sc.nextInt();
//				
//				System.out.println("Enter name:");
//				String name = sc.next();
//				
//				System.out.println("Enter salary:");
//				double salary = sc.nextDouble();
//				
//				Person p1 = new Person(id, name, salary);
//				pObj.addPerson(p1);
//				break;
//
//			case 2:
//				
//				pObj.findPersonById(1);
//				break;
//
//			case 3:
//				pObj.deletePerson(1);
//				break;
//
//
//			default:
//				System.out.println("Invalid Input");
//				break;
//			}
//		} 	   	
    }
}
