package tip.dream.comm.agent.tools.timer;

import lombok.extern.slf4j.Slf4j;
import tip.dream.comm.agent.tools.timer.cmds.IExeCmd;

import java.lang.instrument.Instrumentation;

/**
 * 代理程序入口类
 *
 * @author tangjx
 * @date 2020/8/18 10:43
 */
@Slf4j
public class ExecTimeAgentStarter {

    public static void premain(String args, Instrumentation instrumentation) {
        log.info("执行时长计数器开启,参数{}", args);
        try {
            IExeCmd exeCmd = ExeCmdBuilder.buildExeCmd(args);
            //没解析到命令不执行
            if(exeCmd == null) {
                return;
            }
            //添加字节码转换器
            instrumentation.addTransformer(new ExecTimerTransformer(exeCmd));
        } catch (Exception e) {
            log.warn("执行时长计数器代理程序执行启动失败错误信息如下，但不影响程序正常:");
            log.error(e.getMessage());
        }
    }
}