import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> employeeNames = new ArrayList<String>();
		
		employeeNames.add("John");
		employeeNames.add("Mike");
		employeeNames.add("William");
		employeeNames.add("Dave");
		employeeNames.add("Edward");
		
		Set<Integer> ids = new HashSet<Integer>();
		
		ids.add(101);
		ids.add(102);
		ids.add(103);
		ids.add(104);
		ids.add(105);
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		int i = 0;
		
		for (Integer id : ids) {
			String employeeName = employeeNames.get(i);
			employeeMap.put(id, employeeName);
			i += 1;
			
		}
		System.out.println(employeeMap);
		
		for(Integer id : employeeMap.keySet()) {
			System.out.println(id + " - " + employeeMap.get(id));
			
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		
		for(int id : ids) {
			idsBuilder.append(id).append("-");
				
		}
		
		System.out.println(idsBuilder.toString());
		
	
		StringBuilder namesBuilder = new StringBuilder();
		for (String employeeName : employeeNames) {
			namesBuilder.append(employeeName).append(" ");
			
		}
		System.out.println(namesBuilder.toString());
			
		}
	
	
}
