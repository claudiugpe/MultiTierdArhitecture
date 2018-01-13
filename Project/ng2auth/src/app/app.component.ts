import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
  <div id="sidebar" class="navbar-left">
  <a class="navbar-brand">Kanban Boards</a>
  <ul>
          <li class="nav-parent">
              <span>Workspace</span>
          </li>
          <li class="nav-child">
              <a routerLink="/user" routerLinkActive="active"> Users</a>
           </li>
            <li class="nav-child">
              <a routerLink="/board" routerLinkActive="active"> Board</a>
            </li>
            <li class="nav-child">
                 <a routerLink="/sprint" routerLinkActive="active"> Sprints</a>
            </li>
            <li class="nav-child">
                 <a><i class="fa fa-users"></i> Members</a>
            </li>
              
          <li class="nav-parent">
              <a><i class="fa fa-cogs"></i> Settings</a>
          </li>
          
          <li class="nav-parent"> 
            Sign-in
          </li>
          <li class="nav-parent">
            <a routerLink="/user-from" routerLinkActive="active"> Register</a>
          </li>
  </ul>
</div>
<div id="wrapper">
  <nav class="navbar navbar-inverse">
      <div class="container-fluid">
          <ul class="nav navbar-nav navbar-left">
              <li class="col-md-3 col-md-offset-6">
                  <div id="imaginary_container">
                      <div class="input-group stylish-input-group">
                          <input type="text" class="form-control" placeholder="Search">
                          <span class="input-group-addon">
                              <button type="submit">
                                  <span class="glyphicon glyphicon-search"></span>
                              </button>
                          </span>
                      </div>
                  </div>
              </li>
              <li class="col-md-3 col-md-offset-9" id="add-work-item">
                  <button class="btn btn-success" id="new-work-item-button" type="submit">
                      New Work Item
                  </button>
              </li>
          </ul>
      </div>
  </nav>
</div>
<div id="main" class="container-fluid">
  <div>
       <router-outlet></router-outlet>
  </div>
  <hr />
  <div id="footer" class="container-fluid">
      <div class="navbar navbar-inverse navbar-fixed-bottom">
          <h4 class="text-center text-info">&copy; 2017 - Kanban Boards</h4>
      </div>
  </div>
  `,
  styles: [
    `/*site.css*/

    #sidebar {
        background: #2a2c36;
        color: #eee;
        position: fixed;
        height: 100%;
        width: 200px;
        overflow: hidden;
        left: 0;
        margin: 0;
        transition: left ease .25s;
    }
    
        #sidebar.toggled {
            left: -200px;
            transition: left ease .25s;
        }
    
    .nav-parent {
         list-style: none;
         margin-left: unset;
         padding-bottom: 10px;
         margin-top:10px;
         color: aliceblue;
    }
    
    .nav-parent:first-child {
        padding-bottom: unset;
        margin-top: 60px;
    }
    
    .nav-parent a {
        color: aliceblue;
    }
    
    .nav-parent a:hover {
        color: cadetblue;
        text-decoration:none;
    }
    
    .nav-child {
        list-style: none;
        padding-bottom:5px;
        padding-top:5px;
        margin-left: -15px;
    }
    
    .navbar-inverse {
        background-color: #FFFFFF;
        border-color: #FFFFFF;
        border-bottom: 1px solid #E1E1E1;
    }
    
    .nav-child a:hover {
        color: cadetblue;
        text-decoration: none;
    }
    
    .hamburger {
        color: #000000;
        background-color: #FFFFFF;
        border-color: #FFFFFF;
        font-size: 20px;
    }
    
        .hamburger:hover {
            color: #FFFFFF;
            background-color: #D2D2D2;
            border-color: #D2D2D2;
            border-radius: unset;
            font-size: 20px;
        }
    
    #imaginary_container {
        margin-top: 5px; /* Don't copy this */
    }
    
    .stylish-input-group .input-group-addon {
        background: white;
    }
    
    .stylish-input-group .form-control {
        border-right: 0;
        box-shadow: 0 0 0;
        border-color: #ccc;
    }
    
    .stylish-input-group button {
        border: 0;
        background: transparent;
    }
    
    #add-work-item {
        margin-top: -37px;
        border-radius: 0;
        padding-left: 35px;
    }
    
    #new-work-item-button {
        border-radius: 0;
        background-color: #04B45F;
        border-color: #04B45F;
        color: #FFFFFF;
    }
    
    #brand {
        border-bottom: 1px solid #ddd;
        color: aliceblue;
        padding: 20px;
    }
    
    #brand:hover {
            color:cadetblue;
    }
    
    #wrapper {
        margin: 0 0 0 200px;
        transition: margin-left ease .25s;
    }
    
        #wrapper.toggled {
            margin-left: 0;
            transition: margin-left ease .25s;
        }
    
    #main {
        margin: 0 0 0 200px;
        transition: margin-left ease .25s;
    }
    
    `
  ]
})
export class AppComponent {
  title = 'Kanban boards';

  
  constructor() {}
  
}
