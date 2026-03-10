void main(){
    int day = 3;
    String dayString;
    switch(day){
        case 1: dayString = "วันจันทร์/monday";break;
        case 2: dayString = "วันอังคาร/tuesday";break;
        case 3: dayString = "วันพุธ/wednesday";break;
        case 4: dayString = "วันพฤหัสบดี/thursday";break;
        case 5: dayString = "วันศุกร์/friday";break;
        case 6: dayString = "วันเสาร์/saturday";break;
        case 7: dayString = "วันอาทิตย์/sunday";break;
        default: dayString = "ไม่มีวันที่ถุกต้อง/Not Valid day";break;
    }
    IO.print(day + " Day String : "+dayString);
}
    