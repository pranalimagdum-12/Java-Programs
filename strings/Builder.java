public class Builder{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));
        //set char at index 0
        sb.setCharAt(0, 'B');
        System.out.println(sb);
        //insert
        sb.insert(0, 'S');
        System.out.println(sb);
        //delete
        sb.delete(2,4);
        System.out.println(sb);
        //append
        sb.append("W");
        sb.append("o");
        sb.append("r");
        sb.append("l");
        sb.append("d");
        System.out.println(sb);
        //length
        System.out.println(sb.length());




    }
}