package cn.itcast.Service.Impl;

import cn.itcast.Service.DubboService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class DubboServiceImpl implements DubboService {
    @Override
    public String getName() {
        return "品优购输出";
    }
}
