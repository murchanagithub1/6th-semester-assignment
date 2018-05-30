import java.io.*;
import java.util.*;
class murchana
{
 public static void main(String args[])
     {
         try
         {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                String str;
                 int length;
                System.out.println("Enter the string ");
                str=br.readLine();
                 
                char[] name=str.toCharArray();
                length=str.length();
                 int c=0;
                char[] ch=new char[str.length()];
                 for(int i=0;i<str.length();i++)
                         {
                                ch[i]=name[i];
                         }
                  for(int i=0;i<str.length();i++)
                         {/*start of for*/
                            int find=0;
                            for(int j=0;j<=i;j++)
                                {
                                  if(name[i]==ch[j])
                                    {
                                       find++;
                                    }
                                }
                           if(find==1)
                             {
                              for(int k=0;k<str.length();k++)
                                 {
                                     if(name[i]==ch[k])
                                  { 
                                    c++;
                                   }
                                  }
                         System.out.println("the alphabet "+str.charAt(i)+"  occurs   "+c+"  times  ");
                          c=0;
                          }/*end of for*/
                  }



 System.out.println("the capitalization of alternate numbers is givven below of the above string");
         char[] chre=str.toCharArray();
        int leng2=str.length();
         for(int i=0;i<leng2;i++)
          {
            if(i%2==0)
            {
            if(chre[i]>=97&&chre[i]<=123)
              {
              System.out.println(Character.toUpperCase(chre[i]));
              }
            else
             {
               System.out.println(chre[i]);
               }
            }
            if(i%2==1)
           {
            System.out.println(chre[i]);
           }
         }
        }                                                                         /*end of try*/
        catch( Exception e)
         {
                System.out.println("array index out of bounds");
         }                                                                        /*end of catch*/
      
     }                                                                            /*end of main*/
}                                                                                 /*end of class*/                        
























