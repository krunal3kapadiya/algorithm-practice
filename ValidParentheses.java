class ValidParentheses {
 
    // Hashtable will take care of mappings
    private HashMap<Character, Character> mappings;
    
    // Initializing hashmap with mapping.
    public Solution() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }
    
    public boolean isValid(String s) {
        // Initializing stack
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            // if the current char is closing brancket
            if (this.mappings.containsKey(c)) {
                // get top element of the stack.
                char topElement = stack.empty() ? '#' : stack.pop();
                
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }
}