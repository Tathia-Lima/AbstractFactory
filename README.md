# AbstractFactory

O Padrão de projeto Abstract Factory é um padrão criacional que permite produzir a ligação entre uma família de objetos relacionados sem a necessidade de ter que ser especificado suas classes concretas.

Nesse contexto podemos considerar as classes Paciente, Receita e Prontuário como objetos relacionados e dependentes entre si.

A classe FabricaAbstrata representa a interface que define as operações de criação de objetos.

As classes FabricaClinica e FabricaConsultorio são as fábricas concretas que implementam essa interface e são responsáveis por criar os objetos relacionados.

# Diagrama de Classe
