public class Ascivalue {
    public static void main(String[] args) {
        char[] uppercase= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z' };

        char [] lowercase={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};


        System.out.println("Ascii value for uppercase litters ");

        for(int i=0;i<uppercase.length;i++){
            System.out.println(uppercase[i]+" = "+(int)+uppercase[i]);
        }
        System.err.println();
        
        for(int i=0;i<lowercase.length;i++){
            System.out.println(lowercase[i]+" = "+(int)+lowercase[i]);
        }
    }
    
}
