package com.sctp.harbourbookingapi.services;

import java.util.List;

import com.sctp.harbourbookingapi.entity.ShippingRoute;

// Edited by wei kang
public interface ShippingRouteService {
    ShippingRoute saveShippingRoute(ShippingRoute shippingRoute);

    ShippingRoute getShippingRoute(int id);

    List<ShippingRoute> getAllShippingRoutes();

    ShippingRoute updateShippingRoute(int id, ShippingRoute shippingRoute);

    void deleteShippingRoute(int id);
}
