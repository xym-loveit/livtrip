package com.livtrip.web.mapper;

import com.livtrip.web.domain.Product;
import com.livtrip.web.domain.ProductCriteria;
import com.livtrip.web.model.dto.HotelProductDTO;
import com.livtrip.web.model.query.HotelProductQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper extends BaseMapper<Product, ProductCriteria, Integer> {

    List<HotelProductDTO>  queryHotelProduct();

    HotelProductDTO getHotelProductById(@Param("productId") Integer productId);

    List<HotelProductDTO> queryProductByHotelIds(@Param("hotelIds") List<Integer> hotelIds);

    List<HotelProductDTO> queryHotelProductByReq(HotelProductQuery hotelProductQuery);
}