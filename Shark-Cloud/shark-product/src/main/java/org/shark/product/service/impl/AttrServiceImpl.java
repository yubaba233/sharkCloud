package org.shark.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.shark.product.domain.entity.Attr;
import org.shark.product.mapper.AttrMapper;
import org.shark.product.service.IAttrService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 属性信息 服务实现类
 * </p>
 *
 * @author yubaba
 * @since 2022-07-10
 */
@Service
public class AttrServiceImpl extends ServiceImpl<AttrMapper, Attr> implements IAttrService {

}
