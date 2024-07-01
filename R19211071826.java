class R19211071826 {
    public static void main(String[] args) {
        
        String s = "Hello world";

        int length = lengthOfLastWord(s);
        System.out.println("The length of the last word is: " + length);
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        return s.length() - lastSpaceIndex - 1;
    }
}