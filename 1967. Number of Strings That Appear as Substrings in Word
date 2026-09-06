class Solution {
    class Node {
        Node[] c = new Node[26];
        Node f;
        Node l;
        int n = 0;
    }

    public int numOfStrings(String[] patterns, String word) {
        Node root = new Node();
        
        for (int i = 0; i < patterns.length; i++) {
            Node curr = root;
            String p = patterns[i];
            
            for (int j = 0; j < p.length(); j++) {
                int x = p.charAt(j) - 97;
                
                if (curr.c[x] == null)
                    curr.c[x] = new Node();
                    
                curr = curr.c[x];
            }
            
            curr.n++;
        }
        
        Node[] q = new Node[10005];
        int hd = 0;
        int tl = 0;
        
        for (int i = 0; i < 26; i++) {
            if (root.c[i] == null) {
                root.c[i] = root;
                continue;
            }
            
            root.c[i].f = root;
            root.c[i].l = null;
            q[tl] = root.c[i];
            tl++;
        }
        
        while (hd < tl) {
            Node curr = q[hd];
            hd++;
            
            for (int i = 0; i < 26; i++) {
                if (curr.c[i] == null) {
                    curr.c[i] = curr.f.c[i];
                    continue;
                }
                
                curr.c[i].f = curr.f.c[i];
                
                if (curr.c[i].f.n == 0)
                    curr.c[i].l = curr.c[i].f.l;
                else
                    curr.c[i].l = curr.c[i].f;
                    
                q[tl] = curr.c[i];
                tl++;
            }
        }
        
        Node curr = root;
        int res = 0;
        
        for (int i = 0; i < word.length(); i++) {
            int x = word.charAt(i) - 97;
            curr = curr.c[x];
            
            Node m = curr;
            
            while (m != null) {
                res += m.n;
                m.n = 0;
                
                Node tmp = m.l;
                m.l = null;
                m = tmp;
            }
        }
        
        return res;
    }
}
