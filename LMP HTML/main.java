<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Main Page</title>
    <script>
        function loadHTML(file, elementId) {
            fetch(file)
                .then(response => response.text())
                .then(data => {
                    document.getElementById(elementId).innerHTML = data;
                })
                .catch(error => console.error('Error loading HTML:', error));
        }
        
        // Load each file into the designated element
        window.onload = () => {
            loadHTML("header.html", "header");
            loadHTML("footer.html", "footer");
        };
    </script>
</head>
<body>

    <!-- Header Section -->
    <div id="header"></div>

    <!-- Main Content -->
    <main>
        <h1>Welcome to the Main Page</h1>
        <p>This is the main content of your website.</p>
    </main>

    <!-- Footer Section -->
    <div id="footer"></div>

</body>
</html>
