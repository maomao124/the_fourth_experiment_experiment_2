import java.awt.*;

/**
 * Project name(项目名称)：第四次实验 实验2
 * Package(包名): PACKAGE_NAME
 * Class(类名): ExceptionTest1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/17
 * Time(创建时间)： 13:19
 * Version(版本): 1.0
 * Description(描述)：
 * 2、编写一个类ExceptionTest1,在main方法中使用try、catch、finally:…
 * ①在try块中,编写被0除的代码。
 * ②在catch块中,捕获被0除所产生的异常,并且打印异常信息。
 * ③在finally块中,打印一条语句
 */

public class ExceptionTest1
{
    public static void main(String[] args)
    {
        try
        {
            int a = 3;
            int b = 0;
            int c = a / b;
            System.out.println(c);          //未执行
        }
        catch (Exception e)
        {
            Toolkit.getDefaultToolkit().beep();
            System.err.println("除数为0");
            e.printStackTrace();
        }
        finally
        {
            System.out.println("程序执行完毕！！！");
        }
    }
}
