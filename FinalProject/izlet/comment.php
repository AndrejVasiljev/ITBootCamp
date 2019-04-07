<?php
include("config/config.php");
$conn = new mysqli(SERVER, USER, PASS, DB);
				// Check connection
				if ($conn->connect_error) {
    			die("Connection failed: " . $conn->connect_error);
} ;

if(!empty($_POST["dodaj"])){
	$kom = $_POST["text"];
					$sqlInsert= "INSERT INTO comments(commentBody) VALUES ('".$kom."')";
					$insert = $conn->query($sqlInsert);
					if($insert === true){
						echo "Komentar je dodat";
					} else {
						echo "Imate gresku" .$conn->error;
					}
				}

?>
