import java.util.ArrayList;

public class Column {
	
	ArrayList<String> column = new ArrayList<String>();
	
	public Column(ArrayList<ArrayList<String>> arrayLists, int position) {
		for(int i = 0; i < arrayLists.size(); i++){
			column.add(arrayLists.get(i).get(position));
		}
	}
	
	public boolean simular(Column collumn2,int allowed){
		int same =0;
		for(int i = 0; i < column.size(); i++){
			if(column.get(i).equals(collumn2.column.get(i))){
				same++;
			}
		}
		
		
		if(same>allowed){			
		return true;
		}
		
		return false;
	}

}
