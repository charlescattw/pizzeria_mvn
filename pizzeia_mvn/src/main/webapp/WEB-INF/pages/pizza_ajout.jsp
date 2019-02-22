<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>:lo;lo;lo:lo;o</title>
</head>
<body>

	<div>
		<form action="PizzaAjoutServlet" method="POST">
			<p>
				<label>Numero</label> <input type="text" id="numero" name="numero" />
			</p>

			<p>
				<label>Description</label> <input type="text" id="description"
					name="description" />
			</p>

			<p>
				<label>Libelle</label> <input type="text" id="libelle"
					name="libelle" />
			</p>

			<p>
				<label>Photo</label> <input type="text" id="photo" name="photo" />
			</p>

			<p>
				<label>ref</label> <input type="text" id="reference"
					name="reference" />
			</p>

			<p>
				<label>prix</label> <input type="text" id="prix" name="prix" />
			</p>
			<p>
				<input type="submit" value="Envoyer" /> <input type="reset"
					value="Anuler" />
			</p>
		</form>
	</div>
</body>
</html>