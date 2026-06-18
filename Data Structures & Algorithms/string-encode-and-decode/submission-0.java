class Solution {

    public String encode(List<String> strs) {

        StringBuffer encoded = new StringBuffer();

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
            int st=j+1;
            int end= st+ len;
            String cur = str.substring(st,end);
            decoded.add(cur);
            i=end;
        }

        return decoded;

    }
}
