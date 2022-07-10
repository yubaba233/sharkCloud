package org.shark.product.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Acer
 */
@Data
public class TreeModel  implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 节点ID */
    private Long value;

    /** 节点名称 */
    private String label;

    /** 子节点 */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<TreeModel> children;

    public TreeModel() {

    }


}
