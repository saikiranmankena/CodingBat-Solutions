
// Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


// stringYak("yakpak") → "pak"
// stringYak("pakyak") → "pak"
// stringYak("yak123ya") → "123ya"

public String stringYak(String str) {
  int len = str.length();
  String result = "";
  for(int i=0;i<len;i++){
    if(len>i+2&& str.charAt(i)=='y' && str.charAt(i+2)=='k'){
       i=i+2;
    }else{
      result=result + str.charAt(i);
    }
  }
  return result;
}
