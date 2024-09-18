import java.util.*;

class grpAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> q = new HashMap<>();

        for (String word : strs) {
            int[] arr = new int[26];
            for (char c : word.toCharArray()) {
                arr[c - 'a']++;
            }



            String str = Arrays.toString(arr);
            if (!q.containsKey(str)) {
                q.put(str, new ArrayList<>());
            }

            q.get(str).add(word);
        }

        return new ArrayList<>(q.values());
    }

    public static void main(String[] args) {
        grpAnagram sol = new grpAnagram();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = sol.groupAnagrams(strs);
        System.out.println(result);
    }
}
