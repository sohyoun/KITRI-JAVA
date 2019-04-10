package com.kitri.chat.util;

public class ChatConstance {
	public static final int PORT = 9876; // �ٲ� �� ����.
	
	//protocol ����
//	��
//	client >> server
//	����				100|��ȭ�� 
//	������޼���	200|�޼���
//	Ư������޼���	250|�����|�޼���
//	����������		300|�����|�޼���
//	��ȭ����		400|�����Ҵ�ȭ��
//	��������			900|
	public static final int CS_CONNECT = 100;
	public static final int CS_ALL = 200;
	public static final int CS_TO = 250;
	public static final int CS_PAPER = 300;
	public static final int CS_RENAME = 400;
	public static final int CS_DISCONNECT = 900;
	
	
//	����
//	server >> client
//	����				100|�����ڴ�ȭ�� 
//	�޼���(��ü)		200|[���������ȭ��]|�޼���
//	�޼���(Ư��)		250|���������ȭ��,������
//	����������		300|���������ȭ��|�޼���
//	��ȭ����		400|��������ȭ��|�����Ĵ�ȭ��
//	��������			900|�����ڴ�ȭ��
	public static final int SC_CONNECT = 100;
	public static final int SC_MESSAGE = 200;
	public static final int SC_PAPER = 300;
	public static final int SC_RENAME = 400;
	public static final int SC_DISCONNECT = 900;
}

