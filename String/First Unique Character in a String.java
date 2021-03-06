public int firstUniqChar(String s) {
    int pos = -1;
    int []bits = new int[26];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        ++bits[c - 'a'];
    }
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (bits[c - 'a'] == 1) {
            pos = i;
            break;
        }
    }
    return pos;
}
