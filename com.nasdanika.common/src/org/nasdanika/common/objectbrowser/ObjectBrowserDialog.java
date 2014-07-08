package org.nasdanika.common.objectbrowser;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class ObjectBrowserDialog extends JDialog {
	
	private static class CustomTreeCellRenderer extends DefaultTreeCellRenderer {
		
		public Component getTreeCellRendererComponent(
				JTree tree, 
				Object value,
				boolean sel, 
				boolean expanded, 
				boolean leaf, 
				int row,
				boolean hasFocus) {
			
			super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
			
			if (value instanceof DefaultMutableTreeNode) {
				Object v = ((DefaultMutableTreeNode) value).getUserObject();
				if (v instanceof ObjectBrowserItem) {
					Icon icon = ((ObjectBrowserItem) v).getImage(Icon.class);
					if (icon!=null) {
						setIcon(icon);					
					}
				}
			}

			return this;
		}
	}	
	
	static Window getWindowForComponent(Component parentComponent) {
		if (parentComponent==null) {
			return JOptionPane.getRootFrame();
		}
		if (parentComponent instanceof Frame || parentComponent instanceof Dialog) {
			return (Window) parentComponent;
		}
		return getWindowForComponent(parentComponent.getParent());
	}	

	public ObjectBrowserDialog(Component parentComponent, List<ObjectBrowserItem> items) {
		super(getWindowForComponent(parentComponent), "Object browser");
		setLocationRelativeTo(parentComponent);
		setModalityType(DEFAULT_MODALITY_TYPE);
		this.roots = items;

		ActionListener ticker = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (lastFilterTextChange>0 && System.currentTimeMillis()-lastFilterTextChange>700) {
					buildTree();
					lastFilterTextChange = -1;
				}
			}
		};
		
		initGUI();
		if (items!=null) {
			SwingUtilities.invokeLater(new Runnable() {

				@Override
				public void run() {
					buildTree();
				}
				
			});
		}

		timer = new Timer(200, ticker);		
	}
	
	@Override
	public void setVisible(boolean b) {
		if (timer!=null) {
			if (b) {
				timer.start();
			} else {
				timer.stop();
			}
		}
		super.setVisible(b);
	}
	
	private JTree browserTree;
	private JPanel filterAndDescriptionPanel;
	private JSplitPane jSplitPane;
	private JScrollPane treeScrollPane;
	private JScrollPane descriptionScrollPane;
	private JTextField filterText;
	private JLabel filterLabel;
	private JEditorPane descriptionLabel;
	private long lastFilterTextChange = -1;
	Timer timer;
	private List<ObjectBrowserItem> roots;
	private JButton okButton;
	protected String result;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		final JButton but = new JButton("Object browser");
		frame.getContentPane().add(but);
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {												
				List<ObjectBrowserItem> r = sampleItems();
				ObjectBrowserDialog ob = new ObjectBrowserDialog(but, r);
				ob.setVisible(true);
				System.out.println(ob.getResult());
			}

		});
		frame.pack();
		frame.setVisible(true);				
	}
	
	public static List<ObjectBrowserItem> sampleItems() {
		List<ObjectBrowserItem> r = new ArrayList<ObjectBrowserItem>();
		for (File f: new File(".").listFiles()) {
			r.add(wrapFile(f));
		}
		return r;
	}

	private static ObjectBrowserItem wrapFile(final File f) {
		
		if (f.isDirectory()) {
			return new ObjectBrowserCompositeItem() {
				
				@Override
				public String getName() {
					return f.getName()+" *";
				}
				
				@Override
				public Set<String> getKeywords() {
					return Collections.singleton("directory");
				}
				
				@Override
				public <T> T getImage(Class<T> imageType) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public String getDescription() {
					return f.getAbsolutePath();
				}
				
				@Override
				public List<ObjectBrowserItem> getChildren() {
					List<ObjectBrowserItem> ch = new ArrayList<ObjectBrowserItem>();
					for (File child: f.listFiles()) {
						ch.add(wrapFile(child));
					}
					return ch;
				}
				
				public String toString() {
					return getName();
				};
			};
		} 
		
		return new Snippet() {
			
			@Override
			public String getName() {
				return f.getName();
			}
			
			@Override
			public Set<String> getKeywords() {
				return Collections.singleton("file");
			}
			
			@Override
			public <T> T getImage(Class<T> imageType) {						
				try {
					return (T) new ImageIcon(new File("icons\\crystal_project\\16x16\\actions\\14_layer_deletelayer.png").toURL());
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				}
			}
			
			@Override
			public String getDescription() {
				return f.getAbsolutePath();
			}
			
			@Override
			public String getCode() {
				return f.getAbsolutePath()+" ~~~ ";
			}
			
			@Override
			public String toString() {
				return getName();
			}
		};
	}
	
	private void initGUI() {
		try {			
			BorderLayout thisLayout = new BorderLayout();
			this.setLayout(thisLayout);
			jSplitPane = new JSplitPane();
			this.add(jSplitPane, BorderLayout.CENTER);
			jSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
			treeScrollPane = new JScrollPane();
			jSplitPane.add(treeScrollPane, JSplitPane.TOP);

			browserTree = new JTree();
			browserTree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode()));
			browserTree.setEnabled(false);
			browserTree.setCellRenderer(new CustomTreeCellRenderer());
			browserTree.setRootVisible(false);
			browserTree.setShowsRootHandles(true);
			browserTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
			browserTree.addTreeSelectionListener(new TreeSelectionListener() {
				public void valueChanged(TreeSelectionEvent evt) {
					setDescription();
					boolean fbe = false;
					TreePath[] selectionPaths = ((JTree) evt.getSource()).getSelectionPaths();
					if (selectionPaths!=null) {
						for (TreePath selectionPath: selectionPaths) {
							if (((DefaultMutableTreeNode) selectionPath.getLastPathComponent()).getUserObject() instanceof Snippet) {
								fbe = true;
								break;
							}
						}
					}
					okButton.setEnabled(fbe);
				}
			});
			
			browserTree.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount()>1) {
						okButton.doClick();
					}
				}
				
			});
			
			treeScrollPane.setViewportView(browserTree);

			filterAndDescriptionPanel = new JPanel();
			GridBagLayout filterAndDescriptionPanelLayout = new GridBagLayout();
			jSplitPane.add(filterAndDescriptionPanel, JSplitPane.BOTTOM);
			filterAndDescriptionPanelLayout.rowWeights = new double[] {0.0, 0.0, 0.0, 0.1};
			filterAndDescriptionPanelLayout.rowHeights = new int[] {5, 7, 5, 30};
			filterAndDescriptionPanelLayout.columnWeights = new double[] {0.0, 0.0, 0.1};
			filterAndDescriptionPanelLayout.columnWidths = new int[] {7, 7, 7};
			filterAndDescriptionPanel.setLayout(filterAndDescriptionPanelLayout);

			descriptionScrollPane = new JScrollPane();
			filterAndDescriptionPanel.add(descriptionScrollPane, new GridBagConstraints(0, 3, 3, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

			descriptionLabel = new JEditorPane();
			descriptionScrollPane.setViewportView(descriptionLabel);
			descriptionLabel.setEditable(false);
			descriptionLabel.setContentType("text/html");

			filterLabel = new JLabel();
			filterAndDescriptionPanel.add(filterLabel, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
			filterLabel.setText("Filter");

			filterText = new JTextField();
			filterText.getDocument().addDocumentListener(new DocumentListener() {
				
				@Override
				public void removeUpdate(DocumentEvent e) {
					lastFilterTextChange = System.currentTimeMillis();								
				}
				
				@Override
				public void insertUpdate(DocumentEvent e) {
					lastFilterTextChange = System.currentTimeMillis();
				}
				
				@Override
				public void changedUpdate(DocumentEvent e) {
					lastFilterTextChange = System.currentTimeMillis();
				}
			});
			filterAndDescriptionPanel.add(filterText, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

			jSplitPane.setResizeWeight(0.7);
			jSplitPane.setDividerLocation(200);
			
			JPanel buttonsPanel = new JPanel();
			this.add(buttonsPanel, BorderLayout.SOUTH);
			
			
			okButton = new JButton("OK");
			okButton.setDefaultCapable(true);
			okButton.setEnabled(false);
			buttonsPanel.add(okButton);
			
			okButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					result = getCode();
					ObjectBrowserDialog.this.setVisible(false);
				}
			});
			
			JButton cancelButton = new JButton("Cancel");
			buttonsPanel.add(cancelButton);

			cancelButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					result = null;
					ObjectBrowserDialog.this.setVisible(false);
				}
			});
			
			setSize(400, 400);
			
			filterText.setFocusable(true);
			filterText.requestFocusInWindow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void buildTree() {
		// TODO - on-demand loading to support infinite trees. Copy from old code.
		// Filtering shall be done by object browser items. 
		
		List<String> filterTokens = new ArrayList<String>();
		if (filterText.getText().trim().length()>0) {
			StringTokenizer st = new StringTokenizer(filterText.getText().trim());
			while (st.hasMoreTokens()) {
				filterTokens.add(st.nextToken().toLowerCase());
			}
		}
				
		DefaultMutableTreeNode root = new DefaultMutableTreeNode();
		for (ObjectBrowserItem obi: roots) {
			DefaultMutableTreeNode rootNode = wrap(obi, filterTokens);
			if (rootNode!=null) {
				root.add(rootNode);
			}
		}
		
		TreeModel treeModel = new DefaultTreeModel(root);
		browserTree.setModel(treeModel);
		browserTree.setEnabled(true);

		setDescription();
		
		if (!filterTokens.isEmpty()) {
			for (int i = 0; i < browserTree.getRowCount(); i++) {
				browserTree.expandRow(i);
			}
		}
	}
	
	private DefaultMutableTreeNode wrap(ObjectBrowserItem obi, List<String> filterTokens) {
		boolean wrapThis = filterTokens.isEmpty();
		Y: for (String ft: filterTokens) {
			if (obi.getName()!=null && obi.getName().toLowerCase().contains(ft)) {
				wrapThis = true;
				break;
			}
			
			if (obi.getDescription()!=null && obi.getDescription().toLowerCase().contains(ft)) {
				wrapThis = true;
				break;
			}
			
			if (obi.getKeywords()!=null) {
				for (String keyword: obi.getKeywords()) {
					if (keyword.toLowerCase().equals(ft)) {
						wrapThis = true;
						break Y;
					}
				}
			}
		}
						
		List<DefaultMutableTreeNode> children = new ArrayList<DefaultMutableTreeNode>();
		if (obi instanceof ObjectBrowserCompositeItem) {
			for (ObjectBrowserItem child: ((ObjectBrowserCompositeItem) obi).getChildren()) {
				// If this node matches, then anything under also matches
				DefaultMutableTreeNode cw = wrap(child, wrapThis ? Collections.EMPTY_LIST : filterTokens);
				if (cw!=null) {
					children.add(cw);
				}
			}
		}
		
		if (children.isEmpty() && !wrapThis) {
			return null;
		}
		
		DefaultMutableTreeNode ret = new DefaultMutableTreeNode(obi, !children.isEmpty());
		for (DefaultMutableTreeNode child: children) {
			ret.add(child);
		}
		return ret;
	}

	private void setDescription() {
		if (browserTree.getSelectionCount()==1) {
			Object lpc = ((DefaultMutableTreeNode) browserTree.getSelectionPath().getLastPathComponent()).getUserObject();
			String description = ((ObjectBrowserItem) lpc).getDescription();
			if (description==null) {
				descriptionLabel.setText("");
			} else {
				if (description.trim().toLowerCase().startsWith("<html>")) {
					descriptionLabel.setText(description);
				} else {
					descriptionLabel.setText("<html>"+description+"</html>");
				}
			}
		} else {
			descriptionLabel.setText("");
		}
	}
	
	private String getCode() {
		Object userObject = ((DefaultMutableTreeNode) browserTree.getSelectionPath().getLastPathComponent()).getUserObject();
		if (userObject instanceof Snippet) {
			return ((Snippet) userObject).getCode();
		}
		return null;
	}
	
	public String getResult() {
		return result;
	}
}
