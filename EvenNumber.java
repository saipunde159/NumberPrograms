public class EvenNumber{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			even(i);
		}
	}
	public static void even(int n){
		if(n%2==0){
			System.out.println("Even Number");
		}else{
			System.out.println("Odd Number");
		}
	}
}
