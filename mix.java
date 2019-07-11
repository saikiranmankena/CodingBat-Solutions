
// Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
// mixStart("mix snacks") → true
// mixStart("pix snacks") → true
// mixStart("piz snacks") → false


public boolean mixStart(String str) {
  if(str.length() < 3){
    return false;
  }
  if(str.substring(0,3).equals("mix"))
  {
    return true;
  }else if(!str.substring(0,1).equals("m") && str.substring(1,3).equals("ix")){
      return true;
    }
    else{
    return false;
  }
}
