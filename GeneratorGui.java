package finalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;

import org.w3c.dom.css.DocumentCSS;

import javax.swing.JMenuBar;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.Button;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

/**
 * A GUI class to create a WoD starting character and save the information to a file on your
 * computer.
 * @author Suzanne Woods
 *
 */
public class GeneratorGui extends JFrame {

	/**
	 * Content Pane
	 */
	private JPanel contentPane;
	/**
	 * Character Name Text Field
	 */
	private JTextField txtChName;
	/**
	 * Character Age Text Field
	 */
	private JTextField txtChAge;
	/**
	 * Player Name Text Field
	 */
	private JTextField txtPlName;
	/**
	 * Virtue Drop Down Box
	 */
	private JComboBox cmbVirtue;
	/**
	 * Vice Drop Down Box
	 */
	private JComboBox cmbVice;
	/**
	 * CardLayout for contentPane
	 */
	private CardLayout cardLayout = new CardLayout();
	/**
	 * Label to display Saved Attributes
	 */
	private JTextArea lblAttrFinal;
	/**
	 * Label to display Natural Stats
	 */
	private JTextArea taNatStats;
	/**
	 * Primary Points Left
	 */
	private int pri = 5;
	/**
	 * Secondary Points left
	 */
	private int sec = 4;
	/**
	 * Tertiary Points Left
	 */
	private int tert = 3;
	/**
	 * Character Object
	 */
	Character char1 = null;
	/**
	 * Attribute Object
	 */
	Attributes attr = null;
	/**
	 * Attribute Description Text Area
	 */
	private JTextArea txtrAttributesDescription;
	/**
	 * Mental Drop down menu in Attribute Panel
	 */
	private JComboBox cmboMental_1;
	/**
	 * Physical Drop down menu in Attribute Panel
	 */
	private JComboBox cmboPhysical_1;
	/**
	 * Social Drop down menu in Attribute Panel
	 */
	private JComboBox cmboSocial_1;
	
	//Labels for each category in Attributes
	private JLabel lblMental_1;
	private JLabel lblPhysical_1;
	private JLabel lblSocial_1;
	private JLabel lblIntelligence_1;
	private JLabel lblWits_1;
	private JLabel lblResolve_1;
	private JLabel lblMenPts_1;
	private JLabel lblSocPts_1;
	private JLabel lblStamina_1;
	private JLabel lblDex_1;
	private JLabel lblStrength_1;
	private JLabel lblPhysPts_1;
	private JLabel lblPres_1;
	private JLabel lblMani_1;
	private JLabel lblComp_1;
	
	//Intelligence Radio Buttons
	private JRadioButton rbInt1_1;
	private JRadioButton rbInt2_1;
	private JRadioButton rbInt3_1;
	private JRadioButton rbInt4_1;
	private JRadioButton rbInt5_1;
	
	//Wits Radio Buttons
	private JRadioButton rbWits1_1;
	private JRadioButton rbWits2_1;
	private JRadioButton rbWits3_1;
	private JRadioButton rbWits4_1;
	private JRadioButton rbWits5;
	
	//Resolve Radio Buttons
	private JRadioButton rbRes1_1;
	private JRadioButton rbRes2_1;
	private JRadioButton rbRes3_1;
	private JRadioButton rbRes4_1;
	private JRadioButton rbRes5_1;
	
	//Strength Radio Buttons
	private JRadioButton rbStrength1_1;
	private JRadioButton rbStrength2_1;
	private JRadioButton rbStrength3_1;
	private JRadioButton rbStrength4_1;
	private JRadioButton rbStrength5_1;
	
	//Dexterity Radio Buttons
	private JRadioButton rbDex1_1;
	private JRadioButton rbDex2_1;
	private JRadioButton rbDex3_1;
	private JRadioButton rbDex4_1;
	private JRadioButton rbDex5_1;
	
	//Stamina Radio Buttons
	private JRadioButton rbStam1_1;
	private JRadioButton rbStam2_1;
	private JRadioButton rbStam3_1;
	private JRadioButton rbStam4_1;
	private JRadioButton rbStam5_1;

	//Manipulation Radio Buttons
	private JRadioButton rbMani1_1;
	private JRadioButton rbMani2_1;
	private JRadioButton rbMani3_1;
	private JRadioButton rbMani4_1;
	private JRadioButton rbMani5_1;
	
	//Composure Radio Buttons
	private JRadioButton rbComp1_1;
	private JRadioButton rbComp2_1;
	private JRadioButton rbComp3_1;
	private JRadioButton rbComp4_1;
	private JRadioButton rbComp5_1;
	
	//Presence Radio Buttons
	private JRadioButton rbPres1_1;
	private JRadioButton rbPres2_1;
	private JRadioButton rbPres3_1;
	private JRadioButton rbPres4_1;
	private JRadioButton rbPres5_1;
	
	/**
	 * Attributes Save Button
	 */
	private JButton btnSave_1;
	/**
	 * Attributes Reset Button
	 */
	private JButton btnReset_1;
	/**
	 * Virtue Description Text Area
	 */
	private JTextArea txtrVirtue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneratorGui frame = new GeneratorGui();
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
	public GeneratorGui() {
		setBackground(SystemColor.activeCaption);		
		createFrame();
		createContentPane();
		JMenuBar menuBar = createMainMenu();
		setJMenuBar(menuBar);		
		createPnlGeneral();		
		createPnlAttributes();
		createPnlNatStats();		
	}
	
	/**
	 * A method that creates the Natural Stats Panel and formats it
	 */
	private void createPnlNatStats()
	{
		//create the panel
		JPanel pnlNaturalStats = new JPanel();
		pnlNaturalStats.setBackground(SystemColor.inactiveCaption);
		contentPane.add(pnlNaturalStats, "Natural Stats");
		pnlNaturalStats.setLayout(new BorderLayout(0, 0));
		
		//create the text area to explain points
		JTextArea txtrNaturalStatsAre = new JTextArea();
		txtrNaturalStatsAre.setBackground(SystemColor.inactiveCaption);
		txtrNaturalStatsAre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtrNaturalStatsAre.setBorder(new EmptyBorder(20, 20, 0, 0));
		txtrNaturalStatsAre.setFocusable(false);
		txtrNaturalStatsAre.setEditable(false);
		txtrNaturalStatsAre.setText("Natural Stats are advantages and traits derived from your character's"
				+ " Attributes. \r\nSize = 5 for all starting characters\r\nMorality = 7 for all starting "
				+ "characters\r\nSpeed = Strength + Dexterity + 5\r\nInitiative Modification = Dexterity "
				+ "+ Composure\r\nDefense = The lowest of Dexterity or Wits\r\nHealth = Stamina + Size\r\n"
				+ "Willpower = Resolve + Composure");
		pnlNaturalStats.add(txtrNaturalStatsAre, BorderLayout.NORTH);
		
		//Create Attribute Text Area
		lblAttrFinal = new JTextArea("");		
		lblAttrFinal.setBackground(SystemColor.inactiveCaption);
		lblAttrFinal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAttrFinal.setBorder(new EmptyBorder(20, 20, 0, 0));
		lblAttrFinal.setEditable(false);
		pnlNaturalStats.add(lblAttrFinal, BorderLayout.WEST);
		
		//create Natural Stat Area
		taNatStats = new JTextArea("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\tNeed to Save General Info and "
				+ "Attributes to Calculate Natural Stats");
		taNatStats.setBackground(SystemColor.inactiveCaption);
		taNatStats.setFont(new Font("Tahoma", Font.PLAIN, 14));
		taNatStats.setEditable(false);
		taNatStats.setBorder(new EmptyBorder(20, 100, 0, 0));
		pnlNaturalStats.add(taNatStats, BorderLayout.CENTER);
		
		//WoD Banner at the bottom of Natural Stats
		JLabel lblNatStatBanner = new JLabel("");
		lblNatStatBanner.setHorizontalAlignment(SwingConstants.LEFT);
		lblNatStatBanner.setIcon(new ImageIcon(GeneratorGui.class.getResource("/finalProject/banner-wod.png")));
		pnlNaturalStats.add(lblNatStatBanner, BorderLayout.SOUTH);
	}

	/**
	 * A method to create the Attribute Panel and format the panel
	 */
	private void createPnlAttributes() {
		JPanel pnlAttributes = new JPanel();
		pnlAttributes.setName("2");
		pnlAttributes.setBackground(SystemColor.inactiveCaption);
		contentPane.add(pnlAttributes, "Attributes");
		
		//Text Area with instructions on points
		txtrAttributesDescription = new JTextArea();
		txtrAttributesDescription.setBackground(SystemColor.inactiveCaption);
		txtrAttributesDescription.setEditable(false);
		txtrAttributesDescription.setFocusable(false);
		txtrAttributesDescription.setVerifyInputWhenFocusTarget(false);
		txtrAttributesDescription.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtrAttributesDescription.setLineWrap(true);
		txtrAttributesDescription.setText("Attributes: Innate Abilities - The first point in each attribute "
				+ "is free. Choose a primary category ie: If you character is a brainiac, \r\nprimary would "
				+ "be Mental. If he/she is a jock, primary would be Physical. \r\nYou can spend additional "
				+ "points in each category: 5/4/3\r\n5 in your primary category (Mental, Physical or "
				+ "Social)\r\n4 in your secondary category \r\n3 in your tertiary category\r\nThe fifth dot"
				+ " in any attribute will cost you 2 points.");
		
		//create dropdown menu labels
		lblMental_1 = new JLabel("Mental");		
		lblPhysical_1 = new JLabel("Physical");		
		lblSocial_1 = new JLabel("Social");
		
		//create dropdown menus
		cmboMental_1 = new JComboBox();		
		cmboMental_1.setBackground(SystemColor.activeCaption);
		cmboMental_1.setModel(new DefaultComboBoxModel(new String[] {"", "Primary", "Secondary", "Tertiary"}));		
		
		cmboPhysical_1 = new JComboBox();
		cmboPhysical_1.setBackground(SystemColor.activeCaption);
		cmboPhysical_1.setModel(new DefaultComboBoxModel(new String[] {"", "Primary", "Secondary", "Tertiary"}));
		
		cmboSocial_1 = new JComboBox();
		cmboSocial_1.setBackground(SystemColor.activeCaption);
		cmboSocial_1.setModel(new DefaultComboBoxModel(new String[] {"", "Primary", "Secondary", "Tertiary"}));		
		
		//create Mental Radio Button Labels
		lblIntelligence_1 = new JLabel("Intelligence");		
		lblWits_1 = new JLabel("Wits");		
		lblResolve_1 = new JLabel("Resolve");
		
		//create Intelligence Radio Buttons
		rbInt1_1 = new JRadioButton("");
		rbInt1_1.setBackground(SystemColor.inactiveCaption);
		rbInt1_1.setEnabled(false);
		rbInt1_1.setFocusable(false);
		rbInt1_1.setSelected(true);		
		rbInt2_1 = new JRadioButton("");			
		rbInt2_1.setName("Int2");
		rbInt2_1.setBackground(SystemColor.inactiveCaption);
		rbInt3_1 = new JRadioButton("");		
		rbInt3_1.setName("Int3");
		rbInt3_1.setBackground(SystemColor.inactiveCaption);
		rbInt4_1 = new JRadioButton("");		
		rbInt4_1.setName("Int4");
		rbInt4_1.setBackground(SystemColor.inactiveCaption);
		rbInt5_1 = new JRadioButton("");
		rbInt5_1.setName("2");
		rbInt5_1.setBackground(SystemColor.inactiveCaption);
		rbInt5_1.setToolTipText("Cost = 2 points");			
	
		//create Intelligence RB Array
		JRadioButton[] intBtns = {rbInt1_1, rbInt2_1, rbInt3_1, rbInt4_1, rbInt5_1};
		
		//create Wits Radio Buttons
		rbWits1_1 = new JRadioButton("");
		rbWits1_1.setBackground(SystemColor.inactiveCaption);
		rbWits1_1.setEnabled(false);
		rbWits1_1.setSelected(true);		
		rbWits2_1 = new JRadioButton("");		
		rbWits2_1.setName("Wits2");
		rbWits2_1.setBackground(SystemColor.inactiveCaption);
		rbWits3_1 = new JRadioButton("");		
		rbWits3_1.setName("Wits3");
		rbWits3_1.setBackground(SystemColor.inactiveCaption);
		rbWits4_1 = new JRadioButton("");		
		rbWits4_1.setName("Wits4");
		rbWits4_1.setBackground(SystemColor.inactiveCaption);
		rbWits5 = new JRadioButton("");
		rbWits5.setName("2");
		rbWits5.setBackground(SystemColor.inactiveCaption);
		rbWits5.setToolTipText("Cost = 2 points");
		
		//create Wits RB Array
		JRadioButton[] witBtns = {rbWits1_1, rbWits2_1, rbWits3_1, rbWits4_1, rbWits5};
		
		//create Resolve Radio Buttons
		rbRes1_1 = new JRadioButton("");
		rbRes1_1.setBackground(SystemColor.inactiveCaption);
		rbRes1_1.setEnabled(false);
		rbRes1_1.setSelected(true);		
		rbRes2_1 = new JRadioButton("");		
		rbRes2_1.setName("Res2");
		rbRes2_1.setBackground(SystemColor.inactiveCaption);
		rbRes3_1 = new JRadioButton("");		
		rbRes3_1.setName("Res3");
		rbRes3_1.setBackground(SystemColor.inactiveCaption);
		rbRes4_1 = new JRadioButton("");		
		rbRes4_1.setName("Res4");
		rbRes4_1.setBackground(SystemColor.inactiveCaption);
		rbRes5_1 = new JRadioButton("");
		rbRes5_1.setName("2");
		rbRes5_1.setBackground(SystemColor.inactiveCaption);
		rbRes5_1.setToolTipText("Cost = 2 points");
		
		//create Resolve RB Array
		JRadioButton[] resBtns = {rbRes1_1, rbRes2_1, rbRes3_1, rbRes4_1, rbRes5_1};
		
		//create Array of Mental Radio Buttons
		JRadioButton[] mentalBtns = {rbInt2_1, rbInt3_1, rbInt4_1, rbInt5_1,
				rbWits2_1, rbWits3_1, rbWits4_1, rbWits5, rbRes2_1, rbRes3_1,
				rbRes4_1, rbRes5_1};		
		
		//create Physical Radio Button Labels
		lblStrength_1 = new JLabel("Strength");		
		lblDex_1 = new JLabel("Dexterity");		
		lblStamina_1 = new JLabel("Stamina");
		
		//create Stamina radio buttons
		rbStam1_1 = new JRadioButton("");
		rbStam1_1.setBackground(SystemColor.inactiveCaption);
		rbStam1_1.setEnabled(false);
		rbStam1_1.setSelected(true);		
		rbStam2_1 = new JRadioButton("");		
		rbStam2_1.setName("Sta2");
		rbStam2_1.setBackground(SystemColor.inactiveCaption);
		rbStam3_1 = new JRadioButton("");		
		rbStam3_1.setName("Sta3");
		rbStam3_1.setBackground(SystemColor.inactiveCaption);
		rbStam4_1 = new JRadioButton("");		
		rbStam4_1.setName("Sta4");
		rbStam4_1.setBackground(SystemColor.inactiveCaption);
		rbStam5_1 = new JRadioButton("");
		rbStam5_1.setName("2");
		rbStam5_1.setBackground(SystemColor.inactiveCaption);
		rbStam5_1.setToolTipText("Cost = 2 points");
		
		//create Stamina RB Array
		JRadioButton[] stamBtns = {rbStam1_1, rbStam2_1, rbStam3_1, rbStam4_1, rbStam5_1};
		
		//create Dexterity Radio Buttons
		rbDex1_1 = new JRadioButton("");
		rbDex1_1.setBackground(SystemColor.inactiveCaption);
		rbDex1_1.setEnabled(false);
		rbDex1_1.setSelected(true);		
		rbDex2_1 = new JRadioButton("");		
		rbDex2_1.setName("Str2");
		rbDex2_1.setBackground(SystemColor.inactiveCaption);
		rbDex3_1 = new JRadioButton("");		
		rbDex3_1.setName("Str3");
		rbDex3_1.setBackground(SystemColor.inactiveCaption);
		rbDex4_1 = new JRadioButton("");		
		rbDex4_1.setName("Str4");
		rbDex4_1.setBackground(SystemColor.inactiveCaption);
		rbDex5_1 = new JRadioButton("");
		rbDex5_1.setName("2");
		rbDex5_1.setBackground(SystemColor.inactiveCaption);
		rbDex5_1.setToolTipText("Cost = 2 points");
		
		//create Dexterity RB Array
		JRadioButton[] dexBtns = {rbDex1_1, rbDex2_1, rbDex3_1, rbDex4_1, rbDex5_1};
		
		//create Strength radio buttons
		rbStrength1_1 = new JRadioButton("");
		rbStrength1_1.setBackground(SystemColor.inactiveCaption);
		rbStrength1_1.setEnabled(false);
		rbStrength1_1.setSelected(true);		
		rbStrength2_1 = new JRadioButton("");		
		rbStrength2_1.setName("Str2");
		rbStrength2_1.setBackground(SystemColor.inactiveCaption);
		rbStrength3_1 = new JRadioButton("");		
		rbStrength3_1.setName("Str3");
		rbStrength3_1.setBackground(SystemColor.inactiveCaption);
		rbStrength4_1 = new JRadioButton("");		
		rbStrength4_1.setName("Str4");
		rbStrength4_1.setBackground(SystemColor.inactiveCaption);
		rbStrength5_1 = new JRadioButton("");
		rbStrength5_1.setName("2");
		rbStrength5_1.setBackground(SystemColor.inactiveCaption);
		rbStrength5_1.setToolTipText("Cost = 2 points");
		
		//create Strength RB Array
		JRadioButton[] strBtns = {rbStrength1_1, rbStrength2_1, rbStrength3_1, rbStrength4_1, rbStrength5_1};
		
		//create Array of Physical Radio Buttons		
		JRadioButton[] physicalBtns = {rbStam2_1, rbStam3_1, rbStam4_1, rbStam5_1,
				rbDex2_1, rbDex3_1, rbDex4_1, rbDex5_1, rbStrength2_1, rbStrength3_1,
				rbStrength4_1, rbStrength5_1};	
	
		//create Social Radio Button Labels
		lblPres_1 = new JLabel("Presence");		
		lblMani_1 = new JLabel("Manipulation");		
		lblComp_1 = new JLabel("Composure");
		
		//create Composure Radio Buttons
		rbComp1_1 = new JRadioButton("");
		rbComp1_1.setBackground(SystemColor.inactiveCaption);
		rbComp1_1.setEnabled(false);
		rbComp1_1.setSelected(true);
		rbComp2_1 = new JRadioButton("");
		rbComp2_1.setName("Sta2");
		rbComp2_1.setBackground(SystemColor.inactiveCaption);
		rbComp3_1 = new JRadioButton("");
		rbComp3_1.setName("Sta3");
		rbComp3_1.setBackground(SystemColor.inactiveCaption);
		rbComp4_1 = new JRadioButton("");
		rbComp4_1.setName("Sta4");
		rbComp4_1.setBackground(SystemColor.inactiveCaption);
		rbComp5_1 = new JRadioButton("");
		rbComp5_1.setName("2");
		rbComp5_1.setBackground(SystemColor.inactiveCaption);
		rbComp5_1.setToolTipText("Cost = 2 points");
		
		//create Composure RB Array
		JRadioButton[] compBtns = {rbComp1_1, rbComp2_1, rbComp3_1, rbComp4_1, rbComp5_1};
		
		//create Manipulation Radio Buttons
		rbMani1_1 = new JRadioButton("");
		rbMani1_1.setBackground(SystemColor.inactiveCaption);
		rbMani1_1.setEnabled(false);
		rbMani1_1.setSelected(true);
		rbMani2_1 = new JRadioButton("");
		rbMani2_1.setName("Sta2");
		rbMani2_1.setBackground(SystemColor.inactiveCaption);
		rbMani3_1 = new JRadioButton("");
		rbMani3_1.setName("Sta3");
		rbMani3_1.setBackground(SystemColor.inactiveCaption);
		rbMani4_1 = new JRadioButton("");
		rbMani4_1.setName("Sta4");
		rbMani4_1.setBackground(SystemColor.inactiveCaption);
		rbMani5_1 = new JRadioButton("");
		rbMani5_1.setName("2");
		rbMani5_1.setBackground(SystemColor.inactiveCaption);
		rbMani5_1.setToolTipText("Cost = 2 points");
		
		//create Manipulation RB Array
		JRadioButton[] maniBtns = {rbMani1_1, rbMani2_1, rbMani3_1, rbMani4_1, rbMani5_1};
		
		//create Presence Radio Buttons
		rbPres1_1 = new JRadioButton("");
		rbPres1_1.setBackground(SystemColor.inactiveCaption);
		rbPres1_1.setEnabled(false);
		rbPres1_1.setSelected(true);		
		rbPres2_1 = new JRadioButton("");
		rbPres2_1.setName("Sta2");
		rbPres2_1.setBackground(SystemColor.inactiveCaption);
		rbPres3_1 = new JRadioButton("");		
		rbPres3_1.setName("Sta3");
		rbPres3_1.setBackground(SystemColor.inactiveCaption);
		rbPres4_1 = new JRadioButton("");
		rbPres4_1.setName("Sta4");
		rbPres4_1.setBackground(SystemColor.inactiveCaption);
		rbPres5_1 = new JRadioButton("");
		rbPres5_1.setName("2");
		rbPres5_1.setBackground(SystemColor.inactiveCaption);
		rbPres5_1.setToolTipText("Cost = 2 points");
		
		//create Presence RB Array
		JRadioButton[] presBtns = {rbPres1_1, rbPres2_1, rbPres3_1, rbPres4_1, rbPres5_1};
		
		//create Array of Social Radio Buttons
		JRadioButton[] socialBtns = {rbComp2_1, rbComp3_1, rbComp4_1, rbComp5_1, rbMani2_1,
				rbMani3_1, rbMani4_1, rbMani5_1, rbPres2_1, rbPres3_1, rbPres4_1, rbPres5_1};		
		
		//disable all buttons
		disableAllBtns(mentalBtns, physicalBtns, socialBtns);
		
		//create Points Left Labels		
		lblMenPts_1 = new JLabel("Points Left: 0");		
		lblPhysPts_1 = new JLabel("Points Left: 0");		
		lblSocPts_1 = new JLabel("Points Left: 0");
		
		//create Save Button
		btnSave_1 = new JButton("Save Attributes");
		btnSave_1.setBackground(SystemColor.activeCaption);
		btnSave_1.setFocusable(false);
		btnSave_1.setSelectedIcon(null);		
		
		//create Reset Button
		btnReset_1 = new JButton("Reset");
		btnReset_1.setBackground(SystemColor.activeCaption);
		btnReset_1.setFocusable(false);
		
		//If Reset button is hit, set Primary, Secondary and Tertiary points back
		//to starting value. Set dropdown menus back to empty. Unselect all radio
		//buttons and disable. Reset button is invisible. Save button is enabled.
		//Attribute label in Natural Stats is reset. Natural Stats label is also
		//reset.
		btnReset_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pri = 5;
				sec = 4;
				tert = 3;
				cmboMental_1.setSelectedIndex(0);
				cmboPhysical_1.setSelectedIndex(0);
				cmboSocial_1.setSelectedIndex(0);
				btnReset_1.setVisible(false);
				btnSave_1.setEnabled(true);
				btnSave_1.setText("Save Attributes");
				lblAttrFinal.setText("");
				taNatStats.setText("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\tNeed to Save General Info and Attributes to Calculate Natural Stats");				
			}
		});
		btnReset_1.setVisible(false);
		
		//What happens when I hit save in attributes?
		btnSave_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//check that the user spent all points before saving.
				if (pri != 0 || sec != 0 || tert != 0) JOptionPane.showMessageDialog(null, "Please complete all categories before saving");
				//if all points are spent, create the attributes object
				else {
					attr = new Attributes(countBtns(intBtns), countBtns(witBtns), countBtns(resBtns),
							countBtns(strBtns), countBtns(dexBtns), countBtns(stamBtns), countBtns(presBtns),
							countBtns(maniBtns), countBtns(compBtns));
					//calculate the natural stats, give notification it is saved, disable the save button, enable the reset button
					// disable all radio buttons, change the labels in Natural Stats to reflect the changes
					try {
						char1.calculateNatStats(attr);
						btnSave_1.setText("Yay! Saved!");
						btnSave_1.setEnabled(false);
						btnReset_1.setVisible(true);
						disableAllBtns(mentalBtns, physicalBtns, socialBtns);						
						lblAttrFinal.setText(attr.toString());
						try {
							taNatStats.setText(char1.natStats());
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, "Save General Info before completing Attributes.");
						}
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Save General Info before completing Attributes.");
					}					
				}			
			}			
		});
		
		//create GroupLayout for Attribute Panel
		GroupLayout gl_pnlAttributes = glAttributes(pnlAttributes, txtrAttributesDescription, lblMental_1,
				lblPhysical_1, lblSocial_1, cmboMental_1, cmboPhysical_1, cmboSocial_1, lblIntelligence_1, lblWits_1, lblResolve_1,
				rbInt1_1, rbInt2_1, rbInt3_1, rbInt4_1, rbInt5_1, rbWits1_1, rbWits2_1, rbWits3_1, rbWits4_1, rbWits5, rbRes1_1, rbRes2_1,
				rbRes3_1, rbRes4_1, rbRes5_1, lblStrength_1, lblDex_1, lblStamina_1, rbStam1_1, rbStam2_1, rbStam3_1, rbStam4_1, rbStam5_1,
				rbDex1_1, rbDex2_1, rbDex3_1, rbDex4_1, rbDex5_1, rbStrength1_1, rbStrength2_1, rbStrength3_1, rbStrength4_1, rbStrength5_1,
				lblPres_1, lblMani_1, lblComp_1, rbComp1_1, rbComp2_1, rbComp3_1, rbComp4_1, rbComp5_1, rbMani1_1, rbMani2_1, rbMani3_1,
				rbMani4_1, rbMani5_1, rbPres1_1, rbPres2_1, rbPres3_1, rbPres4_1, rbPres5_1, lblMenPts_1, lblPhysPts_1, lblSocPts_1,
				btnSave_1, btnReset_1);
		
		//Sets the points for Mental dropdown box based on what is chosen. 5 = Primary, 4 = Secondary, 3 = Tertiary
		cmboMental_1.addItemListener(new ItemListener() 
		{
			public void itemStateChanged(ItemEvent e) 
			{
				turnOnRadioButtons(mentalBtns, cmboMental_1);
				cmboItemSelected(e, cmboMental_1, cmboPhysical_1, cmboSocial_1);
				cmboPtsAwarded(e, lblMenPts_1);				
			}			
		});
		
		//Sets the points for Physical dropdown box based on what is chosen. 5 = Primary, 4 = Secondary, 3 = Tertiary
		cmboPhysical_1.addItemListener(new ItemListener() 
		{
			public void itemStateChanged(ItemEvent e) 
			{
				turnOnRadioButtons(physicalBtns, cmboPhysical_1);
				cmboItemSelected(e, cmboMental_1, cmboPhysical_1, cmboSocial_1);
				cmboPtsAwarded(e, lblPhysPts_1);
			}
		});
		
		//Sets the points for Social dropdown box based on what is chosen. 5 = Primary, 4 = Secondary, 3 = Tertiary
		cmboSocial_1.addItemListener(new ItemListener() 
		{
			public void itemStateChanged(ItemEvent e) 
			{
				turnOnRadioButtons(socialBtns, cmboSocial_1);	
				cmboItemSelected(e, cmboMental_1, cmboPhysical_1, cmboSocial_1);
				cmboPtsAwarded(e, lblSocPts_1);				
			}
		});
		
		//create ItemListener for Mental Buttons. Deducts points when selected and adds back when
		//unselected.
		ItemListener mentalListener = new ItemListener()
		{
			public void itemStateChanged(ItemEvent e) 
			{
				setListener(intBtns, witBtns, resBtns, mentalBtns, e, cmboMental_1, lblMenPts_1);					
			}				
		};
		
		//create ItemListener for Physical Buttons Deducts points when selected and adds back when
		//unselected.
		ItemListener physicalListener = new ItemListener()
		{
			public void itemStateChanged(ItemEvent e) 
			{
				setListener(strBtns, dexBtns, stamBtns, physicalBtns, e, cmboPhysical_1, lblPhysPts_1);						
			}			
		};
		
		//create ItemListener for Social Buttons. Deducts points when selected and adds back when
		//unselected.
		ItemListener socialListener = new ItemListener()
		{
			public void itemStateChanged(ItemEvent e) 
			{
				setListener(presBtns, maniBtns, compBtns, socialBtns, e, cmboSocial_1, lblSocPts_1);				
			}			
		};
		
		//A For Loop to add Item Listener to Mental Radio Buttons
		for (JRadioButton el: mentalBtns)
		{			
			el.addItemListener(mentalListener);
		}
		
		//A For Loop to add Item Listener to Physical Radio Buttons
		for (JRadioButton el: physicalBtns)
		{
			el.addItemListener(physicalListener);
		}
		
		//A For Loop to add Item Listener to Social Radio Buttons
		for (JRadioButton el: socialBtns)
		{
			el.addItemListener(socialListener);
		}					
		
		// Create the group layout
		pnlAttributes.setLayout(gl_pnlAttributes);		
	}	
	
	/**
	 * A method to create the General Panel and format the panel.
	 */
	private void createPnlGeneral() {
		JPanel pnlGeneral = new JPanel();		
		pnlGeneral.setBackground(SystemColor.inactiveCaption);
		contentPane.add(pnlGeneral, "General");
		
		//create labels
		JLabel lblCharacterName = new JLabel("Character Name:");		
		lblCharacterName.setFocusable(false);
		JLabel lblCharacterAge = new JLabel("Character Age:");		
		lblCharacterAge.setFocusable(false);
		JLabel lblPlayerName = new JLabel("Player Name:");
		lblPlayerName.setFocusable(false);
		JLabel lblVirtue = new JLabel("Virtue:");		
		lblVirtue.setFocusable(false);
		JLabel lblVice = new JLabel("Vice:");
		lblVice.setFocusable(false);
		
		//create text boxes
		txtChName = new JTextField();			
		txtChName.setColumns(10);
		
		txtChAge = new JTextField();
		txtChAge.setColumns(10);
		
		txtPlName = new JTextField();
		txtPlName.setColumns(10);		
		
		//create Drop Down menus for Vice and Virtue based on Enums
		cmbVirtue = new JComboBox();		
		cmbVirtue.setBackground(SystemColor.activeCaption);
		cmbVirtue.setModel(new DefaultComboBoxModel(Virtue.values()));		
		
		cmbVice = new JComboBox();
		cmbVice.setBackground(SystemColor.activeCaption);
		cmbVice.setModel(new DefaultComboBoxModel(Vice.values()));
		
		//create banner at the bottom
		JLabel lblBanner = new JLabel("");
		lblBanner.setHorizontalAlignment(SwingConstants.LEFT);
		lblBanner.setIcon(new ImageIcon(GeneratorGui.class.getResource("/finalProject/banner-wod.png")));
		
		//create saved notification label
		JLabel lblConfirmation = new JLabel("Saved!");
		lblConfirmation.setFocusable(false);
		lblConfirmation.setVisible(false);
		lblConfirmation.setHorizontalAlignment(SwingConstants.CENTER);		
		
		//create file scanner (file will close on save button push)
		Scanner input = new Scanner(GeneratorGui.class.getResourceAsStream("Names.txt"));
		
		//if I push the button, read from the file to generate a name
		JButton btnGenerateName = new JButton("Generate Name");
		btnGenerateName.setBackground(SystemColor.activeCaption);
		btnGenerateName.setFocusable(false);
		btnGenerateName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (input.hasNextLine()) 
				{
					String line = "";
					line = input.nextLine();
					txtChName.setText(line);
				}
				else 
					{
						JOptionPane.showMessageDialog(null, "If you don't like any of my names, get creative!");
						btnGenerateName.setEnabled(false);
					}
			}
		});	
		
		//What happens when I hit save in General Info?
				JButton btnSaveGeneralInfo = new JButton("Save General Info");
				btnSaveGeneralInfo.setBackground(SystemColor.activeCaption);
				btnSaveGeneralInfo.setFocusable(false);
				btnSaveGeneralInfo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						//if any fields are blank, give an error message
						if (txtChName.getText().equals("") || txtChAge.getText().equals("") || txtPlName.getText().equals("")
								|| cmbVice.getSelectedItem().toString().equals("") || cmbVirtue.getSelectedItem().toString().equals(""))
							JOptionPane.showMessageDialog(null, "Complete all fields before saving.");
						else {				
						try {//create Character object and set Vice and Virtue
							char1 = new Character(txtChName.getText(), Integer.parseInt(txtChAge.getText()),
									txtPlName.getText());
							char1.setVice(String.valueOf(cmbVice.getSelectedItem()));
							char1.setVirtue(String.valueOf(cmbVirtue.getSelectedItem()));
							lblConfirmation.setVisible(true);
							input.close();
							btnGenerateName.setEnabled(false);
						} catch (NumberFormatException e1) {
							JOptionPane.showMessageDialog(null, "Age must be a whole number");
						}}				
					}
				});
				
		//Uh Oh! User changed something. Remove saved confirmation.	
		DocumentListener changed = new DocumentListener()
				{
					@Override
					public void insertUpdate(DocumentEvent e) {
						lblConfirmation.setVisible(false);						
					}
					@Override
					public void removeUpdate(DocumentEvent e) {
						lblConfirmation.setVisible(false);						
					}
					@Override
					public void changedUpdate(DocumentEvent e) {
						lblConfirmation.setVisible(false);						
					}			
				};
				
		//Add Listener to Text field so it removed Saved confirmation when updated		
		txtChName.getDocument().addDocumentListener(changed);
		txtChAge.getDocument().addDocumentListener(changed);
		txtPlName.getDocument().addDocumentListener(changed);
		
				
		//create Text Area for Vice and Virtue descriptions
		JTextArea txtrVice = new JTextArea();
		txtrVice.setFocusable(false);
		txtrVice.setBackground(SystemColor.inactiveCaption);
		txtrVice.setLineWrap(true);
		txtrVice.setEditable(false);
		txtrVice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrVice.setWrapStyleWord(true);
		txtrVice.setText("\t          Select a Vice");
		
		txtrVirtue = new JTextArea();
		txtrVirtue.setFocusable(false);
		txtrVirtue.setEditable(false);
		txtrVirtue.setBackground(SystemColor.inactiveCaption);
		txtrVirtue.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrVirtue.setText("\tSelect a Virtue");
		txtrVirtue.setToolTipText("");
		txtrVirtue.setLineWrap(true);
		txtrVirtue.setWrapStyleWord(true);
		
		//ItemListener for the Vice Dropdown
		cmbVice.addItemListener(new ItemListener() 
		{			
			public void itemStateChanged(ItemEvent e) 
			{	
				lblConfirmation.setVisible(false);
				switch (cmbVice.getSelectedItem().toString())
				{
				case "Envy":
					txtrVice.setText(Vice.Envy.viceDescription());					
					break;	
				case "Gluttony":
					txtrVice.setText(Vice.Gluttony.viceDescription());
					break;
				case "Greed":
					txtrVice.setText(Vice.Greed.viceDescription());
					break;
				case "Lust":
					txtrVice.setText(Vice.Lust.viceDescription());
					break;
				case "Pride":
					txtrVice.setText(Vice.Pride.viceDescription());
					break;
				case "Sloth":
					txtrVice.setText(Vice.Sloth.viceDescription());
					break;
				case "Wrath":
					txtrVice.setText(Vice.Wrath.viceDescription());
					break;
				default:
					txtrVice.setText("\t          Select a Vice");
					break;
				}								
			}
		});
		
		//ItemListener for the Virtue Dropdown
		cmbVirtue.addItemListener(new ItemListener() 		{			
			
			public void itemStateChanged(ItemEvent e) 
			{				
				lblConfirmation.setVisible(false);
				switch (cmbVirtue.getSelectedItem().toString())
				{
				case "Charity":
					txtrVirtue.setText(Virtue.Charity.virtueDescription());
					break;	
				case "Faith":
					txtrVirtue.setText(Virtue.Faith.virtueDescription());
					break;
				case "Fortitude":
					txtrVirtue.setText(Virtue.Fortitude.virtueDescription());
					break;
				case "Hope":
					txtrVirtue.setText(Virtue.Hope.virtueDescription());
					break;
				case "Justice":
					txtrVirtue.setText(Virtue.Justice.virtueDescription());
					break;
				case "Prudence":
					txtrVirtue.setText(Virtue.Prudence.virtueDescription());
					break;
				case "Temperance":
					txtrVirtue.setText(Virtue.Temperance.virtueDescription());
					break;
				default:
					txtrVirtue.setText("\tSelect a Virtue");
					break;
				}								
			}
		});		
		
		//Group Layout for General panel aka A hot mess
		GroupLayout gl_pnlGeneral = new GroupLayout(pnlGeneral);
		gl_pnlGeneral.setHorizontalGroup(
			gl_pnlGeneral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlGeneral.createSequentialGroup()
					.addGroup(gl_pnlGeneral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlGeneral.createSequentialGroup()
							.addGroup(gl_pnlGeneral.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlGeneral.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_pnlGeneral.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_pnlGeneral.createSequentialGroup()
											.addGap(35)
											.addComponent(lblCharacterName)
											.addGap(45))
										.addGroup(gl_pnlGeneral.createSequentialGroup()
											.addGap(26)
											.addGroup(gl_pnlGeneral.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(txtChAge, Alignment.LEADING)
												.addComponent(btnGenerateName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(txtPlName, Alignment.LEADING)
												.addComponent(txtChName, Alignment.LEADING))
											.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
									.addGroup(gl_pnlGeneral.createSequentialGroup()
										.addGap(40)
										.addComponent(lblCharacterAge)
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(gl_pnlGeneral.createSequentialGroup()
									.addGap(46)
									.addComponent(lblPlayerName)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_pnlGeneral.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_pnlGeneral.createSequentialGroup()
									.addGroup(gl_pnlGeneral.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnlGeneral.createSequentialGroup()
											.addGap(108)
											.addComponent(cmbVirtue, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
											.addGap(257)
											.addComponent(cmbVice, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_pnlGeneral.createSequentialGroup()
											.addGap(26)
											.addComponent(txtrVirtue, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
											.addGap(26)
											.addComponent(txtrVice, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)))
									.addGap(179))
								.addGroup(gl_pnlGeneral.createSequentialGroup()
									.addGap(136)
									.addComponent(lblVirtue)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblVice)
									.addGap(307))))
						.addComponent(lblBanner, GroupLayout.PREFERRED_SIZE, 910, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnlGeneral.createSequentialGroup()
							.addGap(389)
							.addGroup(gl_pnlGeneral.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlGeneral.createSequentialGroup()
									.addGap(44)
									.addComponent(lblConfirmation))
								.addComponent(btnSaveGeneralInfo))))
					.addContainerGap())
		);
		gl_pnlGeneral.setVerticalGroup(
			gl_pnlGeneral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlGeneral.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_pnlGeneral.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnlGeneral.createSequentialGroup()
							.addComponent(lblVirtue)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbVirtue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlGeneral.createSequentialGroup()
							.addComponent(lblVice)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbVice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlGeneral.createSequentialGroup()
							.addComponent(lblCharacterName)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtChName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(19)
					.addGroup(gl_pnlGeneral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlGeneral.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtrVirtue, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
							.addGroup(gl_pnlGeneral.createSequentialGroup()
								.addComponent(btnGenerateName)
								.addGap(35)
								.addComponent(lblCharacterAge)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtChAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(41)
								.addComponent(lblPlayerName)
								.addGap(8)
								.addComponent(txtPlName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(txtrVice, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSaveGeneralInfo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblConfirmation)
					.addGap(18)
					.addComponent(lblBanner))
		);
		pnlGeneral.setLayout(gl_pnlGeneral);				
	}

	/**
	 * A method to create the Content Pane
	 */
	private void createContentPane() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(cardLayout);
	}	
	
	/**
	 * A method to create the Main Menu and assign menu buttons
	 */
	private JMenuBar createMainMenu() {
		//create the menu bar
		JMenuBar menuBar = new JMenuBar();
		
		//create General menu button and point to General Panel
		JMenuItem mntmGeneral = new JMenuItem("General Info");
		mntmGeneral.setOpaque(true);
		mntmGeneral.setBackground(SystemColor.activeCaption);
		mntmGeneral.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)  {
				cardLayout.show(contentPane, "General");
			}
		});
		menuBar.add(mntmGeneral);
		
		//create the Attributes menu button and point to Attribute Panel
		JMenuItem mntmAttributes = new JMenuItem("Attributes");
		mntmAttributes.setBackground(SystemColor.activeCaption);
		mntmAttributes.setOpaque(true);
		mntmAttributes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)  {
				cardLayout.show(contentPane, "Attributes");
			}
		});
		menuBar.add(mntmAttributes);
		
		//create the Natural Stats menu button and point to Natural Stats panel
		JMenuItem mntmNatStats = new JMenuItem("Natural Stats");
		mntmNatStats.setBackground(SystemColor.activeCaption);
		mntmNatStats.setOpaque(true);
		mntmNatStats.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)  {
				cardLayout.show(contentPane, "Natural Stats");
			}
		});
		menuBar.add(mntmNatStats);
		
		//create the Save menu button and save the character to a file. 
		JMenuItem mntmSave = new JMenuItem("Save Character");
		mntmSave.setBackground(SystemColor.activeCaption);
		mntmSave.setOpaque(true);
		mntmSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)  {				
				if (attr != null) 
				{
					try {						
						writeCharacterToFile(char1, attr, "Character.txt");
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Please complete General section before saving!");
					}					
				}
				else JOptionPane.showMessageDialog(null, "Please complete and save General Info and Attributes");
			}
		});
		menuBar.add(mntmSave);
		
		//create Exit menu button 
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setBackground(SystemColor.activeCaption);
		mntmExit.setOpaque(true);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuBar.add(mntmExit);
		return menuBar;
	}	
	
	/**
	 * A method to write the character information to a file.
	 * @param char1 Character information created
	 * @param attr2 Attributes selected by user
	 * @param fileName File the information will be written to.
	 */
	protected void writeCharacterToFile(Character char1, Attributes attr2, String fileName) 
	{
		JFileChooser fc = new JFileChooser();
		fc.setDialogTitle("Save a File");
		int retVal = fc.showSaveDialog(GeneratorGui.this);
		if (retVal == JFileChooser.APPROVE_OPTION)
		{
			try (Formatter writer = new Formatter(fc.getSelectedFile() + ".txt")) {
				writer.format("%sVirtue: %s%nVice: %s%n%n%s", char1.toString(), char1.getVirtue(), char1.getVice(), attr.toString());
			} catch (Exception ex) {
				System.out.println("File could not be saved");
			}			
		}		
	}	
	
	/**
	 * A method to create the frame.
	 */
	private void createFrame() {
		setTitle("World Of Darkness Character Generator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 913, 797);
		setResizable(false);		
	}	
	
	/** A method that will change the incomplete dropdown menus based on the selection of other dropdown menus on the panel.
	 * @param cmboMental Mental Dropdown Menu
	 * @param e Event = When a new selection is chosen in the dropdown menu
	 * @param cmboPhysical Physical Dropdown Menu
	 * @param cmboSocial Social Dropdown Menu
	 */
	private void cmboItemSelected(ItemEvent e, JComboBox cmboMental, JComboBox cmboPhysical, JComboBox cmboSocial) {
		if(e.getItem().equals("Primary") || e.getItem().equals("Secondary") || e.getItem().equals("Tertiary"))
		{
			JComboBox<String> oppositeBox1 = cmboMental;
			JComboBox<String> oppositeBox2 = cmboMental;
			if(e.getSource().equals(cmboMental))
			{
				oppositeBox1 = cmboPhysical;
				oppositeBox2 = cmboSocial;
			}
			if(e.getSource().equals(cmboPhysical))
			{
				oppositeBox1 = cmboMental;
				oppositeBox2 = cmboSocial;
			}
			if(e.getSource().equals(cmboSocial))
			{
				oppositeBox1 = cmboMental;
				oppositeBox2 = cmboPhysical;
			}
			
			if(e.getStateChange() == ItemEvent.SELECTED)
			{
				oppositeBox1.removeItem(e.getItem());
				oppositeBox2.removeItem(e.getItem());
			}
			else
			{
				oppositeBox1.addItem((String) e.getItem());
				oppositeBox2.addItem((String) e.getItem());
			}
		}
	}	
	
	/**
	 * A method to disable all radio buttons.
	 * @param mBtns Mental Buttons
	 * @param pBtns Physical Buttons
	 * @param sBtns Social Buttons
	 */
	private void disableAllBtns(JRadioButton[] mBtns, JRadioButton[] pBtns, JRadioButton[] sBtns) {
		for(JRadioButton el: mBtns)
		{	
			el.setEnabled(false);
		}
		for(JRadioButton el: pBtns)
		{	
			el.setEnabled(false);
		}
		for(JRadioButton el: sBtns)
		{	
			el.setEnabled(false);
		}
	}
	
	/**
	 * A method to setup the RadioButton listeners to deduct or add points based on the
	 * user selection. It will also disable and enable buttons based on user selection.
	 * 
	 * @param firstBtnSet First row of attribute buttons ie: Intelligence
	 * @param secondBtnSet Second row of attribute buttons ie: Wits
	 * @param thirdBtnSet Third row of attribute buttons ie: Resolve
	 * @param catButtons All buttons in the category ie: Mental
	 * @param e Button clicked on
	 * @param cmbo DropDown Menu for the category
	 * @param points Points Label for the category
	 */
	private void setListener(JRadioButton[] firstBtnSet, JRadioButton[] secondBtnSet, JRadioButton[] thirdBtnSet,
			JRadioButton[] catButtons, ItemEvent e, JComboBox cmbo, JLabel points) 
	{
		//grab the name of the button
		JRadioButton temp = (JRadioButton)e.getSource();
		String tempName = temp.getName();
		
		//add or subtract points based on if selected or unselected
		rbSetPts(e, cmbo, points, catButtons, tempName);
		
		//based on name of the button, enable or disable the next radio button so the user
		//cannot click them out of order.
		for(JRadioButton el: firstBtnSet)
		{
			if(el.equals(temp)) enableBtns(tempName, e, firstBtnSet, cmbo, points);
		}
		for(JRadioButton el: secondBtnSet)
		{
			if(el.equals(temp)) enableBtns(tempName, e, secondBtnSet, cmbo, points);
		}
		for(JRadioButton el: thirdBtnSet)
		{
			if(el.equals(temp)) enableBtns(tempName, e, thirdBtnSet, cmbo, points);
		}
	}
	
	/** A method that will check the dropdown selection and award points based on the option chosen. If all points have been
	 * awarded, the method will throw a dialog box. .
	 * @param cmbo Dropdown Menu
	 * @param e Event = Radio Button Selected
	 * @param points Points label
	 * @param buttons Array of all buttons in the category. ie: Mental, Physical, Social
	 * @param tempName Name of the button selected
	 */
	private void rbSetPts(ItemEvent e, JComboBox cmbo, JLabel points, JRadioButton[] buttons, String tempName) {		
		//If the radio button is selected, check the dropdown menu option and award points based on the option chosen. 		
		if (e.getStateChange() == 1)
		{
			if (cmbo.getSelectedItem() == "Primary") 
			{
				if (tempName.equals("2")) pri -=2;
				else pri -= 1;
				points.setText("Points left: " + pri);	
				if(pri < 0)
				{
					if (e.getStateChange() == 1)
					{
						JOptionPane.showMessageDialog(null, "You are out of points in that category! Go click somewhere else!");
					}			
				}
			}
			if (cmbo.getSelectedItem() == "Secondary") {
				if (tempName.equals("2")) sec -=2;
				else sec -= 1;
				points.setText("Points left: " + sec);	
				if(sec < 0)
				{
					if (e.getStateChange() == 1)
					{
						JOptionPane.showMessageDialog(null, "You are out of points in that category! Go click somewhere else!");
					}			
				}
			}
			if (cmbo.getSelectedItem() == "Tertiary") {
				if (tempName.equals("2")) tert -=2;
				else tert -= 1;
				points.setText("Points left: " + tert);	
				if(tert < 0)
				{
					if (e.getStateChange() == 1)
					{
						JOptionPane.showMessageDialog(null, "You are out of points in that category! Go click somewhere else!");
					}			
				}
			} 		
		}
		else //If the radio button is unselected give the points back to the user. 
		{
			if (cmbo.getSelectedItem() == "Primary") {
				if (tempName.equals("2")) pri +=2;
				else pri += 1;
				points.setText("Points left: " + pri);				
			}
			if (cmbo.getSelectedItem() == "Secondary") {
				if (tempName.equals("2")) sec +=2;
				else sec += 1;
				points.setText("Points left: " + sec);				
			}
			if (cmbo.getSelectedItem() == "Tertiary") {
				if (tempName.equals("2")) tert +=2;
				else tert += 1;
				points.setText("Points left: " + tert);			
			} 
		}
	}	
	
	/**
	 * A method to enable or disable buttons depending on points available and selections
	 * @param tempName Name of button
	 * @param aBtns Attribute button array ie: Intelligence Buttons
	 * @param e Radio Button clicked
	 * @param cmbo Drop Down menu for the category
	 * @param points Label for the points
	 */
	private void enableBtns(String tempName,ItemEvent e, JRadioButton[] aBtns, JComboBox cmbo, JLabel points)
	{
		
		switch (tempName)
		{
			case "Int2":
				setSecondButton(e, aBtns, points);				
				break;
			case "Int3":
				setThirdButton(e, aBtns, points);				
				break;
			case "Int4":
				lastBtn(e, aBtns, cmbo);		
				break;
			case "Wits2":
				setSecondButton(e, aBtns, points);				
				break;
			case "Wits3":
				setThirdButton(e, aBtns, points);			
				break;
			case "Wits4":
				lastBtn(e, aBtns, cmbo);
				break;	
			case "Res2":
				setSecondButton(e, aBtns, points);				
				break;
			case "Res3":
				setThirdButton(e, aBtns, points);				
				break;
			case "Res4":
				lastBtn(e, aBtns, cmbo);
				break;
			case "Str2":
				setSecondButton(e, aBtns, points);			
				break;
			case "Str3":
				setThirdButton(e, aBtns, points);				
				break;
			case "Str4":
				lastBtn(e, aBtns, cmbo);
				break;	
			case "Dex2":
				setSecondButton(e, aBtns, points);				
				break;
			case "Dex3":
				setThirdButton(e, aBtns, points);				
				break;
			case "Dex4":
				lastBtn(e, aBtns, cmbo);
				break;	
			case "Sta2":
				setSecondButton(e, aBtns, points);			
				break;
			case "Sta3":
				setThirdButton(e, aBtns, points);				
				break;
			case "Sta4":
				lastBtn(e, aBtns, cmbo);
				break;	
			case "Pres2":
				setSecondButton(e, aBtns, points);				
				break;
			case "Pres3":
				setThirdButton(e, aBtns, points);				
				break;
			case "Pres4":
				lastBtn(e, aBtns, cmbo);
				break;	
			case "Mani2":
				setSecondButton(e, aBtns, points);				
				break;
			case "Mani3":
				setThirdButton(e, aBtns, points);				
				break;
			case "Mani4":
				lastBtn(e, aBtns, cmbo);
				break;	
			case "Comp2":
				setSecondButton(e, aBtns, points);				
				break;
			case "Comp3":
				setThirdButton(e, aBtns, points);				
				break;
			case "Comp4":
				lastBtn(e, aBtns, cmbo);	
				break;
			default:
				break;
		}		
	}

	/** A method that enables the button after the one just clicked. It will also disable the next 
	 * button if you unselect.
	 * @param e Radio Button clicked
	 * @param aBtns Attribute buttons ie: Intelligence
	 * @param points Label for points
	 */
	private void setThirdButton(ItemEvent e, JRadioButton[] aBtns, JLabel points) {
		JRadioButton temp = (JRadioButton)e.getSource();
		if (temp.isSelected() && !points.toString().equals("Points left: 0")) aBtns[3].setEnabled(true);		
		else aBtns[3].setEnabled(false);
	}

	/** A method that enables the button after the one just clicked. It will also disable the next 
	 * button if you unselect.
	 * @param e Radio Button clicked
	 * @param aBtns Attribute buttons ie: Intelligence
	 * @param points Label for points
	 */
	private void setSecondButton(ItemEvent e, JRadioButton[] aBtns, JLabel points) {
		JRadioButton temp = (JRadioButton)e.getSource();
		if (temp.isSelected() && !points.toString().equals("Points left: 0")) aBtns[2].setEnabled(true);
		else aBtns[2].setEnabled(false);
	}

	/**
	 * A method to check the dropdown menu and amount of points left to see if last button can be 
	 * enabled.
	 * @param e Radio Button selected or not
	 * @param aBtns Attribute Radio Buttons ie: Intelligence
	 * @param cmbo Dropdown Box 
	 */
	private void lastBtn(ItemEvent e, JRadioButton[] aBtns, JComboBox cmbo) {
		if(cmbo.getSelectedItem()== "Primary" && pri >= 2)
		{
			if (e.getStateChange() == 1) aBtns[4].setEnabled(true);
			else aBtns[4].setEnabled(false);			
		}	
		if(cmbo.getSelectedItem()== "Secondary" && sec >= 2)
		{
			if (e.getStateChange() == 1) aBtns[4].setEnabled(true);
			else aBtns[4].setEnabled(false);			
		}
		if(cmbo.getSelectedItem()== "Tertiary" && tert >= 2)
		{
			if (e.getStateChange() == 1) aBtns[4].setEnabled(true);
			else aBtns[4].setEnabled(false);				
		}
	}
	
	/**
 * A method to count the selected radio buttons.
 * @param buttons
 * @return count
 */
	private int countBtns(JRadioButton[] buttons)
	{
		int count = 0;
		for (JRadioButton el: buttons)
		{
			if (el.isSelected()) count++;
		}
		return count;	
	}	
	
	/**
	 * A method that awards points based on the dropdown selection chosen.
	 * @param e Event = button is selected.
	 * @param points The label used to display how many points are left
	 */
	private void cmboPtsAwarded(ItemEvent e, JLabel points) 
	{
		if (e.getItem().equals("Primary"))
			{
				pri = 5;
				points.setText("Points Left: " + pri);				
			}
		if (e.getItem().equals("Secondary"))
			{
				sec = 4;
				points.setText("Points Left: " + sec);				
			}
		if (e.getItem().equals("Tertiary"))
			{
				tert = 3;
				points.setText("Points Left: " + tert);			
			}
		else if (e.getItem().equals(""))
			{
				points.setText("Points Left: 0");				
			}
	}	
	
	/**
	 * A method to activate and deactivate radio buttons based on dropdown menu
	 * @param buttons Array of buttons in the category. ie: Mental buttons
	 * @param cmbo Drop Down menu
	 */
	private void turnOnRadioButtons(JRadioButton[] buttons, JComboBox cmbo) {
		for(JRadioButton el: buttons)
		{
			el.setSelected(false);
			el.setEnabled(false);					
		}
		if(!cmbo.getSelectedItem().equals(""))
		{
			buttons[0].setEnabled(true);
			buttons[4].setEnabled(true);
			buttons[8].setEnabled(true);
		}
	}
	
	/**
	 * A method to create the GroupLayout for the Attribute Panel.
	 */
	private GroupLayout glAttributes(JPanel pnlAttributes, JTextArea txtrAttributesInnateAbilities, JLabel lblMental,
			JLabel lblPhysical, JLabel lblSocial, JComboBox cmboMental, JComboBox cmboPhysical, JComboBox cmboSocial,
			JLabel lblIntelligence, JLabel lblWits, JLabel lblResolve, JRadioButton rbInt1, JRadioButton rbInt2,
			JRadioButton rbInt3, JRadioButton rbInt4, JRadioButton rbInt5, JRadioButton rbWits1, JRadioButton rbWits2,
			JRadioButton rbWits3, JRadioButton rbWits4, JRadioButton rbwits5, JRadioButton rbRes1, JRadioButton rbRes2,
			JRadioButton rbRes3, JRadioButton rbRes4, JRadioButton rbRes5, JLabel lblStrength, JLabel lblDex,
			JLabel lblStamina, JRadioButton rbStam1, JRadioButton rbStam2, JRadioButton rbStam3, JRadioButton rbStam4,
			JRadioButton rbStam5, JRadioButton rbDex1, JRadioButton rbDex2, JRadioButton rbDex3, JRadioButton rbDex4,
			JRadioButton rbDex5, JRadioButton rbStrength1, JRadioButton rbStrength2, JRadioButton rbStrength3,
			JRadioButton rbStrength4, JRadioButton rbStrength5, JLabel lblPres, JLabel lblMani, JLabel lblComp,
			JRadioButton rbComp1, JRadioButton rbComp2, JRadioButton rbComp3, JRadioButton rbComp4,
			JRadioButton rbComp5, JRadioButton rbMani1, JRadioButton rbMani2, JRadioButton rbMani3,
			JRadioButton rbMani4, JRadioButton rbMani5, JRadioButton rbPres1, JRadioButton rbPres2,
			JRadioButton rbPres3, JRadioButton rbPres4, JRadioButton rbPres5, JLabel lblMenPts, JLabel lblPhysPts,
			JLabel lblSocPts, JButton btnSave, JButton btnReset) {
		
		JLabel lblAttBanner = new JLabel("");
		lblAttBanner.setIcon(new ImageIcon(GeneratorGui.class.getResource("/finalProject/banner-wod.png")));
		GroupLayout gl_pnlAttributes = new GroupLayout(pnlAttributes);
		gl_pnlAttributes.setHorizontalGroup(
			gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlAttributes.createSequentialGroup()
					.addGap(32)
					.addComponent(txtrAttributesDescription, GroupLayout.PREFERRED_SIZE, 799, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(75, Short.MAX_VALUE))
				.addGroup(gl_pnlAttributes.createSequentialGroup()
					.addGap(83)
					.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlAttributes.createSequentialGroup()
							.addComponent(cmboMental_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(222)
							.addComponent(cmboPhysical_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
							.addComponent(cmboSocial_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(103))
						.addGroup(gl_pnlAttributes.createSequentialGroup()
							.addGap(15)
							.addComponent(lblMental_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addGap(255)
							.addComponent(lblPhysical_1)
							.addPreferredGap(ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
							.addComponent(lblSocial_1)
							.addGap(132))))
				.addGroup(gl_pnlAttributes.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlAttributes.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblIntelligence_1))
						.addComponent(lblWits_1)
						.addComponent(lblResolve_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlAttributes.createSequentialGroup()
							.addComponent(lblMenPts_1)
							.addPreferredGap(ComponentPlacement.RELATED, 584, Short.MAX_VALUE)
							.addComponent(lblSocPts_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addGap(70))
						.addGroup(gl_pnlAttributes.createSequentialGroup()
							.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlAttributes.createSequentialGroup()
									.addComponent(rbInt1_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rbInt2_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rbInt3_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rbInt4_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rbInt5_1))
								.addGroup(gl_pnlAttributes.createSequentialGroup()
									.addComponent(rbWits1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbWits2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbWits3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbWits4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbWits5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnlAttributes.createSequentialGroup()
									.addComponent(rbRes1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbRes2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbRes3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbRes4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbRes5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
							.addGap(119)
							.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblStamina_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblDex_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblStrength_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 55, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlAttributes.createSequentialGroup()
									.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnlAttributes.createSequentialGroup()
											.addComponent(rbStrength1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
											.addComponent(rbStrength2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
											.addComponent(rbStrength3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
											.addComponent(rbStrength4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
											.addComponent(rbStrength5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_pnlAttributes.createSequentialGroup()
											.addComponent(rbDex1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
											.addComponent(rbDex2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
											.addComponent(rbDex3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
											.addComponent(rbDex4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
											.addComponent(rbDex5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_pnlAttributes.createSequentialGroup()
											.addComponent(lblPhysPts_1, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
											.addGap(42))
										.addComponent(btnReset_1))
									.addPreferredGap(ComponentPlacement.RELATED, 122, Short.MAX_VALUE))
								.addGroup(gl_pnlAttributes.createSequentialGroup()
									.addComponent(rbStam1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbStam2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbStam3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbStam4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbStam5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblPres_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMani_1, GroupLayout.PREFERRED_SIZE, 73, Short.MAX_VALUE)
								.addComponent(lblComp_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
							.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_pnlAttributes.createSequentialGroup()
										.addComponent(rbMani1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(rbMani2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(rbMani3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(rbMani4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(rbMani5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_pnlAttributes.createSequentialGroup()
										.addComponent(rbComp1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(rbComp2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(rbComp3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(rbComp4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(rbComp5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_pnlAttributes.createSequentialGroup()
									.addComponent(rbPres1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbPres2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbPres3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbPres4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(rbPres5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
							.addGap(49))))
				.addGroup(gl_pnlAttributes.createSequentialGroup()
					.addComponent(lblAttBanner, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_pnlAttributes.createSequentialGroup()
					.addGap(365)
					.addComponent(btnSave_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(438))
		);
		gl_pnlAttributes.setVerticalGroup(
			gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlAttributes.createSequentialGroup()
					.addGap(24)
					.addComponent(txtrAttributesDescription, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(57)
					.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblMental_1)
						.addComponent(lblPhysical_1)
						.addComponent(lblSocial_1))
					.addGap(6)
					.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.BASELINE)
							.addComponent(cmboMental_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(cmboPhysical_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlAttributes.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cmboSocial_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(31)
					.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlAttributes.createSequentialGroup()
							.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
								.addComponent(rbPres1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbPres2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbPres3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbPres4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbPres5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addGap(20)
							.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
								.addComponent(rbMani1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbMani2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbMani3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbMani4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbMani5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
								.addComponent(rbComp1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbComp2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbComp3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbComp4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbComp5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnlAttributes.createSequentialGroup()
							.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
								.addComponent(lblIntelligence_1)
								.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.TRAILING)
									.addComponent(rbInt2_1)
									.addComponent(rbInt1_1)
									.addComponent(rbInt3_1)
									.addComponent(rbInt4_1)
									.addComponent(rbInt5_1)))
							.addGap(20)
							.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
								.addComponent(rbWits1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbWits2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbWits3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbWits4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbWits5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblWits_1))
							.addGap(22)
							.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
								.addComponent(rbRes1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbRes2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbRes3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbRes4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbRes5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblResolve_1)))
						.addGroup(gl_pnlAttributes.createSequentialGroup()
							.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
								.addComponent(lblStrength_1)
								.addComponent(rbStrength1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbStrength2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbStrength3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbStrength4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbStrength5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addGap(20)
							.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
								.addComponent(rbDex1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbDex2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbDex3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbDex4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbDex5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDex_1))
							.addGap(22)
							.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.LEADING)
								.addComponent(rbStam1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbStam2_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbStam3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbStam4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbStam5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblStamina_1)))
						.addGroup(gl_pnlAttributes.createSequentialGroup()
							.addComponent(lblPres_1)
							.addGap(27)
							.addComponent(lblMani_1)
							.addGap(29)
							.addComponent(lblComp_1)))
					.addGap(51)
					.addGroup(gl_pnlAttributes.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMenPts_1)
						.addComponent(lblSocPts_1)
						.addComponent(lblPhysPts_1))
					.addGap(65)
					.addComponent(btnReset_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSave_1)
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addComponent(lblAttBanner, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
		);
		return gl_pnlAttributes;
	}

}
