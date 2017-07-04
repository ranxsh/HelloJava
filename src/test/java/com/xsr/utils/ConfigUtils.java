package com.xsr.utils;

import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigUtils {

	public static final Cfg getCfg(final String resourceName) {

		return new Cfg() {

			private Properties prop = new Properties();
			{
				InputStream is = null;
				try {
					is = Thread.currentThread().getContextClassLoader().getResourceAsStream(resourceName);
					prop.load(is);
				} catch (Exception e) {
					throw new RuntimeException(e);
				} finally {
					IOUtils.closeQuietly(is);
				}
			}

			@Override
			public String get(String key) {
				return prop.getProperty(key);
			}
		};
	}

	public static abstract class Cfg {

		public abstract String get(String key);

	}

}
