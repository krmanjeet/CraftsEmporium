<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>CureInSync</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>

	<!-- Navigation Bar -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">CureInSync</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav ml-auto">
					<!-- Add additional navigation items if needed -->
				</ul>
			</div>
		</div>
	</nav>

	<!-- Main Content -->
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<h1>Inline User Data Form</h1>
				<form action="/save-user" method="post"
					class="row g-3 align-items-center">
					<!-- Add your server endpoint in the 'action' attribute -->

					<!-- User Name -->
					<div class="col-auto">
						<label for="userName" class="visually-hidden">User Name</label> <input
							type="text" class="form-control" id="userName" name="userName"
							placeholder="User Name" required>
					</div>

					<!-- Email -->
					<div class="col-auto">
						<label for="email" class="visually-hidden">Email</label> <input
							type="email" class="form-control" id="email" name="email"
							placeholder="Email" required>
					</div>

					<!-- Submit Button -->
					<div class="col-auto">
						<button type="submit" class="btn btn-primary">Save User</button>
					</div>
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<h1 class="text-center mb-4">CureInSync - AI Assistant Search</h1>
				<h5 class="text-center mb-4">(Select Your Symptoms...)</h5>
				<div class="input-group mb-3">
					<input type="text" class="form-control" placeholder="Search..."
						aria-label="Search" aria-describedby="search-button">
					<button class="btn btn-primary" type="button" id="search-button">Search</button>
				</div>
				<!-- Sample Search Results Section -->
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Search Result Title</h5>
						<p class="card-text">Sample description of the search result.</p>
					</div>
				</div>
				<!-- Add more search results as needed -->
			</div>
		</div>
	</div>

	<!-- Bootstrap JavaScript and dependencies (optional) -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>
