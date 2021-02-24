package native_jdbc_programing.ui;

import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DepartmentUI extends JFrame {

	private JPanel contentPane;
	private JPanel pDept;
	private JPanel pBtn;
	private JPanel pList;
	private JLabel lblDeptNO;
	private JTextField tfDeptName;
	private JLabel lblDeptName;
	private JTextField tfDeptNO;
	private JLabel lblFloor;
	private JTextField tfFloor;
	private JButton btnAdd;
	private JButton btnCancel;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepartmentUI frame = new DepartmentUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DepartmentUI() {
		setTitle("부서정보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		pDept = new JPanel();
		contentPane.add(pDept);
		pDept.setLayout(new GridLayout(0, 2, 10, 0));
		
		lblDeptNO = new JLabel("부서번호");
		lblDeptNO.setHorizontalAlignment(SwingConstants.RIGHT);
		pDept.add(lblDeptNO);
		
		tfDeptNO = new JTextField();
		pDept.add(tfDeptNO);
		tfDeptNO.setColumns(10);
		
		lblDeptName = new JLabel("부서명");
		lblDeptName.setHorizontalAlignment(SwingConstants.RIGHT);
		pDept.add(lblDeptName);
		
		tfDeptName = new JTextField();
		pDept.add(tfDeptName);
		tfDeptName.setColumns(10);
		
		lblFloor = new JLabel("위치");
		lblFloor.setHorizontalAlignment(SwingConstants.RIGHT);
		pDept.add(lblFloor);
		
		tfFloor = new JTextField();
		pDept.add(tfFloor);
		tfFloor.setColumns(10);
		
		pBtn = new JPanel();
		contentPane.add(pBtn);
		
		btnAdd = new JButton("추가");
		pBtn.add(btnAdd);
		
		btnCancel = new JButton("취소");
		pBtn.add(btnCancel);
		
		pList = new JPanel();
		contentPane.add(pList);
		pList.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		pList.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{1, "개발", 8},
			},
			new String[] {
				"부서번호", "부서명", "위치"
			}
		));
		scrollPane.setViewportView(table);
	}

}
