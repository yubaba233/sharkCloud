package org.shark.product.controller.app;

import org.shark.common.core.web.controller.BaseController;
import org.shark.product.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Acer
 */
@RestController("appCategoryController")
@RequestMapping("/app/category")
public class CategoryController extends BaseController {

    @Autowired
    private ICategoryService iCategoryService;

    
}
