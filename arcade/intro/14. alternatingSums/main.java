int[] alternatingSums(int[] a) {
    int[] ret = new int[]{0,0};
    for (int i = 0;i < a.length;i++){
        if(i%2==0)
            ret[0] +=a[i];
        if(i%2==1)
            ret[1] +=a[i];
            
    }
    return ret;
}
