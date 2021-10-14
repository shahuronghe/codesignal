String reverseInParentheses(String inputString) {
    ArrayList<Integer> paren = new ArrayList<>();
    for (int i = 0; i < inputString.length(); i++){
        if (inputString.charAt(i) == '('){
            paren.add(i);
        }
        if(inputString.charAt(i)==')'){
            int node = paren.get(paren.size()-1);
            String desired = inputString.substring(node+1, i);
            String rev2 = new StringBuilder(desired).reverse().toString();
            inputString = inputString.replace("("+desired+")", rev2);
            paren.remove(paren.size()-1);
            i-=2;
        }    
    }
    return inputString;
}
