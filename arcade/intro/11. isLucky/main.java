boolean isLucky(int n) {
    int half = String.valueOf(n).length()/2;
    int total1 = 0;
    int total2 = 0;
    for (int i = 0; i < String.valueOf(n).length(); i++){
        if(i < half)
            total1 += Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
        else
            total2 += Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
    }
    return total1 == total2;
}
