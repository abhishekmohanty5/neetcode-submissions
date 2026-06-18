class Solution {

    public String encode(List<String> strs) {

        StringBuilder encoded = new StringBuilder();

        for(String str : strs){
            int len = str.length();
            encoded.append(len);
            encoded.append('#');
            encoded.append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {

        List<String> decoded = new ArrayList<>();
        int i=0;
        while(i < str.length()){ 
            int j=i;
            while(j < str.length() && str.charAt(j) != '#') j++;
            int len = Integer.parseInt(str.substring(i,j));
            String cur = str.substring(j+1,j+1+len);
            decoded.add(cur);
            i=j+1+len;
        }

        return decoded;

    }
}
