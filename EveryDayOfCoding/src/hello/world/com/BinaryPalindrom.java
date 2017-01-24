package hello.world.com;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class BinaryPalindrom {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int[] arr = new int[4];
		
		int n = in.nextInt();
		int temp = 0, rem = 0;
		List<Integer> bn = new ArrayList<Integer>();
		Stack<Integer> st = new Stack<Integer>();
		int i=0;
		
		System.out.println("\nUsing Stack!");
		while(n!=0){
			
			temp = n % 2;
			n = n / 2;
			bn.add(temp);
			st.push(temp);
			arr[i] = temp;
			++i;
			
		}
		
		while(!st.empty()){
			System.out.print(st.pop());
		}
		System.out.println("\nUsing ArrayList!");
		ListIterator<Integer> ll = bn.listIterator(bn.size());
		//ll.next();
		while(ll.hasPrevious()){
			System.out.print(ll.previous());
		}
		System.out.println("\nUsing Array!");
		for(int a=arr.length-1;a>=0;a--){
		System.out.print(arr[a]);
		}
		
		Object[] arr1 = new Object[bn.size()];
		arr1 =bn.toArray();
		
		System.out.println("hi"+arr1.toString());
		
		//Now, check palindrom or not
		List<Integer> bb = new ArrayList<Integer>();
		int first =0, last=arr.length-1;
		int flag = 0;
		while(first<last){
			first =arr[first];
			last = arr[last];
			if(arr[first]!=arr[last]){
				flag = 1;
				
			}
			
			first++;
			last--;
			
			
					}
		if(flag==0){
			System.out.println("Palindrom");
		}
		if(flag ==1){
			System.out.println("Not Palindrom");
		}
		
		
		
		
		
 		
		
		
		

	}

}
