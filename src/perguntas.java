import java.util.Scanner;

public class perguntas {
    public void exibepergunta() {
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;

        // Pergunta 1
        System.out.println("Pergunta 1: Qual é o maior planeta do sistema solar?");
        System.out.println("a) Terra");
        System.out.println("b) Vênus");
        System.out.println("c) Marte");
        System.out.println("d) Júpiter");
        System.out.println("e) Saturno");
        System.out.print("Resposta (a, b, c, d ou e): ");
        String resposta1 = scanner.nextLine();
        if (resposta1.equalsIgnoreCase("d")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada.");
        }

        // Pergunta 2
        System.out.println("\nPergunta 2: Quem ganhou o Brasileirão de 2019?");
        System.out.println("a) Flamengo");
        System.out.println("b) Fluminense");
        System.out.println("c) Vasco");
        System.out.println("d) Palmeiras");
        System.out.println("e) NDA");
        System.out.print("Resposta (a, b, c, d ou e): ");
        String resposta2 = scanner.nextLine();
        if (resposta2.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada.");
        }

        // Pergunta 3
        System.out.println("\nPergunta 3: Quem Qual é a capital do Brasil?'?");
        System.out.println("a) Goiânia");
        System.out.println("b) Brasilia");
        System.out.println("c) São Paulo");
        System.out.println("d) Espirito Santo");
        System.out.println("e) NDA");
        System.out.print("Resposta (a, b, c, d ou e): ");
        String resposta3 = scanner.nextLine();
        if (resposta3.equalsIgnoreCase("b")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada.");
        }

        // Pergunta 4
        System.out.println("\nPergunta 4: Qual é o maior oceano do mundo?");
        System.out.println("a) Oceano Atlântico");
        System.out.println("b) Oceano Índico");
        System.out.println("c) Oceano Antártico");
        System.out.println("d) Oceano Pacífico");
        System.out.println("e) Oceano Ártico");
        System.out.print("Resposta (a, b, c, d ou e): ");
        String resposta4 = scanner.nextLine();
        if (resposta4.equalsIgnoreCase("d")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada.");
        }

        // Pergunta 5
        System.out.println("\nPergunta 5: Quem foi o primeiro presidente do Brasil?");
        System.out.println("a) Getúlio Vargas");
        System.out.println("b) Juscelino Kubitschek");
        System.out.println("c) Marechal Deodoro da Fonseca");
        System.out.println("d) Itamar Franco");
        System.out.println("e) NDA");
        System.out.print("Resposta (a, b, c, d ou e): ");
        String resposta5 = scanner.nextLine();
        if (resposta5.equalsIgnoreCase("c")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada.");
        }

        // Pergunta 6
        System.out.println("\nPergunta 6: Em que ano foi a independência do Brasil?");
        System.out.println("a) 1808");
        System.out.println("b) 1822");
        System.out.println("c) 1889");
        System.out.println("d) 1922");
        System.out.println("e) NDA");
        System.out.print("Resposta (a, b, c, d ou e): ");
        String resposta6 = scanner.nextLine();
        if (resposta6.equalsIgnoreCase("b")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada.");
        }

        // Pergunta 7
        System.out.println("\nPergunta 7: Qual é o maior animal terrestre?");
        System.out.println("a) Elefante Africano");
        System.out.println("b) Girafa");
        System.out.println("c) Hipopótamo");
        System.out.println("d) Rinoceronte");
        System.out.println("e) Leão");
        System.out.print("Resposta (a, b, c, d ou e): ");
        String resposta7 = scanner.nextLine();
        if (resposta7.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada.");
        }

        // Pergunta 8
        System.out.println("\nPergunta 8: Qual é a capital do Japão?");
        System.out.println("a) Seul");
        System.out.println("b) Pequim");
        System.out.println("c) Tóquio");
        System.out.println("d) Bangkok");
        System.out.println("e) Hanói");
        System.out.print("Resposta (a, b, c, d ou e): ");
        String resposta8 = scanner.nextLine();
        if (resposta8.equalsIgnoreCase("c")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada.");
        }

        // Pergunta 9
        System.out.println("\nPergunta 9: Quem escreveu 'Dom Quixote'?");
        System.out.println("a) William Shakespeare");
        System.out.println("b) Miguel de Cervantes");
        System.out.println("c) James Joyce");
        System.out.println("d) Jane Austen");
        System.out.println("e) NDA");
        System.out.print("Resposta (a, b, c, d ou e): ");
        String resposta9 = scanner.nextLine();
        if (resposta9.equalsIgnoreCase("b")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada.");
        }

        // Pergunta 10
        System.out.println("\nPergunta 10: Qual é o país mais populoso do mundo?");
        System.out.println("a) Índia");
        System.out.println("b) China");
        System.out.println("c) Estados Unidos");
        System.out.println("d) Brasil");
        System.out.println("e) Rússia");
        System.out.print("Resposta (a, b, c, d ou e): ");
        String resposta10 = scanner.nextLine();
        if (resposta10.equalsIgnoreCase("b")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada.");
        }

        // Pergunta 11
        System.out.println("\nPergunta 11: Qual é o símbolo químico do ouro?");
        System.out.println("a) Fe");
        System.out.println("b) Au");
        System.out.println("c) Ag");
        System.out.println("d) Cu");
        System.out.println("e) Pb");
        System.out.print("Resposta (a, b, c, d ou e): ");
        String resposta11 = scanner.nextLine();
        if (resposta11.equalsIgnoreCase("b")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada.");
        }

        // Pergunta 12
        System.out.println("\nPergunta 12: Quem pintou a Mona Lisa?");
        System.out.println("a) Pablo Picasso");
        System.out.println("b) Leonardo da Vinci");
        System.out.println("c) Vincent van Gogh");
        System.out.println("d) Claude Monet");
        System.out.println("e) NDA");
        System.out.print("Resposta (a, b, c, d ou e): ");
        String resposta12 = scanner.nextLine();
        if (resposta12.equalsIgnoreCase("b")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada.");
        }

        // Pergunta 13
        System.out.println("\nPergunta 13: Qual é o planeta conhecido como 'Planeta Vermelho'?");
        System.out.println("a) Vênus");
        System.out.println("b) Júpiter");
        System.out.println("c) Marte");
        System.out.println("d) Saturno");
        System.out.println("e) Urano");
        System.out.print("Resposta (a, b, c, d ou e): ");
        String resposta13 = scanner.nextLine();
        if (resposta13.equalsIgnoreCase("c")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada.");
        }

// Pergunta 14
        System.out.println("\nPergunta 14: Quem escreveu 'Romeu e Julieta'?");
        System.out.println("a) Charles Dickens");
        System.out.println("b) Jane Austen");
        System.out.println("c) William Shakespeare");
        System.out.println("d) Emily Brontë");
        System.out.println("e) NDA");
        System.out.print("Resposta (a, b, c, d ou e): ");
        String resposta14 = scanner.nextLine();
        if (resposta14.equalsIgnoreCase("c")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada.");
        }

// Pergunta 15
        System.out.println("\nPergunta 15: Qual é o maior deserto do mundo?");
        System.out.println("a) Deserto do Saara");
        System.out.println("b) Deserto da Arábia");
        System.out.println("c) Deserto de Atacama");
        System.out.println("d) Deserto de Gobi");
        System.out.println("e) Deserto da Austrália");
        System.out.print("Resposta (a, b, c, d ou e): ");
        String resposta15 = scanner.nextLine();
        if (resposta15.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta!");
            pontuacao++;
        } else {
            System.out.println("Resposta errada.");
        }


// Exibir pontuação final
        System.out.println("\nPontuação final: " + pontuacao + " de 15 perguntas corretas.");
        scanner.close();

    }
}