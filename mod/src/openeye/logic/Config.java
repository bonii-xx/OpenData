package openeye.logic;

import java.util.Set;

import openeye.config.ConfigProperty;

import com.google.common.collect.ImmutableSet;

public class Config {

	@ConfigProperty(category = "debug")
	public static boolean crashOnStartup = false;

	@ConfigProperty(category = "data")
	public static Set<String> tags = ImmutableSet.of();

	@ConfigProperty(category = "data")
	public static boolean scanOnly = false;

	@ConfigProperty(category = "debug")
	public static boolean pingOnInitialReport = false;

	@ConfigProperty(category = "debug")
	public static boolean dontSend = false;

	@ConfigProperty(category = "features")
	public static boolean haltOnDangerousFiles = false;

	@ConfigProperty(category = "features")
	public static Set<String> reportsBlacklist = ImmutableSet.of();

	@ConfigProperty(category = "features")
	public static Set<String> responseBlacklist = ImmutableSet.of();

	@ConfigProperty(category = "gui", comment = "Enables OpenEye additions to main menu screen")
	public static boolean mainScreenNotes = true;

	@ConfigProperty(category = "gui", comment = "Enables extra line in main menu screen under buttons (if true, only note button will be displayed)")
	public static boolean mainScreenExtraLine = true;
}
