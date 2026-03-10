void main(){
    char gender = 'M';
    String genderString;

    switch(gender){
        case 'M': genderString = " ชาย / male ";break;
        case 'F': genderString = " หญิง/ female ";break;
        default: genderString = "LGBTQ+";break;
    }
    IO.println(genderString);
}