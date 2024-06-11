import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ClientComponent } from './client/client.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Alianza';

  constructor(){

  }

  ngOnInit(): void {
    console.log('Componente cargado')
  }

  newClient(){

  }

  exportClient(){
    
  }
}
