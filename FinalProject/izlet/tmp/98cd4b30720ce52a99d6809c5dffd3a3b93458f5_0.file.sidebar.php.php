<?php
/* Smarty version 3.1.33, created on 2019-04-02 18:40:12
  from 'C:\xampp\htdocs\izlet\sidebar.php' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.33',
  'unifunc' => 'content_5ca3906c5c9529_26298660',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '98cd4b30720ce52a99d6809c5dffd3a3b93458f5' => 
    array (
      0 => 'C:\\xampp\\htdocs\\izlet\\sidebar.php',
      1 => 1554221113,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_5ca3906c5c9529_26298660 (Smarty_Internal_Template $_smarty_tpl) {
?><div class="sidebar">
 <div class="main-buttons">
   <div id="profileBtn"><img src="images/placeholder.png" alt="profile-img" class="BtnImg"><a href=""><?php echo $_smarty_tpl->tpl_vars['currentUser']->value;?>
</a></div>
   <div id="dashboardBtn"><a href="dashboard.php">Dashboard</a></div>
   <div id="newPostBtn"><a href="#">Make a post</a></div>
 </div>
  <div class="logoutWrap"><a href="logout.php" id="logoutBtn">Logout</a></div>
</div>
<?php }
}
