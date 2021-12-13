import java.util.*;

public class Test{
	
	public static List<Integer> buildList(){
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++)
			list.add(i);
		return list;
	}

	public static void printList(List<Integer> list){
		for(int i:list)
			System.out.println(i);
	}

	public static void main(String[] args){
		List<Integer> list = buildList();
		printList(list);
	}
}
