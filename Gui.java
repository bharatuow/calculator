package calculator_new;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Gui extends JFrame {
	private JTextField answerfield;
	private JButton one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mul,div,equals,clear,src;
	private String stemp1,stemp2,sanswer;
	private double answer=0.0;
	private JPanel contentpanel;
	private boolean opchosen=false, equalsClicked=false;
	char operation;
	private boolean click=false;
	
	
	
	
	  private void reset()
	  {
		  stemp1=null;
		  stemp2=null;	  
		  if(src.equals(one)||src.equals(two)||src.equals(three)||src.equals(four)||src.equals(five)
				  ||src.equals(six)||src.equals(seven)||src.equals(eight)||src.equals(nine)||src.equals(zero)
				  ||src.equals(add)||src.equals(sub)||src.equals(mul)||src.equals(div)||src.equals(clear)== true)
			click=true;
		  
		  answerfield.setText("");
			
	  }
	
      public Gui(){
    	  
		super("Calculator");
		answerfield= new JTextField(null,21);
		answerfield.setEditable(false);
		
		one=new JButton("1");
		two=new JButton("2");
		three=new JButton("3");
		four=new JButton("4");
		five=new JButton("5");
		six=new JButton("6");
		seven=new JButton("7");
		eight=new JButton("8");
		nine=new JButton("9");
		zero=new JButton("0");
		add=new JButton("+");
		sub=new JButton("-");
		mul=new JButton("*");
		div=new JButton("/");
		equals=new JButton("=");
		clear=new JButton("c");
		
		
	//	one=new JButton("1");
		
		Dimension dim = new Dimension(75,25);
		one.setPreferredSize(dim);
		two.setPreferredSize(dim);
		three.setPreferredSize(dim);
		four.setPreferredSize(dim);
		five.setPreferredSize(dim);
		six.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		nine.setPreferredSize(dim);
		zero.setPreferredSize(new Dimension(115,25));
		add.setPreferredSize(new Dimension(115,25));
		sub.setPreferredSize(new Dimension(115,25));
		mul.setPreferredSize(new Dimension(115,25));
		div.setPreferredSize(new Dimension(115,25));
		equals.setPreferredSize(new Dimension(236,25));
		clear.setPreferredSize(new Dimension(115,25));
		
		
		
		Numbers n = new Numbers();
		calc c = new calc();
		
		one.addActionListener(n);two.addActionListener(n);three.addActionListener(n);four.addActionListener(n);
		five.addActionListener(n);six.addActionListener(n);seven.addActionListener(n);eight.addActionListener(n);
		nine.addActionListener(n);zero.addActionListener(n);
		
		add.addActionListener(c);sub.addActionListener(c);mul.addActionListener(c);div.addActionListener(c);
		equals.addActionListener(c);clear.addActionListener(c);
		
		
		contentpanel=new JPanel();
		contentpanel.setBackground(Color.BLUE);
		contentpanel.setLayout(new FlowLayout());
		contentpanel.add(answerfield, BorderLayout.NORTH);
		
		contentpanel.add(one);contentpanel.add(two);contentpanel.add(three);contentpanel.add(four);
		contentpanel.add(five);contentpanel.add(six);contentpanel.add(seven);contentpanel.add(eight);
		contentpanel.add(nine);contentpanel.add(zero);contentpanel.add(clear);contentpanel.add(add);contentpanel.add(sub);
		contentpanel.add(mul);contentpanel.add(div);contentpanel.add(equals);
		
		this.setContentPane(contentpanel);
		
			
 		}
      
      
  	private class Numbers implements ActionListener{
  		
  			public void actionPerformed(ActionEvent event){
  				
  				
  		//		System.out.println(event);
  		
  				src = (JButton)event.getSource();
  				
  				if(src.equals(one)){
  						if(opchosen==false){
  							if(stemp1==null) stemp1="1";
  							else stemp1+="1";
  						 		}
  						else{
  	  						if(stemp2==null)stemp2="1";
  	  						else stemp2+="1";
  						}		
  	  				}
  				
  				  					
  					if(src.equals(two)){
  						if(opchosen==false){
  							if(stemp1==null) stemp1="2";
  							else stemp1+="2";
  						 		}
  						else{
  	  						if(stemp2==null)stemp2="2";
  	  						else stemp2+="2";
  						}		
  	  				}
  				
  					
  					if(src.equals(three)){
  						if(opchosen==false){
  							if(stemp1==null) stemp1="3";
  							else stemp1+="3";
  						 		}
  						else{
  	  						if(stemp2==null)stemp2="3";
  	  						else stemp2+="3";
  						}		
  	  				}
  					
  					
  					if(src.equals(four)){
  						if(opchosen==false){
  							if(stemp1==null) stemp1="4";
  							else stemp1+="4";
  						 		}
  						else{
  	  						if(stemp2==null)stemp2="4";
  	  						else stemp2+="4";
  						}		
  	  				}
  					
  					
  					
  					if(src.equals(five)){
  						if(opchosen==false){
  							if(stemp1==null) stemp1="5";
  							else stemp1+="5";
  						 		}
  						else{
  	  						if(stemp2==null)stemp2="5";
  	  						else stemp2+="5";
  						}		
  	  				}
  					
  					
  					
  					if(src.equals(six)){
  						if(opchosen==false){
  							if(stemp1==null) stemp1="6";
  							else stemp1+="6";
  						 		}
  						else{
  	  						if(stemp2==null)stemp2="6";
  	  						else stemp2+="6";
  						}		
  	  				}
  					
  					
  					if(src.equals(seven)){
  						if(opchosen==false){
  							if(stemp1==null) stemp1="7";
  							else stemp1+="7";
  						 		}
  						else{
  	  						if(stemp2==null)stemp2="7";
  	  						else stemp2+="7";
  						}		
  	  				}
  					
  					
  					if(src.equals(eight)){
  						if(opchosen==false){
  							if(stemp1==null) stemp1="8";
  							else stemp1+="8";
  						 		}
  						else{
  	  						if(stemp2==null)stemp2="8";
  	  						else stemp2+="8";
  						}		
  	  				}
  					
  					
  					if(src.equals(nine)){
  						if(opchosen==false){
  							if(stemp1==null) stemp1="9";
  							else stemp1+="9";
  						 		}
  						else{
  	  						if(stemp2==null)stemp2="9";
  	  						else stemp2+="9";
  						}		
  	  				}
  					
  					
  					if(src.equals(zero)){
  						if(opchosen==false){
  							if(stemp1==null) stemp1="0";
  							else stemp1+="0";
  						 		}
  						else{
  	  						if(stemp2==null)stemp2="0";
  	  						else stemp2+="0";
  						}		
  	  				}
  				
  					if(opchosen==false){
  						answerfield.setText(stemp1);
  					}else{
  						answerfield.setText(stemp2);
  					}
  				
  					
  					if(equalsClicked==false){
  						if(opchosen==false) answerfield.setText(stemp1);
  						else answerfield.setText(stemp2);
  					}
  				
  				
   				}
  	}
  			
  			
  
  		private class calc implements ActionListener{
  			
  		    public void actionPerformed(ActionEvent event){
  		    	JButton src = (JButton)event.getSource();
  		    	
  		    	if(src.equals(add)){
  		    		if(stemp1==null) System.out.println("choose numbers");
  		    		else 
  		    				if(stemp1!= null && stemp2==null){
  		    					opchosen=true;
  		    					operation='+';
  		    				}else
  		    					if(stemp1 != null && stemp2 != null) System.out.println("one operation at a time");
  		    		}
  		    	
  		    	if(src.equals(sub)){
  		    		if(stemp1==null) System.out.print("choose numbers");
  		    		else 
  		    				if(stemp1!= null && stemp2==null){
  		    					opchosen=true;
  		    					operation='-';
  		    				}else
  		    					if(stemp1 != null && stemp2 != null) System.out.println("one operation at a time");
  		    		}
  		    	
  		    	
  		    	if(src.equals(mul)){
  		    		if(stemp1==null) System.out.println("choose numbers");
  		    		else 
  		    				if(stemp1!= null && stemp2==null){
  		    					opchosen=true;
  		    					operation='*';
  		    				}else
  		    					if(stemp1 != null && stemp2 != null) 
  		    						System.out.println("one operation at a time");
  		    		}
  		    	
  		    	
  		    	if(src.equals(div)){
  		    		if(stemp1==null) System.out.print("choose numbers");
  		    		else 
  		    				if(stemp1!= null && stemp2==null){
  		    					opchosen=true;
  		    					operation='/';
  		    				}else
  		    					if(stemp1 != null && stemp2 != null) System.out.print("one operation at a time");
  		    		}
  		    	
  		    	
  		    	if(src.equals(equals)){
  		    		if(stemp1==null)
  		    		{
  		    			System.out.println("choose numbers");
  		    		}else
  		    			if(stemp1 != null && stemp2==null )
  		    			{
  		    				System.out.println("choose other number ");
  		    			}
  		    		
  		    		if(stemp1!= null && stemp2!= null)
  		    		{
  		    			double d1=0.0,d2=0.0;
  		    			
  		    			d1=Double.parseDouble(stemp1);
  		    			d2=Double.parseDouble(stemp2);
  		    			
  		    			
  		    			switch(operation)
  		    			{
  		    			case '+': answer=d1+d2;
  		    			break;
  		    			case '-': answer=d1-d2;
  		    			break;
  		    			case '*': answer=d1*d2;
  		    			break;
  		    			case '/': answer= d1/d2;
  		    			break;
  		    			}
  		    			
  		    			sanswer=Double.toString(answer);
  		    			answerfield.setText(sanswer);
  		    			
  		    			
  		    //			reset();
  		    			
  		    
  		    			
  		    			
  		    			
  		    			if(src.equals(true)) {
  		    				answerfield.setText("");
  		    			}
  		    				
  		    			
  		    			if(operation == '/' && d2==0)
  		    			{
  		    				answerfield.setText("divide by 0 error! ");
  		    			}
  		    			
  		    		}
  		    		
  		    		
  		    	}
  		    		
  		    }
  		    	
  	    }
  		
}
  	

		
		
		
      
		

