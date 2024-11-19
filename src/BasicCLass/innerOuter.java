package BasicCLass;

public class innerOuter {

}
class outer{

    int outx;
    class inner{
        // inner class can access the var or method of outer
        // but the reverse is not true
        // outer can only access the inner by creating object
        // inner class cannot be access outside the outer class
    }
}