
// Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.


// wordAppend(["a", "b", "a"]) → "a"
// wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
// wordAppend(["a", "", "a"]) → "a"

public String wordAppend(String[] strings) {
  String result = "";
  String newResult="";
  for(int i=0;i<strings.length-1;i++){
    result = strings[i];
    newResult += result;
    if(result==strings[i]){
       newResult += result;
    }
    i++;
    
  }
  return result;
  }
