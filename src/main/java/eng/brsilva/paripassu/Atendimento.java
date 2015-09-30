package eng.brsilva.paripassu;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class Atendimento implements Serializable {
	private static final long serialVersionUID = 1L;
	static private int num_normal = 1;
	static private int num_prefer = 1;
	private Ticket ticket = new Ticket();
	private List<Ticket> tickets = new ArrayList<Ticket>();
	String call = "";
	
	public Ticket getTicket() {
		return ticket;
	}
	public List<Ticket> getTickets() {
		return tickets;
	}
	public String getCall() {
		return call;
	}
	
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public void createTicketNormal() {
    	this.ticket.setType('N');
    	this.ticket.setNum(this.num_normal);
    	addTicket();
        this.num_normal++;
    }
    public void createTicketPrefer() {
    	this.ticket.setType('P');
    	this.ticket.setNum(this.num_prefer);
    	addTicket();
        this.num_prefer++;
    }
	public void addTicket() {
		this.ticket.setDateTime();
    	addMessage("Novo Senha: " + this.ticket.getCode());
    	this.tickets.add(this.ticket);
    	this.ticket = new Ticket();
	}
     
    public void resetCount() {
    	this.num_normal = 1;
    	this.num_prefer = 1;
    	addMessage("Contagem Reiniciada!");
    }
    
    public int indexOfTicketPrefer() {
    	Ticket temp;
    	int i;
    	for (i = 0; i < this.tickets.size(); i++) {
    		temp = this.tickets.get(i);
    		if (temp.getType() == 'P') {
    			return i; 
    		}
    	}
    	return -1;
    }
    
    
    public void ticketCall() {
    	Ticket temp;
    	int i;
    	try {
    		i = indexOfTicketPrefer();
    		if (i < 0) {
    			i = 0;
    		}
			temp = this.tickets.get(i);
        	this.call = temp.getCode();
        	this.tickets.remove(i);
        	addMessage("Senha Chamada: " + this.call);
		} catch (Exception e) {
			// TODO: handle exception
			addMessage("Nenhuma Senha em Aguardo");
			this.call = "";
		}
    }
    
    
    
	
}
