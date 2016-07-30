public class Chengji {
    public static void main(String[] args) {
        /*
        for loop 输出 0 ～ 100 每个数值。
        小于60时候 输出 “成绩为不及格”
        等于60时候 输出 “成绩及格”
        大于60 小于等于85时候 输出 “成绩还好”
        大于等于85小于90时候 输出 “成绩优秀”
        大于等于90时候 成绩非常好
        
        错误: 输出后面没加分号;
             else后加上了条件;
        
        */
        for (int a = 0; a <= 100; a++) {
            if (a < 60){
                System.out.println("成绩为不及格"+ a);
            }else if (a == 60){
                System.out.println("成绩及格"+ a);
            }else if (a < 60 && a == 85){
                System.out.println("成绩还好" + a);
            }else if (a >= 85 && a <90){
                System.out.println("成绩优秀" + a);
            }else {
                System.out.println("成绩非常好" + a);
            }
            
        }
        
    }
}