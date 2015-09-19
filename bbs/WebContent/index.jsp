<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>V2EX</title>

<link rel="stylesheet" type="text/css" media="screen" href="css/style.css" />
<link rel="stylesheet" type="text/css" media="screen" href="css/basic.css" />
<link rel="stylesheet" type="text/css" media="screen" href="css/desktop.css" />
<link rel="stylesheet" type="text/css" media="screen" href="css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css" media="screen" href="css/highlight.css" />


</head>
<body>

	<div id="Top">
		<div class="content">
			<div style="padding-top: 6px;">
				<table cellpadding="0" cellspacing="0" border="0" width="100%">
					<tr>
						<td width="110" align="left"><a href="<%=request.getContextPath() %>/index" name="top"
							title="way to explore"> <img
								src="pic/logo@2x.png" border="0" alt="V2EX"
								width="94" height="30" />
						</a></td>
						<td width="auto" align="left">
							<div id="Search">
								<div
									style="width: 276px; height: 28px; background-size: 276px 28px; background-image: url('pic/search.png'); background-repeat: no-repeat; display: inline-block;">
									<input type="text" maxlength="40" name="q" id="q" value="" />
								</div>
							</div>
						</td>
						<td width="570" align="right" style="padding-top: 2px;"><a
							href="/<%=request.getContextPath() %>/index" class="top">首页</a>&nbsp;&nbsp;&nbsp;<a href="<%=request.getContextPath()%>/signup.jsp"
							class="top">注册</a>&nbsp;&nbsp;&nbsp;<a href="<%=request.getContextPath() %>/signin.jsp" class="top">登录</a>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</div>


	<div id="Wrapper">
		<div class="content">
			<div id="Leftbar"></div>
			<div id="Rightbar">
				<div class="sep20"></div>
				<div class="box">
					<div class="cell">
						<strong>V2EX = way to explore</strong>
						<div class="sep5"></div>
						<span class="fade">V2EX 是一个关于分享和探索的地方</span>
					</div>
					<div class="inner">
						<div class="sep5"></div>
						<div align="center">
							<a href="/signup" class="super normal button">现在注册</a>
							<div class="sep5"></div>
							<div class="sep10"></div>
							已注册用户请 &nbsp;<a href="/signin">登录</a>
						</div>
					</div>
				</div>
				<div class="sep20"></div>
			</div>

			<div id="Main">
				<div class="sep20"></div>

				<div class="box">
					<div class="inner"
						style="background-color: #fff; border-top-left-radius: 3px; border-top-right-radius: 3px;"
						id="Tabs">
						<a href="/?tab=tech" class="tab_current">技术</a><a
							href="/?tab=creative" class="tab">创意</a><a href="/?tab=play"
							class="tab">好玩</a><a href="/?tab=apple" class="tab">Apple</a><a
							href="/?tab=jobs" class="tab">酷工作</a><a href="/?tab=deals"
							class="tab">交易</a><a href="/?tab=city" class="tab">城市</a><a
							href="/?tab=qna" class="tab">问与答</a><a href="/?tab=hot"
							class="tab">最热</a><a href="/?tab=all" class="tab">全部</a><a
							href="/?tab=r2" class="tab">R2</a>
					</div>
					<div class="cell"
						style="background-color: #f9f9f9; padding: 10px 10px 10px 20px;">
						<a href="/go/programmer">程序员</a> &nbsp; &nbsp; <a
							href="/go/python">Python</a> &nbsp; &nbsp; <a href="/go/idev">iDev</a>
						&nbsp; &nbsp; <a href="/go/android">Android</a> &nbsp; &nbsp; <a
							href="/go/linux">Linux</a> &nbsp; &nbsp; <a href="/go/nodejs">node.js</a>
						&nbsp; &nbsp; <a href="/go/cloud">云计算</a> &nbsp; &nbsp; <a
							href="/go/bb">宽带症候群</a>
					</div>



					<div class="cell item"
						style="border-top-left-radius: 3px; border-top-right-radius: 3px;">
						<div style="position: absolute; margin: -10px -10px 0px 650px;">
							<img src="/static/img/corner_star.png" width="20" height="20"
								title="Sticky TTL: 2925 seconds" />
						</div>
						<table cellpadding="0" cellspacing="0" border="0" width="100%">
							<tr>

								<td width="48" valign="top" align="center"><a
									href="/member/hiStarter"><img
										src="//cdn.v2ex.co/avatar/74a7/043d/87144_normal.png?m=1422346144"
										class="avatar" border="0" align="default" /></a></td>
								<td width="10"></td>

								<td width="auto" valign="middle"><span class="item_title"><a
										href="/t/221086#reply38">今晚 Q 群直播：对话顶级构架师茹云峰——作为创业团队 CTO
											是怎样的体验</a></span>
									<div class="sep5"></div> <span class="small fade"><div
											class="votes"></div> <a class="node" href="/go/programmer">程序员</a>
										&nbsp;•&nbsp; <strong><a href="/member/hiStarter">hiStarter</a></strong>
										&nbsp;•&nbsp; 置顶 &nbsp;•&nbsp; 最后回复来自 <strong><a
											href="/member/dai269619118">dai269619118</a></strong></span></td>
								<td width="70" align="right" valign="middle"><a
									href="/t/221086#reply38" class="count_livid">38</a></td>
							</tr>
						</table>
					</div>



					<div class="c"></div>
					<div class="sep20"></div>
				</div>
			</div>

			<div id="Bottom">
				<div class="content"></div>
			</div>






			
</body>
</html>