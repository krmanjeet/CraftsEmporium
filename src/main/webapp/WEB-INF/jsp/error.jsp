<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Error Page</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="/css/error.css" rel="stylesheet">
    <style>
     .container-bg {
            width: 100%;
            min-height:600px;
            margin: 0 auto; /* Center the container horizontally */
            padding: 20px;
         	background-color:teal;
           
            color: white; /* Set text color to contrast with the background */
        }
    </style>
</head>

<body style="background-color: black;">
    <div class="container ">
        <div class="container-bg" style="margin-top: 50px;">
        <div class="row">
            <div class="col-md-8 offset-md-2 text-center">
                <h1 class="mt-5">OOPS! YANHA PE TO KUCH HAIE NOU.</h1>
                <p class="lead">Something went wrong. We apologize for the inconvenience. Please try again later.</p>
                <p>${errorMessage}</p>
            </div>
        </div>
        </div>
    </div>

    <!-- Bootstrap JavaScript and dependencies -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>
