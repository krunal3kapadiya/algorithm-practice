class IsIntPalindrome {
    /**
     * input: 121
     * output: true
     **/
    public boolean isPalindrome(int x) {
        String xString = new StringBuilder().append(Math.abs(x)).toString();
        String reversedXString = new StringBuilder().append(xString).reverse().toString();

        if (x < 0) {
            return false;
        } else {
            return xString.equals(reversedXString);
        }
    }
}