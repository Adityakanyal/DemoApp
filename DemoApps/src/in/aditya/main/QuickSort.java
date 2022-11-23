package in.aditya.main;

public class QuickSort {

	public void quickSort(int arr[],int l,int r)
	{
		if(l<r)
		{
			int p=partiton( arr, l,  r);
			quickSort(arr, l, p-1);
			quickSort(arr,p+1,r);
			
		}
	}
	
	public int partiton(int arr[],int l, int r)
	{
		int pivot=arr[r];
		int j=l-1;
		int temp=0;
		for(int i=l;i<r;i++)
		{ temp=0;
			if(pivot>arr[i])
			{
				j++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		
		temp=arr[r];
		arr[r]=arr[j+1];
		arr[j+1]=temp;
	return j+1;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr=new int[] {54,6,658,4,14,4,7,89,67,0,98,-7};
QuickSort qb=new QuickSort();

qb.quickSort(arr, 0, arr.length-1);
for(int ele:arr)
	System.out.println(ele);
	}

}
