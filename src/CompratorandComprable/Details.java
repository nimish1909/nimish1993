package CompratorandComprable;

import java.util.Scanner;
import java.util.TreeSet;

public class Details {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println( );
		int a = s1.nextInt();
		
		
		
		TreeSet<StudentDetails> ts=new TreeSet<StudentDetails>(StudentDetails.SortByName);
		   
		ts.add(new StudentDetails(6,"c",78));
		ts.add(new StudentDetails(7, "b",72 ));
		ts.add(new StudentDetails(8,"a",79));
		System.out.println(ts);

	}

}
