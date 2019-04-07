<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Comments</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script>history.scrollRestoration = "manual"</script>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
{include file='header.php'}

<div class="container">
<h2>{$header}</h2>
<h4>{$location}</h4>
<img src='uploads/{$image}'/>
{section name=i loop=$postRows}
<div class="comments">
  <p>{$postRows[i].commentBody}</p>
</div>
  {/section}
</div>


{include file='sidebar.php'}

  </body>
</html>
