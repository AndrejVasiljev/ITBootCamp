<?php
/* Smarty version 3.1.33, created on 2019-04-02 19:37:04
  from 'C:\xampp\htdocs\izlet\views\dashboard.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.33',
  'unifunc' => 'content_5ca39dc0ed7117_47188547',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '7a5d3b8e41cf2b470a3465cdfbeb48aefb02f448' => 
    array (
      0 => 'C:\\xampp\\htdocs\\izlet\\views\\dashboard.tpl',
      1 => 1554226622,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
    'file:header.php' => 1,
    'file:sidebar.php' => 1,
  ),
),false)) {
function content_5ca39dc0ed7117_47188547 (Smarty_Internal_Template $_smarty_tpl) {
$_smarty_tpl->_checkPlugins(array(0=>array('file'=>'C:\\xampp\\htdocs\\izlet\\smarty\\libs\\plugins\\modifier.date_format.php','function'=>'smarty_modifier_date_format',),));
?>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Dashboard</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <?php echo '<script'; ?>
>history.scrollRestoration = "manual"<?php echo '</script'; ?>
>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/dashboard.css">
    <link rel="stylesheet" href="css/popup.css">
    <link rel="stylesheet" href="css/posts.css">
  </head>
  <body>
    <?php $_smarty_tpl->_subTemplateRender('file:header.php', $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

    <div class="container">
      <div id="bcground-PopUpComment" style="display:none">
      </div>
      <div class="popupComment" style="display:none">
          <div id="close"><i class="fas fa-times"></i></div>
          <div class="img-wrap"><img src="images/placeholder.png"></div>
          <form class="newcomment" action="comment.php" method="POST">
            <label>Ostavite komentar:</label>
            <textarea cols="10" rows="5" name="text"></textarea>
            <input type="submit" name="dodaj">
          </form>
       </div>

       <div id="bcground-PopUpNewPost" style="display:none">
         </div>
         <div class="popupPost" style="display:none">
         <div id="close2"><i class="fas fa-times"></i></div>
         <h1>New post</h1>
         <form class="newpost" action="dashboard.php" method="post" enctype="multipart/form-data" autocomplete="off">
           <input type="text" name="title" placeholder="Naziv">
           <input type="text" name="location" placeholder="Lokacija">
           <label class="custom-file-upload"><input type="file" name="image" id="image">Browse...</label>
           <select class="transport" name="transport">
             <option value="walk">Walk</option>
             <option value="car">Car</option>
             <option value="motorbike">Motorbike</option>
             <option value="bicycle">Bicycle</option>
             <option value="bus">Bus</option>
           </select>
           <textarea name="description" rows="5" cols="10" placeholder="Opis"></textarea>
           <input type="submit" name="postSubmit" value="Post">
         </form>
         </div>

        <div id="bcground-PopUpEdit" style="display:none">
         </div>
         <div class="popupEdit" style="display:none">
         <div id="close3"><i class="fas fa-times"></i></div>
         <h1>Edit post</h1>
         <form class="newpost" action="insertEdit.php" method="post" enctype="multipart/form-data" autocomplete="off">
           <input id="title" type="text" name="title" value="">
           <input id="location" type="text" name="location" value="">
           <div class="img-wrap">
             <img id="edit-img" src=NULL alt="thumbnail"/>
             <label class="custom-file-upload"><input type="file" name="image" id="editImage" value="">Change...</label>
           </div>
           <select id="transport" class="transport" name="transport">
             <option value="walk">Walk</option>
             <option value="car">Car</option>
             <option value="motorbike">Motorbike</option>
             <option value="bicycle">Bicycle</option>
             <option value="bus">Bus</option>
           </select>
           <input type="hidden" name="edit" id="edit" value="">
           <textarea id="description" name="description" rows="5" cols="10" value=""></textarea>
           <input type="submit" name="postSubmit" value="Post">
         </form>
         </div>

      <?php
$__section_i_0_loop = (is_array(@$_loop=$_smarty_tpl->tpl_vars['postRows']->value) ? count($_loop) : max(0, (int) $_loop));
$__section_i_0_total = $__section_i_0_loop;
$_smarty_tpl->tpl_vars['__smarty_section_i'] = new Smarty_Variable(array());
if ($__section_i_0_total !== 0) {
for ($__section_i_0_iteration = 1, $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] = 0; $__section_i_0_iteration <= $__section_i_0_total; $__section_i_0_iteration++, $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']++){
?>
      <div class="posts">
	       <div class="date">
            <h1><?php echo smarty_modifier_date_format($_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['postdate'],"%d");?>
</h1>
            <h3><?php echo mb_strtoupper(smarty_modifier_date_format($_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['postdate'],"%b"), 'UTF-8');?>
</h3>
	       </div>
	       <div class="photo">
		         <img src="uploads/<?php echo $_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['postimage'];?>
" alt="image">
	       </div>
	       <div class="text">
		         <div class="postheader">
			            <div class="headertxt">
				             <h2><?php echo $_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['postheader'];?>
</h2>
                     <div class="location">
                       <h4><?php echo $_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['postlocation'];?>
</h4>
                         <i class="far fa-map" onclick="GetMap()"></i>
                         <?php if ($_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['userID'] == $_smarty_tpl->tpl_vars['userID']->value) {?>
                           <a href="javascript:void(0)" onclick="myFunction('edit<?php echo $_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['postID'];?>
')"><i class="fas fa-ellipsis-v"></i></a>
                           <div id="edit<?php echo $_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['postID'];?>
" style="display:none" >
                             <i class="fas fa-edit"  onclick="popupEdit(<?php echo $_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['postID'];?>
)"></i>
                             <a href="delete.php?idPost=<?php echo $_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['postID'];?>
"><i class="fas fa-trash-alt"></i></a>
                           </div>
                         <?php }?>
                     </div>
			            </div>
			            <div class="headerphoto">
                    <?php if ($_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['transport'] == 'car') {?>
				             <i class="fas fa-car fa-3x"></i>
                    <?php } elseif ($_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['transport'] == 'bus') {?>
                     <i class="fas fa-bus"></i>
                    <?php } elseif ($_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['transport'] == 'walk') {?>
                     <i class="fas fa-walking"></i>
                    <?php } elseif ($_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['transport'] == 'motorbike') {?>
                     <i class="fas fa-motorcycle"></i>
                    <?php } elseif ($_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['transport'] == 'bicycle') {?>
                     <i class="fas fa-bicycle"></i>
                    <?php }?>
		              </div>
		        </div>
		     <div class="textbody">
            <p><?php echo $_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['postbody'];?>
</p>
		     </div>

		     <div class="buttons">
			        <div class="btnleft">
				         <div id="userBtn"><img src="images/placeholder.png" alt="profile-img" class="BtnImg"><a href=""><?php echo $_smarty_tpl->tpl_vars['postRows']->value[(isset($_smarty_tpl->tpl_vars['__smarty_section_i']->value['index']) ? $_smarty_tpl->tpl_vars['__smarty_section_i']->value['index'] : null)]['username'];?>
</a></div>
				         <button id="commentBtn" onclick="popupComment()">Comment</button>
			        </div>
			        <div class="btnright">
				         <button class="vote" onmouseover="favorite()"><i class="fas fa-star fa-2x"></i></button>
			        </div>
		     </div>
		  </div>
    </div>
    <?php
}
}
?>
    </div>

    <?php $_smarty_tpl->_subTemplateRender('file:sidebar.php', $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>
    <?php echo '<script'; ?>
>

    //Ovde podešavamo da ne učitava ceo sadržaj odjednom, već učitava dodatne postove kako korisnik skroluje
/*    function yHandler() {
      var container = document.querySelector('.container');
      //Visina sadržaja stranice:
      var contentHeight = container.offsetHeight;
      //Vertikalni položaj scroll-a (samo do koje linije je skrolovao korisnik, ne i dno ekrana):
      var yOffset = window.pageYOffset;
      //Da bismo dobili tačan info o tome šta korisnik "vidi", na prethodnu varijablu dodajemo visinu prozora:
      var y = yOffset + window.innerHeight;
      if(y >= contentHeight) {
        //Ajax poziv da se učita dodatni sadržaj:
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
              //Ovo za sad ne radi, fali par linija koda
              xhttp.open("GET", "dashboard.php", true);
              var return_data = xmlhttp.responseText;
              document.querySelector(".container").innerHTML += return_data;
            }
            xhttp.send();
      }
    }
  };
    window.onscroll = yHandler(); */

    //Toggle na tri tačkice, koji prikazuje dugmad za edit i delete
    function myFunction(id) {
      console.log(document.querySelector('#'+id));
      if (document.querySelector('#'+id).style.display == "none") {
        document.querySelector('#'+id).style.display = "flex";
      } else {
        document.querySelector('#'+id).style.display = "none";
      }
    }

    //Pop-up komentar
    function popupComment(id){
      document.querySelector('#bcground-PopUpComment').style.display='flex';
      document.querySelector('.popupComment').style.display='grid';
      document.getElementById('id').value = id;
    }
    document.getElementById("close").addEventListener('click', function(){
      document.querySelector('#bcground-PopUpComment').style.display='none';
      document.querySelector('.popupComment').style.display='none';
    });
      document.getElementById("bcground-PopUpComment").addEventListener('click', function(){
      document.querySelector('#bcground-PopUpComment').style.display='none';
      document.querySelector('.popupComment').style.display='none';
    });

//Pop-up za novi post

    document.getElementById("newPostBtn").addEventListener('click', function(){
      document.querySelector('#bcground-PopUpNewPost').style.display='flex';
      document.querySelector('.popupPost').style.display='grid';
    })
    document.getElementById("close2").addEventListener('click', function(){
      document.querySelector('#bcground-PopUpNewPost').style.display='none';
      document.querySelector('.popupPost').style.display='none';
    })
    document.getElementById("bcground-PopUpNewPost").addEventListener('click', function(){
      document.querySelector('#bcground-PopUpNewPost').style.display='none';
      document.querySelector('.popupPost').style.display='none';
    })

//Edit post-a
    function popupEdit(id){
      //Snima id posta u skriveno polje u formi za edit
      document.getElementById('edit').value = id;
      //Ajax poziv za listanje sadržaja forme iz fajla edit.php
      var ajax = new XMLHttpRequest();
      ajax.onreadystatechange = function() {
          if (this.readyState == 4 && this.status == 200) {
              console.log(ajax.responseText);
              var data = JSON.parse(ajax.responseText);
              renderHTML(data);
            }
            console.log(this.status);
            console.log(this.readyState);

      }
      ajax.open('GET', 'edit.php?edit='+id);
      ajax.send();

      function renderHTML(data){
        for(i = 0; i < data.length; i++) {
          document.querySelector('#title').value = data[i].postheader;
          document.querySelector('#location').value = data[i].postlocation;
          document.querySelector('#edit-img').src = "uploads/"+ data[i].postimage;
          document.querySelector('#transport').option = data[i].transport;
          document.querySelector('#description').value = data[i].postbody;
            }
          }

      document.querySelector('#bcground-PopUpEdit').style.display='flex';
      document.querySelector('.popupEdit').style.display='grid';
    }
    document.getElementById("close3").addEventListener('click', function(){
      document.querySelector('#bcground-PopUpEdit').style.display='none';
      document.querySelector('.popupEdit').style.display='none';
    })
      document.getElementById("bcground-PopUpEdit").addEventListener('click', function(){
      document.querySelector('#bcground-PopUpEdit').style.display='none';
      document.querySelector('.popupEdit').style.display='none';
    })

//Sprečava unos u bazu pri refresh-u stranice
    if ( window.history.replaceState ) {
       window.history.replaceState( null, null, window.location.href );
     }
    <?php echo '</script'; ?>
>
  </body>
</html>
<?php }
}
