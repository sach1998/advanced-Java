import java.util.*;
public class collectionExample {
	public static void main(String args[])
	{
		LinkedList<String> al = new LinkedList<String>();
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Three");
		System.out.println(al);
		int s = al.indexOf("Three");
		System.out.print("The index of Three is "+s);
		al.remove(3);
		System.out.println("\n"+al);
		System.out.println("Enter a string to check: ");
		Scanner w = new Scanner(System.in);
		String k = w.nextLine();
		if(al.contains(k))
		{
			System.out.print(k+" is present");
			
		}
		else
		{
			System.out.println(k+" is not present");
		}
		al.addFirst("Hello");
		System.out.println(al);
		al.clear();
		System.out.println(al);
	}
}
