package Capgi;

class StringPlay {
    int convert;
    int max;

    StringPlay() {
        this.convert=0;
        this.max=0;
    }
    int convertString(String str)
    {
        convert=Integer.parseInt(str);
        return convert;
    }
    int countCharacterOccurance(String s,char c)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == c)
            {
                max++;
            }
        }
        return max;
    }

}

class StringMethods {
    public int convertToInt(StringPlay sp, String str) {
      return  sp.convertString(str);
    }

    public int getMax(StringPlay sp, String s, char c) {
        return sp.countCharacterOccurance(s, c);
    }
}
class Practice1 {
    public static void main(String[] args) {
        StringPlay sp= new StringPlay();
        StringMethods sm= new StringMethods();
       System.out.println( sm.getMax(sp, "fgfgfgf", 'g'));
      System.out.println(  sm.convertToInt(sp, "123"));
        
    }
}