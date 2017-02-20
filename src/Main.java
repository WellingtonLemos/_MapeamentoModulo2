import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args){
		
		int n = 3;
		for(int i=0; i<n; i++){
			JOptionPane.showMessageDialog(null, n);
			n--;
		}
		
		JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema de mapeamento!");
		
	}

}
