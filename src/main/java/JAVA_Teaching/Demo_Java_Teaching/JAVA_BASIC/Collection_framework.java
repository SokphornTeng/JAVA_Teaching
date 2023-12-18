package JAVA_Teaching.Demo_Java_Teaching.JAVA_BASIC;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collection_framework {

	private static final int HashMap = 0;

	public static void main(String[] args) {

		//===========  Collection Interface

			//	it focus to interface in java

			//	   ========== Collection framework

			//	it have list, map, set..specail(list, set)

			//	it use in group object and in data structureEx:int[] a = new int[4] -> it have 4 elementa[0] = 35; when output it need to add toString() for convert int to Stringa[1] = 5;a[2] = 3;a[3] = 23;int[] b = new int[a.lenght + 1];for(int i=0; i<a.length; i++){b[i] = a[i]}b[a.lenght] = 56;output(b)=================List<Interger> list = new ArrayList<>(); -> it use to add element not limit and can dupplicat and orderlist.add(2)list.add(20)list.add(12)list.add(22)output(list);// access by indexint z = list.get(1)output(z)// check existboolean y =  list.contains(20)output(y) -> true// remove elementlist.remove(2)output(list)// update elementlist.set(3, 700)output(list)

			//	List<Student> stu = List.of( -> .of() -> return object with add value and it use for testing and can't change Listnew Student(1, 2, 4, "ss"),new Student(1, 2, 4, "ss"),new Student(1, 2, 4, "ss"))Student t = stu.get(0)output(t)for(int i=0; i<stu.size(); i++) { output(stu.get(i).getName())}

			//	Set -> use to store element that not duplicate it at interface set is not order
				Set<Integer> list = new HashSet<>(); // -> simple of HashSet<>();
				list.add(4);
				list.add(6);
				list.add(4);
				list.add(24);
				System.out.print(list);

				boolean bb = list.isEmpty();
				System.out.print(bb); // -> false check it empty or not

				//Iterator<Integer> listing = list.iterator();while(listing.hasNext()){ output(listing.next()) -> it use with set for order element in Set}

				//Map -> it have 2 type of generic and it will override key  if it the same key it must uniqu key
				Map<String, Integer> map = HashMap();
				//add element
				map.put("a", 1);
				map.put("b", 2);
				map.put("c", 3);
				System.out.print(map);
				// access to any element
				Integer price = map.get("c");
				if(price != null){
					System.out.print(price); // -> if not have key it will show null
				} else {
				 System.out.print("not have value");
				}

				// check exist
				map.containsKey("a");
				System.out.print(map.containsKey("a")); // -> true

				// get all key
				Set<String> k = map.keySet();
				System.out.print(k);

//				Set<Entry<String, Integer>> ent = map.entrySet();
//
//				for(Entry<String, Integer> ent : map.entrySet()) {
//				output(ent.getKey() + ent.getValue()); //-> want to get both of getValue and getKey in map
//				}
//				map.forEach((k,v) -> {
//				 System.out.print(k + v);
//				}
		
	}

	private static Map<String, Integer> HashMap() {
		// TODO Auto-generated method stub
		return null;
	}

}
