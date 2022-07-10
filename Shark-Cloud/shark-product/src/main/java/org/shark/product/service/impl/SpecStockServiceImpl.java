package org.shark.product.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.shark.product.domain.entity.SpecStock;
import org.shark.product.mapper.SpecStockMapper;
import org.shark.product.service.ISpecStockService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 库存信息 服务实现类
 * </p>
 *
 * @author yubaba
 * @since 2022-07-10
 */
@Service
public class SpecStockServiceImpl extends ServiceImpl<SpecStockMapper, SpecStock> implements ISpecStockService {

}
