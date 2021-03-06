package quick.pager.shop.response;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import quick.pager.shop.model.Goods;
import quick.pager.shop.model.GoodsDetail;

@Data
public class GoodsResponse implements Serializable {
    private static final long serialVersionUID = -8479156993270457418L;

    private Goods goods;

    private GoodsDetail goodsDetail;
    /**
     * 购买数量
     */
    private Integer buyerGoodsCount;

    // 购物车商品总价格
    private BigDecimal settlementAmount;
}
