<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>ELEGANT CRAFTS EMPORIUM</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
	<style>
	.container {
    max-width: 960px;
}
	</style>
</head>

<body>
	<!-- Navigation Bar - Start -->

<div class="container py-3">
    <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
      <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
        <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"></use></svg>
        <span class="fs-4">ELEGANT CRAFTS EMPORIUM</span>
      </a>
	
      <ul class="nav nav-pills">
        <li class="nav-item"><a href="#" class="nav-link active" aria-current="page">Home</a></li>
        <li class="nav-item"><a href="#" class="nav-link">Features</a></li>
        <li class="nav-item"><a href="#" class="nav-link">Pricing</a></li>
        <li class="nav-item"><a href="#" class="nav-link">FAQs</a></li>
        <li class="nav-item"><a href="#" class="nav-link">About</a></li>
      </ul>
    </header>
    <div class="pricing-header p-3 pb-md-4 mx-auto text-center">
      <h1 class="display-4 fw-normal">Pricing</h1>
    </div>
    <main>
   

<!--     <h2 class="display-6 text-center mb-4">Compare plans</h2> -->

    <div class="table-responsive">
      <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Product</th>
                    <th>Size</th>
                     <th>Dimension</th>
                    <th>Weight</th>
                    <th>Price</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Product A</td>
                    <td>Small</td>
                    <td>18x20x25</td>
                    <td>0.5 kg</td>
                    <td>$10.00</td>
                    <td><button class="btn btn-primary">Add to Cart</button></td>
                </tr>
                <tr>
                    <td>Product B</td>
                    <td>Medium</td>
                    <td>18x20x25</td>
                    <td>1 kg</td>
                    <td>$20.00</td>
                    <td><button class="btn btn-primary">Add to Cart</button></td>
                </tr>
                <tr>
                    <td>Product C</td>
                    <td>Medium</td>
                    <td>18x20x25</td>
                    <td>1 kg</td>
                    <td>$20.00</td>
                    <td><button class="btn btn-primary">Add to Cart</button></td>
                </tr>
                <tr>
                    <td>Product D</td>
                    <td>Medium</td>
                    <td>18x20x25</td>
                    <td>1 kg</td>
                    <td>$20.00</td>
                    <td><button class="btn btn-primary">Add to Cart</button></td>
                </tr>
                <!-- Add more rows for other products -->
            </tbody>
        </table>
     
    </div>
  </main>
  </div>
	<!-- Navigation Bar -END -->
	<div class="b-example-divider"></div>
	<!-- Hero-Start -->
	
		<!-- Hero-End -->
	<!-- Album-Start -->
	<div class="album py-5 bg-light">
    <div class="container">
      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
      </div>
    </div>
  </div>
  
	<!-- Album-End -->
	 <script>
        function redirectToPreview() {
            window.location.href = '/CraftsEmporium/productPreview';
        }
    </script>
<!-- Footer -Start -->
<footer class="footer mt-auto py-3 bg-light">
  <div class="container">
    <span class="text-muted">Place sticky footer content here.</span>
  </div>
</footer>
<!-- Footer -End -->

	<!-- Bootstrap JavaScript and dependencies (optional) -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>
