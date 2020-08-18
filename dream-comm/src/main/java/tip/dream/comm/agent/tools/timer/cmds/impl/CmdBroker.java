package tip.dream.comm.agent.tools.timer.cmds.impl;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tip.dream.comm.agent.tools.timer.cmds.ExecParam;
import tip.dream.comm.agent.tools.timer.cmds.IExeCmd;

import java.util.List;

/**
 * 命名服务
 *
 * @author tangjx
 * @date 2020/8/18 11:24
 */
@Slf4j
public class CmdBroker implements IExeCmd {

    private List<IExeCmd> cmdList;

    public CmdBroker(List<IExeCmd> cmdList) {
        this.cmdList = cmdList;
        printInit();
    }

    @Override
    public boolean execTime(ExecParam execParam) {
        for (IExeCmd cmd : cmdList) {
            if (cmd.execTime(execParam)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printInit() {
        try {
            log.info("共有{}条规则", cmdList.size());
        } catch (Exception e) {
            log.error("", e);
        }
    }

}
