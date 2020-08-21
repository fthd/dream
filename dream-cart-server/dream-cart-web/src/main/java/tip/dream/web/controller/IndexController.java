package tip.dream.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页控制器
 *
 * @author tangjx
 * @date 2020/8/19 9:24
 */
@RestController
@Api(tags = "首页控制器")
@RequestMapping(value = "/index")
public class IndexController {

    @ApiOperation("查询首页接口")
    @GetMapping("/go-index")
    public String goIndex() {
        return "Dream Go Index";
    }

}
