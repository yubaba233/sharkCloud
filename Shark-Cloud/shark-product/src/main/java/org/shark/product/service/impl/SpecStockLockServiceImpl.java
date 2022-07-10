package org.shark.product.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.shark.product.domain.entity.SpecStockLock;
import org.shark.product.mapper.SpecStockLockMapper;
import org.shark.product.service.ISpecStockLockService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 库存锁定信息 服务实现类
 * </p>
 *
 * @author yubaba
 * @since 2022-07-10
 */
@Service
public class SpecStockLockServiceImpl extends ServiceImpl<SpecStockLockMapper, SpecStockLock> implements ISpecStockLockService {

}
