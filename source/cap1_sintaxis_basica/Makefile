KOTLINC=kotlinc


.SUFFIXES: .jar .kt

all: cadenas_basicas.jar

.kt.jar:
	$(KOTLINC) $^ -include-runtime -d $@

clean:
	rm *.jar
