import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CallbackComponent } from './callback.component';
import { UsersComponent } from './users/users.component';
import { BoardsComponent } from './boards/boards.component';  
import { WorkItemsComponent } from './work-items/work-items.component'; 
import {SprintComponent} from './sprint/sprint.component';
import {UserFormComponent} from './user-form/user-form.component';
import {BoardFormComponent} from './board-form/board-form.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'board',
    pathMatch: 'full'
  },
  {
    path: 'user',
    component: UsersComponent
  },
  {
    path: 'board',
    component: BoardsComponent
  },
  {
    path: 'workitem',
    component: WorkItemsComponent
  },
  {
    path: 'sprint',
    component: SprintComponent
  },
  {
    path:'user-from',
    component:UserFormComponent
  },
  {
    path:'createBoard',
    component:BoardFormComponent
  },
  {
    path: 'callback',
    component: CallbackComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
