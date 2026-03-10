void main(){
    Scanner SC = new Scanner(System.in);
    int age = -1;

    while (age < 0 || age > 150){
        IO.println("Input your Age : ");
        age = SC.nextInt();
    }
    IO.println("Register SuccessFul!!! \n you age is : "+age);
}