package jpabook.jpashop.repository;

import jpabook.jpashop.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class OrderSearch {

    public String memberName;
    public OrderStatus orderStatus;
}
