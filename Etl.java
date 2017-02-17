import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
    	Map<String, Integer> sol = new HashMap<String, Integer>();
	 //sol.put("a", 1);
	Integer a = 0;	
	for(Map.Entry<Integer, List<String>> entry: old.entrySet()){
	Integer i = 0;									while(i< entry.getValue().size()){

	sol.put(entry.getValue().get(i).toLowerCase(), entry.getKey());	
	   i++;
}
	a++;
    }
	return sol;
}
}
