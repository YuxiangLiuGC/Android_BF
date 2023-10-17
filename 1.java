/* 
给一个string type的double, 转换成rating star。要求round到最接近的“半整数”（3.1->3, 3.4->3.5, 3.6->3.5, 4.9->5 以此类推
最低0个star，最高5个star
input: "3.7"
round到3.5颗星
output：“full full full half empty”(三个完整star加半个start)
input: "1.6"
round到1.5颗星
output:“full half empty empty empty”(三个完整star加半个start)
*/
class solution{
    public static void main(String[] args){
        System.out.println(helper("3.7"));
        System.out.println(helper("1.6"));
    }
    public static String helper(String s){
        String res = "";
        int full = Integer.parseInt(s.substring(0, 1));
        int half = Integer.parseInt(s.substring(2, 3));
        
        for(int i=0; i<full; i++){
            res += "full ";
        }
        
        if(half<2.5){
            half=0;
        }else if(half>2.5 && half<=7.5){
            res += "half ";
            full++;
        }else{
            res += "full ";
            full++;
        }
        for(int i=0; i<5-full; i++){
            res += "empty ";
        }
        return res.substring(0, res.length()-1);
    }  
}

