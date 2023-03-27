# AbstractFactory

O Padrão de projeto Abstract Factory é um padrão criacional que permite produzir a ligação entre uma família de objetos relacionados sem a necessidade de ter que ser especificado suas classes concretas.

Nesse contexto podemos considerar as classes Paciente, Receita e Prontuário como objetos relacionados e dependentes entre si.

A classe FabricaAbstrata representa a interface que define as operações de criação de objetos.

As classes FabricaClinica e FabricaConsultorio são as fábricas concretas que implementam essa interface e são responsáveis por criar os objetos relacionados.

# Diagrama de Classe
![WhatsApp Image 2023-03-27 at 18 22 01](https://user-images.githubusercontent.com/80372910/228069858-9f661de8-9773-45c3-a66a-6507f9469844.jpeg)
