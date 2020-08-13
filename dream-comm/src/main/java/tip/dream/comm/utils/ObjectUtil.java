package tip.dream.comm.utils;

/**
 * Object对象处理工具类
 *
 * @author tangjx
 * @date 2020/8/13 16:40
 */
public class ObjectUtil {

    // isEmpty
    public static boolean isEmpty(Object obj) {
        return obj == null || StringUtil.isEmpty(obj.toString());
    }

    // isNotEmpty
    public static boolean isNotEmpty(Object obj) {
        return !ObjectUtil.isEmpty(obj);
    }

}
