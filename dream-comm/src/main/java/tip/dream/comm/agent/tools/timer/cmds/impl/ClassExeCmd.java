package tip.dream.comm.agent.tools.timer.cmds.impl;

import lombok.extern.slf4j.Slf4j;
import tip.dream.comm.agent.tools.timer.cmds.ExecParam;
import tip.dream.comm.agent.tools.timer.cmds.IExeCmd;

/**
 * 扫类命令
 * 
 * @author tangjx
 * @date 2020/8/18 11:23
 */
@Slf4j
public class ClassExeCmd implements IExeCmd {

    private static final int CMD_MIN_LEN = 4;
    private static final String CMD_PREFIX = "@C-";


    private String className;


    private ClassExeCmd(String className) {
        this.className = className;
        printInit();
    }


    public static ClassExeCmd makeCmd(String cmdStr) {
        try {
            String cmdTrim = cmdStr.trim();

            if (cmdTrim.length() < CMD_MIN_LEN) {
                return null;
            }

            if (!cmdTrim.startsWith(CMD_PREFIX)) {
                return null;
            }

            return new ClassExeCmd(cmdTrim.substring(3));
        } catch (Exception e) {
            log.error("", e);
            return null;
        }
    }


    @Override
    public boolean execTime(ExecParam execParam) {
        try {
            return className.equals(execParam.getClassName());
        } catch (Exception e) {
            log.error("", e);
            return false;
        }

    }

    @Override
    public void printInit() {
        try {
            log.info("类:{}所有的方法将计算执行时长", className);
        } catch (Exception e) {
            log.error("", e);
        }
    }


}
