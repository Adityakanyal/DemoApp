package in.aditya.main;

public class MergeSort {
	
	public void sort(int[] arr,int l, int r)
	{
		if(l<r)
		{
			int m=l+(r-l)/2;
		sort(arr,l,m);
		sort(arr,m+1,r);
		
		merge(arr,l,m,r);
		}
	}

	public void merge(int arr[],int l,int m,int r)
	{
		int l1=m-l+1;
		int r1=r-m;
		
		int rr[]=new int[r1];
		int lr[]=new int[l1];
		
		for(int i=0;i<l1;i++)
			lr[i]=arr[l+i];
		for(int j=0;j<r1;j++)
			rr[j]=arr[m+j+1];
		
		int i=0;
		int j=0;
		int k=l;
		while(i<l1 && j<r1)
		{
			if(lr[i]<rr[j])
			{arr[k]=lr[i];
				i++;
			}
			else {
				arr[k]=rr[j];
				j++;
			}
			k++;
		}
		
		 while (j < r1) {
	            arr[k] = rr[j];
	            j++;
	            k++;
	        }
		 
		 while (i < l1) {
	            arr[k] = lr[i];
	            i++;
	            k++;
	        }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {11,22,324,3212,654,789,1,54,516,7,1,23,4,465,15,8};
		MergeSort qb=new MergeSort();
		qb.sort(arr, 0, arr.length-1);
		for(int ele: arr)
			System.out.println(ele);
	}
}
