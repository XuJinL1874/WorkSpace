package cn.mastc.demo2;

/**
 * @Author: XuJin_L
 * @Description: * A: IO流对象的操作规律
 *         * a: 明确一：要操作的数据是数据源还是数据目的。
 *             * 源：InputStream    Reader
 *             * 目的：OutputStream Writer
 *             * 先根据需求明确要读，还是要写。
 *
 *         * b: 明确二：要操作的数据是字节还是文本呢？
 *             * 源：
 *                 * 字节：InputStream
 *                 * 文本：Reader
 *             * 目的：
 *                 * 字节：OutputStream
 *                 * 文本：Writer
 *         * c: 明确三：明确数据所在的具体设备。
 *             * 源设备： 
 *                                 * 硬盘：文件  File开头。
 *                 * 内存：数组，字符串。
 *                 * 键盘：System.in;
 *                 * 网络：Socket
 *             * 目的设备：
 *                 * 硬盘：文件  File开头。
 *                 * 内存：数组，字符串。
 *                 * 屏幕：System.out
 *                 * 网络：Socket
 *                 * 完全可以明确具体要使用哪个流对象。
 *         * d: 明确四：是否需要额外功能呢？
 *             * 额外功能：
 *                 * 转换吗？转换流。InputStreamReader OutputStreamWriter
 *                 * 高效吗？缓冲区对象。BufferedXXX
 *                 * 已经明确到了具体的体系上。
 * @Date: Created in 16:54 2018/8/9
 * @Modified By:
 */
public class QuestionDemo {
    /**
     *
     */
}
