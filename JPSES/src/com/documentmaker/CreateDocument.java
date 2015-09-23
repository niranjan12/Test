package com.documentmaker;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class CreateDocument 
{
   public static void main(String[] args)throws Exception 
   {
   //Blank Document
   XWPFDocument document= new XWPFDocument(); 
   //Write the Document in file system
   FileOutputStream out = new FileOutputStream(
   new File("createdocument.docx"));
   document.write(out);
   out.close();
   System.out.println(
   "createdocument.docx written successully");
   
   FileOutputStream out1 = new FileOutputStream(
		   new File("create_table.docx"));
		        
		   //create table
		   XWPFTable table = document.createTable();
		   //create first row
		   XWPFTableRow tableRowOne = table.getRow(0);
		   tableRowOne.getCell(0).setText("col one, row one");
		   tableRowOne.addNewTableCell().setText("col two, row one");
		   tableRowOne.addNewTableCell().setText("col three, row one");
		   //create second row
		   XWPFTableRow tableRowTwo = table.createRow();
		   tableRowTwo.getCell(0).setText("col one, row two");
		   tableRowTwo.getCell(1).setText("col two, row two");
		   tableRowTwo.getCell(2).setText("col three, row two");
		   //create third row
		   XWPFTableRow tableRowThree = table.createRow();
		   tableRowThree.getCell(0).setText("col one, row three");
		   tableRowThree.getCell(1).setText("col two, row three");
		   tableRowThree.getCell(2).setText("col three, row three");
			
		   document.write(out1);
		   out.close();
		   System.out.println("create_table.docx written successully");
   document.close();
   }
}