// import com.sun.org.apache.bcel.internal.classfile.InnerClass;
// import com.sun.org.apache.xalan.internal.xsltc.TransletException;

/**
 * exceptions
 */
public class exceptions {
    /**
     * Innerexceptions
     */
    public class Innerexceptions extends RuntimeException {

        private static final long serialVersionUID = 1L;
        
        Exception testException = new Exception();

        public Innerexceptions(String message){
            super(message);
        } 
        
    }

    public static void main(String[] args) {
        try {
            exceptions1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            exceptions2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void exceptions1() throws ArithmeticException {
        throw new ArithmeticException();
    }

    private static void exceptions2() throws Innerexceptions {
        throw new Innerexceptions("hihi");
    }
}