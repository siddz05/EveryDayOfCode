package hello.world.com;

public class ArrayOperations {
	private int[] theArray = new int[50];
	private int arraySize = 10;
	
	//Insert random number in the array
	public void generateRandomElement(){
		
		for(int i = 0; i < arraySize; ++i){
			
			theArray[i] = (int)(Math.random()*10)+10;
		}
	}
	//return the array
	public int[] getArray(){
		return theArray;
	}
	
	//get the Size
	public int getArraySize(){
		
		return arraySize;
		
	}
	
	//print the Array
	public void printArray(){
		
		for(int i = 0; i< arraySize; ++i){
			
			System.out.println("------");
			System.out.print("|"+ i +"|");
			System.out.println(theArray[i] +"|" );
			
			
		}
		System.out.println("------");
	}
	
	//Get the value at the Index
	public int getValueAtIndex(int index){
		if(index < arraySize ){
			//System.out.println(theArray[index]);
			return theArray[index];
			
			}
		return 0;
		
		}
	
	//Does Array Contains This Value
	public String doesArrayContainsThisValue(int value){
		String indexWithValue = "The Value : "+value+" Found At : ";
		boolean valueInArray = false;
		for(int i = 0; i < arraySize; ++i){
			if(theArray[i] == value){
				valueInArray = true;
				
				indexWithValue += " " +i + " ";
				
			}
			
		}
		System.out.print(indexWithValue);
		
		if(!valueInArray){
		indexWithValue = "None";
		System.out.println(indexWithValue);
			
		}
		System.out.println();		
		return indexWithValue;
		
		
	}
	
	//Delete the Array value
	public void delteArray(int index){
		
		if(index < arraySize ){
			for(int i = index; i < arraySize-1; i++){
				
				theArray[i] = theArray[i+1];
				
			}
		arraySize--;
		}
	}
	
	//insert The value At End
	public void insertElementAtEnd(int value){
		if(arraySize < 50){
			
			theArray[arraySize] = value;
			arraySize++;
			
		}
		
	}
	
	// Insert Value at the specific position
	public void insertAtSpecificPlace(int value, int index){
		
		if(index < 50){
			
			for(int i = 0; i < index; i++){
				
				theArray[index] = theArray[index+1];
				
			}
			//arraySize++;
			theArray[index] = value;
			
			
			
		}
	}
		//Insert In The Beginning
		public void insertAtTheBeginning(int value){
			
			//arraySize++;
			for(int i = arraySize-1; i >= 0; --i){
				theArray[i] = theArray[i+1];
			}
			
			int index = 0;
			if(index < arraySize){
				theArray[index] = value;
			//index++;	
			}
			
			
			
		}
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayOperations myArray =new ArrayOperations();
		
		myArray.generateRandomElement();
		myArray.getArray();
		myArray.printArray();
		System.out.println(myArray.getValueAtIndex(5));
		myArray.doesArrayContainsThisValue(12);
		myArray.delteArray(6);
		myArray.printArray();
		myArray.insertElementAtEnd(16);
		myArray.printArray();
		
		myArray.insertAtSpecificPlace(55, 1);
		myArray.printArray();
		
		myArray.insertAtTheBeginning(69);
		myArray.printArray();
	}

}
