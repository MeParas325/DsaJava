// package SortingAlgorithms;

public class PV_06_MergeSort{
	static void Merge(int A[],int l,int mid,int h)
	{
		int i=l,j=mid+1,k=l;
		int B[]=new int[100];
		while(i<=mid && j<=h)
		{
			if(A[i]<A[j])
				B[k++]=A[i++];
			else
				B[k++]=A[j++];
		}
		for(;i<=mid;i++)
			B[k++]=A[i];
		for(;j<=h;j++)
			B[k++]=A[j];

		for(i=l;i<=h;i++)
			A[i]=B[i];
	}
	static void MergeSort(int A[],int l,int h)
	{
		int mid;
		if(l<h)
		{
			mid=(l+h)/2;
			MergeSort(A,l,mid);
			MergeSort(A,mid+1,h);
			Merge(A,l,mid,h);

		}
	}
	public static void main(String args[]){
		int arr[] = {15, 5, 24, 8, 1, 3, 16, 10, 20};
		MergeSort(arr,0, arr.length - 1);
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	} 
}
