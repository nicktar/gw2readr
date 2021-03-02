package de.getsetsociety.gw2readr.v2.account.material;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v2.account.material.enums.Binding;
import de.getsetsociety.gw2readr.v2.account.material.interfaces.IStoredMaterial;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.json.IEntityWrapper;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StoredMaterialJson implements IEntityWrapper<IStoredMaterial> {

    private final IStoredMaterial entity = EntityFactoryProvider.getAccountFactory().newStoredMaterial();

    @JsonProperty("id")
    public Integer getId() {
        return entity.getId();
    }

    @JsonProperty("category")
    public Integer getCategory() {
        return entity.getCategory();
    }

    @JsonProperty("binding")
    public Binding getBinding() {
        return entity.getBinding();
    }

    @JsonProperty("count")
    public Integer getCount() {
        return entity.getCount();
    }


    public void setId(Integer id) {
        entity.setId(id);
    }

    public void setCategory(Integer category) {
        entity.setCategory(category);
    }

    public void setBinding(Binding binding) {
        entity.setBinding(binding);
    }

    public void setCount(Integer count) {
        entity.setCount(count);
    }


}
