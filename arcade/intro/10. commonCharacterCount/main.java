int commonCharacterCount(String s1, String s2) {
    int count = 0;
    int[] marked1 = new int[s1.length()];
    int[] marked2 = new int[s2.length()];
    for (int i = 0; i < s1.length(); i++){
        char c = s1.charAt(i);
        for (int j = 0; j < s2.length(); j++){
            if (c == s2.charAt(j) && marked2[j]==0 && marked1[i]==0){
                marked2[j] = 1;
                marked1[i] = 1;
                count++;
                continue;
            }
        }
    }
    return count;
}
