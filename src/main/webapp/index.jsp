<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<script type="text/javascript">
	function validate() {
		if (document.addItem.store.value == "") {
			alert("Please prvoide the store for the Item");
			document.addItem.Store.focus();
			return false;
		}

		if (document.addItem.item.value == "") {
			alert("Please provide the name of the item");
			document.addItem.Game.focus();
			return false;
		}
		//return (true);
	}
</script>
</head>
<body>
	<form action="addItemServlet" name="addItem" method="post"
		onsubmit="return(validate())">
		<table border="1">
			<tr>
				<td align="right">Store</td>
				<td><input type="text" name="store"></td>
			</tr>

			<tr>
				<td align="right">Item</td>
				<td><input type="text" name="item"></td>
			</tr>

			<tr>
				<td align="right"></td>
				<td><input type="submit" value="Add Item"></td>
			</tr>
		</table>
	</form>
	<br />
	<a href="viewAllItemsServlet">View the complete list</a>
	<a href="viewAllListsServlet">View all shopping lists</a>
	<br />
	<a href="addItemsForListServlet">Create a new list</a>
</body>
</html>