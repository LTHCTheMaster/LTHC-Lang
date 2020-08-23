package lthclang.game.engine.lthcsmagicworld.audio;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundClip 
{
	private Clip clip = null;
	private FloatControl gainControl;
	
	public SoundClip(String path)
	{
		try {
			InputStream audioSrc = SoundClip.class.getResourceAsStream(path);
			InputStream bufferedIn = new BufferedInputStream(audioSrc);
			AudioInputStream ais = AudioSystem.getAudioInputStream(bufferedIn);
			AudioFormat baseFormat = ais.getFormat();
			AudioFormat decodeFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, baseFormat.getSampleRate(), 16, baseFormat.getChannels(), baseFormat.getChannels() * 2, baseFormat.getSampleRate(), false);
			AudioInputStream dais = AudioSystem.getAudioInputStream(decodeFormat, ais);
			
			clip = AudioSystem.getClip();
			clip.open(dais);
			
			gainControl = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
		} catch (UnsupportedAudioFileException e) {
			System.out.println("UnsupportedAudioFileException caused a fail");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException caused a fail");
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			System.out.println("LineUnavailableException caused a fail");
		}
		
	}
	
	public void play()
	{
		if(clip == null) return;
		
		stop();
		clip.setFramePosition(0);
		while(!clip.isRunning())
		{
			clip.start();
		}
	}
	
	public void stop()
	{
		if(clip.isRunning())
		{
			clip.stop();
		}
	}
	
	public void close()
	{
		stop();
		clip.drain();
		clip.close();
	}
	
	public void loop()
	{
		clip.loop(Clip.LOOP_CONTINUOUSLY);
		play();
	}
	
	public void setVolume(float value)
	{
		gainControl.setValue(value);
	}
	
	public boolean isRunning()
	{
		return clip.isRunning();
	}
}
