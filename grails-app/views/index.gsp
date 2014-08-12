<!doctype html>
<html lang="en">
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Google Phone Gallery</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <r:require module="angular"/>
    <r:layoutResources />
</head>

<body ng-controller="AppCtrl">

<div class="navbar">
    <div class="navbar-inner">
        <div class="container-fluid">
            <!-- .btn-navbar is used as the toggle for collapsed navbar content -->
            <a class="btn btn-navbar" data-toggle="collapse"
               data-target=".nav-collapse"> <span class="icon-bar"></span> <span
                    class="icon-bar"></span> <span class="icon-bar"></span>
            </a> <a class="brand" href="#"> <msg key="title"></msg>
        </a>
            <div class="nav-collapse collapse">
                <ul class="nav">
                    <li ng-class="activeWhen(path() == '/books')"><a
                            href="#/books">Books</a></li>
                    <li ng-class="activeWhen(path() == '/new')"
                        ng-show="user.username"><a href="#/new">New Book</a></li>
                </ul>
            </div>
            <form class="navbar-form pull-right">
                <button onclick=" $('#login').modal('show');"  class="btn btn-primary" ng-hide="user.username">Login</button>
                <span ng-show="user.username"><button ng-click="logout()" class="btn btn-success">Logout!</button></span>
            </form>
        </div>
    </div>
</div>

<div class="container-fluid">
    <div ng-class="'alert alert-' + message().type"
         ng-show="message().show">
        <button type="button" class="close" ng-click="message().show = false">&times;</button>
        <msg key-expr="message().text"></msg>
    </div>
    <div class="modal" style="display: none" id="login">
        <div class="modal-header">
            <a class="close" data-dismiss="modal">x</a>
            <h3>Login</h3>
        </div>
        <div class="modal-body">
            <div class="control-group">
                <label class="control-label" for="username">Username</label>
                <div class="controls">
                    <input type="text" id="username" ng-model="username"
                           required="required" class="input-block-level" />
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="password">Password</label>
                <div class="controls">
                    <input type="password" id="password" ng-model="password"
                           required="required" class="input-block-level" />
                </div>
            </div>
        </div>
        <div class="modal-footer">
            <a ng-click="login()" class="btn btn-primary">Login</a> <a
                data-dismiss="modal" class="btn">Cancel</a>
        </div>
    </div>

    <ng-view></ng-view>
    <div class="footer">
        <div class="row-fluid">
            Angular seed app: v<span app-version></span>
        </div>
        <div class="row-fluid">
            <ul class="nav nav-pills">
                <li ng-class="activeWhen(language() == 'zh_CN')"><a
                        ng-click="setLanguage('zh_CN')">Chinese Simplified</a></li>
                <li ng-class="activeWhen(language() == 'en')"><a
                        ng-click="setLanguage('en')">English</a></li>
            </ul>
        </div>
    </div>
</div>

<body>

%{--<div class="view-container" ng-app="phonecatApp">--}%
    %{--<div ng-view class="view-frame"></div>--}%
%{--</div>--}%

<r:layoutResources />

</body>

</html>
