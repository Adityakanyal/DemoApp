package in.aditya.main;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[] {11,22,324,3212,654,789,1,54,516,7,1,23,4,465,15,8};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int ele: arr)
			System.out.println(ele);
	}

}
