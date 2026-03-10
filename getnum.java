void main(){
    Scanner SC = new Scanner(System.in);
    int num = 3;
    int innum;
    boolean result = true;

    while (result){
        IO.println("Input Number : ");
        innum = SC.nextInt();
        if(innum > num){
            IO.println("Too Much");
        }else if(innum < num){
            IO.println("Lower Number");
        }else{
            result = false;
        }
    }
    IO.println("Congratulation \n you correct number : "+num);
}