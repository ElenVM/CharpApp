package commands;

public interface Command {
    public String getCmdText();
    public void setCmdText(String text);
    public String getCmdClass();
    public boolean getCmdStatus();
    public void setCmdStatus(boolean status);
}
