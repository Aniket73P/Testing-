package Assignment_core_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class P19_itreateArrayList {
	public static void main(String[] args) {
		 List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  // Print the list
		  for (String element : list_Strings) {
		    System.out.println(element);
		}
	}

}
