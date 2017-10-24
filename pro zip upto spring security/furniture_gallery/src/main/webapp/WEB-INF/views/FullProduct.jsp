<!DOCTYPE html>
<html lang="en">
<head>
<title>Furniture Zone</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default rounded borders and increase the bottom margin */
.navbar {
	margin-bottom: 0px;
	border-radius: 0;
}

/* Remove the jumbotron's default bottom margin */
.jumbotron {
	margin-bottom: 0;
}

/* Add a gray background color and some padding to the footer */
footer {
	background-color: #f2f2f2;
	padding: 25px;
}

p.italic {
	font-style: italic;
}
</style>
</head>
<body>
<jsp:include page="CommonHeader.jsp"></jsp:include>
	<div class="container">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner">
				<div class="item active">
					<img src="images/mat.jpg/ " style="width: 100%; height: 350px;">
				</div>

				<div class="item">
					<img src="images/E.jpg/ " style="width: 100%; height: 350px;">
				</div>

				<div class="item">
					<img src="images/C.jpg/ " style="width: 100%; height: 350px;">
				</div>

				<div class="item">
					<img src="images/B.jpg/ " style="width: 100%; height: 350px;">
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">kurlon Queen Coir Mattress</div>
					<div class="panel-body">
						<img src="images/mattres.jpeg/ " class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">
						<div class="price">
							<div>
								&#8377;15,274 <span class="label-tags"><span
									class="label label-danger arrowed">15% off</span></span>
							</div>
							<span class="price-old"> &#8377;17,970</span>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">Solid Wood Tv Unit</div>
					<div class="panel-body">
						<img src="images/tv.jpeg/ " class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">
						<div class="price">
							<div>
								&#8377;13,499 <span class="label-tags"><span
									class="label label-danger arrowed">10% off</span></span>
							</div>
							<span class="price-old"> &#8377;14,999</span>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">Fashion Large Bean Bag</div>
					<div class="panel-body">
						<img src="images/bean.jpeg/ " class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">
						<div class="price">
							<div>
								&#8377;1,529 <span class="label-tags"><span
									class="label label-danger arrowed">56% off</span></span>
							</div>
							<span class="price-old"> &#8377;3,499</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<br>

	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">Wood King Bed</div>
					<div class="panel-body">
						<img src="images/king bed.jpeg/ " class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">
						<div class="price">
							<div>
								&#8377;25,500<span class="label-tags"><span
									class="label label-danger arrowed"> 24% off</span></span>
							</div>
							<span class="price-old"> &#8377;33,599</span>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">3 Seater sofa</div>
					<div class="panel-body">
						<img src="images/sofa.jpeg/ " class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">
						<div class="price">
							<div>
								&#8377;13,949<span class="label-tags"><span
									class="label label-danger arrowed"> 10% off</span></span>
							</div>
							<span class="price-old"> &#8377;15,499</span>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">Edge 4 Seater Dining Set</div>
					<div class="panel-body">
						<img src="images/din2.jpeg/ " class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">
						<div class="price">
							<div>
								&#8377;23,999<span class="label-tags"><span
									class="label label-danger arrowed"> 45% off</span></span>
							</div>
							<span class="price-old"> &#8377;44,200</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>
	<nav class="navbar navbar-inverse">
		<footer class="container-fluid text-center "
			style="background-color: black; height: 30px">
			<p style="color: white;">&copy;furnitureZone</p>
		</footer>
	</nav>
</body>
</html>
