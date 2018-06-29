create table Discounts
(
	eid INTEGER not null
		primary key
	autoincrement
	unique,
	category_id INT,
	name VARCHAR,
	price DOUBLE,
	quantity INT,
	unique_id BIGINT,
	id VARCHAR,
	update_timestamp TIMESTAMP default CURRENT_TIMESTAMP not null
)
;

create unique index Discounts_eid_uindex
	on Discounts (eid)
;

create table Eorder
(
	eid INTEGER not null
		primary key
	autoincrement
	unique,
	image_hash VARCHAR,
	name VARCHAR,
	price DOUBLE,
	quantity FLOAT,
	marks VARCHAR,
	unique_id BIGINT,
	restaurant_name VARCHAR,
	restaurant_image_hash VARCHAR,
	restaurant_id INT,
	restaurant_type TINYINT,
	restaurant_valid TINYINT,
	total_amount DOUBLE not null,
	total_quantity INT,
	rated_point FLOAT,
	operation_rate FLOAT,
	is_brand TINYINT,
	is_deletable TINYINT,
	is_from_openapi TINYINT,
	is_new_pay TINYINT,
	id VARCHAR,
	courier_phone VARCHAR,
	created_timestamp BIGINT,
	packing_quantity DOUBLE,
	packing_total_price DOUBLE,
	deliver_price DOUBLE,
	update_time TIMESTAMP default CURRENT_TIMESTAMP not null
)
;

create unique index Eorder_eid_uindex
	on Eorder (eid)
;

