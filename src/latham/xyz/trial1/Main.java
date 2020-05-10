package latham.xyz.trial1;

import org.bukkit.plugin.java.JavaPlugin;

import latham.xyz.trial1.commands.HelloCommand;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		new HelloCommand(this);
	}
}

