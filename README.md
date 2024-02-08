# Task 1
Create a class to describe the client.
Place fields in the class to describe the client (registration date, name, age and other fields at your discretion).
The customer class must contain a collection field with the orders of this customer - this is a kind of basket of customer orders.
The order class must contain fields to describe the order (price, description and other fields are possible).
Create several clients.
Create several orders for each client and place them in the collection field for orders.
Create a collection of type Mar and fill it with pairs “client passport number” -> “client class object”.
Passport numbers can be stored as constants in an interface created for this purpose.
Loop through the collection and display:
- all key-value pairs, using Map.Entry<K, V> entry : map.entrySet()
- all key-value pairs using an iterator
- all keys using map.keySet()
- all values using map.values()
