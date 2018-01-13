import { Component, OnInit } from '@angular/core';
import {Sprint} from '../sprint';

import {SprintService} from '../sprint.service'
import { OnDestroy } from '@angular/core/src/metadata/lifecycle_hooks';
import { Subscription } from 'rxjs/Subscription';

@Component({
  selector: 'app-sprint',
  templateUrl: './sprint.component.html',
  styleUrls: ['./sprint.component.css']
})
export class SprintComponent implements OnInit {

  sprintsSub: Subscription;
  sprints:Sprint[];
  error:any;
 
  constructor(public sprintService:SprintService) { }

  ngOnInit() {
    this.sprintsSub=this.sprintService
      .getSprints()
      .subscribe(
        sprints=>this.sprints=sprints,
        err=>this.error=err
      )
  }

  ngOnDestroy(){
    this.sprintsSub.unsubscribe();
  }


}
