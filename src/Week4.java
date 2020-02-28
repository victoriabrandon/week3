import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an instance of an ArrayList of String called employeeNames		
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Tommy");
		employeeNames.add("Sarah");
		employeeNames.add("Casper");
		employeeNames.add("Bobby");
		employeeNames.add("Lisa");
		
		
		//Create an instance of a HashSet of Integer called ids
		
	}
		Set<Integer> ids = new HashSet<Integer>();
		ids.add("5");
		ids.add("10");
		ids.add("55");
		ids.add("7");
		ids.add("23");
		
		
		int i = 0;
		
		for (String id : ids) {
			
		}
		
		
		
		//Create an instance of a HashMap of Integer, String called employeeMap
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		//Add at least five entries to the employeeNames and ids (make sure both collections have the same number of entries).
		
		//Create a variable int i = 0; then iterate over ids using an enhanced for loop. Inside the enhanced for loop use employeeMap.put() to add a new entry to the map. The entry should consist of a key that is the id in the enhanced loop’s current iteration, and a value that is the employeeName at position i of the employeeNames ArrayList. Increment i so that each iteration grabs the next element in the ArrayList.
		//Once the employeeMap is fully populated, use another enhanced for loop to iterate over the employeeMap.keySet(), and use the key for each current iteration to print to the console both the current key and its associated value in the map.

		//Create a StringBuilder called idsBuilder.
		StringBuilder idsBuilder = new StringBuilder();
		ids.append("5 -");
		ids.append("10 -");
		ids.append("55 - ");
		ids.append("7 -");
		ids.append("23 -");
		
		
		
		//Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
		//Print the result of idsBuilder.toString() to the console.


		
		
		
		
		
		
		
		
	}

}
