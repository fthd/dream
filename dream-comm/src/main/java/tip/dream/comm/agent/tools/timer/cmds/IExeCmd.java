package tip.dream.comm.agent.tools.timer.cmds;

/**
 * 命令接口
 *
 * @author tangjx
 * @date 2020/8/18 11:25
 */
public interface IExeCmd {
    String COM = ",";
    String DOLLAR = "\\$";

    /**
     * 是否执行计算执行时长
     *
     * @param execParam
     * @return
     */
     boolean execTime(ExecParam execParam);

     void printInit();

}
