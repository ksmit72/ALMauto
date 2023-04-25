package uz.alm.almauto.web.productin;

import com.haulmont.cuba.gui.components.AbstractLookup;
import javax.inject.Inject;
import com.haulmont.cuba.gui.data.GroupDatasource;
import uz.alm.almauto.entity.prod.ProductIn;
import uz.alm.almauto.entity.sprs.TypeFlow;
import uz.alm.almauto.entity.sprs.Warehouse;

public class ProductInBrowse extends AbstractLookup {
//@Inject private productInsDs ProductInsDs;
@Inject private GroupDatasource<ProductIn, Integer> productInsDs;
private ProductIn productIn;
private TypeFlow typefow;
private Warehouse warehouse;

    public void onCreateBtnClick() {
        //productInsDs.getItems().
        productIn = productInsDs.getItem();
        typefow.setId(1);
        warehouse.setId(1);
        productIn.setWarehouse(warehouse);
    }
}