package mi.model;

public abstract class Task {
    private long id;
    private String desc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Task(long id, String desc)
    {   this.id=id;
        this.desc=desc;
    }

    @Override
    public String toString() {
        return id +" "+desc;
    }
    public abstract void execute();

}
