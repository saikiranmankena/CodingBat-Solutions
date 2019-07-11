// Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


// stringMatch("xxcaazz", "xxbaaz") → 3
// stringMatch("abc", "abc") → 2
// stringMatch("abc", "axc") → 0

public int stringMatch(String a, String b) {
  int c=0;
  int l1=a.length();
  int l2=b.length();
  int l=0;
  if(l1>l2){
    l=l2;
  }else{
    l=l1;
  }
  
  for(int i=0;i<l-1;i++){
    if(a.substring(i,i+2).equals(b.substring(i,i+2))){
      c++;
    }
  }
  return c;
}
