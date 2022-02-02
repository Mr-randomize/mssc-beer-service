package com.iviberberi.comon.events;

import com.iviberberi.msscbeerservice.web.model.BeerDto;
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
