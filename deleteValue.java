class ArrayTests {

	public static void delete(char[] arr, int pos){
	    
		for(int i=pos-1;i<arr.length-1;i++){
		    
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=' ';
	}
}

public class deleteValue {
	public static void main(String args[]){
		char arr[]=new char[6];
		arr[0]='A';
		arr[1]='B';
		arr[2]='J';
		arr[3]='C';
		arr[4]='D';
		arr[5]='E';
		
		ArrayTests.delete(arr, 3);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}