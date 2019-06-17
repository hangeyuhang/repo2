package cn.itcast.Service.Impl;

import cn.itcast.Dao.itemsDao;
import cn.itcast.Service.ItemsService;
import cn.itcast.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private itemsDao itemsDao;

    public Items findById(int id) {
        return itemsDao.findById(id);
    }
}
