package problem2;

public class TestSelectStatement {

    public static void main(String[] args){
        //creating SelectStmt instances using constructors
        SelectStatement firstStmt = new SelectStatement("pnumber, pname, count(*)", " Project join Works_on on pnumber=pno");
        firstStmt.setGroup_by("pnumber,pname");
        firstStmt.setHaving("count(*)>2");


        //creating second instance
        SelectStatement secondStmt = new SelectStatement("fname, lname, address", "Employee join Department on dnumber=dno");
        secondStmt.setWhere("'research'");

        //creating third instance
        SelectStatement thirdStmt = new SelectStatement("fname, lname, address", "Employee");

        //fourth instance
        SelectStatement fourthStmt = new SelectStatement("pnumber, pname, budget, count(*)", "Project join Works_on on pnumber=");
        fourthStmt.setWhere("budget > 200000");
        fourthStmt.setGroup_by("pnumber, pname, budget");
        fourthStmt.setHaving("count(*) > 2");
        fourthStmt.setOrder_by("pnumber");
    }
}
