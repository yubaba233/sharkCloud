package org.shark.product.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.shark.product.domain.entity.Spec;
import org.shark.product.mapper.SpecMapper;
import org.shark.product.service.ISpecService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * sku信息 服务实现类
 * </p>
 *
 * @author yubaba
 * @since 2022-07-10
 */
@Service
public class SpecServiceImpl extends ServiceImpl<SpecMapper, Spec> implements ISpecService {

}
