package org.shark.product.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.shark.product.domain.entity.AttrValue;
import org.shark.product.mapper.AttrValueMapper;
import org.shark.product.service.IAttrValueService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 属性值信息 服务实现类
 * </p>
 *
 * @author yubaba
 * @since 2022-07-10
 */
@Service
public class AttrValueServiceImpl extends ServiceImpl<AttrValueMapper, AttrValue> implements IAttrValueService {

}
