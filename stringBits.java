
// Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


// stringBits("Hello") → "Hlo"
// stringBits("Hi") → "H"
// stringBits("Heeololeo") → "Hello"

public String stringBits(String str) {
  String s="";
  for(int i=0;i<str.length();i++){
    s+=str.charAt(i);
    i++;
  }
  return s;
}
