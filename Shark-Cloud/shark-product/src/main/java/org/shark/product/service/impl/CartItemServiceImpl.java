package org.shark.product.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.shark.product.domain.entity.CartItem;
import org.shark.product.mapper.CartItemMapper;
import org.shark.product.service.ICartItemService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车 服务实现类
 * </p>
 *
 * @author yubaba
 * @since 2022-07-10
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements ICartItemService {

}
