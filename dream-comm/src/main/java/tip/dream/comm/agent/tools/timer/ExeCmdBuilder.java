package tip.dream.comm.agent.tools.timer;

import lombok.extern.slf4j.Slf4j;
import tip.dream.comm.agent.tools.timer.cmds.*;
import tip.dream.comm.agent.tools.timer.cmds.impl.ClassExeCmd;
import tip.dream.comm.agent.tools.timer.cmds.impl.CmdBroker;
import tip.dream.comm.agent.tools.timer.cmds.impl.MethodExeCmd;
import tip.dream.comm.agent.tools.timer.cmds.impl.PackageExeCmd;
import tip.dream.comm.utils.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 执行命令的建造者
 *
 * @author tangjx
 * @date 2020/8/18 11:26
 */
@Slf4j
public class ExeCmdBuilder {

    private static final String SP = "\\|\\|";
    
    public static IExeCmd buildExeCmd(String cmdParam){
        cmdParam = cmdParam.trim();
        if(StringUtil.isEmpty(cmdParam)) {
            log.error("执行时长统计参数参数为空");
            return null;
        }

        String[] cmdArray = cmdParam.split(SP);
        List<IExeCmd> cmdList = new ArrayList<>();
        for(String cmdStr : cmdArray){
            //统一判空
            if(StringUtil.isEmpty(cmdParam)){
                continue;
            }

            //类
            IExeCmd cmd = ClassExeCmd.makeCmd(cmdStr);
            if(cmd != null){
                cmdList.add(cmd);
                continue;
            }

            //包
            cmd = PackageExeCmd.makeCmd(cmdStr);
            if(cmd != null){
                cmdList.add(cmd);
                continue;
            }

            //方法
            cmd = MethodExeCmd.makeCmd(cmdStr);
            if(cmd != null){
                cmdList.add(cmd);
            }
        }

        if(cmdList.isEmpty()){
            log.warn("无法成功解析命令，请检查命令是否正确");
            return null;
        }

        return new CmdBroker(cmdList);
    }

}
