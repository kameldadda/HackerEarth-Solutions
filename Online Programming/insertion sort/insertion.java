class insertion {
  static void sort(int[]a ){
       int N = a.length;
   for (int i =0 ; i<N; i++){
     for (int j = i; j > 0 && less(a[j],a[j-1]); j--) {
       exch(a, j, j-1);
     }
 }
}

public static boolean less(int a , int b){
  return a<b;
}

public static void exch(int[]a , int i,int j){
  int c = a[i];
  a[i]=a[j];
  a[j]=c;
}

public static void main(String[] args) {
  int [] tab = new int[5];
  tab[0]=5;
  tab[1]=2;
  tab[2]=7;
  tab[3]=3;
  tab[4]=9; 
  // tab = 5 2 7 3 9
  sort(tab);
  //tab = 2 3 5 7 9
  for (int i =0;i<tab.length ;i++ ) {
    System.out.print(tab[i]+" ");
  }
}
}
