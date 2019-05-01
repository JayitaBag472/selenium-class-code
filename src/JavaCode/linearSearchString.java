package JavaCode;

public class linearSearchString {
	
	public static void main(String[] args){
		
		String[] a= {"siva","java","pushpa","laxmi","ayan","arya"};
		
		int temp =0;
		
		String element= "arya";
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]==element){
				System.out.println("element is present in"+i+"index position");
				temp = temp+1;
			}
			
		}
		
		if (temp ==0){
			System.out.println("element is not present");
		}
	}

}
