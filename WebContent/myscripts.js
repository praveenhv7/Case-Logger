/**
 * 
 */
function clicked()
{
	 var inc_num=$('#incNum').val();
	 var category=$('#catg').val();
	 var urgency=$('#priority').val();
	 var group=$('#grp').val();
	 var issue_desc=$('#issue').val();
	 var action=$('#stf').val();
	 var routed=$('#route').val();
	 var reason=$('#reas').val();
	 
 $.ajax({url:"http://localhost:8547/CaseLogger/ControllerNew?argument=insert",
	 type:"POST",
	 data:{"data1":inc_num,
		   "data2":category,
		   "data3":urgency,
		   "data4":group,
		   "data5":issue_desc,
		   "data6":action,
		   "data7":routed,
		   "data8":reason,
	      },
	      async:false, 	
	 success:function(result){
	 alert("called");}});
 
}