package eng.brsilva.paripassu;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ticket implements Serializable {
	private static final long serialVersionUID = 1L;
	private char type;
	private int num;
	private String date;
	private String time;
	
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public void setType(char type) {
		this.type = type;
	}
	public char getType() {
		return type;
	}
	public String getTime() {
		return time;
	}
	public String getDate() {
		return date;
	}
	public void setDateTime() {
		Locale locale = new Locale("pt", "BR");
		GregorianCalendar calendar = new GregorianCalendar();
		SimpleDateFormat simple_date = new SimpleDateFormat("dd/MM/yyyy", locale);
		this.date = simple_date.format(calendar.getTime());
		simple_date = new SimpleDateFormat("HH:mm:ss", locale);
		this.time = simple_date.format(calendar.getTime());
	}
    public String getCode() {
    	String str = "";
    	str += this.type;
    	if (num < 1000) {
    		str += "0";
    	}
    	if (num < 100) {
    		str += "0";
    	}
    	if (num < 10) {
    		str += "0";
    	}
    	str += num;
    	return str;
    }
    public String strCode() {
    	String str = "";
    	str += this.type;
    	if (num < 1000) {
    		str += "0";
    	}
    	if (num < 100) {
    		str += "0";
    	}
    	if (num < 10) {
    		str += "0";
    	}
    	str += num;
    	return str;
    }
}
