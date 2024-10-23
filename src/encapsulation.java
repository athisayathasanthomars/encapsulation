class encapsulation {
    private String password="200134702209Tt";
    public String getPassword(){
        return password;
    }
    public void setPassword(String pw){
        password=pw;
    }
    public static void main(String[] args) {
        encapsulation obj=new encapsulation();
        System.out.println("old password-"+obj.getPassword());
        //get method to get the password
        obj.setPassword("thomars2001T");
        //set method to set the new password
        System.out.println("new password-"+obj.getPassword());
        //getting the new password after settled
    }
}
