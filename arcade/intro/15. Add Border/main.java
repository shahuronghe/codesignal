String[] addBorder(String[] picture) {
    String[] ret = new String[picture.length+2];
    int starValue = picture[0].length()+2;
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < starValue; i++){
        sb.append("*");
    }
    for(int i = 0; i < ret.length;i++){
        if(i==0 || i == ret.length-1){
            ret[i] = sb.toString();           
        }else{
            ret[i] = "*"+ picture[i-1] +"*";
        }
    }
    System.out.println(Arrays.toString(ret));
    return ret;
}
