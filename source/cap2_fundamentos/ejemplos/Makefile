KOTLINC=kotlinc


.SUFFIXES: .jar .kt

all: ejemplo_identidad_tipos.jar

.kt.jar:
	$(KOTLINC) $^ -include-runtime -d $@

clean:
	rm *.jar
