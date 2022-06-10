<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>project-create</title>


    <link rel="stylesheet" href="${contextPath}/resources/css/project-create.css">

    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <script src="https://kit.fontawesome.com/a2e8ca0ae3.js" crossorigin="anonymous"></script>
</head>
<body>
    <main>
        <jsp:include page="/WEB-INF/views/common/header.jsp" />


		<jsp:include page="/WEB-INF/views/common/sideMenu.jsp"/>


        

        <!-- 클래스 생성 페이지 -->
        <section class="classPage-content">
            

            <!-- 왼쪽 클래스 생성 페이지 -->

                <section class="classPage-inside">

                    <section class="classPage-left">
                      
                        <h1 class="left-text">클래스 이름을 지어주세요.</h1> 

                        <h3 class="left-text">클래스 이름</h3>
                        <div class="page-left1">
                            
                            <input type="text" id="className" maxlength="11"
                            placeholder="프로젝트 이름 입력" size="30">

                            <button id="name-double-check">중복확인</button>
                        
                        </div>
                        
                        
                        <div class="page-left3">

                            <div class="category">
                                <h3 class="left-text">카테고리</h3>
                                
                                <select name="classCategory">
                                    <option>학급</option>
                                    <option>프로젝트</option>
                                    <option>동호회</option>
                                    <option>취미생활</option>

                                </select>
                            </div> 


                        <div class="quota">
                                <h3 class="left-text">정원</h3>
                                <input type="number" id="projectQuota" placeholder="10" max="30" min="1">
                            </div>
                        </div>


                        <h3 class="left-text">소개글</h3>
                        <div class="page-left">
                            
                            <textarea id="classIntro" rows="10" cols="45" 
                            style="resize: none;"></textarea>


                        </div>
                    </form>  
                </section>
                

                

                <!-- 오른쪽 마이페이지 주요 내용 부분 -->
                <section class="classPage-right">

                    <form action="#" method="POST" name="rightPage-form">

                        <input type="radio" name="public-select" id="secret-class">
                        <label for="secret-class">비공개 클래스</label><br>
                        <p id="select-text" class="select-text">초대를 통해서만 가입할 수 있습니다.</p>


                        <input type="radio" name="public-select" id="private-class">
                        <label for="private-class">클래스 명 공개</label><br>
                        <p id="select-text">검색으로 소개를 볼 수 있지만,</p>
                        <p id="select-text" class="select-text">게시글은 맴버만 볼 수 있습니다.</p>
                        


                        <input type="radio" name="public-select" id="public-class">
                        <label for="private-class">공개 클래스</label><br>
                        <p id="select-text"> 누구든 클래스를 검색해 찾을 수 있고 </p>
                        <p id="select-text">클래스 소개와 게시글을 볼 수 있습니다.</p>


                        <button id="createBtn" name="createBtn">제출</button>


                    </form>

                </section>

        </section>



        </section>




    </main>

    <jsp:include page="/WEB-INF/views/common/footer.jsp" />

</body>
</html>