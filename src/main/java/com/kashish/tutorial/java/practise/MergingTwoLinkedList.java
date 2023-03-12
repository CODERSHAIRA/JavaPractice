package com.kashish.tutorial.java.practise;

public class MergingTwoLinkedList {
	
	    public Node mergeTwoLists(Node list1, Node list2) {
	        Node result= null;
	          if(list1!=null && list2!=null){
	        if(list1.data<=list2.data){
	            result=list1;
	            result.next=mergeTwoLists(list1.next,list2);
	            
	            }
	            else{
	                result=list2;
	                result.next=mergeTwoLists(list1,list2.next);
	        }
	        return(result);
	        }
	        if(list1==null)
	            return list2;
	        return list1;
	    }
	    
	}

