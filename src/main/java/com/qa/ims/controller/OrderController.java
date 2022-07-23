package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderlineDAO;
import com.qa.ims.persistence.dao.OrdersDAO;
import com.qa.ims.persistence.domain.Orders;
import com.qa.ims.utils.Utils;

public class OrderController implements OrdersCrudController<Orders> {

	public static final Logger LOGGER = LogManager.getLogger();

	private OrdersDAO ordersDAO;
	private OrderlineDAO orderlineDAO;
	private Utils utils;

	public OrderController(OrdersDAO ordersDAO, Utils utils) {
		super();
		this.ordersDAO = ordersDAO;
		this.utils = utils;
	}

	@Override
	public List<Orders> readAll() { // view all orders in the system
		List<Orders> orders = ordersDAO.readAll();
		for (Orders order1 : orders) {
			LOGGER.info(order1);
		}
		return orders;
	}

	@Override
	public Orders create() { // create an order in the system
		LOGGER.info("Please enter a customer ID");
		Long fk_id = utils.getLong();
		LOGGER.info("Please enter an item ID to add to the order");
		Long fk_itemID = utils.getLong();
		LOGGER.info("Please enter the quantity of this item");
		Long quantity = utils.getLong();
		Orders orders = ordersDAO.create(new Orders(fk_id, fk_itemID, quantity));
		LOGGER.info("Order created");
		return orders;
//
	}

	@Override
	public Orders update() { // change the item ID from an order (how to reflect this is orderline???)
		LOGGER.info("Please enter the id of the order you would like to update");
		Long orderID = utils.getLong();
		LOGGER.info("Please enter the customer ID");
		Long fk_id = utils.getLong();
		LOGGER.info("Please enter item id of the product being ordered");
		Long fk_itemID = utils.getLong();
		LOGGER.info("Please enter the number of items being ordered");
		Long quantity = utils.getLong();
		Orders orders = ordersDAO.update(new Orders(orderID, fk_id, fk_itemID, quantity));
		LOGGER.info("Order Updated");
		return orders;
	}

	@Override
	public Orders read_Cost() {
		LOGGER.info("Please enter the id of the order you would like to see the cost of");
		Long orderID = utils.getLong();

		return ordersDAO.read_Cost(orderID);

	}

//	public void addItem() {
//		LOGGER.info("Please enter the order ID");
//		Long fk_orderID = utils.getLong();
//		LOGGER.info("Please enter the ID of the item you want to add to the order");
//		Long fk_itemID = utils.getLong();
//		LOGGER.info("Please enter the number of units");
//		Long quantity = utils.getLong();
//		LOGGER.info("Please enter the price of the item");
//		Double price = utils.getDouble();
//		Orderline orderline = orderlineDAO.update(new Orderline(fk_orderID, fk_itemID, quantity, price));
//
//	}

	@Override
	public int delete() { // delete an order in the system
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long orderID = utils.getLong();
		return ordersDAO.delete(orderID);
	}

}
