
public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");//for the mutability of the strings  we use the stringbuffer->thread safe( it can access the synchronized manner)
        System.out.println(sb);
        // insert,append,delete
        sb.append(123);
        sb.append(12.45);// add at the end
        sb.setCharAt(0,'p'); //  it can replacd the chaar at 0th index with 'p'
        sb.deleteCharAt(0);// removes character at the index 0
        sb.insert(3,5990);
        System.out.println(sb);
        String outpuString = new String(sb);// converting bufferstring to noraml string 
        System.out.println(outpuString);
        System.out.println(outpuString.length());

        StringBuffer sbb = new StringBuffer("hello");
        System.out.println(sbb);
        sb.append(123); // appends 123 at the end of hello
        sb.append(12.45); // appends 12.45 at the of hello123
        sb.setCharAt(0, 'p'); // replaces the char at 0th index with 'p'
        sb.deleteCharAt(0);  // removes character at 0th index
        sb.insert(1, "pq"); // inserts pq from 1st index
        System.out.println(sbb);
        String outputString = new String(sbb); // converting a StringBuffer to String
        System.out.println(outputString.length());

        
    }
}