<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

 		<title><dec:title default="Trang chủ" /></title>
		<!-- ccs -->
 		<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <link href="template/web/css/styles.css" rel="stylesheet" />
        
        
		
</head>
<body>

		<!-- header -->
   			 <%@ include file="/common/web/header.jsp" %>
   		 <!-- header -->
    
    <div class="container">
    	<dec:body/>
    </div>

		<!-- footer -->
			<%@ include file="/common/web/footer.jsp" %>
		<!-- footer -->
	
		<!-- js -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <script src="template/web/js/scripts.js"></script>
        
        
</body>
</html>