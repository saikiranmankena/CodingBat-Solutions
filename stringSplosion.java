
// Given a non-empty string like "Code" return a string like "CCoCodCode".


// stringSplosion("Code") → "CCoCodCode"
// stringSplosion("abc") → "aababc"
// stringSplosion("ab") → "aab"

public String stringSplosion(String str) {
  int len = str.length();
  String s="";
  for(int i=0;i<len+1;i++){
    s+=str.substring(0,i);
  }
  return s;
}
