class ShaLa {
    public static void main(String[] args) {
        
        /*
        if (boolean) {
            zhi xing 1
        } else if (boolean) {
            zhi xing  2
        } else if (boolean) {
            zhi xing 3
        } else {
            zhi xing
        }
        */
        
        //boolean flag = (5 < 2);
        //0 ~ 100
        int grade = 53;
        if (grade >= 90) {
            System.out.println("成绩为A");
        } else if (grade < 90 && grade >= 80) {
            System.out.println("成绩为B");
        } else if (grade <80 && grade >= 60) {
            System.out.println("成绩为C");
        } else { //if (grade < 60)
            System.out.println("成绩为D");
        }     
        
        
        /* 
            if ( true ) { // 如果
            
            } else () { //否则
            
            }
            
        */
        
        int huangGua = 5;
        int huLuoBo = 3;
        int caiLiao = 9;
        int shaLa = 0;
        
        if (caiLiao % huangGua == 0) {
            shaLa = huangGua;
        } else if (caiLiao % huLuoBo == 0) {
            shaLa = huLuoBo;
        } else {
            System.out.println("不能上菜");
        }
        
        if(shaLa == 0) {
            System.out.println("不能上菜");
        } else if (shaLa == 3) {
            System.out.println("胡萝卜沙拉");
        } else if (shaLa == 5) {
            System.out.println("黄瓜沙拉");
        }
        
        
    }
}