package db;

import javax.swing.JOptionPane;

public class DbException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public DbException(String msg)
    {
	super(msg);
	JOptionPane.showMessageDialog(null, msg);	
    }

}
