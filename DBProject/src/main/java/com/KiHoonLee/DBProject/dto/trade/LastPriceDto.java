package com.KiHoonLee.DBProject.dto.trade;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class LastPriceDto {
    private Date day;
    private int sLast;
}
