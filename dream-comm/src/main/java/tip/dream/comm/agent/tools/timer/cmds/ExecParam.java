package tip.dream.comm.agent.tools.timer.cmds;

import lombok.Getter;
import lombok.Setter;

/**
 * 判断是否执行的参数
 *
 * @author tangjx
 * @date 2020/8/18 11:24
 */
@Getter
@Setter
public class ExecParam {

    private String className;
    private String classAno;
    private String methodName;
    private String methodAno;

    public ExecParam(String className, String classAno, String methodName, String methodAno) {
        this.className=className;
        this.classAno=classAno;
        this.methodName=methodName;
        this.methodAno=methodAno;
    }

    public static ExecParam Vf(String className, String classAno, String methodName, String methodAno){
        return new ExecParam( className,  classAno,  methodName, methodAno);
    }

}
