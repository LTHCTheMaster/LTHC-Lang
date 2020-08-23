package lthclang.game.engine.lthcsmagicworld;

public class GameContainer implements Runnable
{
	private Thread thread;
	private Window window;
	private Renderer renderer;
	private Input input;
	private AbstractGame game;
	
	private boolean running = false;
	private final double UPDATE_CAP = 1.0/90.0;
	private int width = 1120, height = 630;
	private float scale = 1f;
	private String title = "LTHC's Magic World [v1.0]";
	
	private int fps;
	private double frameTime = 0;
	
	public GameContainer(AbstractGame game)
	{
		this.game = game;
	}
	
	public void start()
	{
		window = new Window(this);
		renderer = new Renderer(this);
		input = new Input(this);
		
		thread = new Thread(this);
		thread.run();
	}
	
	public void stop()
	{
		
	}
	
	public void run()
	{
		running = true;
		
		boolean render = false;
		double firstTime = 0;
		double lastTime = System.nanoTime() / 1000000000.0;
		double passedTime = 0;
		double unprocessedTime = 0;
		
		int frames = 0;
		fps = 0;
		
		while(running)
		{
			render = false;
			
			firstTime = System.nanoTime() / 1000000000.0;
			passedTime = firstTime - lastTime;
			lastTime = firstTime;
			
			unprocessedTime += passedTime;
			frameTime += passedTime;
			
			while(unprocessedTime >= UPDATE_CAP)
			{
				unprocessedTime -= UPDATE_CAP;
				render = true;
				
				game.update(this, (float)UPDATE_CAP);
				
				input.update();
				
				if(frameTime >= 1.0)
				{
					frameTime = 0;
					fps = frames;
					frames = 0;
					System.out.println("FPS: " + fps);
				}
			}
			
			if(render)
			{
				renderer.clear();
				game.render(this, renderer);
				window.update();
				frames++;
			}
			else
			{
				try 
				{
					Thread.sleep(1);
				} 
				catch (InterruptedException e) 
				{
					System.out.println("InterruptedException caused a fail");
				}
			}
		}
		
		dispose();
	}
	
	private void dispose()
	{
		
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public float getScale() {
		return scale;
	}

	public void setScale(float scale) {
		this.scale = scale;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Window getWindow() {
		return window;
	}

	public Input getInput() {
		return input;
	}

	public int getFps() {
		return fps;
	}

	public Renderer getRenderer() {
		return renderer;
	}

	public double getFrameTime() {
		return frameTime;
	}
}
