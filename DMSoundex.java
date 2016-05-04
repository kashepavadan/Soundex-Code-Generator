import java.util.*;

public class DMSoundex
{
  //gets code for individual sequence
  public static int[] getDMval(String sub, char beside)
  {
    int arr[]={-1,-1};
    if(beside=='*')
    {
      if(sub.equals("AI") || sub.equals("AI") || sub.equals("AY"))
        arr[0]=0;
      else if(sub.equals("AU"))
        arr[0]=0;
      else if(sub.equals("A"))
        arr[0]=0;
      else if(sub.equals("B"))
        arr[0]=7;
      else if(sub.equals("CHS"))
        arr[0]=5;
      else if(sub.equals("CH"))
      {
        arr[0]=5;
        arr[1]=4;
      }
      else if(sub.equals("CK"))
      {
        arr[0]=5;
        arr[1]=45;
      }
      else if(sub.equals("CSZ")||sub.equals("CZS")||sub.equals("CZ")||sub.equals("CS"))
        arr[0]=4;
      else if(sub.equals("C"))
      {
        arr[0]=5;
        arr[1]=4;
      }
      else if(sub.equals("DRZ")||sub.equals("DRS")||sub.equals("DS")||sub.equals("DSH")||sub.equals("DSZ")||sub.equals("DZH")||sub.equals("DZS"))
        arr[0]=4;
      else if(sub.equals("D")||sub.equals("DT"))
        arr[0]=3;
      else if(sub.equals("EI")||sub.equals("EJ")||sub.equals("EY"))
        arr[0]=0;
      else if(sub.equals("EU"))
        arr[0]=1;
      else if(sub.equals("E"))
        arr[0]=0;
      else if(sub.equals("FB")||sub.equals("F"))
        arr[0]=7;
      else if(sub.equals("G"))
        arr[0]=5;
      else if(sub.equals("H"))
        arr[0]=5;
      else if(sub.equals("IA")||sub.equals("IE")||sub.equals("IO")||sub.equals("IU"))
        arr[0]=1;
      else if(sub.equals("I"))
        arr[0]=0;
      else if(sub.equals("J"))
      {
        arr[0]=1;
        arr[1]=4;
      }
      else if(sub.equals("KS"))
        arr[0]=5;
      else if(sub.equals("KH")||sub.equals("K")||sub.equals("Q"))
        arr[0]=5;
      else if(sub.equals("L"))
        arr[0]=8;
      else if(sub.equals("MN")||sub.equals("NM"))
        arr[0]=66;
      else if(sub.equals("M")||sub.equals("N"))
        arr[0]=6;
      else if(sub.equals("OI")||sub.equals("OJ")||sub.equals("OY"))
        arr[0]=0;
      else if(sub.equals("O"))
        arr[0]=0;
      else if(sub.equals("P")||sub.equals("PF")||sub.equals("PH"))
        arr[0]=7;
      else if(sub.equals("RS")||sub.equals("RZ"))
      {
        arr[0]=94;
        arr[1]=4;
      }
      else if(sub.equals("R"))
        arr[0]=9;
      else if(sub.equals("SCHTSCH")||sub.equals("SCHTSH")||sub.equals("SCHTCH"))
        arr[0]=2;
      else if(sub.equals("SCH"))
        arr[0]=4;
      else if(sub.equals("SHTSH")||sub.equals("SHCH")||sub.equals("SHTSH"))
        arr[0]=2;
      else if(sub.equals("SHT")||sub.equals("SCHT")||sub.equals("SCHD"))
        arr[0]=2;
      else if(sub.equals("SH"))
        arr[0]=4;
      else if(sub.equals("STCH")||sub.equals("STSCH")||sub.equals("SC"))
        arr[0]=2;
      else if(sub.equals("STRZ")||sub.equals("STRS")||sub.equals("STSH"))
        arr[0]=2;
      else if(sub.equals("SZCZ")||sub.equals("SZCS"))
        arr[0]=2;
      else if(sub.equals("ST")||sub.equals("SZT")||sub.equals("SHD")||sub.equals("SZD")||sub.equals("SD"))
        arr[0]=2;
      else if(sub.equals("SZ")||sub.equals("S")||sub.equals("TCH")||sub.equals("TTCH")||sub.equals("TTSCH")||sub.equals("THS"))
        arr[0]=4;
      else if(sub.equals("TH")||sub.equals("T"))
        arr[0]=3;
      else if(sub.equals("TRZ")||sub.equals("TRS")||sub.equals("TSCH")||sub.equals("TSH")||sub.equals("TTS")||sub.equals("TTSZ"))
        arr[0]=4;
      else if(sub.equals("TC")||sub.equals("TTZ")||sub.equals("TZS")||sub.equals("TSZ")||sub.equals("TS"))
        arr[0]=4;
      else if(sub.equals("UI")||sub.equals("UJ")||sub.equals("UY"))
        arr[0]=0;
      else if(sub.equals("U")||sub.equals("UE"))
        arr[0]=0;
      else if(sub.equals("V")||sub.equals("W"))
        arr[0]=7;
      else if(sub.equals("X"))
        arr[0]=5;
      else if(sub.equals("Y"))
        arr[0]=1;
      else if(sub.equals("ZDZ")||sub.equals("ZDZH")||sub.equals("ZHDZH"))
        arr[0]=2;
      else if(sub.equals("ZD")||sub.equals("ZHD"))
        arr[0]=2;
      else if(sub.equals("ZH")||sub.equals("ZS")||sub.equals("ZSCH")||sub.equals("ZSH")||sub.equals("Z"))
        arr[0]=4;
      
    }
    else if(beside=='A'||beside=='E'||beside=='I'||beside=='O'||beside=='U'||beside=='J'||beside=='Y')
    {
      if(sub.equals("AI") || sub.equals("AI") || sub.equals("AY"))
        arr[0]=1;
      else if(sub.equals("AU"))
        arr[0]=7;
      else if(sub.equals("B"))
        arr[0]=7;
      else if(sub.equals("CHS"))
        arr[0]=54;
      else if(sub.equals("CH"))
      {
        arr[0]=5;
        arr[1]=4;
      }
      else if(sub.equals("CK"))
      {
        arr[0]=5;
        arr[1]=45;
      }
      else if(sub.equals("CSZ")||sub.equals("CZS")||sub.equals("CZ")||sub.equals("CS"))
        arr[0]=4;
      else if(sub.equals("C"))
      {
        arr[0]=5;
        arr[1]=4;
      }
      else if(sub.equals("DRZ")||sub.equals("DRS")||sub.equals("DS")||sub.equals("DSH")||sub.equals("DSZ")||sub.equals("DZH")||sub.equals("DZS"))
        arr[0]=4;
      else if(sub.equals("D")||sub.equals("DT"))
        arr[0]=3;
      else if(sub.equals("EI")||sub.equals("EJ")||sub.equals("EY"))
        arr[0]=1;
      else if(sub.equals("EU"))
        arr[0]=1;
      else if(sub.equals("FB")||sub.equals("F"))
        arr[0]=7;
      else if(sub.equals("G"))
        arr[0]=5;
      else if(sub.equals("H"))
        arr[0]=5;
      else if(sub.equals("J"))
        arr[0]=4;
      else if(sub.equals("KS"))
        arr[0]=54;
      else if(sub.equals("KH")||sub.equals("K")||sub.equals("Q"))
        arr[0]=5;
      else if(sub.equals("L"))
        arr[0]=8;
      else if(sub.equals("MN")||sub.equals("NM"))
        arr[0]=66;
      else if(sub.equals("M")||sub.equals("N"))
        arr[0]=6;
      else if(sub.equals("OI")||sub.equals("OJ")||sub.equals("OY"))
        arr[0]=1;
      else if(sub.equals("P")||sub.equals("PF")||sub.equals("PH"))
        arr[0]=7;
      else if(sub.equals("RS")||sub.equals("RZ"))
      {
        arr[0]=94;
        arr[1]=4;
      }
      else if(sub.equals("R"))
        arr[0]=9;
      else if(sub.equals("SCHTSCH")||sub.equals("SCHTSH")||sub.equals("SCHTCH"))
        arr[0]=4;
      else if(sub.equals("SCH"))
        arr[0]=4;
      else if(sub.equals("SHTSH")||sub.equals("SHCH")||sub.equals("SHTSH"))
        arr[0]=4;
      else if(sub.equals("SHT")||sub.equals("SCHT")||sub.equals("SCHD"))
        arr[0]=43;
      else if(sub.equals("SH"))
        arr[0]=4;
      else if(sub.equals("STCH")||sub.equals("STSCH")||sub.equals("SC"))
        arr[0]=4;
      else if(sub.equals("STRZ")||sub.equals("STRS")||sub.equals("STSH"))
        arr[0]=4;
      else if(sub.equals("SZCZ")||sub.equals("SZCS"))
        arr[0]=4;
      else if(sub.equals("ST")||sub.equals("SZT")||sub.equals("SHD")||sub.equals("SZD")||sub.equals("SD"))
        arr[0]=43;
      else if(sub.equals("SZ")||sub.equals("S")||sub.equals("TCH")||sub.equals("TTCH")||sub.equals("TTSCH")||sub.equals("THS"))
        arr[0]=4;
      else if(sub.equals("TH")||sub.equals("T"))
        arr[0]=3;
      else if(sub.equals("TRZ")||sub.equals("TRS")||sub.equals("TSCH")||sub.equals("TSH")||sub.equals("TTS")||sub.equals("TTSZ"))
        arr[0]=4;
      else if(sub.equals("TC")||sub.equals("TTZ")||sub.equals("TZS")||sub.equals("TSZ")||sub.equals("TS"))
        arr[0]=4;
      else if(sub.equals("UI")||sub.equals("UJ")||sub.equals("UY"))
        arr[0]=1;
      else if(sub.equals("V")||sub.equals("W"))
        arr[0]=7;
      else if(sub.equals("X"))
        arr[0]=54;
      else if(sub.equals("ZDZ")||sub.equals("ZDZH")||sub.equals("ZHDZH"))
        arr[0]=4;
      else if(sub.equals("ZD")||sub.equals("ZHD"))
        arr[0]=43;
      else if(sub.equals("ZH")||sub.equals("ZS")||sub.equals("ZSCH")||sub.equals("ZSH")||sub.equals("Z"))
        arr[0]=4;
    }
    else
    {
      if(sub.equals("B"))
        arr[0]=7;
      else if(sub.equals("CHS"))
        arr[0]=54;
      else if(sub.equals("CH"))
      {
        arr[0]=5;
        arr[1]=4;
      }
      else if(sub.equals("CK"))
      {
        arr[0]=5;
        arr[1]=45;
      }
      else if(sub.equals("CSZ")||sub.equals("CZS")||sub.equals("CZ")||sub.equals("CS"))
        arr[0]=4;
      else if(sub.equals("C"))
      {
        arr[0]=5;
        arr[1]=4;
      }
      else if(sub.equals("DRZ")||sub.equals("DRS")||sub.equals("DS")||sub.equals("DSH")||sub.equals("DSZ")||sub.equals("DZH")||sub.equals("DZS"))
        arr[0]=4;
      else if(sub.equals("D")||sub.equals("DT"))
        arr[0]=3;
      else if(sub.equals("FB")||sub.equals("F"))
        arr[0]=7;
      else if(sub.equals("G"))
        arr[0]=5;
      else if(sub.equals("J"))
        arr[0]=4;
      else if(sub.equals("KS"))
        arr[0]=54;
      else if(sub.equals("KH")||sub.equals("K")||sub.equals("Q"))
        arr[0]=5;
      else if(sub.equals("L"))
        arr[0]=8;
      else if(sub.equals("MN")||sub.equals("NM"))
        arr[0]=66;
      else if(sub.equals("M")||sub.equals("N"))
        arr[0]=6;
      else if(sub.equals("P")||sub.equals("PF")||sub.equals("PH"))
        arr[0]=7;
      else if(sub.equals("RS")||sub.equals("RZ"))
      {
        arr[0]=94;
        arr[1]=4;
      }
      else if(sub.equals("R"))
        arr[0]=9;
      else if(sub.equals("SCHTSCH")||sub.equals("SCHTSH")||sub.equals("SCHTCH"))
        arr[0]=4;
      else if(sub.equals("SCH"))
        arr[0]=4;
      else if(sub.equals("SHTSH")||sub.equals("SHCH")||sub.equals("SHTSH"))
        arr[0]=4;
      else if(sub.equals("SHT")||sub.equals("SCHT")||sub.equals("SCHD"))
        arr[0]=43;
      else if(sub.equals("SH"))
        arr[0]=4;
      else if(sub.equals("STCH")||sub.equals("STSCH")||sub.equals("SC"))
        arr[0]=4;
      else if(sub.equals("STRZ")||sub.equals("STRS")||sub.equals("STSH"))
        arr[0]=4;
      else if(sub.equals("SZCZ")||sub.equals("SZCS"))
        arr[0]=4;
      else if(sub.equals("ST")||sub.equals("SZT")||sub.equals("SHD")||sub.equals("SZD")||sub.equals("SD"))
        arr[0]=43;
      else if(sub.equals("SZ")||sub.equals("S")||sub.equals("TCH")||sub.equals("TTCH")||sub.equals("TTSCH")||sub.equals("THS"))
        arr[0]=4;
      else if(sub.equals("TH")||sub.equals("T"))
        arr[0]=3;
      else if(sub.equals("TRZ")||sub.equals("TRS")||sub.equals("TSCH")||sub.equals("TSH")||sub.equals("TTS")||sub.equals("TTSZ"))
        arr[0]=4;
      else if(sub.equals("TC")||sub.equals("TTZ")||sub.equals("TZS")||sub.equals("TSZ")||sub.equals("TS"))
        arr[0]=4;
      else if(sub.equals("V")||sub.equals("W"))
        arr[0]=7;
      else if(sub.equals("X"))
        arr[0]=54;
      else if(sub.equals("ZDZ")||sub.equals("ZDZH")||sub.equals("ZHDZH"))
        arr[0]=4;
      else if(sub.equals("ZD")||sub.equals("ZHD"))
        arr[0]=43;
      else if(sub.equals("ZH")||sub.equals("ZS")||sub.equals("ZSCH")||sub.equals("ZSH")||sub.equals("Z"))
        arr[0]=4;
    }
    return arr;
  }
  
  //gets all possible 6-digit codes
  public static ArrayList<String> getDMS(String name)
  {
    ArrayList<String> arr=new ArrayList<String>();
    arr.add("");
    char beside='*'; //next char
    boolean repl=true;
    for(int i=0;i<name.length();i++) // iterates through chars
    {
      for(int j=name.length();j>=i;j--) // finds largest codable substring after i
      {
        int[] dmval=getDMval(name.substring(i,j), beside);
        
        if(dmval[0]==-1 && j-i>0)
          continue;
        if(dmval[0]==-1 && j-i==0)
        {
          repl=false;
          break;
        }
        
        int len=arr.size();
        for(int l=0;l<len;l++)
        {
          String temp=arr.get(l);
          for(int k=0;k<dmval.length;k++) // goes through possibilities of next codes
          {
            if(dmval[k]==-1)
              break;
            char comp;
            if(dmval[k]>9)
              comp=(char)((dmval[k]/10)+48);
            else
              comp=(char)(dmval[k]+48);
            if(temp.length()==0 || temp.charAt(temp.length()-1)!=comp || !repl)
            {
              if(k==0)
              {
                arr.set(l, temp+Integer.toString(dmval[k]));
              }
              else
              {
                arr.add(temp+Integer.toString(dmval[k]));
              }
            }
          }
        }
        
        if(!repl)
          repl=true;
        i=j-1;
        break;
      }
      if(i+2<name.length())
      {
        beside=name.charAt(i+2);
      }
      else
        beside='/';
    }
    for(int i=0;i<arr.size();i++)
    {
      int len=arr.get(i).length();
      for(int j=len;j<6;j++)
        arr.set(i, arr.get(i)+"0");
      if(len>6)
      {
        arr.set(i,arr.get(i).substring(0,6));
      }
    }
    return arr;
  }
  
  public static void main(String[]args)
  {
    System.out.println("Enter any strings, or 'EXIT' to exit!");
    Scanner in=new Scanner(System.in);
    String input=in.next().toUpperCase();
    while(!input.equals("EXIT"))
    {
      System.out.println(input+":");
      ArrayList<String> out=getDMS(input);
      for(int i=0;i<out.size();i++)
      {
        System.out.println(out.get(i));
      }
      System.out.println();
      input=in.next().toUpperCase();
    }
    in.close();
  }
}