package LamdaExpressions;

public class passlamda {
    static String Op(strhandle sf,String st){
        return sf.func(st);
    }

    public static void main(String[] args) {
        String instr ="resp";
        String res=Op((str)->{
            System.out.println(str);
            return str;
        },instr);
    }
}
