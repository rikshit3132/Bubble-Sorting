import java.util.Scanner;
class Bubble{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array\n");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Elements\n");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Bubble Sort\n");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("Bubble Sort\n");
		for(int i=0;i<arr.length;i++){
			int flag=0;
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0){
				break;
			}
		}
		System.out.println("After Bubble Sort:\n");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
}