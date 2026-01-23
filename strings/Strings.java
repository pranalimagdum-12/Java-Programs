public class Strings{
    public static void main(String args[]){
        //Concatenation
        String FirstName = "Tony";
        String Lastname = "Stark";
        String FullName = FirstName + " " + Lastname;
        //finding lenght of string
        System.out.println(FullName.length());
        //charAt()
        for(int i = 0;i<FullName.length(); i++){
            System.out.println(FullName.charAt(i));
        }
    }
}
