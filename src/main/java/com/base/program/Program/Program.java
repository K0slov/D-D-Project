// package Program;

// import Classes.HeroRepository;
// import Entities.Hero;
// import Enum.TypeClass;

// public class Program
// {
//     static HeroRepository repositorio = new HeroRepository();
//     static void Main(String[] args) throws Exception
//     {
//             String opcaoUsuario = NovoJogo();

//             while (opcaoUsuario.toUpperCase() != "X")
//             {
//                 switch (opcaoUsuario)
//                 {
//                     case "1":
//                         NovoPerfil();
//                         break;
//                     case "2":
//                         ListarHerois();
//                         break;
//                     case "3":
//                         VisualizarHeroi();
//                         break;
//                     case "4":
//                         ExcluirHeroi();
//                         break;
//                     case "C":
//                     Runtime.getRuntime().exec("cls");
//                         break;

//                     default:
//                         throw new Exception();

//                 }
//                 opcaoUsuario = NovoJogo();
//             }
//     }

//         private static void ExcluirHeroi()
// 		{
//             System.out.println("Digite o id do herói: ");
// 			int indiceHeroi = Integer.parseInt(System.console().readLine());

// 			repositorio.Exclui(indiceHeroi);
// 		}

//         private static void VisualizarHeroi()
// 		{
// 			System.out.println("Digite o id do Herói: ");
// 			int indiceHeroi = Integer.parseInt(System.console().readLine());

// 			var hero = repositorio.RetornaPorId(indiceHeroi);

// 			System.out.println(hero);
// 		}

//         private static void ListarHerois()
//         {
//             System.out.println("Listar Herois");

//             var lista = repositorio.Lista();

//             if (lista.size() == 0)
//             {
//                 System.out.println("Nenhum herói registrado.");
//             return;
//             }

//             for(var hero : lista)
//             {
//             var Excluido = hero.retornaExcluido();
//             System.out.printf("ID {0}: - {1} {2}", hero.retornaId(), hero.retornaTitulo(), Excluido ? " *Excluido*" : " ");
//             }}
//         private static void NovoPerfil()
//         {
            
//             System.out.println("Primeiramente, qual o seu nome? ");
//             String entradaNome = System.console().readLine();
//             System.out.println();
            
//             System.out.println("Me diga qual a sua classe");

            

//             for(TypeClass classe : TypeClass.values())
//             {
//             System.out.printf("{0}-{1}", classe);
//             }
            
//             System.out.println();
//             System.out.println("Digite a classe entre as opções acima: ");
//             int entradaClasse = Integer.parseInt(System.console().readLine());

//             int entradaLevel = 1;

//             int entradaVida = entradaClasse;
//             {
//                 if(entradaVida == 1)
//                 {
//                     entradaVida = 80;

//                 }if(entradaVida == 2)
//                 {
//                     entradaVida = 60; 

//                 }if(entradaVida == 3)
//                 {
//                     entradaVida = 90; 

//                 }if(entradaVida == 4)
//                 {
//                     entradaVida = 70; 

//                 }if(entradaVida == 5)
//                 {
//                     entradaVida = 80; 
//                 }

//             int entradaForca = entradaClasse;
//             {
//                 if(entradaForca == 1)
//                 {
//                     entradaForca = 8;

//                 }if(entradaForca == 2)
//                 {
//                     entradaForca = 6; 

//                 }if(entradaForca == 3)
//                 {
//                     entradaForca = 9; 

//                 }if(entradaForca == 4)
//                 {
//                     entradaForca = 7; 

//                 }if(entradaForca == 5)
//                 {
//                     entradaForca = 8; 
//                 }
//             }
        

//             Hero newHero = new Hero(null, entradaNome, entradaLevel, null, entradaVida, entradaForca);
//             repositorio.Insere(newHero);
            
//         String player = NovoJogo();

//         player = NovoJogo();
//         }}
//         private static String NovoJogo()
//         {
//             System.out.println();
//             System.out.println("Fala DEV bem-vindo ao teste de RPG inspirado em D&D!");
//             System.out.println("Qual a opção que voce deseja?");
            
//             System.out.println("1 - Novo perfil");
//             System.out.println("2 - Listar heróis");
//             System.out.println("3 - Visualizar heroi");
//             System.out.println("4 - Excluir herói");
//             System.out.println("C - Limpar tela");
//             System.out.println("X - Sair");
//             System.out.println();

//             String opcaoUsuario = System.console().readLine().toUpperCase();
//             System.out.println();
//             return opcaoUsuario;
//         }
// }