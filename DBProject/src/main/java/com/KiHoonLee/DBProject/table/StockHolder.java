package com.KiHoonLee.DBProject.table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StockHolder {
    private String stockStkCd;
    private String mStockHolder;
    private int stockNum;
    private float stake;
}