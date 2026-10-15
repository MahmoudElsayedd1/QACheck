public static int Count(String[]words,String target) {
    int count = 1;
    if(words==null && target==null) {
        return 0;
    }
    for(String Word:words){
        if(Word!=null  && Word.equalsIgnoreCase(target)){
            count++;
        }
    }
    return count;
}
void main(String[] args) {
    String[]words={"noor",null,"nOOr","NOOR",null,"NooR"};
    int result =Count(words,"noor");
    System.out.println(result);
}