class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> words = new HashSet<>();
        words.addAll(wordList);
        
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        Set<String> reached = new HashSet<>();
        reached.add(beginWord);
        
        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                for (int j = 0; j < word.length(); j++) {
                    char[] chars = word.toCharArray();
                    
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[j] = c;
                        String newWord = new String(chars);
                        if (words.contains(newWord)) {
                            if (newWord.equals(endWord)) {
                                return level + 1;
                            }
                            else if (reached.add(newWord)) {
                                queue.add(newWord);
                            }
                        }
                    }
                }
            }
            level++;
        }
        return 0;
    }
}
