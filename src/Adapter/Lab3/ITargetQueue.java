package Adapter.Lab3;

public interface ITargetQueue {
	public boolean offer(String str);
	public String poll();
	public boolean isEmpty();
}