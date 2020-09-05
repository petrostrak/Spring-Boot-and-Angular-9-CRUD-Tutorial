import { EmployeeListComponent } from './../employee-list/employee-list.component';
import { EmployeeService } from './../employee.service';
import { Employee } from './../employee';
import { Router, ActivatedRoute } from '@angular/router'
import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {

  id: number
  employee: Employee

  constructor(private route: ActivatedRoute, private router: Router, private employeeService: EmployeeService) { }

  ngOnInit(): void {
    this.employee = new Employee()

    this.id = this.route.snapshot.params['id']

    this.employeeService.getEmployee(this.id)
      .subscribe(data => {
        console.log(data)
        this.employee = data
      }, error => console.log(error))
  }

  list() {
    this.router.navigate(['employees'])
  }

}
