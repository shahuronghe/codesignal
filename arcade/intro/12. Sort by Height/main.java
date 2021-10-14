int[] sortByHeight(int[] a) {
    boolean swap = true;
  //  while(swap){
        for (int i = 0; i < a.length-1; i++){
            swap = false;
            int val1 = a[i];
            if(val1 == -1)
                continue;
            for (int j = i; j < a.length; j++){
                int val2 = a[j];
                if (val2 == -1)
                    continue;
                if (a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;  
                    swap = true;                  
                }
            }
       // }
    }
    
    return a;
}
