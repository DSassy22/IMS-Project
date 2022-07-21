--INSERT INTO `customer` (`first_name`, `surname`) VALUES ('jordan', 'harrison');

--INSERT INTO `Item` (`itemName`, `price`) VALUES ('calculator', '9.99');

INSERT INTO `Orders` (`fk_id`, `fk_itemID`, `quantity`) VALUES ('1', '1', "25');

INSERT INTO `Orderline` (`fk_orderID`, `fk_itemID`, `quantity`) VALUES ('1', '1', '20');