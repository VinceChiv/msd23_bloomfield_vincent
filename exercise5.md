## Big questions regarding logging libraries
# Why do we use logging libraries?
It is important to log anything that has interaction, the developer has to understand/monitor the behaviour of their app.
# Which loglevels are there and how do they interact with each other?
Info, debug, trace, warn, error and fatal. Some levels have higher priority than others, meaning only certain levels will show in output. This can be changed in a config file but by default warn and error are shown in output.
# Was für Konfigurationsmöglichkeiten bietet Ihnen log4J?
+ configure the logger itself, configure the appender which appends logs in a file, configure the layout of a log, and configure filters

