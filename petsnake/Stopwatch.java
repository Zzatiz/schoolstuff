package club.westcs.petproject;

public class Stopwatch {
	
	private boolean running;
	private long startTime, stopTime, pausedTime;
	public Stopwatch() {
		running = false;
		startTime = 0;
		stopTime = 0;
		pausedTime = 0;
	}
	public boolean isRunning() {
		return this.running;				
	}
	
	public void start() {
		this.running = true;
		this.startTime = System.currentTimeMillis();

	}
	public void stop() {
		this.running = false;
		this.stopTime = System.currentTimeMillis();

	}
	public void pause() {
		if(this.running) {
			stop();
			this.pausedTime += this.stopTime - this.startTime;
		}
	}
	
	public long getElapsedTime() {
		long elapsed =0;
		if(this.running) {
			elapsed = System.currentTimeMillis() - this.startTime;
			elapsed += pausedTime;
		}
		else {
			elapsed += this.pausedTime;
		}
		return elapsed / 1000;
	}
	
}
