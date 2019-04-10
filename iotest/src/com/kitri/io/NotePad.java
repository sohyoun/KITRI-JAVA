package com.kitri.io;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class NotePad extends Frame implements ActionListener {
	TextArea ta = new TextArea();

	MenuBar mb = new MenuBar();
	Menu file = new Menu("파일");
	Menu help = new Menu("도움말");
	MenuItem open = new MenuItem("열기");
	MenuItem save = new MenuItem("저장");
	MenuItem exit = new MenuItem("종료");

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

				String infile = path.readLine()+File.separator+in.readLine();// infile : 열 파일 이름
				fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));// infile이란 이름의
																										// 파일의 내용을 받아와
																										// fin에 저장
				String str = null;
				while ((str = fin.readLine()) != null) {// fin의 내용을 readline으로 한줄씩 읽어오기
//					System.out.println(str);
					ta.append(str + "\r\n");// ta에 읽어온 fin의 내용 쓰기
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		} else if (ob == save) {
			fd.setMode(FileDialog.SAVE);
			// ta에 써진거 받아옴
			// 저장
			try {
				BufferedReader in = new BufferedReader(new StringReader(fd.getFile()));
				String outfile = in.readLine();// outfile : 저장할 파일 이름
				fw = new FileWriter(new File(outfile)); // outfile이라는 이름의 fw라는 file을 만듦
				String str = ta.getText();// ta의 내용 읽어오기
				fw.write(str);// fw 파일에 ta의 내용쓰기

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
