import java.io.*;
class createfile
{
public static void main(String[] arr){
if (arr.length<1)
{
try
System.Out.println("Usage.java create file name");
System.exit(0);
Buffered Reader b =new buffer Reader(new Input Struam reader(System.in));
print streamform =new print Stream (new Fileoutput Stream(arr[0]));
System.out.println("enter text end to save");
print streamTemp=Systemout
System.setout(fos);
do
{
    String Str=breadline();
    if (Str.equals Ignorecase ("end"));
    System.out.println("str");
    break;
}
while(true);
System.Out.print("sussefully created");
}
catch(Exception ex){
    System.out.println(ex);
}
}
}