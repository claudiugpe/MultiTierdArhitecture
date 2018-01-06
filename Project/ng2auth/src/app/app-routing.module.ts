import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CallbackComponent } from './callback.component';
import { UsersComponent } from './users/users.component';
import { BoardsComponent } from './boards/boards.component';  
import { WorkItemsComponent } from './work-items/work-items.component'; 

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
    path: 'callback',
    component: CallbackComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
