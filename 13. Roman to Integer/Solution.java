class Solution {
    public int romanToInt(String s) {
        int number = 0;
        for(int i = 0; i<s.length(); i++){
            if( (i+1)<=s.length()-1){
             switch(s.charAt(i)){
                 case 'I': 
                    if(s.charAt(i+1) != 'V' && s.charAt(i+1) != 'X' ){
                     number = number + 1;
                    }
                    else{
                        if(s.charAt(i+1) == 'V'){ number = number + 4; i++;}
                        else{ number = number + 9; i++;}
                    }
                break;
                 case 'V':
                    number = number + 5;
                    break;
                 case 'X': 
                    if(s.charAt(i+1) == 'L'){ number = number + 40; i++;}
                    else if(s.charAt(i+1) == 'C'){ number = number + 90; i++;}
                    else number = number + 10;
                    break;
                 case 'L': 
                    number = number + 50;
                    break;
                 case 'C': 
                    if(s.charAt(i+1) == 'D'){ number = number + 400; i++;}
                    else if(s.charAt(i+1) == 'M'){ number = number + 900; i++;}
                    else number = number + 100;
                    break;
                 case 'D': 
                    number = number + 500;
                    break;
                 case 'M': 
                     number = number + 1000;
                    break;

             }
        }
        else number = number +1;
        
    }
    
         return number;
    }
}
