package Array;

public class Linear_Search {
	
	public static int linearSearch(int number[], int key) {
		for(int i = 0; i< number.length; i++) {
			if(number[i] == key) {
				return i;
			}
			
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number = {2,4,6,8,10,12,14,16};
		int key = 14;
		
		int index =linearSearch(number, key);
		  if(index == -1) {
			  System.out.println("Index not Found");
		  }else {
				System.out.println("key is an index: " + index);
 
		  }
		
	}

}
