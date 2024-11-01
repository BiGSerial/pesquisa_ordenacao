package Main;

import utils.ConsoleUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

import dados.Item;

public class MenuPrincipal {

	static Scanner scanner = new Scanner(System.in);
	static int tamanho;

	public static void main(String[] args) throws IOException {

		menu();

	}

	public static void menu() {
		ConsoleUtils.clearConsole();
		int opcao;

		System.out.println("\n--- MENU ----\n");
		System.out.println("1. Criar vetor");
		System.out.println("2. Ler arquivo");
		System.out.println("3. Pesquisa Sequencial");
		System.out.println("4. Pesquisa Binária");
		System.out.println("5. Comparar Algoritmos");
		System.out.println("6. Hashing");
		System.out.println("7. Sair");

		do {
			opcao = scanner.nextInt();
			switch (opcao) {
				case 1:
					
					System.out.println("\n--- DEFINIR TAMANHO DO VETOR ---\n");
					System.out.println("Defina o tamanho do vetor que ira ordenar: ");
					tamanho = scanner.nextInt();

					// usuário criar um vetor de inteiros com tamanho definido por ele.
					// O programa deverá preencher o vetor com valores aleatórios ou permitir que o
					// usuário insira os valores manualmente
					break;
				case 2:
				case 2:
				System.out.println("\n--- CARREGAR ARQUIVO ---\n");
                String path = selecionarArquivo();
				int lineCount = 0;
        
				// Contar as linhas
				try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
					while (reader.readLine() != null) {
						lineCount++;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		
				// Ler os valores para o vetor
				int[] vetor = new int[lineCount];
				int count = 0;
		
				try (BufferedReader reader2 = new BufferedReader(new FileReader(path))) {
					String linha;
					while ((linha = reader2.readLine()) != null) {
						vetor[count] = Integer.parseInt(linha); // Lê a linha e converte para inteiro
						count++;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		
				// Exibir os valores do vetor
				for (int numeros : vetor) {
					System.out.println(numeros);
				}

				
					
					break;

				
					
					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					break;
				case 6:

					Pesquisa_Hashing Hashing = new Pesquisa_Hashing();
					break;
				case 7:

					System.out.println("Finalizando Sistema ...");
					break;

				default:
					System.out.println("Valor invalido, tente novamente!");
					break;
			}

		} while (opcao > 0 && opcao < 8);
	}

	public static void leitor10000(String path, Vetor vetor) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = buffRead.readLine();
		Integer vetorLocal[] = new Integer[10000];
		int i = 0;
		while (true) {
			if (linha != null) {
				vetorLocal[i] = Integer.parseInt(linha);
				vetor.inserirDados(new Item(vetorLocal[i]));
				i++;
				// System.out.println(vetorLocal[i-1]);
			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}


	public static String selecionarArquivo() {
		JFileChooser fileChooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de Texto", "txt");
		fileChooser.setFileFilter(filter);
		
		int returnValue = fileChooser.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fileChooser.getSelectedFile();
			return selectedFile.getAbsolutePath();
		}
		return null;
	}
}

/*
 * • O programa deve incluir tratamento de erros para lidar com entradas
 * inválidas do usuário e
 * arquivos inexistentes.
 * • O programa deve ser capaz de lidar com vetores de grande tamanho (pelo
 * menos 10.000
 * elementos).
 */
