insert into orders(id) values ('1');
insert into bill(id) values ('1');
insert into bill_ext(id, description) values ('1', 'extended');
insert into address(id, bill_id) values ('1', '1');
insert into order_item(id, order_id, address_id) values ('1', '1', '1');
