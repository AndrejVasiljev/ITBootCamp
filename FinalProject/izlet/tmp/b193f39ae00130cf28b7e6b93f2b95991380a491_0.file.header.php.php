<?php
/* Smarty version 3.1.33, created on 2019-04-02 19:03:29
  from 'C:\xampp\htdocs\izlet\header.php' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.33',
  'unifunc' => 'content_5ca395e15c1453_38308518',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    'b193f39ae00130cf28b7e6b93f2b95991380a491' => 
    array (
      0 => 'C:\\xampp\\htdocs\\izlet\\header.php',
      1 => 1554224599,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_5ca395e15c1453_38308518 (Smarty_Internal_Template $_smarty_tpl) {
?><!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
    <style>
        header {
            position: sticky;
            top: 0;
            left: 0;
            grid-row: 1/2;
            grid-column: 1/-1;
            z-index: 1;
        }

        .line {
            background-color: #000;
            height: 20px;
        }

        .navbar {
            padding-left: 10%;
            display: flex;
            align-items: center;
            width: 10%;
        }

        #logo {
            background-color: #000;
            padding: 15px 10px;
            border-radius: 0 0 50px 50px;
        }
    </style>

</head>
<body>

<header>
   <div class="line"></div>
   <div class="navbar">
    <div id="logo">
        <img src="images/izlet_logo.svg" alt="logo" height="70">
    </div>
    </div>
</header>

</body>
</html>
<?php }
}
