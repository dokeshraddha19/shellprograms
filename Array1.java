import java.util.*;
public class Array1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=10;
		int[] array=new int[];
		System.out.println("Enter the element of an array");
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
			System.out.print(array[i]);
		}
		for(int i=0;i<n;i++){
			for(j=1;j<n;j++){
				if(array[i]==array[j]){
					System.out.println(array[i]);
				}
				if(array[i]<array[j]){
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
			}	
			System.out.print(array[i]);
		}
		
	}


}