<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="utf-8">
  <title>tabs demo</title>
  

<script src="jquery-2.1.1.js"></script> 
<script type="text/javascript" src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css">
<link href="jquery-ui-1.10.4/jquery-ui-1.10.4/css/ui-lightness/jquery-ui-1.10.4.css" rel="stylesheet" />
<link href="~/Content/Style.css" rel="stylesheet" />

 
  
  <script>
  $(function() {
    $( "#tabs" ).tabs();
  });
  </script>
  
 
   
  <script src="myscripts.js"></script>
	
  
  
  
  <style>
  
  #grad1 {
    background: -webkit-linear-gradient(right,#91B5FF,white); /* For Safari 5.1 to 6.0 */
    background: -o-linear-gradient(right,#91B5FF,white); /* For Opera 11.1 to 12.0 */
    background: -moz-linear-gradient(right,#91B5FF,white); /* For Firefox 3.6 to 15 */
    background: linear-gradient(right, #91B5FF,white); /* Standard syntax (must be last) */
}

  #grad2 {
    background: -webkit-linear-gradient(right, white, grey); /* For Safari 5.1 to 6.0 */
    background: -o-linear-gradient(right, white, grey); /* For Opera 11.1 to 12.0 */
    background: -moz-linear-gradient(right, white, grey); /* For Firefox 3.6 to 15 */
    background: linear-gradient(right, white, grey); /* Standard syntax (must be last) */
}

#grad3 {
    background: -webkit-linear-gradient(right, #66FF66, #990000); /* For Safari 5.1 to 6.0 */
    background: -o-linear-gradient(right, #66FF66, #990000); /* For Opera 11.1 to 12.0 */
    background: -moz-linear-gradient(right, #66FF66, #990000); /* For Firefox 3.6 to 15 */
    background: linear-gradient(right, #66FF66, #990000); /* Standard syntax (must be last) */
}

#grad4 {
    background: -webkit-linear-gradient(right, #91B5FF, #E4EDFF); /* For Safari 5.1 to 6.0 */
    background: -o-linear-gradient(right, #91B5FF, #E4EDFF); /* For Opera 11.1 to 12.0 */
    background: -moz-linear-gradient(right, #91B5FF, #E4EDFF); /* For Firefox 3.6 to 15 */
    background: linear-gradient(right, #91B5FF, #E4EDFF); /* Standard syntax (must be last) */
}
  
 </style> 
</head>

<body>
<div id="wrapper2" style="position:fixed;top:0px;width:100%;height:20%">
<div id="grad2" style="float:left;width:50.0%;height:30px"></div>
<div id="grad1"style="float:right;width:50.0%;height:30px"></div>

</div>

<div id="wrapper" style="position:fixed;top:30px;width:100%;height:145%">
 <div id="sub1" style="float:left" >
<div id="tabs" style="width:182%;height:880px">
<ul>
   <li><a href="#option1"><span>Case Logger</span></a></li>
   <li><a href="#option2"><span>Case retriever</span></a></li>
   <li><a href="#option3"><span>Extra</span></a></li>
</ul>  

<div id="option1" >
	<div>
	<table style="border:1">
	<tr>
	<td>Please Enter all the details</td>
	</tr>
	<tr><td></td></tr>
	<tr><td></td></tr>
	<tr><td></td></tr>
	<tr><td>Incident Number</td><td><input type="text" id="incNum"></td></tr>
	<tr>
		<td>Category</td>
		<td><select id="catg"  style="width:130px;">
		<option value="Select" selected="selected">Select</option>
		<option value="3A9">3A9</option>
		<option value="Packout/ASN 3b2">Packout/ASN 3b2</option>
		<option value="No IT Action">No IT Action</option>
		<option value="Autotest">Autotest</option>
		<option value="RTV">RTV</option>
		<option value="Delivery Creation to 3B18">Delivery Creation to 3B18</option>
		<option value="3B2SC and 3B3">3B2SC and 3B3</option>
		<option value="Generic">Generic</option>
		<option value="4B2">4B2</option>
		<option value="Invoice">Invoice</option>
		<option value="Un-Dispatch">Un-Dispatch</option>
		<option value="3A4">3A4</option></select>
		</td>
		<td></td><td>Urgency</td>
		<td><select id="priority" >
         <option value="P4" selected="selected">P4</option> 
		 <option value="P3">P3</option>
		 <option value="P4">P2</option>
		 <option value="P4">P1</option>
		 </select>
		</td>
    
	</tr>
	<tr></tr>
	<tr>
	
	<td>Assigned Group:</td>
	<td><select id="grp" value="grp" style="width:130px;">
	<option value="Select" selected="true">Select</option>
	<option value="Fpath" >Fast Path</option>
	<option value="Doe" >Deliver OE</option>
	<option value="BTS" >BTS orders</option>
	</select>
	</td>
	<tr>
	<td>Issue Description:</td>
	<td><textarea id="issue" colspan="3" name="issue" rows="3" style="width:235%;resize:none"></textarea></td>
	</tr>
	<tr>
	<td>Action Taken:</td>
	<td><textarea id="stf" name="stf" colspan="3" rows="6"  style="width:235%;resize:none"></textarea></td>
	</tr>
	<tr>
	<td>Routed To</td><td><input type="Text" id="route" value=""></td><td></td><td>Reason:</td><td><input type="Text" id="reas" value=""></td>   
	</tr>
	<tr><td></td></tr>
	</table>
	<span style="position: relative;left: 80%;top: 20px;"><input type="button" value="Submit" onclick="clicked()"></span>
	<span style="position: relative;left: 80%;top: 20px;"><input type="button" value="Reset"></span>
	</div>
	</div>
    <div id="option2">
    <p>First tab is active by default:</p>
</div>

<div id="option3">
    <p>First tab is active by default:</p>
</div>
</div>
</div>
<div id="grad4"style="float:right;width:36.7%;height:80%"></div>
</div>
<div id="grad3" style="position:fixed;top:85%;width:100%;height:5%"></div>
<img src="c-header1.png" height="10%" width="100%" style="position:fixed;top:90%"></img>

</body>
</html>
