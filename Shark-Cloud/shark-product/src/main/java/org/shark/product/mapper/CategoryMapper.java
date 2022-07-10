package org.shark.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.shark.product.domain.entity.Category;
import org.shark.product.domain.vo.CategoryVo;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yubaba
 * @since 2022-07-06
 */
public interface CategoryMapper extends BaseMapper<Category> {

    /**
     * 查询所所欲分类
     *
     * @param status 状态
     * @return 结果
     * */
    List<CategoryVo> findAll(String status);
}
