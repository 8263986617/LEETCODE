class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder s = new StringBuilder();

        while(a>0 || b>0){

            if(a>b){
                if(a>1){
                    s.append("aa");
                    a-=2;
                }else{
                    s.append("a");
                    a--;
                }
                if(b>0){
                    s.append("b");
                    b--;
                }
            }else if(b>a){
                if(b>1){
                    s.append("bb");
                    b-=2;
                }else{
                    s.append("b");
                    b--;
                }
                if(a>0){
                    s.append("a");
                    a--;
                }
            }else{
                s.append("ab");
                a--;
                b--;
            }
        }
        return s.toString();

    }
}