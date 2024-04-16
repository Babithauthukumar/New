 class Hlo {
	 public static void main(String[] args){
	int a[]={13,2,4,15,12,10,5};
	for(int i=0;i<a.length;i++){
		if(i%2==0){
		int temp=a[i];
		for(int k=i+2;k<a.length;k+=2){
			if(a[i]<a[k]){
				a[i]=a[k];
				a[k]=temp;
				System.out.print(a[i]+" ");
			}
		}
	}
	if(i%2==1){
		int temp=a[i];
		for(int j=i+2;j<a.length;j+=2){
			if(a[i]>a[j]){
				a[i]=a[j];
				a[j]=temp;
				System.out.print(a[i]);
			}
		}
	  }
	 }
   }
 }
