package problem2;

public class SelectStatement {
    private String select;
    private String from;
    //optional. add using getters and setter
    private String where;
    private String group_by;
    private String having;
    private String order_by;

    public SelectStatement(String select, String from) {
        this.select = select;
        this.from = from;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getGroup_by() {
        return group_by;
    }

    public void setGroup_by(String group_by) {
        this.group_by = group_by;
    }

    public String getHaving() {
        return having;
    }

    public void setHaving(String having) {
        this.having = having;
    }

    public String getOrder_by() {
        return order_by;
    }

    public void setOrder_by(String order_by) {
        this.order_by = order_by;
    }
}
