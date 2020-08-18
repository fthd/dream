package tip.dream.comm.agent.tools.timer.cmds.impl;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tip.dream.comm.agent.tools.timer.cmds.ExecParam;
import tip.dream.comm.agent.tools.timer.cmds.IExeCmd;

/**
 * 扫包命令 @P-com.ayg.service
 *
 * @author tangjx
 * @date 2020/8/18 11:26
 */
@Slf4j
public class PackageExeCmd implements IExeCmd {

    private static final int CMD_MIN_LEN = 4;
    private static final String CMD_PREFIX = "@P-";


    private String packageName;


    private PackageExeCmd(String packageName){
        this.packageName = packageName;
        printInit();
    }

    @Override
    public void printInit() {
        try{
            log.info("包:{}其下所有类的方法将计算执行时长", packageName);
        } catch (Exception e){
            log.error("", e);
        }
    }

    public static PackageExeCmd makeCmd(String cmdStr){
        String cmdTrim = cmdStr.trim();

        if(cmdTrim.length() < CMD_MIN_LEN){
            return null;
        }

        if(!cmdTrim.startsWith(CMD_PREFIX)){
            return null;
        }

        return new PackageExeCmd(cmdTrim.substring(3).concat("."));
    }


    @Override
    public boolean execTime(ExecParam execParam) {
        try {
            return execParam.getClassName().startsWith(packageName);
        } catch (Exception e){
            log.error("", e);
        }
        return false;
    }


}
