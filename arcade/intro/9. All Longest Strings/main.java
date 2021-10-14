String[] allLongestStrings(String[] inputArray) {
    if (inputArray.length == 0)
        return new String[]{};
    
    ArrayList<String> retList = new ArrayList<>();
    int max = inputArray[0].length();
    for(int i = 0; i < inputArray.length; i++){
        if(max < inputArray[i].length())
            max = inputArray[i].length();
    }
    for(int i = 0; i < inputArray.length; i++){
        if(inputArray[i].length() == max){
            retList.add(inputArray[i]);
        }
    }    
    return retList.toArray(new String[retList.size()]);
}
