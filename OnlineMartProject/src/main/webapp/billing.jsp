<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="mart.model.*" %>
    <%@ page import="java.util.*" %>
<!doctype html>
<html>
<head>
<meta charset='utf-8'>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<title>Snippet - BBBootstrap</title>
<link
	href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'
	rel='stylesheet'>
<link
	href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'
	rel='stylesheet'>
<script type='text/javascript'
	src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
<style>
::-webkit-scrollbar {
	width: 8px;
}
/* Track */
::-webkit-scrollbar-track {
	background: #f1f1f1;
}

/* Handle */
::-webkit-scrollbar-thumb {
	background: #888;
}

/* Handle on hover */
::-webkit-scrollbar-thumb:hover {
	background: #555;
}

body {
	min-height: 100vh;
	display: flex;
	align-items: center;
	justify-content: center;
	background-color: rgb(0, 0, 34);
	font-size: 0.8rem;
}

.card {
	max-width: 1000px;
	margin: 2vh;
}

.card-top {
	padding: 0.7rem 5rem;
}

.card-top a {
	float: left;
	margin-top: 0.7rem;
}

#logo {
	font-family: 'Dancing Script';
	font-weight: bold;
	font-size: 1.6rem;
}

.card-body {
	padding: 0 5rem 5rem 5rem;
	background-image: url("https://i.imgur.com/4bg1e6u.jpg");
	background-size: cover;
	background-repeat: no-repeat;
}

@media ( max-width :768px) {
	.card-body {
		padding: 0 1rem 1rem 1rem;
		background-image:
			url("https://i.imgur.com/4bg1e6u.jpg");
		background-size: cover;
		background-repeat: no-repeat;
	}
	.card-top {
		padding: 0.7rem 1rem;
	}
}

.row {
	margin: 0;
}

.upper {
	padding: 1rem 0;
	justify-content: space-evenly;
}

#three {
	border-radius: 1rem;
	width: 22px;
	height: 22px;
	margin-right: 3px;
	border: 1px solid blue;
	text-align: center;
	display: inline-block;
}

#payment {
	margin: 0;
	color: blue;
}

.icons {
	margin-left: auto;
}

form span {
	color: rgb(179, 179, 179);
}

form {
	padding: 2vh 0;
}

input {
	border: 1px solid rgba(0, 0, 0, 0.137);
	padding: 1vh;
	margin-bottom: 4vh;
	outline: none;
	width: 100%;
	background-color: rgb(247, 247, 247);
}

input:focus::-webkit-input-placeholder {
	color: transparent;
}

.header {
	font-size: 1.5rem;
}

.left {
	background-color: #ffffff;
	padding: 2vh;
}

.left img {
	width: 2rem;
}

.left .col-4 {
	padding-left: 0;
}

.right .item {
	padding: 0.3rem 0;
}

.right {
	background-color: #ffffff;
	padding: 2vh;
}

.col-8 {
	padding: 0 1vh;
}

.lower {
	line-height: 2;
}

.btn {
	background-color: rgb(23, 4, 189);
	border-color: rgb(23, 4, 189);
	color: white;
	width: 100%;
	font-size: 0.7rem;
	margin: 4vh 0 1.5vh 0;
	padding: 1.5vh;
	border-radius: 0;
}

.btn:focus {
	box-shadow: none;
	outline: none;
	box-shadow: none;
	color: white;
	-webkit-box-shadow: none;
	-webkit-user-select: none;
	transition: none;
}

.btn:hover {
	color: white;
}

a {
	color: black;
}

a:hover {
	color: black;
	text-decoration: none;
}

input[type=checkbox] {
	width: unset;
	margin-bottom: unset;
}

#cvv {
	background-image: linear-gradient(to left, rgba(255, 255, 255, 0.575),
		rgba(255, 255, 255, 0.541)),
		url("https://img.icons8.com/material-outlined/24/000000/help.png");
	background-repeat: no-repeat;
	background-position-x: 95%;
	background-position-y: center;
}

#cvv:hover {
	
}
</style>
</head>
<body className='snippet-body'>
	<div class="card">
		<div class="card-top border-bottom text-center">
			<a href="#"> Back to shop</a> <span id="logo">Billing Page</span>
		</div>
		<div class="card-body">
			<div class="row upper">
				<span><i class="fa fa-check-circle-o"></i> Shopping bag</span> <span><i
					class="fa fa-check-circle-o"></i> Order details</span> <span id="payment"><span
					id="three">3</span>Payment</span>
			</div>
			<div class="row">
				<div class="col-md-7">
					<div class="left border">
						<div class="row">
							<span class="header">Payment</span>
							<div class="icons">
								<img src="https://img.icons8.com/color/48/000000/visa.png" /> <img
									src="https://img.icons8.com/color/48/000000/mastercard-logo.png" />
								<img src="https://img.icons8.com/color/48/000000/maestro.png" />
							</div>
						</div>
						<form>
							<span>Cardholder's name:</span> <input
								placeholder="Linda Williams"> <span>Card Number:</span>
							<input placeholder="0125 6780 4567 9909">
							<div class="row">
								<div class="col-4">
									<span>Expiry date:</span> <input placeholder="YY/MM">
								</div>
								<div class="col-4">
									<span>CVV:</span> <input id="cvv">
								</div>
							</div>
							<input type="checkbox" id="save_card" class="align-left">
							<label for="save_card">Save card details to wallet</label>
						</form>
					</div>
					
					<button class="btn " style="background-color: #86DC3D;color:black;">PAYTEM</button>
					<button class="btn" style="background-color: #86DC3D;color:black;">Other UPI Options</button>
				</div>
				<div class="col-md-5">
					<div class="right border">
						<div class="header">
						<form action="BillingController" method="post">
						<input type="submit" value="Order Summary"class="btn " style="background-color: #86DC3D;color:black;">
						</div></form>
						
						<%List<productModel> listlog=null; %>
						<%listlog=(List<productModel>)session.getAttribute("cartitem"); %>
						<% int subtotal=0; %>
						<%if(listlog!=null){ %>
						<% for(int k=0;k<listlog.size();k++){%>
						<% subtotal +=listlog.get(k).getCost()*listlog.get(k).getQut(); %>
						<p>item no. <%= k+1  %></p>
						<div class="row item">
							<div class="col-4 align-self-center">
								<img class="img-fluid" src="cartItemImage.jpg">
							</div>
							<div class="col-8">
								<div class="row">
									<b>Rs. <%= listlog.get(k).getCost() %></b>
								</div>
								<div class="row text-muted">
								Name : <%= listlog.get(k).getPname() %>
								</div>
								<div class="row">Qty:<%= listlog.get(k).getQut() %></div>
							</div>
						</div>
						<%} %>
						<%} %>
						<hr>
						<div class="row lower">
							<div class="col text-left">Subtotal</div>
							<div class="col text-right"><b><%= subtotal %></b></div>
						</div>
						<div class="row lower">
							<div class="col text-left">Delivery</div>
							<div class="col text-right">Free</div>
						</div>
						<div class="row lower">
							<div class="col text-left">
								<b>Total to pay</b>
							</div>
							<div class="col text-right">
								<b><%= subtotal %></b>
							</div>
						</div>
						<div class="row lower">
							<div class="col text-left">
								<a href="#"><u>Add promo code</u></a>
							</div>
						</div>
						<button class="btn">Place order</button>
						<p class="text-muted text-center">Complimentary Shipping &
							Returns</p>
					</div>
				</div>
			</div>
		</div>

		<div></div>
	</div>
	<script type='text/javascript'
		src='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js'></script>
	<script type='text/javascript' src='#'></script>
	<script type='text/javascript' src='#'></script>
	<script type='text/javascript'>#</script>
	<script type='text/javascript'>var myLink = document.querySelector('a[href="#"]');
                                myLink.addEventListener('click', function(e) {
                                  e.preventDefault();
                                });</script>
  <body>  
<div>

</div>
</body>
</html>