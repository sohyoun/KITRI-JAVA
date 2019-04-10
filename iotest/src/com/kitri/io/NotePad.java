package com.kitri.io;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class NotePad extends Frame implements ActionListener {
	TextArea ta = new TextArea();

	MenuBar mb = new MenuBar();
	Menu file = new Menu("����");
	Menu help = new Menu("����");
	MenuItem open = new MenuItem("����");
	MenuItem save = new MenuItem("����");
	MenuItem exit = new MenuItem("����");

	FileDialog fd;

	public NotePad() {
		mb.add(file);
		mb.add(help);

		file.add(open);
		file.add(save);
		file.add(exit);

		setMenuBar(mb);
		add(ta, "Center");

		setBounds(300, 200, 500, 500);
		setVisible(true);

		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);

		fd = new FileDialog(this);
		fd.setVisible(false);
	}

	public static void main(String[] args) {
		new NotePad();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		BufferedReader fin = null;
		FileWriter fw = null;

		if (ob == open) {
			try {
				fd.setMode(FileDialog.LOAD);
				fd.setVisible(true);
				BufferedReader in = new BufferedReader(new StringReader(fd.getFile()));
				BufferedReader path = new BufferedReader(new StringReader(fd.getDirectory()));

				String infile = path.readLine()+File.separator+in.readLine();// infile : �� ���� �̸�
				fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));// infile�̶� �̸���
																										// ������ ������ �޾ƿ�
																										// fin�� ����
				String str = null;
				while ((str = fin.readLine()) != null) {// fin�� ������ readline���� ���پ� �о����
//					System.out.println(str);
					ta.append(str + "\r\n");// ta�� �о�� fin�� ���� ����
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		} else if (ob == save) {
			fd.setMode(FileDialog.SAVE);
			// ta�� ������ �޾ƿ�
			// ����
			try {
				BufferedReader in = new BufferedReader(new StringReader(fd.getFile()));
				String outfile = in.readLine();// outfile : ������ ���� �̸�
				fw = new FileWriter(new File(outfile)); // outfile�̶�� �̸��� fw��� file�� ����
				String str = ta.getText();// ta�� ���� �о����
				fw.write(str);// fw ���Ͽ� ta�� ���뾲��

			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if (fw != null)
						fw.close();
					if (fin != null)
						fin.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		} else if (ob == exit) {
			System.exit(0);
		}

	}

}
