boolean checkPalindrome(String inputString) {
    if(new StringBuilder(inputString).reverse().toString().equals(inputString))
        return true;
    return false;
}
