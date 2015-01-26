package de.getsetsociety.gw2readr.v2.item.items.entities;

import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBag;

public class Bag extends Item implements IBag {

    private static final long serialVersionUID = -2023834635748023418L;
    private boolean noSellOrSort;
    private Integer size;

    /*
     * (non-Javadoc)
     * 
     * @see de.getsetsociety.gw2readr.entities.IBag#isNoSellOrSort()
     */
    @Override
    public boolean isNoSellOrSort() {
        return noSellOrSort;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.getsetsociety.gw2readr.entities.IBag#setNoSellOrSort(boolean)
     */
    @Override
    public void setNoSellOrSort(boolean noSellOrSort) {
        this.noSellOrSort = noSellOrSort;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.getsetsociety.gw2readr.entities.IBag#getSize()
     */
    @Override
    public Integer getSize() {
        return size;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.getsetsociety.gw2readr.entities.IBag#setSize(java.lang.Integer)
     */
    @Override
    public void setSize(Integer size) {
        this.size = size;
    }
}
