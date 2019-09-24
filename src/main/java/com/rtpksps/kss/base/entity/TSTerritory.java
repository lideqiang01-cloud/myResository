package com.rtpksps.kss.base.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TSTerritory implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String territorycode;

    private Integer territorylevel;

    private String territoryname;

    private String territoryPinyin;

    private String territorysort;

    private Double xWgs84;

    private Double yWgs84;

    private String territoryparentid;


}
