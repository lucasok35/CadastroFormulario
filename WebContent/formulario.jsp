<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form	action="ServFormulario" method="post">
					<input type="radio" name="options"  id="option1" autocomplete="off" checked>Física
					<input type="radio" name="options" id="option2" autocomplete="off" checked>Jurídica <br>
					
					CNPJ/CPF: <input type="text" name="CNPJ/CPF" /><br />
					Nome:	<input	type="text" name="nome"	/><br	/>
					Data Nasc.:	<input	type="text" name="datanascimento"	/><br	/>
					Endereço:	<input	type="text" name="endereco"	/><br	/>
					Complemento:	<input	type="text" name="complemento"	/><br	/>
					Cidade:	<input	type="text" name="cidade"	/><br	/>
					Estado:	<select	classe="form-control" id="estado"	>
					<option>AM</option>
					<option>BA</option>
					<option>CE</option>
					<option>ES</option>
					</select>
					CEP:<input type="text" name="cep" /><br>
					E-mail:	<input	type="text" name="email"	/><br>
					<font  color="red"> Não indique e-mail que possua bloqueio para mensagens automáticas (anti-SPAM)</font><br>
					<!--  >h5 style="color:red;">Não</h5>!-->
					Endereço:	<input	type="text" name="endereco"	/><br	/>
					Data	Nascimento:	<input	type="text" name="dataNascimento"	/><br	/>
					<input	type="submit" value="Salvar"	/>
</form>


</body>
</html>