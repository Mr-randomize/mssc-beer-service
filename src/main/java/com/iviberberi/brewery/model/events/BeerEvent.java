package com.iviberberi.brewery.model.events;

import com.iviberberi.brewery.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -6244203433565325785L;

    private BeerDto beerDto;

}
