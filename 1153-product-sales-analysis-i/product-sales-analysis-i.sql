select prod_table.product_name, s_table.year, s_table.price
from sales s_table
inner join product prod_table on prod_table.product_id = s_table.product_id