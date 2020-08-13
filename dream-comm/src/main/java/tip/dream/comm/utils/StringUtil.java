package tip.dream.comm.utils;

/**
 * 字符串处理工具类
 *
 * @author tangjx
 * @date 2020/8/13 16:40
 */
public class StringUtil {

    // isEmpty
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    // isBlank
    public static boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }

    // isNotEmpty
    public static boolean isNotEmpty(String str) {
        return !StringUtil.isEmpty(str);
    }

    // isNotBlank
    public static boolean isNotBlank(String str) {
        return !StringUtil.isBlank(str);
    }

}
