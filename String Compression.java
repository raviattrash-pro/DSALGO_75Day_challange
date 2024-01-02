//443. String Compression


class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;
        int pos = -1;

        int count = 1;
        char curr = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == curr) count++;
            else {
                chars[++pos] = curr;
                if (count >= 10) {
                    if (count / 1000 != 0) chars[++pos] = (char) ((count / 1000) + '0');
                    if (count / 100 != 0) chars[++pos] = (char) ((count / 100) + '0');
                    if (count / 10 != 0) chars[++pos] = (char) ((count / 10) + '0');
                }
                if (count != 1)
                    chars[++pos] = (char) ((count % 10) + '0');
                curr = chars[i];
                count = 1;
            }
        }
        chars[++pos] = curr;
        if (count >= 10) {
            if (count / 1000 != 0) chars[++pos] = (char) ((count / 1000) % 10 + '0');
            if (count / 100 != 0) chars[++pos] = (char) ((count / 100) % 10 + '0');
            if (count / 10 != 0) chars[++pos] = (char) ((count / 10) % 10 + '0');
        }
        if (count != 1)
            chars[++pos] = (char) ((count % 10) + '0');
        return pos + 1;
    }
}