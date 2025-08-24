class integer{
    public static void main(String[]args){
            Object a = "sai vivek";
       
        if(a instanceof Integer){
           System.out.println("the variable you have given is an integer");
        }
        else if(a instanceof Float){
            System.out.println("the variable you have given is a float");
        }
        else if(a instanceof Boolean){
            System.out.println("the variable you have given is a boolean");
        }
        else if(a instanceof Character){
            System.out.println("the variable you have given is a character");
        } else {
            System.out.println("the variable you have given is a string");
            }
   }

} 