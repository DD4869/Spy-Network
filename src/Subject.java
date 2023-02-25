public interface Subject {
	
	public void registerFieldbaseOb(FieldbaseOb fieldbaseob);
	public void unregisterFieldbaseOb(FieldbaseOb fieldbaseob);
	public void notifyFieldbaseOb(int key, String scheme);
	public abstract int getKey();
	public abstract void setKey(int key);
	public abstract String getScheme();
	public abstract void setScheme(String scheme);
}
