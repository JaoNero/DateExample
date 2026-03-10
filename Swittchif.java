void main(){
    int day = 3;
    String dayString;

    if(day==1){
        dayString = "วันจันทร์/monday";
    }else if (day==2){
        dayString = "วันอังคาร/tuesday";
    }else if (day==3){
        dayString = "วันพุธ/wednesday";
    }else if (day==4){
        dayString = "วันพฤหัสบดี/thursday";
    }else if (day==5){
        dayString = "วันศุกร์/friday";
    }else if (day==6){
        dayString = "วันเสาร์/saturday";
    }else if (day==7){
        dayString = "วันอาทิตย์/sunday";
    }else{
        dayString = "ไม่มีวันที่ถุกต้อง/Not Valid day";
    }
    IO.print(day + " Day String : "+dayString);
}