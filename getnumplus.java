void main(){
    Random randomnum = new Random(); 
    Scanner SC = new Scanner(System.in);
    int num = randomnum.nextInt(100);
    int innum;
    boolean result = true;
    int count = 0;
    int score = 100;

    while (result){
        IO.println("Input Number : ");
        innum = SC.nextInt();
        if(innum > num){
            IO.println("Too Much");
            count++;
        }else if(innum < num){
            IO.println("Lower Number");
            count++;
        }else{
            result = false;
        }
    }
    IO.println("Congratulation \n you correct number : "+num);
}